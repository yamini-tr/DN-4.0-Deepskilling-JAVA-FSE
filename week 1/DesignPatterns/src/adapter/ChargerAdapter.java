package adapter;

public class ChargerAdapter implements NewCharger {
    private final OldCharger oldCharger;

    public ChargerAdapter(OldCharger oldCharger) {
        this.oldCharger = oldCharger;
    }

    @Override
    public void chargeWithFlatPin() {
        System.out.println("Adapter converts flat pin to round pin.");
        oldCharger.chargeWithRoundPin();
    }
}
