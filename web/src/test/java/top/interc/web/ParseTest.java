package top.interc.web;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ：linweisen
 * @date ：Created in 2021/4/15 9:37
 * @description：${description}
 * @modified By：
 * @version: 1.0
 */
public class ParseTest {

    @Test
    public void test(){
        String s = "jQuery02690408090823675_1618384644897({\"profitsData\":[{\"2017\":105786,\"2008\":14513,\"2009\":15128,\"index\":\"营业收入\",\"2013\":52189,\"2014\":73407,\"2015\":96163,\"2016\":107715,\"2012\":39749,\"2011\":29643,\"2010\":18109},{\"2017\":74009,\"2008\":12598,\"2009\":12984,\"index\":\"利息净收入\",\"2013\":40688,\"2014\":53046,\"2015\":68461,\"2016\":76411,\"2012\":33035,\"2011\":25290,\"2010\":15829},{\"2017\":30674,\"2008\":851,\"2009\":1181,\"index\":\"手续费及佣金净收入\",\"2013\":10456,\"2014\":17378,\"2015\":24083,\"2016\":27859,\"2012\":5721,\"2011\":3665,\"2010\":1585},{\"2017\":75563,\"2008\":13710,\"2009\":8955,\"index\":\"营业支出\",\"2013\":32234,\"2014\":47161,\"2015\":67268,\"2016\":77936,\"2012\":22207,\"2011\":16510,\"2010\":10173},{\"2017\":30223,\"2008\":803,\"2009\":6172,\"index\":\"营业利润\",\"2013\":19955,\"2014\":26246,\"2015\":28895,\"2016\":29779,\"2012\":17542,\"2011\":13133,\"2010\":7937},{\"2017\":30157,\"2008\":793,\"2009\":6191,\"index\":\"利润总额\",\"2013\":20040,\"2014\":26194,\"2015\":28846,\"2016\":29935,\"2012\":17551,\"2011\":13257,\"2010\":7998},{\"2017\":6968,\"2008\":179,\"2009\":1160,\"index\":\"所得税\",\"2013\":4809,\"2014\":6392,\"2015\":6981,\"2016\":7336,\"2012\":4040,\"2011\":2867,\"2010\":1714},{\"2017\":23189,\"2008\":614,\"2009\":5031,\"index\":\"净利润\",\"2013\":15231,\"2014\":19802,\"2015\":21865,\"2016\":22599,\"2012\":13511,\"2011\":10390,\"2010\":6284}],\"cashFlowData\":[{\"2017\":-118780,\"2008\":24343,\"2009\":32194,\"index\":\"经营活动产生的现金流量净额\",\"2013\":91674,\"2014\":25321,\"2015\":-1826,\"2016\":10989,\"2012\":185838,\"2011\":-14439,\"2010\":22045},{\"2017\":-36131,\"2008\":-28214,\"2009\":-15641,\"index\":\"投资活动产生的现金流量净额\",\"2013\":-87011,\"2014\":-54483,\"2015\":-96226,\"2016\":-102343,\"2012\":-80037,\"2011\":8837,\"2010\":-14661},{\"2017\":61439,\"2008\":10441,\"2009\":1027,\"index\":\"筹资活动产生的现金流量净额\",\"2013\":4910,\"2014\":31189,\"2015\":174177,\"2016\":59212,\"2012\":-1488,\"2011\":5778,\"2010\":6359}],\"assetsData\":[{\"2017\":null,\"2008\":null,\"2009\":null,\"index\":\"资产\",\"2013\":null,\"2014\":null,\"2015\":null,\"2016\":null,\"2012\":null,\"2011\":null,\"2010\":null},{\"2017\":310212,\"2008\":39768,\"2009\":54244,\"index\":\"现金及存放中央银行款项\",\"2013\":229924,\"2014\":306298,\"2015\":291715,\"2016\":311258,\"2012\":219347,\"2011\":160635,\"2010\":76587},{\"2017\":130208,\"2008\":21501,\"2009\":15593,\"index\":\"存放同业及其他金融机构款项\",\"2013\":71914,\"2014\":66969,\"2015\":109046,\"2016\":166882,\"2012\":94295,\"2011\":39884,\"2010\":8524},{\"2017\":1660420,\"2008\":281715,\"2009\":355563,\"index\":\"发放贷款和垫款\",\"2013\":832127,\"2014\":1003637,\"2015\":1186872,\"2016\":1435869,\"2012\":708262,\"2011\":610075,\"2010\":400966},{\"2017\":36744,\"2008\":48800,\"2009\":36998,\"index\":\"可供出售金融资产\",\"2013\":578,\"2014\":1493,\"2015\":1245,\"2016\":1179,\"2012\":90007,\"2011\":78384,\"2010\":31534},{\"2017\":358360,\"2008\":15585,\"2009\":34585,\"index\":\"持有至到期投资\",\"2013\":195667,\"2014\":207874,\"2015\":266166,\"2016\":286802,\"2012\":103124,\"2011\":107683,\"2010\":61380},{\"2017\":3248474,\"2008\":474440,\"2009\":587811,\"index\":\"总资产\",\"2013\":1891741,\"2014\":2186459,\"2015\":2507149,\"2016\":2953434,\"2012\":1606537,\"2011\":1258177,\"2010\":727207},{\"2017\":null,\"2008\":null,\"2009\":null,\"index\":\"负债\",\"2013\":null,\"2014\":null,\"2015\":null,\"2016\":null,\"2012\":null,\"2011\":null,\"2010\":null},{\"2017\":130652,\"2008\":null,\"2009\":null,\"index\":\"向中央银行借款\",\"2013\":2264,\"2014\":2754,\"2015\":3051,\"2016\":19137,\"2012\":16168,\"2011\":1131,\"2010\":2238},{\"2017\":430904,\"2008\":36063,\"2009\":74140,\"index\":\"同业存放及其他金融机构存放款项\",\"2013\":450789,\"2014\":385451,\"2015\":311106,\"2016\":392351,\"2012\":354223,\"2011\":155410,\"2010\":82370},{\"2017\":6359,\"2008\":38916,\"2009\":13733,\"index\":\"卖出回购金融资产款\",\"2013\":36049,\"2014\":22568,\"2015\":11000,\"2016\":18941,\"2012\":46148,\"2011\":39197,\"2010\":17589},{\"2017\":2000420,\"2008\":360514,\"2009\":454635,\"index\":\"吸收存款\",\"2013\":1217002,\"2014\":1533183,\"2015\":1733921,\"2016\":1921835,\"2012\":1021108,\"2011\":850845,\"2010\":562912},{\"2017\":3026420,\"2008\":458039,\"2009\":567341,\"index\":\"总负债\",\"2013\":1779660,\"2014\":2055510,\"2015\":2345649,\"2016\":2751263,\"2012\":1521738,\"2011\":1182796,\"2010\":694010},{\"2017\":null,\"2008\":null,\"2009\":null,\"index\":\"股东权益\",\"2013\":null,\"2014\":null,\"2015\":null,\"2016\":null,\"2012\":null,\"2011\":null,\"2010\":null},{\"2017\":17170,\"2008\":3105,\"2009\":3105,\"index\":\"股本\",\"2013\":9521,\"2014\":11425,\"2015\":14309,\"2016\":17170,\"2012\":5123,\"2011\":5123,\"2010\":3485},{\"2017\":38552,\"2008\":3583,\"2009\":4676,\"index\":\"一般风险准备\",\"2013\":16509,\"2014\":19115,\"2015\":27528,\"2016\":34468,\"2012\":13633,\"2011\":7955,\"2010\":5978},{\"2017\":79661,\"2008\":952,\"2009\":4387,\"index\":\"未分配利润\",\"2013\":29963,\"2014\":43656,\"2015\":52933,\"2016\":64143,\"2012\":23077,\"2011\":15864,\"2010\":8481},{\"2017\":222054,\"2008\":16401,\"2009\":20470,\"index\":\"所有者权益\",\"2013\":112081,\"2014\":130949,\"2015\":161500,\"2016\":202171,\"2012\":84799,\"2011\":75381,\"2010\":33198}]})";
        Pattern pattern = Pattern.compile("(?<=\\()[^\\)]+");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }

}
