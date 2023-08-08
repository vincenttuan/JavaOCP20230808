package day02;

/*
 * 調查五位學生之身高及體重如下:
 * 身高：172、168、164、170、176(公分)
 * 體重：62、57、58、64、64(公斤)
 * 求身高,體重分散程度哪一個大
 * */
import static day02.ArrayDemo4.average;
import static day02.ArrayDemo4.standardDeviation;
import static day02.ArrayDemo4.cv;

public class ArrayDemo5 {

	public static void main(String[] args) {
		double[] heights = {172, 168, 164, 170, 176};
		double[] weights = {62, 57, 58, 64, 64};
		
		double avgHeight = average(heights); // 身高平均
		double avgWeight = average(weights); // 身高平均
		double sdHeights = standardDeviation(heights); // 身高SD
		double sdWeights = standardDeviation(weights); // 體重SD
		double cvHeights = cv(sdHeights, avgHeight); // 身高CV
		double cvWeights = cv(sdWeights, avgWeight); // 體重CV
		System.out.printf("身高平均變異係數: %.1f\n", cvHeights);
		System.out.printf("體重平均變異係數: %.1f\n", cvWeights);
		
		if(cvHeights > cvWeights) {
			System.out.println("身高分散程度大");
		} else {
			System.out.println("體重分散程度大");
		}
		

	}

}
