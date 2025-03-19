package proj0319;

public class Exam09 {

	public static void main(String[] args) {
		
		Automobile auto1 = new Automobile();
		System.out.println(auto1.getColor() + ", " + auto1.getSpeed() + ", " + auto1.getSeatNum());
		
		Automobile pors = new Automobile("È²±Ý»ö", 0, 2);
		Automobile benz = new Automobile("Èò»ö", 0, 4);
		Automobile gene = new Automobile("»¡°­»ö", 0, 6);
		System.out.println(pors.getColor() + ", " + pors.getSpeed() + ", " + pors.getSeatNum());
		System.out.println(benz.getColor() + ", " + benz.getSpeed() + ", " + benz.getSeatNum());
		System.out.println(gene.getColor() + ", " + gene.getSpeed() + ", " + gene.getSeatNum());
		
		Car iuCar = new Car("ÆÄ¶û", 0);
		iuCar.upSpeed(300);
		pors.upSpeed(300);
		System.out.println(iuCar.getColor() + ", " + iuCar.getSpeed());
		System.out.println(pors.getColor() + ", " + pors.getSpeed() + ", " + pors.getSeatNum());
		
	}

}

// ¿¹Á¦ (3-15)