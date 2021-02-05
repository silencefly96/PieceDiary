package com.silencefly96.piecediary.other.util;

import android.util.DisplayMetrics;
import android.util.TypedValue;

import com.silencefly96.piecediary.PieceApplication;

public class DisplayUtil {
	private static final DisplayMetrics DISPLAY_METRICS;

	static
	{
		DISPLAY_METRICS = PieceApplication.context.getResources().getDisplayMetrics();
	}

	public static int px2dip(float pxValue)
	{
		final float scale = DISPLAY_METRICS.density;
		return (int) (pxValue / scale + 0.5f);
	}

	public static int dip2px(float dipValue)
	{
		final float scale = DISPLAY_METRICS.density;
		return (int) (dipValue * scale + 0.5f);
	}
	
	public static int dp2px(int dp) {
		return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, DISPLAY_METRICS);
	}

	public static int px2sp(float pxValue)
	{
		final float fontScale = DISPLAY_METRICS.scaledDensity;
		return (int) (pxValue / fontScale + 0.5f);
	}

	public static int sp2px(float spValue)
	{
		final float fontScale = DISPLAY_METRICS.scaledDensity;
		return (int) (spValue * fontScale + 0.5f);
	}

	public static DisplayMetrics getDisplayMetrics()
	{
		return DISPLAY_METRICS;
	}
}
