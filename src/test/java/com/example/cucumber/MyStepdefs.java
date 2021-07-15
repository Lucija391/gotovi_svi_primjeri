package com.example.cucumber;


import io.cucumber.java.hr.I;
import io.cucumber.java.hr.Kada;
import io.cucumber.java.hr.Onda;
import io.cucumber.java.hr.Zadano;
import org.jruby.runtime.callsite.AsetCallSite;
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
        WikipedijaGlavnaStranica wikipedijaGlavnaStranica= new WikipedijaGlavnaStranica(driver);
        wikipedijaGlavnaStranica.chooseGlazba();
    }

    @Onda("će mi se prikazati stranica o glazbi {string}")
    public void ćeMiSePrikazatiStranicaOGlazbi(String titleExpected) {
        WikipedijaPortalGlazba wikipedijaPortalGlazba=new WikipedijaPortalGlazba(driver);
        Assert.assertTrue(wikipedijaPortalGlazba.getPageTitle().contains(titleExpected));
    }

    @Kada("odaberem link {string}")
    public void odaberemLink(String linkTitle) {
        WikipedijaPortalGlazba wikipedijaPortalGlazba=new WikipedijaPortalGlazba(driver);
        wikipedijaPortalGlazba.chooseLinkBeatles();
    }

    @Onda("će mi se prikazati stranica o bendu {string}")
    public void ćeMiSePrikazatiStranicaOBendu(String titleExpected) {
        WikipedijaPortalBeatles wikipedijaPortalBeatles=new WikipedijaPortalBeatles(driver);
        wikipedijaPortalBeatles.getPageTitle();
    }

    @Kada("u tražilicu Pretraži Wikipedija upišem {string}")
    public void uTražilicuPretražiWikipedijaUpišem(String searchInput) {
        WikipedijaPortalBeatles wikipedijaPortalBeatles=new WikipedijaPortalBeatles(driver);
        wikipedijaPortalBeatles.clickOnSearchInput();
        wikipedijaPortalBeatles.writeText(searchInput);
    }

    @I("odaberem predloženu opciju pretrage")
    public void odaberemPredloženuOpcijuPretrage() {
        WikipedijaPortalBeatles wikipedijaPortalBeatles=new WikipedijaPortalBeatles(driver);
        wikipedijaPortalBeatles.chooseSuggestedOption();
    }


    @Onda("će mi se prikazati pretražena stranica {string}")
    public void ćeMiSePrikazatiPretraženaStranica(String titleExpected) {
        WikipedijaPortalBeethoven wikipedijaPortalBeethoven=new WikipedijaPortalBeethoven(driver);
        Assert.assertTrue(wikipedijaPortalBeethoven.getPortalTitle().contains(titleExpected));
        driver.close();
    }

    @Kada("odaberem poveznicu Prijavi se")
    public void odaberemPoveznicuPrijaviSe() {
        WikipedijaGlavnaStranica wikipedijaGlavnaStranica=new WikipedijaGlavnaStranica(driver);
        wikipedijaGlavnaStranica.choosePrijava();
    }


    @Onda("će mi se prikazati stranica za prijavu {string}")
    public void ćeMiSePrikazatiStranicaZaPrijavu(String titleExpected) {
        WikipedijaPrijava wikipedijaPrijava=new WikipedijaPrijava(driver);
        Assert.assertTrue(wikipedijaPrijava.getTitle().contains(titleExpected));
    }

    @Kada("upišem korisničko ime {string}")
    public void upišemKorisničkoIme(String usernameInput) {
        WikipedijaPrijava wikipedijaPrijava=new WikipedijaPrijava(driver);
        wikipedijaPrijava.insertUsername(usernameInput);
    }


    @I("upišem lozinku {string}")
    public void upišemLozinku(String passwordInput) {
        WikipedijaPrijava wikipedijaPrijava=new WikipedijaPrijava(driver);
        wikipedijaPrijava.insertPassword(passwordInput);
    }

    @I("označim da se login podaci zapamte")
    public void označimDaSeLoginPodaciZapamte() {
        WikipedijaPrijava wikipedijaPrijava=new WikipedijaPrijava(driver);
        wikipedijaPrijava.checkRemeberLoginData();
    }

    @I("odaberem gumb za prijavu")
    public void odaberemGumbZaPrijavu() {
        WikipedijaPrijava wikipedijaPrijava=new WikipedijaPrijava(driver);
        wikipedijaPrijava.submitLoginData();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Onda("bi mi se trebala pojaviti glavna stranica s naslovom{string}")
    public void biMiSeTrebalaPojavitiGlavnaStranicaSNaslovom(String titleExpected) {
        WikipedijaGlavnaStranica wikipedijaGlavnaStranica=new WikipedijaGlavnaStranica(driver);
        Assert.assertTrue(wikipedijaGlavnaStranica.getTitle().contains(titleExpected));
    }

    @I("poveznica za odjavu bi trebala biti vidljiva")
    public void poveznicaBiTrebalaBitiVidljiva() {
        WikipedijaGlavnaStranica wikipedijaGlavnaStranica=new WikipedijaGlavnaStranica(driver);
        Assert.assertTrue(wikipedijaGlavnaStranica.checkOdjava());
    }

    @Kada("odaberem poveznicu Odjava")
    public void odaberemPoveznicuOdjava() {
        WikipedijaGlavnaStranica wikipedijaGlavnaStranica=new WikipedijaGlavnaStranica(driver);
        wikipedijaGlavnaStranica.chooseOdjava();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    @Onda("mi je prikazana stranica s naslovom {string}")
    public void miJePrikazanaStranicaSNaslovom(String titleExpected) {
        WikipedijaOdjava wikipedijaOdjava=new WikipedijaOdjava(driver);
        Assert.assertTrue(wikipedijaOdjava
                .getTitle()
                .contains(titleExpected));
    }

    @I("poveznica za prijavu bi se trebala prikazati")
    public void poveznicaZaPrijavuBiSeTrebalaPrikazati() {
        WikipedijaGlavnaStranica wikipedijaGlavnaStranica=new WikipedijaGlavnaStranica(driver);
        Assert.assertTrue(wikipedijaGlavnaStranica.checkPrijava());
    }

    @Onda("mi je prikazan tekst {string}")
    public void miJePrikazanTekst(String expectedText) {
        WikipedijaGlavnaStranica wikipedijaGlavnaStranica=new WikipedijaGlavnaStranica(driver);
        Assert.assertTrue(wikipedijaGlavnaStranica.getLoginStatus().contains(expectedText));
    }

    @I("korisničko ime prijavljenog korisnika bi trebalo biti {string}")
    public void korisničkoImePrijavljenogKorisnikaBiTrebaloBiti(String username) {
        WikipedijaGlavnaStranica wikipedijaGlavnaStranica=new WikipedijaGlavnaStranica(driver);
        Assert.assertTrue(wikipedijaGlavnaStranica.getNameOfLoginUser().contains(username));
    }
}
