package StrategyPattern;
public class doAdd implements Strategy{
	@Override
	public int doOp(int a, int b){
		return a + b;
	}
}