package com.ertugrul.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "URUN_YORUM")
public class UrunYorum {

    @SequenceGenerator(name = "generator", sequenceName = "URUN_YORUM_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(length = 500, name = "YORUM")
    private String yorum;

    @Column(name = "YORUM_TARIHI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date yorumTarihi;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "KULLANICI_ID",
            foreignKey = @ForeignKey(name = "FK_URUN_YORUM_KULLANICI_ID")
    )
    private Kullanici kullanici;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "URUN_ID",
            foreignKey = @ForeignKey(name = "FK_URUN_YORUM_URUN_ID")
    )
    private Urun urun;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Kullanici getKullanici() {
        return kullanici;
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }

    public Urun getUrun() {
        return urun;
    }

    public void setUrun(Urun urun) {
        this.urun = urun;
    }


    @Override
    public String toString() {
        return "UrunYorum{" +
                "id=" + id +
                ", yorum='" + yorum + '\'' +
                ", yorumTarihi=" + yorumTarihi +
                ", kullanici=" + kullanici +
                ", urun=" + urun +
                '}';
    }
}