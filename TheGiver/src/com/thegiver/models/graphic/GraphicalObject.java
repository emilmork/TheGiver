package com.thegiver.models.graphic;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public class GraphicalObject {

	public Position position;
	public Rotation rotation;
	public Scale scale;
	public Size size;
	public Border border;

	public Bitmap image;

	public boolean selected = false;

	public GraphicalObject() {
	}

	public void onDraw(Canvas canvas) {

	}

}
