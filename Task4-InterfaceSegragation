interface Document {
    void open();
    void save();
}

interface Printable {
    void printDocument();
}

interface Editable {
    void editDocument();
}


class PDFDocument implements Document, Printable, Editable {
    public void open() {
        System.out.println("Opening PDF document");
    }

    public void save() {
        System.out.println("Saving PDF document");
    }

    public void printDocument() {
        System.out.println("Printing PDF document");
    }

    public void editDocument() {
        System.out.println("Editing PDF document");
    }
}

class WordDocument implements Document, Editable {
    public void open() {
        System.out.println("Opening Word document");
    }

    public void save() {
        System.out.println("Saving Word document");
    }

    public void editDocument() {
        System.out.println("Editing Word document");
    }
}

public class Main {
    public static void main(String[] args) {
        PDFDocument pdfDoc = new PDFDocument();
        WordDocument wordDoc = new WordDocument();

        pdfDoc.open();
        pdfDoc.editDocument();
        pdfDoc.save();
        pdfDoc.printDocument();

        wordDoc.open();
        wordDoc.editDocument();
        wordDoc.save();
    }
}
