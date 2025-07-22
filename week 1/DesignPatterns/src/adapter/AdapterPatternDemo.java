package adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        OldCharger oldCharger = new OldCharger();


        NewCharger adapter = new ChargerAdapter(oldCharger);
        adapter.chargeWithFlatPin();
    }
}
