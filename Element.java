public class Element {
    //fields
    int type;
    int intElement;
    double doubleElement;
    String stringElement;

    public Element(int type) {
        type = this.type;
    }

    public String toString() {
        String s = "";
        if (type == 0) s += intElement;
        else if (type == 1) s += doubleElement;
        else if (type == 2) s += stringElement;
        return s;
    }

}
