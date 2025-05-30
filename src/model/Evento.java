package model;

public class Evento {
    private int id;
    private String nm;
    private String end;
    private String cat;
    private String hr;
    private String desc;

    public Evento(String nm, String end, String cat, String hr, String desc) {
        this.nm = nm;
        this.end = end;
        this.cat = cat;
        this.hr = hr;
        this.desc = desc;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNm() { return nm; }
    public String getEnd() { return end; }
    public String getCat() { return cat; }
    public String getHr() { return hr; }
    public String getDesc() { return desc; }
}
