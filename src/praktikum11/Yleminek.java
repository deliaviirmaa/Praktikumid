package praktikum11;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Yleminek extends Applet {
	// Color minuV2rv = new Color(i,i,i); //rgb - red, green, blue

	@Override

	public void paint(Graphics g) {
		int w = getWidth();
		int h = getHeight();
		double v2rviMuutus = 255./h;         //kui panen punkti selle numbri taha, siis ta muudab ise selle arvu double tüüpi

		for (int i = 0; i < h; i++) {
			int v2rvikood = (int) (255 - i * v2rviMuutus);
			Color minuV2rv = new Color(v2rvikood, v2rvikood, v2rvikood);
			g.setColor(minuV2rv);
			g.drawLine(0, i, w, i);
			
			}

		}

	}

	// public void yleminek(Graphics g, Color varv1, Color varv2)


