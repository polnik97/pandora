package com.company.pandora.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;

@NamePattern("%s|date")
@Table(name = "PANDORA_EVENT")
@Entity(name = "pandora$Event")
public class Event extends StandardEntity {
    private static final long serialVersionUID = -1941968331758273082L;

    @Column(name = "EVENT", nullable = false)
    protected Integer event;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RELAPSE_ID")
    protected Relapse relapse;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_", nullable = false)
    protected Date date;

    @Column(name = "STATUS_LAST_SEEN")
    protected Integer status_last_seen;

    @Column(name = "INFO_SOURCE")
    protected String info_source;

    @Column(name = "COMMENTS")
    protected String comments;

    @Column(name = "POSSIBLE_EFFECTS")
    protected String possible_effects;



    public Events getEvent() {
        return event == null ? null : Events.fromId(event);
    }

    public void setEvent(Events event) {
        this.event = event == null ? null : event.getId();
    }


    public LastSeenStatus getStatus_last_seen() {
        return status_last_seen == null ? null : LastSeenStatus.fromId(status_last_seen);
    }

    public void setStatus_last_seen(LastSeenStatus status_last_seen) {
        this.status_last_seen = status_last_seen == null ? null : status_last_seen.getId();
    }


    public void setRelapse(Relapse relapse) {
        this.relapse = relapse;
    }

    public Relapse getRelapse() {
        return relapse;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setInfo_source(String info_source) {
        this.info_source = info_source;
    }

    public String getInfo_source() {
        return info_source;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getComments() {
        return comments;
    }

    public void setPossible_effects(String possible_effects) {
        this.possible_effects = possible_effects;
    }

    public String getPossible_effects() {
        return possible_effects;
    }


}