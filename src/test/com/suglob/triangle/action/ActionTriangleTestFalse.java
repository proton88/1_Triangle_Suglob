package test.com.suglob.triangle.action;

import com.suglob.triangle.action.ActionTriangle;
import com.suglob.triangle.entity.Dot;
import com.suglob.triangle.entity.Triangle;
import com.suglob.triangle.parser.TxtParser;
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
public class ActionTriangleTestFalse {
    private static final String LOG_FILE="property/log4j.properties";
    static {
        PropertyConfigurator.configure(LOG_FILE);
    }
    static Logger logger = Logger.getLogger(ActionTriangleTestFalse.class);
    private Triangle triangle;
    private static ActionTriangle actionTriangle;

    public ActionTriangleTestFalse(Triangle triangle){
        this.triangle=triangle;
    }
    @Parameterized.Parameters
    public static Collection<Triangle> getTriangleParameters(){
        List<Triangle> triangleList=new ArrayList<>();
        triangleList.add(new Triangle(new Dot(0,0), new Dot(0,2), new Dot(0,6)));
        triangleList.add(new Triangle(new Dot(1,1), new Dot(2,2), new Dot(3,3)));
        return triangleList;
    }

    @BeforeClass
    public static void initActionTriangle(){
        actionTriangle=new ActionTriangle();
    }

    @Test
    public void checkIsTriangleTestFalse(){
        logger.info("Test: checkIsTriangleTestFalse is started");
        boolean actual=actionTriangle.isTriangle(this.triangle);
        assertFalse("Test failed: object is triangle", actual);
        logger.info("Test: checkIsTriangleTestFalse is finished");
    }
}
