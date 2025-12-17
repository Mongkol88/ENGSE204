package Lab5.Lab5P6;

import java.util.Scanner;

class Media {
    protected String title;
    public Media(String title) {
        this.title = title;
    }
    public void process() {
        System.out.println("Starting generic media processing");
    }
}

class Video extends Media {
    protected int duration;
    public Video(String title, int duration) {
        super(title);
        this.duration = duration;
    }
    @Override
    public void process() {
        System.out.println("Processing video: " + title + " for " + this.duration + " minutes.");
    }
}

class Audio extends Media {
    protected String quality;
    public Audio(String title, String quality) {
        super(title);
        this.quality = quality;
    }
    @Override
    public void process() {
        System.out.println("Processing audio: " + title + " with " + this.quality + " quality.");
    }
}

class Processor {
    public static void runProcessor(Media m) {
        m.process();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String videotitle = sc.nextLine();
        int viedoduration = sc.nextInt();
        sc.nextLine();
        String audiotitle = sc.nextLine();
        String audioquality = sc.nextLine();

        Video video = new Video(videotitle, viedoduration);
        Audio audio = new Audio(audiotitle, audioquality);
        Processor.runProcessor(video);
        Processor.runProcessor(audio);

        sc.close();
    }
}
