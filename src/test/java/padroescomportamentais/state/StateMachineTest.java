package padroescomportamentais.state;

import org.junit.Test;
import static org.junit.Assert.*;

public class StateMachineTest {
    @Test
    public void testPositiveState() {
        StateMachine machine = new StateMachine(new PositiveState());
        assertTrue(machine.isPositive());
        assertFalse(machine.isNegative());
        assertFalse(machine.isZero());
        machine.setState(new NegativeState());
        assertFalse(machine.isPositive());
        assertTrue(machine.isNegative());
        assertFalse(machine.isZero());
        machine.setState(new ZeroState());
        assertFalse(machine.isPositive());
        assertFalse(machine.isNegative());
        assertTrue(machine.isZero());
    }

    @Test
    public void testNegativeState() {
        StateMachine machine = new StateMachine(new NegativeState());
        assertFalse(machine.isPositive());
        assertTrue(machine.isNegative());
        assertFalse(machine.isZero());
        machine.setState(new PositiveState());
        assertTrue(machine.isPositive());
        assertFalse(machine.isNegative());
        assertFalse(machine.isZero());
        machine.setState(new ZeroState());
        assertFalse(machine.isPositive());
        assertFalse(machine.isNegative());
        assertTrue(machine.isZero());
    }

    @Test
    public void testZeroState() {
        StateMachine machine = new StateMachine(new ZeroState());
        assertFalse(machine.isPositive());
        assertFalse(machine.isNegative());
        assertTrue(machine.isZero());
        machine.setState(new PositiveState());
        assertTrue(machine.isPositive());
        assertFalse(machine.isNegative());
        assertFalse(machine.isZero());
        machine.setState(new NegativeState());
        assertFalse(machine.isPositive());
        assertTrue(machine.isNegative());
        assertFalse(machine.isZero());
    }
}

