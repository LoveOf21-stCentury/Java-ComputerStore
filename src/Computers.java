public class Computers {
    private static int count = 0;
    private int order;
    private String color;
    private String model;
    private String oc;
    private int ram;
    private int hhd;

    private void setValues(String color, String model, String oc,
                           int ram, int hhd) {
        this.order = ++count;
        this.color = color;
        this.model = model;
        this.oc = oc;
        this.ram = ram;
        this.hhd = hhd;
    }

    public Computers(String color, String model, String oc, int ram,
                     int hhd) {
        setValues(color, model, oc, ram, hhd);
    }


    public int getOrder() {
        return this.order;
    }

    public String getColor() {
        return this.color;
    }

    public String getModel() {
        return this.model;
    }

    public String getOc() {
        return this.oc;
    }

    public int getRam() {
        return this.ram;
    }

    public int getHhd() {
        return this.hhd;
    }

    @Override
    public String toString() {
        return "Ноутбук: " + model + ": ОЗУ " + ram + " GB" + "; Объем жесткого диска: " + getHhdInfo() +
                "; Операционная система: " + oc +
                "; Цвет: " + color;
    }

    private String getHhdInfo() {
        if (hhd > 0 && hhd <= 10) {
            return hhd + " Tb";
        } else {
            return hhd + " Gb";
        }
    }
}
