package DesignModel;

public class Ammeter extends AmmeterElement{
	double electricAmount;
	public void accept(Visitor visitor){
		double feiyong=visitor.visit(this);
		System.out.println("��ǰ�����û���Ҫ���ɵ��"+feiyong+"Ԫ");
	}
	public double showElectricAmount(){
		return electricAmount;
	}
	public void setEletricAmount(double n){
		electricAmount=n;
	}
}
