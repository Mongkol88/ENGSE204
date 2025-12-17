package Lab5.Lab5P11;

import java.util.Scanner;


class Document {
    protected String title;
    public Document(String title) {
        this.title = title;
    }
    public void displayDeteils() {
        System.out.println("Document: " + this.title);
    }
}

class TextDocument extends Document {
    protected int wordCount;
    public TextDocument(String title, int pageCount) {
        super(title);
        this.wordCount = pageCount;
    }
    @Override
    public void displayDeteils() {
        System.out.println("Text: " + title + ", Words: " + this.wordCount);
    }
}

class PDFDocument extends Document {
    protected int pageCount;
    public PDFDocument(String title, int pagecount) {
        super(title);
        this.pageCount = pagecount;
    }
    @Override
    public void displayDeteils() {
        System.out.println("PDF: " + title + "Pages: " + this.pageCount);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String textDocument1 = sc.nextLine();
        int textWordcount1 = sc.nextInt();
        sc.nextLine();
        String PDFDocument1 = sc.nextLine();
        int PDFPagecount1 = sc.nextInt();
        sc.nextLine();
        String textDocument2 = sc.nextLine();
        int textWordcount2 = sc.nextInt();
        sc.nextLine();
        String PDFDocument2 = sc.nextLine();
        int PDFPagecount2 = sc.nextInt();

        TextDocument textdocument1 = new TextDocument(textDocument1, textWordcount1);
        PDFDocument pdfdocument1 = new PDFDocument(PDFDocument1, PDFPagecount1);
        TextDocument textdocument2 = new TextDocument(textDocument2, textWordcount2);
        PDFDocument pdfdocument2 = new PDFDocument(PDFDocument2, PDFPagecount2);
        Document[] documents = {textdocument1, pdfdocument1, textdocument2, pdfdocument2};
        int totalpage = 0;
        for (Document document : documents) {
            if (document instanceof PDFDocument) {
                PDFDocument document1 = (PDFDocument) document;
                totalpage += document1.pageCount;
            }
        }
        for (Document document : documents) {
            document.displayDeteils();
        }
        System.out.println("Total Pages: " + totalpage);
        sc.close();
    }
}
