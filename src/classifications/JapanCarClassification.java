package classifications;

public enum JapanCarClassification {
	KEIJIDOSHA(0, "KEIJIDOSHA", 3.4, 1.48, 2., 660), 
	SMALL_SIZE_VEHICLES(1, "SMALL_SIZE_VEHICLES", 4.7, 1.7, 2., 2000), 
	NORMAL_SIZE_VEHICLES(2, "NORMAL_SIZE_VEHICLES", Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE, Integer.MAX_VALUE);

	private double maxCarLength;
	private double maxCarWidth;
	private double maxCarHeight;
	private int maxEngineVolume;

	private JapanCarClassification(int id, String name, double maxCarLength, double maxCarWidth,
			double maxCarHeight, int maxEngineVolume) {
		
		this.maxCarLength = maxCarLength;
		this.maxCarWidth = maxCarWidth;
		this.maxCarHeight = maxCarHeight;
		this.ordinal();
	}
}
