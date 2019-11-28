package StrategyPattern;
public class doSub implements Strategy{
	@Override
	public int doOp(int a, int b){
		return a - b;
	}
}