package top.interc.crawler.parser;

import top.interc.crawler.controller.Page;
import top.interc.crawler.exceptions.ParseException;

public interface HtmlParser {

    HtmlParseData parse(Page page, String contextURL) throws ParseException;

}
