package com.company.pandora.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import java.util.Date;

@Table(name = "PANDORA_COURSE")
@Entity(name = "pandora$Course")
public class Course extends StandardEntity {
    private static final long serialVersionUID = -6388819304587467542L;

    @Column(name = "NAME")
    protected Integer name;

    @Temporal(TemporalType.DATE)
    @Column(name = "START_DATE", nullable = false)
    protected Date start_date;

    @Column(name = "AFP_BEFORE_COURSE")
    protected Integer afp_before_course;

    public Courses getName() {
        return name == null ? null : Courses.fromId(name);
    }

    public void setName(Courses name) {
        this.name = name == null ? null : name.getId();
    }



    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setAfp_before_course(Integer afp_before_course) {
        this.afp_before_course = afp_before_course;
    }

    public Integer getAfp_before_course() {
        return afp_before_course;
    }


}