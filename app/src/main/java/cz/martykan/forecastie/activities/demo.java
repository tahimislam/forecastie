package cz.martykan.forecastie.activities;

public class demo {
    private String test1,test2,test4;

    public demo(String test1, String test2) {
        this.test1 = test1;
        this.test2 = test2;
    }

    public String getTest1() {
        return test1;
    }

    public String getTest2() {
        return test2;
    }

    public void setTest1(String test1) {
        this.test1 = test1;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }

    public demo(String test4) {
        this.test4 = test4;
    }

    public String getTest4() {
        return test4;
    }

    public void setTest4(String test4) {
        this.test4 = test4;
    }
}
