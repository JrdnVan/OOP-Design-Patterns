package StrategyPattern;
public class doMul implements Strategy{
	@Override
	public int doOp(int a, int b){
		return a * b;
	}
}