package com.company;
    class Outer{
    int x=20;
    class Inner{
        int y =10;
    }
}
public class InnerClass {
        public static void main(String[] args){
            Outer myOuter = new Outer();
            Outer.Inner myInner = myOuter.new Inner();
            System.out.println(myInner.y + myOuter.x);
        }
}
