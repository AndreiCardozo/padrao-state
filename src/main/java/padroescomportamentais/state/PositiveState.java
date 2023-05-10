package padroescomportamentais.state;

public class PositiveState implements State {
    @Override
    public boolean isPositive() {
        return true;
    }

    @Override
    public boolean isNegative() {
        return false;
    }

    @Override
    public boolean isZero() {
        return false;
    }
}