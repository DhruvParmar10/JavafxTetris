package com.example.tetrisgame;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Form {
	Rectangle a;
	Rectangle b;
	Rectangle c;
	Rectangle d;
	Color color;
	private String name;
	public int form = 1;

	public Form(Rectangle a, Rectangle b, Rectangle c, Rectangle d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public Form(Rectangle a, Rectangle b, Rectangle c, Rectangle d, String name) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.name = name;

		switch (name) {
		case "j":
			color = Color.ROYALBLUE;
			break;
		case "l":
			color = Color.FORESTGREEN;
			break;
		case "o":
			color = Color.LIGHTYELLOW;
			break;
		case "s":
			color = Color.SEAGREEN;
			break;
		case "t":
			color = Color.STEELBLUE;
			break;
		case "z":
			color = Color.DEEPSKYBLUE;
			break;
		case "i":
			color = Color.SADDLEBROWN;
			break;

		}
		this.a.setFill(color);
		this.b.setFill(color);
		this.c.setFill(color);
		this.d.setFill(color);
	}


	public String getName() {
		return name;
	}


	public void changeForm() {
		if (form != 4) {
			form++;
		} else {
			form = 1;
		}
	}
}