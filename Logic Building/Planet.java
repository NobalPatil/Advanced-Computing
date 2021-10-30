import java.util.Scanner;
class Planet{
	String name,color;
	long radius,orbitalPeriod,population,distanceFromSun;
	double temp,velocity,gravity;
	
	Planet(String name,String color,long radius,long orbitalPeriod,long population,
			long distanceFromSun,double temperature,double velocity,double gravity){
		this.name = name;
		this.color = color;
		this.radius = radius;
		this.orbitalPeriod = orbitalPeriod;
		this.population = population;
		this.distanceFromSun = distanceFromSun;
		this.temp = temp;
		this.velocity = velocity;
		this.gravity = gravity;
	}

	void rotation(){
		System.out.println("\n");
		System.out.println("Rotating.........");
		System.out.println("Velocity: "+velocity+" km/s");
		System.out.println("Orbital Period: "+orbitalPeriod+" days");
	}
	
	void orbitalStatus(){
		System.out.println("\n");
		if(distanceFromSun < 150000000)
			System.out.println(name+" is CLOSE to the Sun!");
		else	System.out.println(name+" is AWAY from the Sun!");
	}

	void waterExistence(){
		System.out.println("\n");
		if(name.equals("Earth") || name.equals("earth"))
			System.out.println("There exists WATER on the Earth");
		else	System.out.println("Don't Know!");
	}

	void humanExistence(){
		System.out.println("\n");
		if(population>0)
			System.out.println("Humans are exists on the "+name);
		else System.out.println("Humans are NOT exists on the "+name);
	}	

	void displayInfo(){
		System.out.println("\n");
		System.out.println("Name: "+name); 
		System.out.println("Color: "+color);
		System.out.println("Radius: "+radius+" km");
		System.out.println("Orbital Period: "+orbitalPeriod+" days");
		System.out.println("Population: "+population);
		System.out.println("Distance from Sun: "+distanceFromSun+" km");
		System.out.println("Temperature: "+temp+" C");
		System.out.println("Velocity: "+velocity+" km/s");
		System.out.println("Gravity: "+gravity+" m/s^2");
	}

	public static void main(String args[]){
		PlanetInfo info = new PlanetInfo();
		Scanner input = new Scanner(System.in);
		String stop = "no";

		Planet planet = new Planet(info.getName(),info.getColor(),info.getRadius(),info.getOrbitalPeriod(),
			info.getPopulation(),info.getDistanceFromSun(),info.getTemp(),info.getVelocity(),info.getGravity());


		System.out.println("\n");
		
		
		do{	
			System.out.println("Opations ->\n1-Planet Details\n2-Human Existance\n3-Water Existence\n4-Orbital Status\n5-Rotation\n6-Exit");

			System.out.println("Enter your choice: ");
			int ch = input.nextInt();

			switch(ch){
				case 1:	planet.displayInfo();
					break;
				case 2:	planet.humanExistence();
					break;
				case 3: planet.waterExistence();
					break;
				case 4: planet.orbitalStatus();
					break;
				case 5: planet.rotation();
					break;
				case 6: stop = "yes";
			}
			
			System.out.println();
		}while(stop.equals("no"));
	}
}

class PlanetInfo{
	Scanner scan = new Scanner(System.in);

	String getName(){
	System.out.println("Name: "); 
	String name = scan.nextLine();

	return name;
	}
	
	String getColor(){
	System.out.println("Color: ");
	String color = scan.nextLine();

	return color;
	}

	long getRadius(){
	System.out.println("Radius(Km): ");
	long radius = scan.nextLong();

	return radius;
	}


	long getOrbitalPeriod(){
	System.out.println("Orbital Period(days): ");
	long orbitalPeriod = scan.nextLong();

	return orbitalPeriod;
	}

	long getPopulation(){
	System.out.println("Population: ");
	long population = scan.nextLong();

	return population;
	}

	long getDistanceFromSun(){
	System.out.println("Distance from Sun(Km): ");
	long distanceFromSun = scan.nextLong();

	return distanceFromSun;
	}

	double getTemp(){
	System.out.println("Temperature(C): ");
	Double temp = scan.nextDouble();

	return temp;
	}

	double getVelocity(){
	System.out.println("Velocity(Km/s): ");
	double velocity = scan.nextDouble();

	return velocity;
	}

	double getGravity(){
	System.out.println("Gravity(m/s^2): ");
	double gravity = scan.nextDouble();

	return gravity;
	}
}