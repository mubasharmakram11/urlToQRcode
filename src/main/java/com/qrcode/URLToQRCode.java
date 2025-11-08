package com.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import java.util.HashMap;
import java.util.Map;

public class URLToQRCode {
    private static final int QR_CODE_SIZE = 25; // Smaller size for console display
    private static final String DARK_BLOCK = "██"; // Unicode block character for QR code dark module
    private static final String LIGHT_BLOCK = "  "; // Two spaces for light module

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a URL as a command line argument");
            System.out.println("Usage: java -jar url-to-qrcode.jar <URL>");
            System.exit(1);
        }

        String url = args[0];

        try {
            displayQRCode(url);
        } catch (Exception e) {
            System.err.println("Error generating QR code: " + e.getMessage());
            System.exit(1);
        }
    }

    public static void displayQRCode(String url) throws Exception {
        // Set QR Code parameters
        Map<EncodeHintType, Object> hints = new HashMap<>();
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L); // Lower error correction for smaller size
        hints.put(EncodeHintType.MARGIN, 1); // Smaller margin for console display

        // Create QR Code
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(url, BarcodeFormat.QR_CODE, QR_CODE_SIZE, QR_CODE_SIZE, hints);

        // Clear console for better visibility (platform independent)
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Print URL above the QR code
        System.out.println("QR Code for: " + url);
        System.out.println(); // Empty line for spacing

        // Display QR code in console
        for (int y = 0; y < bitMatrix.getHeight(); y++) {
            StringBuilder row = new StringBuilder();
            for (int x = 0; x < bitMatrix.getWidth(); x++) {
                row.append(bitMatrix.get(x, y) ? DARK_BLOCK : LIGHT_BLOCK);
            }
            System.out.println(row);
        }
    }
}
