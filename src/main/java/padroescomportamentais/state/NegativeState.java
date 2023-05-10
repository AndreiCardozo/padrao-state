package padroescomportamentais.state;

public class NegativeState implements State {
    @Override
    public boolean isPositive() {
        return false;
    }

    @Override
    public boolean isNegative() {
        return true;
    }

    @Override
    public boolean isZero() {
        return false;
    }
}
