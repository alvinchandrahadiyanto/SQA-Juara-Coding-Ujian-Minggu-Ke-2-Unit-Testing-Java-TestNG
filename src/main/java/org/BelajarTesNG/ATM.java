package org.BelajarTesNG;

public class ATM {
    private static double saldo;
    public ATM(double saldoAwal) {
        this.saldo = saldoAwal;
    }

    public static double lihatSaldo() {
        return saldo;
    }

    public static void setorUang(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
        } else {
            throw new IllegalArgumentException("Jumlah harus lebih besar dari 0");
        }
    }

    public void tarikUang(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
        } else if (jumlah > saldo) {
            throw new IllegalArgumentException("Saldo tidak mencukupi");
        } else {
            throw new IllegalArgumentException("Jumlah harus lebih besar dari 0");
        }
    }
}
