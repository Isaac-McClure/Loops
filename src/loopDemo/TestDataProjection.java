package loopDemo;

import java.util.ArrayList;

public class TestDataProjection {

	public boolean testDataProjection() {
		// Arrange
		Dog dogOne = new Dog(1, "Badger", "McDoogle");
		Dog dogTwo = new Dog(2, "Bear", "Burns");				
		Dog[] dogTestData = {dogOne, dogTwo};
		
		DataProjectionDemo projector = new DataProjectionDemo();
				
		// Act
		ArrayList<ShapedDog> testDogShapedData = projector.MapDogsToShapedDogs(dogTestData);
		
		// Assert
		if(testDogShapedData.get(0).FullName.equals("Badger McDoogle") && testDogShapedData.get(0).Id == 1
				&& testDogShapedData.get(1).FullName.equals("Bear Burns") && testDogShapedData.get(1).Id == 2)
		{
			return true;			
		}
		return false;		
	}
}
