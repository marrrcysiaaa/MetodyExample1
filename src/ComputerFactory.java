public class ComputerFactory {
  Computer create(String processor, int memory){
    Computer computer = new Computer();
    computer.procesor = processor;
    computer.memeory = memory;
    return computer;
  }
}
