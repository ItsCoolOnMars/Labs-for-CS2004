public class Lab10 {
	
	public static CannonSolution RMHC1(double angle, double velocity,int iter)
	{
		CannonSolution sol = new CannonSolution(angle, velocity);
		for(int i = 0; i<iter; i++) {
			CannonSolution oldsol = new CannonSolution(sol.GetAng(), sol.GetvVel());
			sol.SmallChange();
			if(Cannon.GetMaxRange(sol.GetAng(), sol.GetvVel())<Cannon.GetMaxRange(oldsol.GetAng(), oldsol.GetvVel())) {
				sol = new CannonSolution(oldsol.GetAng(), oldsol.GetvVel());
			}
//			System.out.println("Current Iteration: "+ i + " Current Range: " +  Cannon.GetMaxRange(sol.GetAng(), sol.GetvVel()));
			System.out.println((i+1) + "," +  Cannon.GetMaxRange(sol.GetAng(), sol.GetvVel()));
		}
//		System.out.println("Max range: " + Cannon.GetMaxRange(sol.GetAng(), sol.GetvVel()) +
//				" Angle: " + sol.GetAng() +
//				" Velocity: " + sol.GetvVel());
		return(sol);
	}
	
	public static CannonSolution RMHC2(double angle, double velocity,int iter)
	{
		CannonSolution sol = new CannonSolution(angle, velocity);
		for(int i = 0; i<iter; i++) {
			CannonSolution oldsol = new CannonSolution(sol.GetAng(), sol.GetvVel());
			sol.SmallChange();
			if(Cannon.GetMaxRange(sol.GetAng(), sol.GetvVel())>Cannon.GetMaxRange(oldsol.GetAng(), oldsol.GetvVel())) {
				sol = new CannonSolution(oldsol.GetAng(), oldsol.GetvVel());
			}
//			System.out.println("Current Iteration: "+ i + " Current Range: " +  Cannon.GetMaxRange(sol.GetAng(), sol.GetvVel()));
			System.out.println((i+1) + "," +  Cannon.GetMaxRange(sol.GetAng(), sol.GetvVel()));
		}
//		System.out.println("Min range: " + Cannon.GetMaxRange(sol.GetAng(), sol.GetvVel()) +
//				" Angle: " + sol.GetAng() +
//				" Velocity: " + sol.GetvVel());
		return(sol);
	}
	
	public static CannonSolution RMHC3(double angle, double velocity,int iter, double TargetRange)
	{
		CannonSolution sol = new CannonSolution(angle, velocity);
		for(int i = 0; i<iter; i++) {
			CannonSolution oldsol = new CannonSolution(sol.GetAng(), sol.GetvVel());
			sol.SmallChange();
			if(sol.CannonFitness(TargetRange) > oldsol.CannonFitness(TargetRange)) {
				sol = new CannonSolution(oldsol.GetAng(), oldsol.GetvVel());
			}
//			System.out.println("Current Iteration: "+ i + " Current Fitness: " +  sol.CannonFitness(TargetRange));
			System.out.println((i+1) + "," +  sol.CannonFitness(TargetRange));
		}
//		System.out.println("Final Fitness: " + sol.CannonFitness(TargetRange) +
//				" Angle: " + sol.GetAng() +
//				" Velocity: " + sol.GetvVel());
		return(sol);
	}

	public static void main(String[] args) {
		
//		Exercise 1
//		double r = Cannon.GetMaxRange(40.0,1575.0);
//		System.out.println(r);
//		ArrayList<Double> xt = Cannon.GetX();
//		ArrayList<Double> yt = Cannon.GetY();
//		System.out.println(xt.size());
//		System.out.println(yt.size());
//		
//		System.out.println("x,y");
//		for(int i= 0;i<xt.size();i++) {
//			System.out.println(xt.get(i) + "," + yt.get(i));
//		}
	
		
//		Exercise 2
		
		
//		Conduct a series of experiments to find the best number of iterations to run the hill climbing algorithm for.
		System.out.println("Iteration,Range");
		
//		1)	What is the maximum range of K12? What angle and muzzle velocity is needed?
//		Max range: 113594.0274721513 Angle: 53.5459047753609 Velocity: 1650.0
		
//		for(int i = 0; i<10; i++) {
//			RMHC1(0, 0, 1000);
//		}
		
//		2)	What is the minimum range of K12? What angle and muzzle velocity is needed?
//		Min range: 50091.29062658121 Angle: 25.0 Velocity: 1500.0
		
//		for(int i = 0; i<10; i++) {
//			RMHC2(0, 0, 1000);
//		}
		
//		3)	What angle and muzzle velocity is needed to hit a target 75,000 metres away? How close can you get?
//		Final Fitness: 0.023624484703759663 Angle: 36.37025187237401 Velocity: 1540.2493835058654
		
//		for(int i = 0; i<10; i++) {
//			RMHC3(0, 0, 1000, 75000);
//		}
		
//		4)	What angle and muzzle velocity is needed to hit a target 95,000 metres away? How close can you get?
//		Final Fitness: 0.059025413196650334 Angle: 48.059899944204396 Velocity: 1527.9695607407953
		
//		for(int i = 0; i<10; i++) {
//			RMHC3(0, 0, 1000, 95000);
//		}
		
//		5)	What angle and muzzle velocity is needed to hit a target 65,000 metres away? How close can you get?
//		Final Fitness: 0.007885491053457372 Angle: 33.07767321282268 Velocity: 1501.205261934443
		
//		for(int i = 0; i<10; i++) {
//			RMHC3(0, 0, 1000, 65000);
//		}
//		
//		Plot convergence graphs for all of the experiments. Make sure you save any results and graphs for the viva.
		
	}




}
