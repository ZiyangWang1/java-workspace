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
		System.out.println(account+"账户创建成功！");                            
		count++;
		}
	public static void accountsNumber(){
		System.out.println("账户数量："+count);
	}
	public void save(double saveIn){
		this.monery+=saveIn;
		System.out.println(account+"成功存入"+saveIn+"元");
	}
	public void getMonery(double getOut){
		if(this.monery>=getOut){
			this.monery-=getOut;
			System.out.println(account+"成功取出"+getOut+"元 ");
		}
		else
			System.out.println(account+"余额不足，取款失败");
		}
	public void checkMonery(){
		System.out.println(account+"余额为："+this.monery+"元 ");
	}
	public void finalize(){
		count--;
		System.out.println(account+"销户成功");
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
