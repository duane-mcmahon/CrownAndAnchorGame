import java.util.HashMap;
import java.util.Map;
import java.util.PrimitiveIterator;
import java.util.Random;

public enum DiceValue {
	CROWN, ANCHOR, HEART, DIAMOND, CLUB, SPADE;

	private static PrimitiveIterator.OfInt RANDOM =  new Random().ints(DiceValue.CROWN.ordinal(),
			DiceValue.SPADE.ordinal() + 1).iterator();

	private static final Map<DiceValue, String> VALUE_REPR_MAP = new HashMap<>();

	static {
		VALUE_REPR_MAP.put(DiceValue.CROWN, "Crown");
		VALUE_REPR_MAP.put(DiceValue.ANCHOR, "Anchor");
		VALUE_REPR_MAP.put(DiceValue.HEART, "Heart");
		VALUE_REPR_MAP.put(DiceValue.DIAMOND, "Diamond");
		VALUE_REPR_MAP.put(DiceValue.CLUB, "Club");
		VALUE_REPR_MAP.put(DiceValue.SPADE, "Spade");
	}

	public String toString(DiceValue value) {
		return VALUE_REPR_MAP.get(value);
	}

	public static DiceValue getRandom() {
		int random = RANDOM.nextInt();
		return values()[random];
	}

}
