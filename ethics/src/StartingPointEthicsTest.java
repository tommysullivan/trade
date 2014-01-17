import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class StartingPointEthicsTest {

	@Test
	public void canCreateTrader() {
		assertNotNull(new Trader(null, null));
	}
	
	@Test
	public void canCreateTraderWithSpecificNameAndViewThatName() {
		String name = "EM";
		Trader t = new Trader(name, null);
		assertEquals(name, t.name());
	}
	
	@Test
	public void traderFinderCanFindAllTraders() {
		List<Trader> allTraders = new ArrayList<Trader>();
		List<Trader> expectedTraders = allTraders;
		allTraders.add(new Trader("Tommy", null));
		allTraders.add(new Trader("Esa-Matti", null));
		TraderFinder traderFinder = new TraderFinder(allTraders);
		assertEquals(expectedTraders, traderFinder.findAllTraders());
	}
	
	@Test
	public void canCreateGood() {
		assertNotNull(new Good(null));
	}
	
	@Test
	public void canCreateGoodWithNameAndViewThatName() {
		String name = "Stone Hammer";
		Good good = new Good(name);
		assertEquals(name, good.name());
	}
	
	@Test
	public void traderFinderCanFindOnlyThoseTradersThatProvideStoneHammers() {
		List<Trader> allTraders = new ArrayList<Trader>();
		List<Trader> expectedTraders = new ArrayList<Trader>();
		
		List<Good> tommysGoods = new ArrayList<Good>();
		Good stoneHammer = new Good("Stone Hammer");
		tommysGoods.add(stoneHammer);
		Trader tommy = new Trader("Tommy", tommysGoods);
		
		List<Good> esaMattisGoods = new ArrayList<Good>();
		Trader esaMatti = new Trader("Esa-Matti", esaMattisGoods);
		
		allTraders.add(esaMatti);
		allTraders.add(tommy);
		
		expectedTraders.add(tommy);
		
		TraderFinder traderFinder = new TraderFinder(allTraders);
		assertEquals(expectedTraders, traderFinder.findTradersThatTradeAParticularGood(stoneHammer));
	}
	
	@Test
	public void testNextThing() {
		/*
		 * Next we will find traders with specific goods who match the ethics we want. At first, the ethics
		 * will be matched based on object equivalence.
		 */
	}

}
