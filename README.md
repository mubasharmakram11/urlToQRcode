# Console URL to QR Code Generator

A simple Java console application that generates and displays QR codes directly in the terminal. When you provide a URL as a command-line argument, it instantly creates an ASCII art QR code that you can scan with your smartphone.

## Features

- Instant QR code generation in the console
- ASCII art representation using Unicode block characters
- Clean and minimal interface
- Scannable output compatible with most QR code readers

## Requirements

- Java 24 or higher
- Maven 3.6 or higher

## Installation

1. Clone this repository:
```bash
git clone https://github.com/mubasharmakram11/urlToQRcode.git
cd urlToQRcode
```

2. Build the project using Maven:
```bash
mvn clean package
```

## Usage

Run the application using the following command:
```bash
java -jar target/url-to-qrcode-1.0-SNAPSHOT-jar-with-dependencies.jar <URL>
```

Example:
```bash
java -jar target/url-to-qrcode-1.0-SNAPSHOT-jar-with-dependencies.jar https://github.com
```

The QR code will be displayed directly in your terminal. You can scan it with your smartphone's camera or any QR code scanner app.

## Contributing

Feel free to submit issues and enhancement requests or contribute to the code!

