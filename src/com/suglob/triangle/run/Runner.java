package com.suglob.triangle.run;

import com.suglob.triangle.parser.TxtParser;

public class Runner {
    private static final String FILE_TRIANGLES="res/right_triangles.txt";
    public static void main(String[] args) {
        System.out.println(TxtParser.parseTriangle(FILE_TRIANGLES));
    }
}
