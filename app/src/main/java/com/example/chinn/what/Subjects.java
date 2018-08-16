package com.example.chinn.what;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Subjects extends AppCompatActivity{

    int link=2;

    String qpName;
    ArrayList<String> reqSubjectsNames = new ArrayList<String>();

    Subject M1 = new Subject("Mathematics-1",1,1);
    Subject EP1 = new Subject("Engineering Physics-1",1,1);
    Subject Chemistry = new Subject("Chemistry",1,1);
    Subject BEEE = new Subject("BEEE",1,1);
    Subject Mechanics = new Subject("Mechanics",1,1);
    Subject M2 = new Subject("Mathematics-2",2,1);
    Subject M3 = new Subject("Mathematics-3",2,1);
    Subject EP2 = new Subject("Engineering Physics 2",2,1);
    Subject CP = new Subject("Computer programming in C",2,1);
    Subject ED = new Subject("Engineering Drawing",2,1);



    // 2-2 Subjects

    //CSE

    Subject ComputerOrganisation = new Subject("ComputerOrganization",4,1);
    Subject DBMS = new Subject ("DatabaseManagementSystem",4,1);
    Subject DAA = new Subject ("DesignandAnalysisofAlgorithms",4,1);
    Subject ES = new Subject ("EnvironmentalStudies",4,1);
    Subject FLAA = new Subject ("FormalLanguagesandAutomataTheory",4,1);
    Subject JP = new Subject("JavaProgramming",4,1);

    //ECE

    Subject DigitalDesignusingVerilogHDL = new Subject("DigitalDesignusingVerilogHDL",4,2);
    Subject ElectromagneticTheoryandTransmissionLines = new Subject("ElectromagneticTheoryandTransmissionLines",4,2);
    Subject ElectronicCircuitAnalysis = new Subject("ElectronicCircuitAnalysis",4,2);
    Subject PrinciplesofElectricalEngineering= new Subject("PrinciplesofElectricalEngineering",4,2);
    Subject PulseandDigitalCircuits = new Subject("PulseandDigitalCircuits",4,2);



    //EEE
    Subject ElectricalMachines2 = new Subject("ElectricalMachines2",4,3);
    Subject ElectronicCircuits = new Subject("ElectronicCircuits",4,3);
    Subject ManagerialEconomicsandFinancialAnalysis = new Subject("ManagerialEconomicsandFinancialAnalysis",4,3);
    Subject NetworkTheory= new Subject("NetworkTheory",4,3);
    Subject PowerSystems1= new Subject("PowerSystems1",4,3);
    Subject SwitchingTheoryandLogicDesign= new Subject("SwitchingTheoryandLogicDesign",4,3);

    //IT

    Subject DataCommunication = new Subject("DataCommunication",4,4);
    Subject PrinciplesOfProgrammingLanguages = new Subject("PrinciplesOfProgrammingLanguages",4,4);


    //MECH
    Subject KinematicsofMachines= new Subject("KinematicsofMachines",4,5);
    Subject MachineDrawing= new Subject("MachineDrawing",4,5);
    Subject Mathematics2= new Subject("Mathematics2",4,5);
    Subject MechanicsOfFluidsandHydraulicMachines= new Subject("MechanicsOfFluidsandHydraulicMachines",4,5);
    Subject ProductionTechnology= new Subject("ProductionTechnology",4,5);
    Subject ThermalEnginerring1= new Subject("ThermalEnginerring-1",4,5);


    //Civil
    Subject BuildingMaterialsConstructionandPlanning = new Subject("BuildingMaterials,ConstructionandPlanning",4,6);
    Subject HydraulicsandHydraulicMachinery= new Subject("HydraulicsandHydraulicMachinery",4,6);
    Subject ProbabilityandStatistics= new Subject("ProbabilityandStatistics",4,6);
    Subject StrengthofMaterials2= new Subject("StrengthofMaterials-2",4,6);
    Subject StructuralAnalysis1= new Subject("StructuralAnalysis-1",4,6);
    Subject EnvironmentalStudies45= new Subject("EnvironmentalStudies",4,6);





    @Override
    protected void onCreate(Bundle savedInstanceState)
    {




        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);




        Bundle extras = getIntent().getExtras();
        int year = extras.getInt("yeaar");
        int Branch = extras.getInt("branch");

        if(year == 1 || year == 2)
        {
            if (Branch >0 && Branch <5)
                Branch = 1;
            else if(Branch > 4)
                Branch = 2;

        }




        ListView subList = (ListView) findViewById(R.id.a1);




        ArrayList<Subject> AllSubjects = new ArrayList<Subject>();
        ArrayList<Subject> ReqSubjects = new ArrayList<Subject>();
        AllSubjects.add(M1);
        AllSubjects.add(EP1);
        AllSubjects.add(Chemistry);
        AllSubjects.add(BEEE);
        AllSubjects.add(Mechanics);
        AllSubjects.add(M2);
        AllSubjects.add(M3);
        AllSubjects.add(EP2);
        AllSubjects.add(CP);
        AllSubjects.add(ED);
        //2-2 Cse
        AllSubjects.add(ComputerOrganisation);
        AllSubjects.add(DBMS);
        AllSubjects.add(DAA);
        AllSubjects.add(FLAA);
        AllSubjects.add(ES);
        AllSubjects.add(JP);


        //2-2 ECE
        AllSubjects.add(DigitalDesignusingVerilogHDL);
        AllSubjects.add(ElectromagneticTheoryandTransmissionLines);
        AllSubjects.add(ElectronicCircuitAnalysis);
        AllSubjects.add(PrinciplesofElectricalEngineering);
        AllSubjects.add(PulseandDigitalCircuits);

        // 2-2 EEE
        AllSubjects.add(ElectricalMachines2);
        AllSubjects.add(ElectronicCircuits);
        AllSubjects.add(ManagerialEconomicsandFinancialAnalysis);
        AllSubjects.add(NetworkTheory);
        AllSubjects.add(PowerSystems1);
        AllSubjects.add(SwitchingTheoryandLogicDesign);

        //2-2 IT
        AllSubjects.add(DataCommunication);
        AllSubjects.add(PrinciplesOfProgrammingLanguages);

        if(year == 4 && Branch == 4) {
            ReqSubjects.add(ES);
            ReqSubjects.add(DBMS);
            ReqSubjects.add(JP);
            ReqSubjects.add(DAA);

        }
        //2-2 MECH
        AllSubjects.add(Mathematics2);
        AllSubjects.add(ThermalEnginerring1);
        AllSubjects.add(MachineDrawing);
        AllSubjects.add(KinematicsofMachines);
        AllSubjects.add(MechanicsOfFluidsandHydraulicMachines);
        AllSubjects.add(ProductionTechnology);

        //2-2 Civil
        AllSubjects.add(BuildingMaterialsConstructionandPlanning);
        AllSubjects.add(HydraulicsandHydraulicMachinery);
        AllSubjects.add(ProbabilityandStatistics);
        AllSubjects.add(StrengthofMaterials2);
        AllSubjects.add(StructuralAnalysis1);
        AllSubjects.add(EnvironmentalStudies45);







        for (Subject sub:AllSubjects)
        {

            if (year == sub.year && Branch == sub.branch)
            {
                ReqSubjects.add(sub);
            }

        }




        for (Subject reqSub:ReqSubjects)
        {
            reqSubjectsNames.add(reqSub.name);
        }

        ArrayAdapter SubjectsList = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,reqSubjectsNames);

        subList.setAdapter(SubjectsList);

        qpName = reqSubjectsNames.get(link);
        subList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                qpName = reqSubjectsNames.get(i);
                openQP();

            }
        });


    }

    public void openQP(){

        Intent qp = new Intent(getApplicationContext(), QuestionPapersView.class);
        qp.putExtra("qpPDF",qpName);
        startActivity(qp);
    }
}

