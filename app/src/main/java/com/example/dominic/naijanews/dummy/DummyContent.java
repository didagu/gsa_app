package com.example.dominic.naijanews.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        addItem(new DummyItem("1", "BLUEPRINT","http://www.blueprint.ng/"));
        addItem(new DummyItem("2", "BUSINESS DAY","http://www.businessdayonline.com/"));
        addItem(new DummyItem("3", "BUSINESS HALLMARK","http://www.hallmarknews.com/"));
        addItem(new DummyItem("4", "DAILY CHAMPION","http://championonlinenews.com/"));
        addItem(new DummyItem("5", "DAILY TIMES OF NIGERIA","http://www.dailytimes.com.ng/"));
        addItem(new DummyItem("6", "ENTERTAINMENT EXPRESS","http://www.e-expressnigeria.com/news/"));
        addItem(new DummyItem("7", "GUARDIAN","http://www.ngrguardiannews.com/"));
        addItem(new DummyItem("8", "INDEPENDENT","http://dailyindependentnig.com/"));
        addItem(new DummyItem("9", "LEADERSHIP","http://www.leadership.ng/nga/"));
        addItem(new DummyItem("10", "NATION","http://www.thenationonlineng.net/"));
        addItem(new DummyItem("11", "NATIONAL MIRROR","http://nationalmirroronline.net/new/"));
        addItem(new DummyItem("12", "NATIONAL NETWORK","http://www.nationalnetworkonline.com/"));
        addItem(new DummyItem("13", "NEW TELEGRAPH","http://newtelegraph.ng/"));
        addItem(new DummyItem("14", "NEWSWATCH","http://www.newswatchdirect.com/"));
        addItem(new DummyItem("15", "NEXT","http://234next.com/"));
        addItem(new DummyItem("16", "NIGERIAN COMPASS","http://www.compassfreepaper.com/"));
        addItem(new DummyItem("17", "NIGERIAN OBSERVER","http://nigerianobservernews.com/"));
        addItem(new DummyItem("18", "NOGINTELLIGENCE","http://www.nogintelligence.com/"));
        addItem(new DummyItem("19", "OSUN DEFENDER","http://www.osundefender.org/"));
        addItem(new DummyItem("20", "P. M. NEWS","http://pmnewsnigeria.com/"));
        addItem(new DummyItem("21", "PEOPLE'S DAILY","http://www.peoplesdaily-online.com/"));
        addItem(new DummyItem("22", "PREMIUM TIMES","http://premiumtimesng.com/"));
        addItem(new DummyItem("23", "PUNCH","http://www.punchng.com/"));
        addItem(new DummyItem("24","SUN","http://sunnewsonline.com/new/"));
        addItem(new DummyItem("25", "THE TIDE","http://www.thetidenewsonline.com/"));
        addItem(new DummyItem("26", "TELL MAGAZINE","http://www.tell.ng/"));
        addItem(new DummyItem("27", "THE NEWS JOURNAL","http://newsjournal.com.ng/"));
        addItem(new DummyItem("28", "THISDAY","http://www.thisdaylive.com/"));
        addItem(new DummyItem("29", "TRIBUNE","http://www.tribune.com.ng/"));
        addItem(new DummyItem("30", "TRIUMPH","http://triumphnewsng.com/"));
        addItem(new DummyItem("31", "VANGUARD","http://www.vanguardngr.com/"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;
        public String item_name;
        public String url;

        public DummyItem(String id, String item_name, String url) {
            this.id = id;
            this.item_name = item_name;
            this.url= url;
        }

        @Override
        public String toString() {
            return item_name;
        }
    }
}
