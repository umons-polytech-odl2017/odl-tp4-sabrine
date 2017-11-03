package exercise1;

public class ExceptionThrower {

	public void throwACustomExceptionWhenValueIs42(int value) {

		if (value==42){
			throw new NotreException();
		}
	}
}
