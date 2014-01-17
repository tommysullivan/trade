import java.util.ArrayList;
import java.util.List;

public class TraderFinder {
	private final List<Trader> traders;
	
	public TraderFinder(List<Trader> tradersToKeepTrackOfInThisTraderFinder) {
		this.traders = tradersToKeepTrackOfInThisTraderFinder;
	}
	
	public List<Trader> findAllTraders() {
		return traders;
	}
	
	public List<Trader> findTradersThatTradeAParticularGood(Good soughtGood) {
		List<Trader> tradersThatProvideSoughtGood = new ArrayList<Trader>();
		for(Trader currentTrader : traders) {
			if(currentTrader.goods().contains(soughtGood)) tradersThatProvideSoughtGood.add(currentTrader);
		}
		return tradersThatProvideSoughtGood;
	}
}
