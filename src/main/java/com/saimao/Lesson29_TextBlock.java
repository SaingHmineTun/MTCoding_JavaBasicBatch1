package com.saimao;

public class Lesson29_TextBlock {
    public static void main(String[] args) {
        String html = """
                <html>
                    <head>
                        <title> "Hello World" </title>
                    </head>
                </html>
                """;
        String html2 = "<html>\n" +
                        "\t<head>\n" +
                        "\t\t<title> \"Hello World\" </title>\n" +
                        "\t</head>\n" +
                        "</html>";
        System.out.println(html2);
    }
}
