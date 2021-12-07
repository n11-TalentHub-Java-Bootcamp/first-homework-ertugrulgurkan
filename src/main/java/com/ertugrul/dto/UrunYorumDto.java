package com.ertugrul.dto;

import java.math.BigDecimal;
import java.util.Date;

public class UrunYorumDto {

    private String urunAdi;
    private String kategoriAdi;
    private BigDecimal fiyat;
    private String kullanciAdi;
    private String kullaniciSoyadi;
    private String kullaniciEmail;
    private String kullaniciTelefon;
    private String yorum;
    private Date yorumTarihi;

    public UrunYorumDto(String urunAdi, String kategoriAdi, BigDecimal fiyat, String kullanciAdi, String kullaniciSoyadi, String kullaniciEmail, String kullaniciTelefon, String yorum, Date yorumTarihi) {
        this.urunAdi = urunAdi;
        this.kategoriAdi = kategoriAdi;
        this.fiyat = fiyat;
        this.kullanciAdi = kullanciAdi;
        this.kullaniciSoyadi = kullaniciSoyadi;
        this.kullaniciEmail = kullaniciEmail;
        this.kullaniciTelefon = kullaniciTelefon;
        this.yorum = yorum;
        this.yorumTarihi = yorumTarihi;
    }
    public UrunYorumDto() {
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public String getKategoriAdi() {
        return kategoriAdi;
    }

    public void setKategoriAdi(String kategoriAdi) {
        this.kategoriAdi = kategoriAdi;
    }

    public BigDecimal getFiyat() {
        return fiyat;
    }

    public void setFiyat(BigDecimal fiyat) {
        this.fiyat = fiyat;
    }

    public String getKullanciAdi() {
        return kullanciAdi;
    }

    public void setKullanciAdi(String kullanciAdi) {
        this.kullanciAdi = kullanciAdi;
    }

    public String getKullaniciSoyadi() {
        return kullaniciSoyadi;
    }

    public void setKullaniciSoyadi(String kullaniciSoyadi) {
        this.kullaniciSoyadi = kullaniciSoyadi;
    }

    public String getKullaniciEmail() {
        return kullaniciEmail;
    }

    public void setKullaniciEmail(String kullaniciEmail) {
        this.kullaniciEmail = kullaniciEmail;
    }

    public String getKullaniciTelefon() {
        return kullaniciTelefon;
    }

    public void setKullaniciTelefon(String kullaniciTelefon) {
        this.kullaniciTelefon = kullaniciTelefon;
    }

    public String getYorum() {
        return yorum;
    }

    public void setYorum(String yorum) {
        this.yorum = yorum;
    }

    public Date getYorumTarihi() {
        return yorumTarihi;
    }

    public void setYorumTarihi(Date yorumTarihi) {
        this.yorumTarihi = yorumTarihi;
    }

    @Override
    public String toString() {
        return "UrunYorumDto{" +
                "urunAdi='" + urunAdi + '\'' +
                ", kategoriAdi='" + kategoriAdi + '\'' +
                ", fiyat=" + fiyat +
                ", kullanciAdi='" + kullanciAdi + '\'' +
                ", kullaniciSoyadi='" + kullaniciSoyadi + '\'' +
                ", kullaniciEmail='" + kullaniciEmail + '\'' +
                ", kullaniciTelefon='" + kullaniciTelefon + '\'' +
                ", yorum='" + yorum + '\'' +
                ", yorumTarihi=" + yorumTarihi +
                '}';
    }
}