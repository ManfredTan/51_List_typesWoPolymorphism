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
        if (type == 0) return s += intElement;
        if (type == 1) return s += doubleElement;
        if (type == 2) {} return s += stringElement;
    }

}
