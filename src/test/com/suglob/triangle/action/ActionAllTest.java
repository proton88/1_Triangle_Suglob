package test.com.suglob.triangle.action;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses( { ActionRightTriangleTestFalse.class, ActionTriangleTestFalse.class,
        ActionTriangleTestTrue.class, ActionTrigonometryTest.class } )
@RunWith(Suite.class)
public class ActionAllTest {
}
