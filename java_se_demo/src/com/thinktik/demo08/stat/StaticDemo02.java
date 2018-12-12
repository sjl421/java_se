package com.thinktik.demo08.stat;

public class StaticDemo02 {
	public static void main(String[] args) {
		Temp temp= new Temp(21);
		boolean isInRange = temp.isInRange();
	}
}

class Temp{
    private static Integer max;
    private static Integer min;
    private Integer temp;
    static{
    	max = 42;
    	min = 18;
    }
     
    public Temp(Integer temp) {
        this.temp= temp;
    }
     
    boolean isInRange() {
        return min.compareTo(temp)<0&&max.compareTo(temp)>0;
    }
}
