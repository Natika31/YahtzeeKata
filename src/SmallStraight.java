
public class SmallStraight extends Category {

	@Override
	public int compute(int[] roll) {
		return sumAll(roll);
	}

	@Override
	public boolean isValid(int[] roll) {
		int [] rollOccNb = countOccNbForEachValue(roll);
		return sumAll(rollOccNb) == 5 && rollOccNb[rollOccNb.length -1] == 0;
	}

}
