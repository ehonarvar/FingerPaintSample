//package com.elahe.fingerpaint;
//
//import android.app.Activity;
//import android.app.AlertDialog;
//import android.graphics.BlurMaskFilter;
//import android.graphics.EmbossMaskFilter;
//import android.graphics.MaskFilter;
//import android.graphics.Paint;
//import android.os.Bundle;
//import android.view.View;
//
//public class FingerPaintActivity extends Activity implements ColorPickerDialog.OnColorChangedListener {    
//
//	View mv;
//	AlertDialog dialog;
//	@Override
//	protected void onCreate(Bundle savedInstanceState) {
//	super.onCreate(savedInstanceState);
//
//	mv= new View(this);
//	mv.setDrawingCacheEnabled(true);
//	//mv.setBackgroundResource(R.drawable.afor);//set the back ground if you wish to
//	setContentView(mv);
//	mPaint = new Paint();
//	mPaint.setAntiAlias(true);
//	mPaint.setDither(true);
//	mPaint.setColor(0xFFFF0000);
//	mPaint.setStyle(Paint.Style.STROKE);
//	mPaint.setStrokeJoin(Paint.Join.ROUND);
//	mPaint.setStrokeCap(Paint.Cap.ROUND);
//	mPaint.setStrokeWidth(20);
//	mEmboss = new EmbossMaskFilter(new float[] { 1, 1, 1 },
//	                           0.4f, 6, 3.5f);
//	mBlur = new BlurMaskFilter(8, BlurMaskFilter.Blur.NORMAL);
//	}
//
//	private Paint       mPaint;
//	private MaskFilter  mEmboss;
//	private MaskFilter  mBlur;
//
//	public void colorChanged(int color) {
//	mPaint.setColor(color);
//	}
//}