package com.cfarrend.AusTravelSim;

public enum State {
    ACT, NSW, NT, QLD, SA, TAS, VIC, WA;

    private String nameAbbrev;
    private String nameFull;
    private String capital;

    static {
        ACT.nameAbbrev = "ACT";
        NSW.nameAbbrev = "NSW";
        NT.nameAbbrev = "NT";
        QLD.nameAbbrev = "QLD";
        SA.nameAbbrev = "SA";
        TAS.nameAbbrev = "TAS";
        VIC.nameAbbrev = "VIC";
        WA.nameAbbrev = "WA";
    }

    static {
        ACT.nameFull = "Australia Capital Territory";
        NSW.nameFull = "New South Wales";
        NT.nameFull = "Northern Territory";
        QLD.nameFull = "Queensland";
        SA.nameFull = "South Australia";
        TAS.nameFull = "Tasmania";
        VIC.nameFull = "Victoria";
        WA.nameFull = "Western Australia";
    }

    static {
        ACT.capital = "Canberra";
        NSW.capital = "Sydney";
        NT.capital = "Darwin";
        QLD.capital = "Brisbane";
        SA.capital = "Adelaide";
        TAS.capital = "Hobart";
        VIC.capital = "Melbourne";
        WA.capital = "Perth";
    }

    public String getNameAbbrev() {
        return nameAbbrev;
    }

    public String getNameFull() {
        return nameFull;
    }

    public String getCapital() {
        return capital;
    }
}
