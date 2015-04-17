package util;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.select.Elements;

public class HtmlTableDataParser {
    private String id;
    private int page;
    private String url = "https://www.urionlinejudge.com.br/judge/pt/profile/"; 

    public HtmlTableDataParser(String id, int page) {
        this.id = id;
        this.page = page;
    }
    
    public String getURL() {
		return url;
	}

	public void setURL(String uRL) {
		url = uRL;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPage() {
		return page;
	}


	public void setPage(int page) {
		this.page = page;
	}

	public Elements fillOutForm() throws IOException {
        return Jsoup.connect(this.url+this.id+"/page:"+this.page).post().select("tr");
    }
	
  }

