package com.suglob.triangle.action;

import com.suglob.triangle.entity.Triangle;

public class ActionTriangle {
    public double square(Triangle tr){
        return 0.5*Math.abs((tr.getA().getX()-tr.getC().getX())*(tr.getB().getY()-tr.getC().getY())-
                (tr.getB().getX()-tr.getC().getX())*(tr.getA().getY()-tr.getC().getY()));
    }

    public double perimeter(Triangle tr){
        double[] triangleSide=valueSides(tr);
        return triangleSide[0]+triangleSide[1]+triangleSide[2];
    }

    public boolean isTriangle(Triangle tr){
        double[] triangleSide=valueSides(tr);
        return !((triangleSide[0]==triangleSide[1]+triangleSide[2])||
                (triangleSide[1]==triangleSide[0]+triangleSide[2])||
                (triangleSide[2]==triangleSide[0]+triangleSide[1]));
    }

    private double[] valueSides(Triangle tr){
        double[] mas=new double[3];
        mas[0]=Math.sqrt(Math.pow((tr.getA().getX()-tr.getB().getX()),2)+Math.pow((tr.getA().getY()-tr.getB().getY()),2));
        mas[1]=Math.sqrt(Math.pow((tr.getB().getX()-tr.getC().getX()),2)+Math.pow((tr.getB().getY()-tr.getC().getY()),2));
        mas[2]=Math.sqrt(Math.pow((tr.getA().getX()-tr.getC().getX()),2)+Math.pow((tr.getA().getY()-tr.getC().getY()),2));
        return mas;
    }

    public boolean isRightTriangle(Triangle tr){
        boolean result = false;
        double[] triangleSide=valueSides(tr);
        double squareSide1=Math.pow(triangleSide[0],2);
        double squareSide2=Math.pow(triangleSide[1],2);
        double squareSide3=Math.pow(triangleSide[2],2);
        if (squareSide1-squareSide2-squareSide3<0.01&&squareSide1-squareSide2-squareSide3>-0.01){
            result=true;
        }
        if (squareSide2-squareSide1-squareSide3<0.01&&squareSide2-squareSide1-squareSide3>-0.01){
            result=true;
        }
        if (squareSide3-squareSide2-squareSide1<0.01&&squareSide3-squareSide2-squareSide1>-0.01){
            result=true;
        }
        return result;

    }


}
