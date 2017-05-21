/*
 * Copyright (C) Ian Morgan 2017 to Present
 * Code Written by Ian Morgan <ianbrianmorgan@outlook.com>
 */

package net.sourceforge.tess4j.example;

import java.io.File;
import net.sourceforge.tess4j.*;

public class TesseractExample {
 public static void main(String[] args) {
        //File imageFile = new File("eurotext.tif");
        //File imageFile = new File("Text-searchable.pdf");
        File imageFile = new File("Portfolio.pdf");
        ITesseract instance = new Tesseract();  // JNA Interface Mapping
        // ITesseract instance = new Tesseract1(); // JNA Direct Mapping

        try {
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }
}
