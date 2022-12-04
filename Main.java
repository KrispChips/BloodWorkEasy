import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in); 
		
		double healthscore =0; 
		
		String[] testCase = {"Sodium", "Potassium" , "Chloride" , "Calcium" , "Magnesium", "Zinc", "D, 25-hydroxy", "Iron"
, "Vitamin b12"	, "Vitamin A", "Free Testesterone", "Chlorestrol", "Triglycerides", "Hemoglobin A1", "Urine PH Screen", "Albumin"}; 
		
		double [] values = new double[testCase.length]; 
		
		
		for(int i = 0; i < testCase.length; i++)
		{
			System.out.print("What is the value of the measurement of " + testCase[i] + "? ");
			values[i] = sc.nextDouble(); 
		}
		
		//These are the calculations 
		
		//Sodium
		if(values[0] >= 134 && values[0] <= 144)
		{
			System.out.println("");
			healthscore =healthscore+ 5.55
		}
		else if(values[0] < 134)
		{
			System.out.println("You are below the range for sodium!");
			System.out.println("Eat more salt. Intravenous fluids. Your doctor may recommend IV sodium solution to slowly raise the sodium levels in your blood.");
			healthscore =healthscore- 2.775
		}
		else
		{
			System.out.println("You are above the range for sodium!");
			System.out.println("Drink more water and take pottasium suplement.Take 1600 to 2000 mg daily ");
			healthscore =healthscore- 2.775
			
		}
		
		//Pottasium 
		if(values[1] >= 3.5 && values[1] <= 5.2)
		{
			System.out.println("");
			healthscore =healthscore+ 5.55
		}
		else if(values[1] < 3.5)
		{
			System.out.println("You are below the range for pottasium! Take 1600 to 2000 mg daily.");
			healthscore =healthscore- 2.775
		}
		else
		{
			System.out.println("You are above the range for pottasium! ");
			healthscore =healthscore- 2.775
		}


		//Chloride
		if(values[2] >= 96 && values[2] <= 106)
		{
			System.out.println("");
			healthscore =healthscore+ 5.55
		}
		else if(values[2] < 96)
		{
			System.out.println("You are below the range for chloride! Check salt intake.");
			healthscore =healthscore- 2.775
		}
		else
		{
			System.out.println("You are above the range for chloride!");
			healthscore =healthscore- 2.775
		}
				
		//Calcium
		if(values[3] >= 8.7 && values[3] <= 10.2)
		{
			System.out.println(""); 
			healthscore =healthscore+ 5.55
		}
		else if(values[3] < 8.7)
		{
			System.out.println("You are below the range for calcium!");
			System.out.println("Eat food with calcium and vitamin D3.");
			healthscore =healthscore- 2.775
			
		}
		else
		{
			System.out.println("You are above the range for calcium!");
			System.out.println("Take Calcitonin and vitamin k2 for heart health");
			healthscore =healthscore- 2.775
		}
		
		//Magnesium 
		if(values[4] >= 4.2  && values[4] <= 6.8)
		{
			System.out.println(""); 
			healthscore =healthscore+ 5.55
		}
		else if(values[4] < 4.2)
		{
			System.out.println("You are below the range for magnesium!");
			System.out.println("Take between 300-400mg more of magnesium");
			healthscore =healthscore- 2.775
		}
		else
		{
			System.out.println("You are above the range for magnesium!");
			System.out.println("Check the amount of seafood being eaten.");
			healthscore =healthscore- 2.775
		}
		
		//Zinc
		if(values[5] >= 80 && values[5] <= 120)
		{
			System.out.println("");
			healthscore =healthscore+ 5.55
		}
		else if(values[5] < 80)
		{
			System.out.println("You are below the range for zinc!");
			healthscore =healthscore- 2.775
		}
		else
		{
			System.out.println("You are above the range for zinc!");
			healthscore =healthscore- 2.775
		}
		
		
		//D, 25-hydroxy 
		if(values[6] >= 20 && values[6] <= 40)
		{
			System.out.println("");
			healthscore =healthscore+ 5.55
		}
		else if(values[6] < 20)
		{
			System.out.println("You are below the range for D, 25-hydroxy!");
			System.out.println(" take 10 to 20 micrograms of D3 and get more sunlight.");
			healthscore =healthscore- 2.775
		}
		else
		{
			System.out.println("");
			healthscore =healthscore+ 5.55

		}
		
		
		
		//Iron 
		if(values[7] >= 60 && values[7] <= 170)
		{
			System.out.println("");
			healthscore =healthscore+ 5.55
		}
		else if(values[7] < 60)
		{
			System.out.println("You are below the range for iron!");
			healthscore =healthscore- 2.775
		}
		else
		{
			System.out.println("You are above the range for iron!");
			healthscore =healthscore- 2.775
		}
		
		
		
		//Vitamin b12
		if(values[8] >= 5 && values[8] <= 50)
		{
			System.out.println("");
			healthscore =healthscore+ 5.55
		}
		else if(values[8] < 5)
		{
			System.out.println("You are below the range for vitamin B12!");
			System.out.println("Take 2.4 mcg of B12 in a disolvable table form. ");
			healthscore =healthscore- 2.775
		}
		else
		{
			System.out.println("You are above the range for vitamin B12!");
			healthscore =healthscore- 2.775
		}
		
		
		
		//Vitamin A 
		if(values[9] >= 20 && values[9] <= 60)
		{
			System.out.println(""); 
			healthscore =healthscore+ 5.55
		}
		else if(values[9] < 20)
		{
			System.out.println("You are below the range for vitamin A!");
			healthscore =healthscore- 2.775
		}
		else
		{
			System.out.println("You are above the range for vitamin A!");
			healthscore =healthscore- 2.775
		}
		
		
		
		//Free Testosterone  
		if(values[10] >= 300 && values[10] <= 1000)
		{
			System.out.println("You have medium testosterone levels. To increrase these levles decrease stress and get more sleep. Intake the daily doses of vitiam D3, Magnesium, and Zinc recomeneded by the NIH. Perform resistance training.");
			healthscore =healthscore- 2.775
		}
		else if(values[10] < 300)
		{
			System.out.println("You have very low testosterone levels. To increrase these levles decrease stress and get more sleep. Intake the daily doses of vitiam D3, Magnesium, and Zinc recomeneded by the NIH. Perform resistance training."); 
			healthscore =healthscore- 2.775
		}
		else
		{
			System.out.println("You are above the range for free testosterone!");
			healthscore =healthscore- 2.775
		}
		
		
		//Cholestral 
		if(values[11] >= 200 && values[11] <= 239)
		{
			System.out.println(""); 
			healthscore =healthscore+ 5.55
		}
		else if(values[11] < 200)
		{
			System.out.println("You are below the range for cholestral!");
			healthscore =healthscore- 2.775
		}
		else
		{
			System.out.println("You are above the range for cholesteral!");
			System.out.println("Reduce saturated fats. Saturated fats, found primarily in red meat and full-fat dairy products, raise your total cholesterol.Eliminate trans fats. take 300mg of Omega 3 fats a day.Increase soluble fiber and take whey protien. ");
			healthscore =healthscore- 2.775
		}
		
		
		//Tryglycerides
		if(values[12] >= 150 && values[12] <= 199)
		{
			System.out.println("You are borderline high for tryglycerides!");
			healthscore =healthscore- 2.775
		}
		else if(values[12] >= 200 && values[1] <= 499)
		{
			System.out.println("You are high for Tryglycerides!");
			System.out.println("Workout regularly. Avoid intake of carbs and sugars. Lose viseral fat. ");
			healthscore =healthscore- 2.775
		}
		else if(values[12] < 150)
		{
			System.out.println("");
			healthscore =healthscore+ 5.55
		}
		else
		{
			System.out.println("You are above the range for Tryglycerides");
			healthscore =healthscore- 2.775
		}

		//Hemogolobin A1C 
		if(values[13] >= 5.7 && values[13] <= 6.4)
		{
			System.out.println("");
			healthscore =healthscore+ 5.55
		}
		else if(values[13] < 5.7)
		{
			System.out.println("You are below the range for hemoglobin!");
			healthscore =healthscore- 2.775
		}
		else
		{
			System.out.println("You are above the range for hemoglobin! Check your insulin resistance.");
			healthscore =healthscore- 2.775
		}
		
		//Urine PH screen 
		if(values[14] >= 4.6 && values[14] <= 8.0)
		{
			System.out.println("");
			healthscore =healthscore+ 5.55
		}
		else if(values[14] < 4.6)
		{
			System.out.println("You are below the range for urine PH screen!");
			healthscore =healthscore- 2.775
		}
		else
		{
			System.out.println("You are above the range for urine PH screen!");
			healthscore =healthscore- 2.775
		}
		
		//Albumin
		if(values[15] >= 3.4 && values[15] <= 5.4)
		{
			System.out.println("");
			healthscore =healthscore+ 5.55
			
		}
		else if(values[15] < 3.4)
		{
			System.out.println("You are below the range for albumin!");
			healthscore =healthscore- 2.775
		}
		else
		{
			System.out.println("You are above the range for albumin!");
			healthscore =healthscore- 2.775
		}
		
		
				
		
		
		
		
		

	}

	System.out.println("Your over all health score is:" + healthscore); 

}
