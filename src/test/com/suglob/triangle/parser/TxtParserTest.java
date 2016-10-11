package test.com.suglob.triangle.parser;


import com.suglob.triangle.entity.Triangle;
import com.suglob.triangle.parser.TxtParser;

import org.junit.Test;


import java.util.List;

public class TxtParserTest {
    private static final String FILE_NOT_TRIANGLE="res/not_triangles2323.txt";

    @Test(expected = RuntimeException.class)
    public void checkTxtParserExceptionTest(){
        List<Triangle> actual= TxtParser.parseTriangle(FILE_NOT_TRIANGLE);
    }
}
