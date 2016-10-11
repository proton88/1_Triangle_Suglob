package test.com.suglob.triangle.action;

import com.suglob.triangle.action.ActionTriangle;
import com.suglob.triangle.entity.Dot;
import com.suglob.triangle.entity.Triangle;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ActionTriangleTestTrue {
    private static final String LOG_FILE="property/log4j.properties";
    static {
        PropertyConfigurator.configure(LOG_FILE);
    }
    static Logger logger = Logger.getLogger(ActionTriangleTestFalse.class);
    private Triangle triangle;
    private static ActionTriangle actionTriangle;

    public ActionTriangleTestTrue(Triangle triangle){
        this.triangle=triangle;
    }
    @Parameterized.Parameters
    public static Collection<Triangle> getTriangleParameters(){
        List<Triangle> triangleList=new ArrayList<>();
        triangleList.add(new Triangle(new Dot(1,1), new Dot(1,4), new Dot(4,1)));
        triangleList.add(new Triangle(new Dot(1,1), new Dot(1,4), new Dot(3,1)));
        triangleList.add(new Triangle(new Dot(1,-3), new Dot(3,-1), new Dot(5,-3)));
        triangleList.add(new Triangle(new Dot(0,0), new Dot(3,0), new Dot(0,3)));
        return triangleList;
    }

    @BeforeClass
    public static void initActionTriangle(){
        actionTriangle=new ActionTriangle();
    }

    @Test
    public void checkIsTriangleTestTrue(){
        logger.info("Test: checkIsTriangleTestTrue is started");
        boolean actual=actionTriangle.isTriangle(this.triangle);
        assertTrue("Test failed: object is not triangle", actual);
        logger.info("Test: checkIsTriangleTestTrue is finished");
    }


    @Test
    public void checkIsRightTriangleTestTrue(){
        logger.info("Test: checkIsRightTriangleTestTrue is started");
        boolean actual=actionTriangle.isRightTriangle(this.triangle);
        assertTrue("Test failed: object is not right triangle", actual);
        logger.info("Test: checkIsRightTriangleTestTrue is finished");
    }


}
