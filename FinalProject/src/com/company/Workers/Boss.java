package com.company.Workers;


public class Boss extends Worker {

    private String n = "Assem";//There should be only one Boss, the name and surname

    private String sn = "Assemova";


    public Boss(String n, String sn) {

        super(n, sn);

        //this.n="Assem";

        //this.sn="Assemova";


    }

    @Override
    public Boolean GetVacation() {
        return true;
    }

    @Override

    public int GetSalary() {

        // TODO Auto-generated method stub
        return 500000;
    }
}
