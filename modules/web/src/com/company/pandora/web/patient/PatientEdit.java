package com.company.pandora.web.patient;

import com.company.pandora.entity.*;
import com.haulmont.cuba.core.global.Messages;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.components.TextArea;
import com.haulmont.cuba.web.gui.components.WebTextField;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Map;

public class PatientEdit extends AbstractEditor<Patient> {


    @Inject
    private Metadata metadata;


    @Named("diagnosTable.diagnosis")
    private TextArea diagnoses;

    @Named("diagnosTable.tumorType")
    private LookupField tumorType;

    @Named("diagnosTable.hepar_parts")
    private LookupField hepar_parts;

    @Named("diagnosTable.additional_diagnosis")
    private LookupField additional_diagnosis;

    @Named("diagnosTable.pretext_stage")
    private LookupField pretex;

    @Named("diagnosTable.speigelian_lobe_affect")
    private LookupField lobe_affevt;

    @Named("diagnosTable.hepar_out_expansion")
    private LookupField hepar_out_expansion;

    @Named("diagnosTable.focal")
    private LookupField focal;

    @Named("diagnosTable.tumor_explosion")
    private LookupField tumor_explosion;

    @Named("diagnosTable.remote_metastasis")
    private LookupField remote_metastasis;

    @Named("diagnosTable.lymph_nodes_affect")
    private LookupField lymph_nodes_affect;

    @Named("diagnosTable.portal_vein_involve")
    private LookupField portal_vein_involve;

    @Named("diagnosTable.hepar_vein_involve")
    private LookupField hepar_vein_involve;

    private LookupField[] diagList;

    @Inject
    protected Messages messages;

    public void onEdit(Component source) {
    }

    @Override
    protected void initNewItem(Patient item) {
        item.setDiagnos(metadata.create(Diagnosis.class));
        item.setTherapy(metadata.create(Therapy.class));
        item.setSurgery(metadata.create(Surgery.class));
        item.setTreatment(metadata.create(TreatmentRating.class));
        item.setEvent(metadata.create(Event.class));


        item.getEvent().setRelapse(metadata.create(Relapse.class));
        item.getTreatment().setEar_rating(metadata.create(EarRating.class));
        item.getTherapy().setProtocol(metadata.create(Protocol.class));
        item.getTherapy().setTc99_scintigraphy(metadata.create(Tc99Scintigraphy.class));
        item.getTherapy().setMyelogram(metadata.create(Myelogram.class));

    }

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);


        diagList = new LookupField[]{tumorType, hepar_parts, additional_diagnosis, pretex, lobe_affevt, hepar_out_expansion, focal, tumor_explosion, remote_metastasis, lymph_nodes_affect, portal_vein_involve, hepar_vein_involve};


        for (int i = 1; i < diagList.length; i++ )
        {
            diagList[i].setVisible(false);
        }


        tumorType.addValueChangeListener( e -> {
            hepar_parts.setVisible(true);
        });


        tumorType.addValueChangeListener(e -> {
            ifFieldChanged(0, e);
            setDiagnos();
        });

        hepar_parts.addValueChangeListener(e -> {
            ifFieldChanged(1, e);
            setDiagnos();
        });

        additional_diagnosis.addValueChangeListener(e ->{
            ifFieldChanged(2, e);
            setDiagnos();
        });

        pretex.addValueChangeListener(e -> {
            ifFieldChanged(3, e);
            setDiagnos();
        });

        lobe_affevt.addValueChangeListener(e -> {
            ifFieldChanged(4, e);
            setDiagnos();
        });

        hepar_out_expansion.addValueChangeListener(e -> {
            ifFieldChanged(5, e);
            setDiagnos();
        });

        focal.addValueChangeListener(e -> {
            ifFieldChanged(6, e);
            setDiagnos();
        });

        tumor_explosion.addValueChangeListener(e -> {
            ifFieldChanged(7, e);
            setDiagnos();
        });

        remote_metastasis.addValueChangeListener(e -> {
            ifFieldChanged(8, e);
            setDiagnos();
        });

        lymph_nodes_affect.addValueChangeListener(e -> {
            ifFieldChanged(9, e);
            setDiagnos();
        });

        portal_vein_involve.addValueChangeListener(e -> {
            ifFieldChanged(10, e);
            setDiagnos();
        });

        hepar_vein_involve.addValueChangeListener(e -> {
            ifFieldChanged(11, e);
            setDiagnos();
        });


    }


    private void setVisBot(int start)
    {
        for(int i = start; i < diagList.length; i++)
        {
            if(diagList[i].getValue() != null)
            {
                diagList[i].setVisible(true);
            }
            else
            {
                diagList[i].setVisible(true);
                break;
            }
        }
    }

    private void setUnvisBot(int start)
    {
        for (int i = start; i < diagList.length; i++ )
        {
            diagList[i].setVisible(false);
        }
    }

    private void ifFieldChanged(int position, ValueChangeEvent fieldVal)
    {
        if (fieldVal.getValue() != null)
        {
            setVisBot(position+1);
        } else
        {
            setUnvisBot(position + 1);
        }
    }

    private void setDiagnos()
    {
        String diagnos = new String();
        for (int i = 0; i < diagList.length; i++)
        {

            if(diagList[i].isVisible() && (diagList[i].getValue() != null))
            {
                diagnos = diagnos.concat(messages.getMessage(diagList[i].getValue()) + " > ");
            }
            else
            {
                break;
            }

        }

        diagnos = diagnos.substring(0, diagnos.length() - 2);
        diagnoses.setValue(diagnos);
    }


}