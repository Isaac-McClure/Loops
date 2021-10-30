package loopDemo;

import java.util.ArrayList;

public class DataProjectionDemo {

	public ArrayList<ShapedDog> MapDogsToShapedDogs(Dog[] dogs) 
	{
		ArrayList<ShapedDog> shapedDogs = new ArrayList<ShapedDog>();
		
		for(Dog dog: dogs) 
		{
			ShapedDog shapedDog = new ShapedDog();
			shapedDog.Id = dog.Id;
			shapedDog.FullName = dog.FirstName + " " + dog.LastName;		
			shapedDogs.add(shapedDog);
		}
		
		return shapedDogs;
	}
}