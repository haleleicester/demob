package com.example.gapp;


/**
 * Created by he282 on 11/11/2015.
 */
public class Patient {

    private int ID;
    private String NHS_Num;
    private String FirstName;
    private String LastName;
    private int BirthDay;
    private int BirthMonth;
    private int BirthYear;

   private String Date;

  /*  Patient(String FName, String LName, String nhsNum)
    {
        FName = this.FirstName;
       LName = this.LastName;
       *//*BDay= this.BirthDay;
       BMonth= this.BirthMonth;
       BYear= this.BirthYear;*//*
        nhsNum = this.NHS_Num;

    }*/

    void setName(String first, String last){
        this.FirstName=first;
        this.LastName=last;
    }

    void setNHS(String iNHSNum){
        this.NHS_Num = iNHSNum;
    }

    void setDOB(String sDate){
        this.Date = sDate;
    }

    String getName(){
        return FirstName + LastName;
    }

    String getNHS(){
        return NHS_Num;
    }

    String getDOB(){
        return Integer.toString(BirthDay) + "/" + Integer.toString(BirthMonth) + "/" + Integer.toString(BirthYear);
    }

    Patient(){
        this.ID = 0;
    }


}
