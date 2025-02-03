package org.BelajarTesNG;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ATMTest {
    private ATM atm;

    @BeforeMethod
    public void setUp() {
        atm = new ATM(1000.0); // Inisialisasi ATM dengan saldo awal 1000.0 (double)
    }

    @Test
    public void testLihatSaldo() {
        double expectedSaldo = 1000.0;
        double actualSaldo = atm.lihatSaldo();
        Assert.assertEquals(actualSaldo, expectedSaldo, "Saldo tidak sesuai");
    }

    @Test
    public void testSetorUang() {
        double jumlahSetor = 500.0;
        atm.setorUang(jumlahSetor);
        double expectedSaldo = 1500.0;
        double actualSaldo = atm.lihatSaldo();
        Assert.assertEquals(actualSaldo, expectedSaldo, "Saldo setelah setor tidak sesuai");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testSetorUangNegatif() {
        atm.setorUang(-100.0);
    }

    @Test
    public void testTarikUang() {
        double jumlahTarik = 300.0;
        atm.tarikUang(jumlahTarik);
        double expectedSaldo = 700.0;
        double actualSaldo = atm.lihatSaldo();
        Assert.assertEquals(actualSaldo, expectedSaldo, "Saldo setelah tarik tidak sesuai");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTarikUangLebihDariSaldo() {
        atm.tarikUang(2000.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTarikUangNegatif() {
        atm.tarikUang(-100.0);
    }
}