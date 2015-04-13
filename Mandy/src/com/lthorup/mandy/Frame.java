/* Project: Mandy
 * File:    Frame.java
 * Created: May 4, 2011
 */
package com.lthorup.mandy;

import java.awt.Graphics;
import java.awt.Image;



/** This class represents a Frame
 *
 * @author Layne
 */
public class Frame {
    public Image image;
    public double size, offX, offY, cx, cy;

    /** Constructor
     *
     */
    public Frame(Image image, double size, double offX, double offY, double cx, double cy) {
        this.image = image;
        this.size = size;
        this.offX = offX;
        this.offY = offY;
        this.cx = cx;
        this.cy = cy;
    }
    
    public void paint(Graphics g, int width, int height) {
        g.drawImage(image, 0, 0, width, height, null);
    }
}
