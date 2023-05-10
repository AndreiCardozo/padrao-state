package padroescomportamentais.state;

public class ZeroState implements State {
    @Override
    public boolean isPositive() {
        return false;
    }

    @Override
    public boolean isNegative() {
        return false;
    }

    @Override
    public boolean isZero() {
        return true;
    }
}