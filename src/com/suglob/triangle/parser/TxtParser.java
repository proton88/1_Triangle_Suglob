package com.suglob.triangle.parser;

import com.suglob.triangle.entity.Dot;
import com.suglob.triangle.entity.Triangle;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class TxtParser {
    private static final String LOG_FILE="property/log4j.properties";
    private static final String DELIMETER="[,;\\s]+";
    static {
        PropertyConfigurator.configure(LOG_FILE);
    }
    static Logger logger = Logger.getLogger(TxtParser.class);
    public static List<Triangle> parseTriangle(String filePath){
        List<Triangle> list=new ArrayList<>();
        try (BufferedReader bufferedReader=new BufferedReader(new FileReader(filePath))) {
            String fileString;
            String[] brokenString;
            int counter=0;
            while ((fileString = bufferedReader.readLine()) != null) {
                counter++;
                brokenString = fileString.split(DELIMETER);
                if (brokenString.length!=6){
                    logger.error("Wrong count of values of triangle in string: "+counter);
                    continue;
                }
                try{
                    list.add(new Triangle(new Dot(Double.parseDouble(brokenString[0]),Double.parseDouble(brokenString[1])),
                            new Dot(Double.parseDouble(brokenString[2]),Double.parseDouble(brokenString[3])),
                            new Dot(Double.parseDouble(brokenString[4]),Double.parseDouble(brokenString[5]))));
                }catch (NumberFormatException e){
                    logger.error("Wrong values of triangle in string: "+counter,e);
                    continue;
                }


            }
        }catch (IOException e) {
            logger.fatal("Fail "+filePath+" is failed", e);
            throw new RuntimeException("Fail failed");
        }
        return list;
    }

}
