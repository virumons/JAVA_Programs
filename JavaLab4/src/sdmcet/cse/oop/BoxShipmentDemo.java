package sdmcet.cse.oop;
class Box{
	protected double width;
	protected double height;
	protected double depth;
      Box(){
	this.width=-1;
	this.height=-1;
	this.depth=-1;
}
	Box(double width,double height,double depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	
	Box(double width){
		this.width=width;
		this.height=width;
		this.depth=width;
	}
	
	double volume() {
		double vol=width*height*depth;
		return vol;
		
	}
}

class Boxweight extends Box{
	protected double weight;
	
	Boxweight(){
		super();
		this.weight=-1;
	}
	
	Boxweight(double width,double height,double depth,double weight){
		super(width,height,depth);
		this.weight=weight;
	}
	Boxweight(double width,double weight){
		super(width);
		this.weight=weight;
	}
	
}

class Shipment extends Boxweight{
	protected double cost;
	
	Shipment(){
		super();
		this.cost=-1;
	}
	
	Shipment(double width,double height,double depth,double weight,double cost){
		super(width,height,depth,weight);
		this.cost=cost;
	}
	
	Shipment(double width,double weight,double cost){
		super(width,weight);
		this.cost=cost;
	}
	
	}

public class BoxShipmentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Shipment s1=new Shipment();
		 Shipment s2=new Shipment(1,2,3,4,5);
		 Shipment s3=new Shipment(2,3,4);
		 
		 System.out.println("volume : " + s1.volume());
		 System.out.println("volume : " + s2.volume());
		 System.out.println("volume :" +s3.volume());
                    
	}

}
