package local.hal.sa31.androidjava.lesson2.asgmt1;

public class CalcFromOneEdge {
	public static void main(String[] args) {
		double[] ary = { 1.5, 3.2, 5.8, 7.4, 9.7 };
		for (int i = 0; i < ary.length; i++) {
			System.out.println("■■■■一片" + ary[i] + "の計算結果");
			//----[立方体結果処理]----//
			CalcCubeAndCuboid cube = new CalcCubeAndCuboid(ary[i]);
			System.out.println("立方体表面積:" + cube.getArea() + " |体積:" + cube.getVolume());
			
			//----[直方体結果処理]----//
			CalcCubeAndCuboid rectangular = new CalcCubeAndCuboid(ary[i], ary[i] * 4, ary[i] * 8);
			System.out.println("横" + ary[i] * 4 + "奥行き" + ary[i] * 8 + "の直方体の表面積:" + rectangular.getArea() + " |体積" + rectangular.getVolume());
		}
	}
}
