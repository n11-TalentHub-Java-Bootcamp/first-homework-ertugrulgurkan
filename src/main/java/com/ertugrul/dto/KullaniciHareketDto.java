package com.ertugrul.dto;

import java.util.Date;

public class KullaniciHareketDto {
    private Long kullaniciId;
    private String kullaniciAdi;
    private String urunAdi;
    private String yorum;
    private Date yorumTarihi;

    public KullaniciHareketDto(Long kullaniciId, String kullaniciAdi, String urunAdi, String yorum, Date yorumTarihi) {
        this.kullaniciId = kullaniciId;
        this.kullaniciAdi = kullaniciAdi;
        this.urunAdi = urunAdi;
        this.yorum = yorum;
        this.yorumTarihi = yorumTarihi;
    }

    public KullaniciHareketDto() {
    }

    public long getKullaniciId() {
        return kullaniciId;
    }

    public void setKullaniciId(Long kullaniciId) {
        this.kullaniciId = kullaniciId;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
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
        return "KullaniciHareketDto{" +
                "kullaniciId=" + kullaniciId +
                ", kullaniciAdi='" + kullaniciAdi + '\'' +
                ", urunAdi='" + urunAdi + '\'' +
                ", yorum='" + yorum + '\'' +
                ", yorumTarihi=" + yorumTarihi +
                '}';
    }
}
