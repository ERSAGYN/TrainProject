package rails;

public class Rails {
    boolean electrity;

    public Rails(boolean electrity) {
        this.electrity = electrity;
    }

    public boolean getElectricity() {
        return electrity;
    }

    public void setElectrity(boolean hasElectricity) {
        this.electrity = hasElectricity;
    }

    @Override
    public String toString() {
        return "Rails{" +
                "electrity=" + electrity +
                '}';
    }
}
