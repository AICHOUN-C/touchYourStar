package com.hackathon3.api.entities;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

@Entity
@Table(name = "card")
@AssociationOverrides({
    @AssociationOverride(name = "pk.product",
        joinColumns = @JoinColumn(name = "product_id")),
    @AssociationOverride(name = "pk.user",
        joinColumns = @JoinColumn(name = "user_id")) })
public class Card implements java.io.Serializable {
    private CardId pk = new CardId();
    private Date createdDate;
    private int quantité;

    public Card() { }

    @EmbeddedId
    public CardId getPk() {
        return pk;
    }

    public void setPk(CardId pk) {
        this.pk = pk;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "created_date", nullable = false, length = 10)
    public Date getCreatedAt() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Transient
    public int getQuantité() {
        return quantité;
    }

    public void setQuantité(int quantité) {
        this.quantité = quantité;
    }
}
