package DesignModel;

public class Ammeter extends AmmeterElement{
	double electricAmount;
	public void accept(Visitor visitor){
		double feiyong=visitor.visit(this);
		System.out.println("当前电表的用户需要交纳电费"+feiyong+"元");
	}
	public double showElectricAmount(){
		return electricAmount;
	}
	public void setEletricAmount(double n){
		electricAmount=n;
	}
}
