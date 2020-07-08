class Point{
	public int x=0;
    public int y=0;
    public void xieshuaiqiao(int x,int y){
    	this.x=x;
    	this.y=y;
    	System.out.println("你的圆心为："+"("+x+","+y+")");
    }
}
class Circle{
	double s, r=0.0;
	public void mianji(double r){
		this.r=r;
		s=Math.PI*r*r;
		System.out.println("你的半径为："+r);
		System.out.println("圆的面积为："+s);
	}
}

public class TestCircle {
   public static void main(String[] args) {
	   Point sc=new Point();
	   Circle ss=new Circle();
	   sc.xieshuaiqiao(3, 4);
	   ss.mianji(2);
                   System.out.println("myname is xieqiao");
  }
}
