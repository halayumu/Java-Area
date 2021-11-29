package local.hal.sa31.androidjava.lesson2.asgmt1;

public class CalcCubeAndCuboid {

	private double _height;//高さ

	private double _width;//幅

	private double _depth;//奥行き

	//----[コンストラクタ]----//
	public CalcCubeAndCuboid(double height, double width, double depth) {
		_height = height;
		_width = width;
		_depth = depth;
	}

	//----[高さ]----//
	public CalcCubeAndCuboid(double height) {
		this(height, height, height);
	}
	
	//----[立方体,直方体の表面積]----//
	public double getArea() {
		return 2 * (_depth * _width + _depth * _height + _width * _height);
	}

	//----[直方体,立方体の体積を取得]----//
	public double getVolume() {
		return _height * _width * _depth;
	}
}