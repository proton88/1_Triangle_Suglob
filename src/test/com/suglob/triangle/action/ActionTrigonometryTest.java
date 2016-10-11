package test.com.suglob.triangle.action;

import com.suglob.triangle.action.ActionTriangle;
import com.suglob.triangle.entity.Dot;
import com.suglob.triangle.entity.Triangle;
import junit.framework.Assert;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.BeforeClass;
import org.junit.Test;


public class ActionTrigonometryTest {
    private static final String LOG_FILE="property/log4j.properties";
    static {
        PropertyConfigurator.configure(LOG_FILE);
    }
    static Logger logger = Logger.getLogger(ActionTrigonometryTest.class);

    private static Triangle triangle;
    private static ActionTriangle actionTriangle;

    @BeforeClass
    public static void initActionTriangle(){
        actionTriangle=new ActionTriangle();
        triangle=new Triangle(new Dot(0,0),new Dot(8,2), new Dot(-2,6));
    }

    @Test
    public void trianglePerimeterTest(){
        logger.info("Test: trianglePerimeterTest is started");
        double actual=actionTriangle.perimeter(triangle);
        double expected=25.34;
        Assert.assertEquals(actual, expected, 0.01);
        logger.info("Test: trianglePerimeterTest is finished");
    }

    @Test
    public void triangleSquareTest(){
        logger.info("Test: triangleSquareTest is started");
        double actual=actionTriangle.square(triangle);
        double expected=26;
        Assert.assertEquals(actual, expected, 0.01);
        logger.info("Test: triangleSquareTest is finished");
    }

}
