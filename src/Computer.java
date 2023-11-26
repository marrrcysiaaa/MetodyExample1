public class Computer {
    String procesor;
    int memeory;

    void printInfo(){
        System.out.println("Procesor: " + procesor + " ," + memeory +  " GB RAM");
    }

    String getInfo(){
        String description = "Procesor: " + procesor + " ," + memeory +  " GB RAM";
        return description;
    }



}
