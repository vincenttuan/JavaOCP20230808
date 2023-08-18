package lambda2;

/*
 * r 若是半徑可以求圓面積
 * r 若是半徑可以求球體積
 * r 若是半徑可以求直徑
 * */
@FunctionalInterface
public interface Calc {
	double apply(int r);
}
