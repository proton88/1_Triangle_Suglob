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

import static org.junit.Assert.assertFalse;

@RunWith(Parameterized.class)
public class ActionRightTriangleTestFalse {
    private static final String LOG_FILE="property/log4j.properties";
    static {
        PropertyConfigurator.configure(LOG_FILE);
    }
    static Logger logger = Logger.getLogger(ActionRightTriangleTestFalse.class);
    private Triangle triangle;

    private static ActionTriangle actionTriangle;

    public ActionRightTriangleTestFalse(Triangle triangle){
        this.triangle=triangle;
    }
    @Parameterized.Parameters
    public static Collection<Triangle> getTriangleParameters(){
        List<Triangle> triangleList=new ArrayList<>();
        triangleList.add(new Triangle(new Dot(2,1), new Dot(4,1), new Dot(1,4)));
        triangleList.add(new Triangle(new Dot(0,0), new Dot(4,1), new Dot(8,0)));
        return triangleList;
    }

    @BeforeClass
    public static void initActionTriangle(){
        actionTriangle=new ActionTriangle();
    }

    @Test
    public void checkIsRightTriangleTestFalse(){
        logger.info("Test: checkIsRightTriangleTestFalse is started");
        boolean actual=actionTriangle.isRightTriangle(this.triangle);
        assertFalse("Test failed: object is right triangle", actual);
        logger.info("Test: checkIsRightTriangleTestFalse is finished");
    }
}
