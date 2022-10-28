
public class DemoHorses {
	public static void main(String[] args) {
	Horse horse1 = new Horse();
	RaceHorse horse2 = new RaceHorse();
	horse1.setName("name");
	horse1.setColor("black");
	horse1.setBirthYear("1000");
	horse2.setName("Name1");
	horse2.setColor("black");
	horse2.setBirthYear("10 BC");
	horse2.setRaces(10);
	System.out.println(horse1.getName() + "\n" + horse1.getColor() + "\n" +  horse1.getBirthYear() + "\n\n");
	System.out.println(horse2.getName() + "\n" + horse2.getColor() + "\n" +  horse2.getBirthYear() + "\n" + horse2.getRaces());
	
	}
	}
