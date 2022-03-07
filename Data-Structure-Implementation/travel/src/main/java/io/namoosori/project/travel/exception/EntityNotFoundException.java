package io.namoosori.project.travel.exception;

import javax.swing.text.html.parser.Entity;

/**
 * @Company: {Nextree Inc.}
 * @Author: {urunov}
 * @Project: {travel}
 * @Date: {2022/02/07 && 10:44 PM}
 */
public class EntityNotFoundException extends RuntimeException{

    public EntityNotFoundException(String message) {
        super(message);
    }
}
