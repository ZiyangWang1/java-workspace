package bankaccounts;

public class BankAccounts implements CashIO{
	public String account,name,id,creatTime;
	public double monery;
	private static int count=0;
	
	public BankAccounts(String account,String name,String creatTime,String id,double monery){
		this.account=account;
		this.name=name;
		this.creatTime=creatTime;
		this.id=id;
		this.monery=monery;
		System.out.println(account+"�˻������ɹ���");                            
		count++;
		}
	public static void accountsNumber(){
		System.out.println("�˻�������"+count);
	}
	public void save(double saveIn){
		this.monery+=saveIn;
		System.out.println(account+"�ɹ�����"+saveIn+"Ԫ");
	}
	public void getMonery(double getOut){
		if(this.monery>=getOut){
			this.monery-=getOut;
			System.out.println(account+"�ɹ�ȡ��"+getOut+"Ԫ ");
		}
		else
			System.out.println(account+"���㣬ȡ��ʧ��");
		}
	public void checkMonery(){
		System.out.println(account+"���Ϊ��"+this.monery+"Ԫ ");
	}
	public void finalize(){
		count--;
		System.out.println(account+"�����ɹ�");
	}
	
	public static void main(String[] args){
		BankAccounts b1=new BankAccounts("001","Adam","2017/3/23","320200000000000000",1000.0);
		accountsNumber();
		b1.checkMonery();
		b1.save(2000);
		b1.checkMonery();
		b1.getMonery(5000);
		b1.getMonery(1500);
		b1.checkMonery();
		b1.finalize();
		accountsNumber();
	}
}
