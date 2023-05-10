package padroescomportamentais.state;

public class StateMachine {
    private State currentState;

    public StateMachine(State initialState) {
        currentState = initialState;
    }

    public boolean isPositive() {
        return currentState.isPositive();
    }

    public boolean isNegative() {
        return currentState.isNegative();
    }

    public boolean isZero() {
        return currentState.isZero();
    }

    public void setState(State newState) {
        currentState = newState;
    }
}