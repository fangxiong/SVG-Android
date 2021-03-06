package com.github.megatronking.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_toll extends SVGRenderer {

    public ic_toll(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(15.0f, 4.0f);
        mPath.rCubicTo(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        mPath.rCubicTo(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        mPath.rCubicTo(4.42f, 0.0f, 8.0f, -3.58f, 8.0f, -8.0f);
        mPath.rCubicTo(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
        mPath.close();
        mPath.moveTo(15.0f, 4.0f);
        mPath.rMoveTo(0.0f, 14.0f);
        mPath.rCubicTo(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        mPath.rCubicTo(0.0f, -3.3099995f, 2.69f, -6.0f, 6.0f, -6.0f);
        mPath.rCubicTo(3.3099995f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        mPath.rCubicTo(0.0f, 3.3099995f, -2.69f, 6.0f, -6.0f, 6.0f);
        mPath.close();
        mPath.moveTo(15.0f, 18.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(3.0f, 12.0f);
        mPath.rCubicTo(0.0f, -2.61f, 1.67f, -4.83f, 4.0f, -5.65f);
        mPath.lineTo(7.0f, 4.26f);
        mPath.cubicTo(3.55f, 5.15f, 1.0f, 8.27f, 1.0f, 12.0f);
        mPath.rCubicTo(0.0f, 3.7299995f, 2.55f, 6.85f, 6.0f, 7.74f);
        mPath.rLineTo(0f, -2.09f);
        mPath.rCubicTo(-2.33f, -0.82f, -4.0f, -3.04f, -4.0f, -5.65f);
        mPath.close();
        mPath.moveTo(3.0f, 12.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}