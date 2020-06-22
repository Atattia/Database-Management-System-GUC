import java.io.Serializable;
import java.util.Comparator;



public class Point implements Comparable<Object> , Serializable  { 
// for comparing point values
	public Object  d;
	public int pageindex ;
	public int recordnumber;
	
	public Point(Object  d ,int pageindex , int recordnumber) {
		this.d=d ;
		this.pageindex=pageindex;
		this.recordnumber=recordnumber;
	}

	@Override
	public int compareTo(Object o) {
		Point p = (Point) o ;
		
		if(p.d instanceof Double) {
			double oo= Double.parseDouble( p.d.toString()) ;
			double v = Double.parseDouble(this.d.toString())  -oo;
			if(v>0)return 1;
			if(v==0)return 0;
			return -1;
		}
		
		if(p.d instanceof Double) {
			Integer oo= Integer.parseInt( o.toString()) ;
			Integer v = Integer.parseInt(this.d.toString())  -oo;
			if(v>0)return -1;
			if(v==0)return 0;
			return 1;
		}
		
		return this.d.toString().compareTo(p.d.toString());
	}

}