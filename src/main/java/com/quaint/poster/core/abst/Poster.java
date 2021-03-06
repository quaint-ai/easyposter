package com.quaint.poster.core.abst;

import java.awt.image.BufferedImage;

/**
 * 海报接口, 只有绘制方法
 * @author quaint
 * @date 21 February 2020
 * @since 1.0
 */
public interface Poster {

    /**
     * 画海报
     * @param image image
     * @return image
     */
    BufferedImage draw(BufferedImage image);

}
