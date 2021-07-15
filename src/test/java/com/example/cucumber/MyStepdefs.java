package com.example.cucumber;


import io.cucumber.java.hr.I;
import io.cucumber.java.hr.Kada;
import io.cucumber.java.hr.Onda;
import io.cucumber.java.hr.Zadano;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page_factory.*;

import java.util.concurrent.TimeUnit;

public class MyStepdefs {

    WebDriver driver;

    @Zadano("se nalazim na glavnoj stranici")
    public void seNalazimNaGlavnojStranici() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lucija.suprina\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://hr.wikipedia.org/wiki/Glavna_stranica");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Kada("odaberem link Šport")
    public void odaberemLinkŠport() {
        WikipedijaGlavnaStranica wikipedijaGlavnaStranica = new WikipedijaGlavnaStranica(driver);
        wikipedijaGlavnaStranica.clickLink();
    }

    @Onda("će mi se prikazati stranica {string}")
    public void ćeMiSePrikazatiStranica(String titleExpected) {
        WikipedijaPortalSport wikipedijaPortalSport=new WikipedijaPortalSport(driver);
        Assert.assertTrue(wikipedijaPortalSport.getPageTitle().contains(titleExpected));
    }

    @Kada("odaberem link Nogomet")
    public void odaberemLinkNogomet() {
        WikipedijaPortalSport wikipedijaPortalSport=new WikipedijaPortalSport(driver);
        wikipedijaPortalSport.clickLink();
    }

    @Onda("će mi se prikazati ova stranica {string}")
    public void ćeMiSePrikazatiOvaStranica(String titleExpected) {
        WikipedijaPortalONogometu wikipedijaPortalONogometu=new WikipedijaPortalONogometu(driver);
        Assert.assertTrue(wikipedijaPortalONogometu.getPageTitle().contains(titleExpected));
    }

    @Kada("kliknem na zastavu države Portugal")
    public void kliknemNaZastavuDržavePortugal() {
        WikipedijaPortalONogometu wikipedijaPortalONogometu=new WikipedijaPortalONogometu(driver);
        wikipedijaPortalONogometu.clickLink();
    }

    @Onda("će mi se prikazati sljedeća stranica {string}")
    public void ćeMiSePrikazatiSljedećaStranica(String titleExpected) {
        WikipedijaPortugalskaNogometnaReprezentacija wikipedijaPortugalskaNogometnaReprezentacija=new WikipedijaPortugalskaNogometnaReprezentacija(driver);
        Assert.assertTrue(wikipedijaPortugalskaNogometnaReprezentacija.getTitleOfPortugalskaNogometnaReprezentacija().contains(titleExpected));
    }

    @Kada("u tražilicu Pretraži projekt Wikipedija upišem {string}")
    public void uTražilicuPretražiProjektWikipedijaUpišem(String searchInput) {
        WikipedijaPortugalskaNogometnaReprezentacija wikipedijaPortugalskaNogometnaReprezentacija=new WikipedijaPortugalskaNogometnaReprezentacija(driver);
        wikipedijaPortugalskaNogometnaReprezentacija.clickOnSearchInput();
        wikipedijaPortugalskaNogometnaReprezentacija.writeText(searchInput);
    }

    @I("odaberem opciju za pretragu")
    public void odaberemOpcijuZaPretragu() {
        WikipedijaPortugalskaNogometnaReprezentacija wikipedijaPortugalskaNogometnaReprezentacija=new WikipedijaPortugalskaNogometnaReprezentacija(driver);
        wikipedijaPortugalskaNogometnaReprezentacija.clickOnSearchButton();
    }

    @Onda("će mi se prikazati posljednja stranica {string}")
    public void ćeMiSePrikazatiPosljednjaStranica(String titleExpected) {
        WikipedijaHrvatskaNogometnaReprezentacija wikipedijaHrvatskaNogometnaReprezentacija=new WikipedijaHrvatskaNogometnaReprezentacija(driver);
        Assert.assertTrue(wikipedijaHrvatskaNogometnaReprezentacija.getPageTitle().contains(titleExpected));
        driver.close();
    }

    @Kada("odaberem link Glazba")
    public void odaberemLinkGlazba() {

    }
}
