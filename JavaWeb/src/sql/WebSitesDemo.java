package sql;

import sql.action.WebSitesAction;
import sql.dao.WebSitesDao;
import sql.model.WebSites;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by admin on 2017/4/18.
 */
public class WebSitesDemo {
    public static void main(String[] args) throws Exception {
        WebSitesAction webSitesAction = new WebSitesAction();
        List<WebSites> webSitesList = webSitesAction.query();

        for(WebSites webSites:webSitesList){
            System.out.println(webSites.getName()+"\t"+webSites.getUrl()+"\t"+webSites.getAlexa()+"\t"+webSites.getCountry() );
            System.out.println("\n");
        }
    }
}
