package bankaccounts;

public interface CashIO {
	public abstract void save(double saveIn);
	public abstract void getMonery(double getOut);
	public abstract void checkMonery();

}
