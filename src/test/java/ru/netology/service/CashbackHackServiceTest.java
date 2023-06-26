package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        Assert.assertEquals(cashbackHackService.remain(amount), 0);
    }

    @Test
    public void testRemainWithCashback() {
        CashbackHackService cashbackHackService = new CashbackHackService();git status
        int amount = 900;

        Assert.assertEquals(cashbackHackService.remain(amount), 100);
    }
}