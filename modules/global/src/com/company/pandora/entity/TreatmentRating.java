package com.company.pandora.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;

@NamePattern("%s|answer_date")
@Table(name = "PANDORA_TREATMENT_RATING")
@Entity(name = "pandora$TreatmentRating")
public class TreatmentRating extends StandardEntity {
    private static final long serialVersionUID = -8769963686328186864L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EAR_RATING_ID")
    protected EarRating ear_rating;

    @Column(name = "EAR_RATING_METHOD")
    protected Integer ear_rating_method;

    @Temporal(TemporalType.DATE)
    @Column(name = "AFP_NORMALIZATION_DATE")
    protected Date afp_normalization_date;

    @Column(name = "ANSWER_TIME")
    protected Integer answer_time;

    @Temporal(TemporalType.DATE)
    @Column(name = "ANSWER_DATE")
    protected Date answer_date;

    @Column(name = "ANSWER")
    protected Integer answer;

    public EarRating getEar_rating() {
        return ear_rating;
    }

    public void setEar_rating(EarRating ear_rating) {
        this.ear_rating = ear_rating;
    }




    public void setAnswer(TherapyAnswer answer) {
        this.answer = answer == null ? null : answer.getId();
    }

    public TherapyAnswer getAnswer() {
        return answer == null ? null : TherapyAnswer.fromId(answer);
    }


    public EarRatingMethod getEar_rating_method() {
        return ear_rating_method == null ? null : EarRatingMethod.fromId(ear_rating_method);
    }

    public void setEar_rating_method(EarRatingMethod ear_rating_method) {
        this.ear_rating_method = ear_rating_method == null ? null : ear_rating_method.getId();
    }


    public AnswerTime getAnswer_time() {
        return answer_time == null ? null : AnswerTime.fromId(answer_time);
    }

    public void setAnswer_time(AnswerTime answer_time) {
        this.answer_time = answer_time == null ? null : answer_time.getId();
    }



    public void setAfp_normalization_date(Date afp_normalization_date) {
        this.afp_normalization_date = afp_normalization_date;
    }

    public Date getAfp_normalization_date() {
        return afp_normalization_date;
    }

    public void setAnswer_date(Date answer_date) {
        this.answer_date = answer_date;
    }

    public Date getAnswer_date() {
        return answer_date;
    }


}