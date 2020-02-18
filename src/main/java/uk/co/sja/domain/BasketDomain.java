package uk.co.sja.domain;


import uk.co.sja.pages.BasketPage;

import static org.junit.Assert.assertEquals;

public class BasketDomain {

    BasketPage basketPage = new BasketPage();

    //public BasketDomain clickAddToBasketButton () throws InterruptedException {

        //basketPage.clickBookButton();
        //basketPage.clickAddToBasketButton();
        //Thread.sleep(Long.parseLong("1000"));
        //basketPage.clickGoToBasketButton();
        //return this;
    //}

    public BasketDomain basketContent () {
        basketPage.clickBasketButton();
        return this;
    }

    public void verifyBasketContent() {
        String expected = "basketContent";
        assertEquals(expected, basketPage.getBasketContent());
        System.out.println(basketPage.getBasketContent());
    }
}