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

     //   WebSites webSites1 = webSitesAction.queryById(1);
       // System.out.println(webSites1.getName()+"\t"+webSites1.getUrl()+"\t"+webSites1.getAlexa()+"\t"+webSites1.getCountry() );

        //add(webSitesAction);
       // update(webSitesAction);
        delete(webSitesAction);
        show(webSitesAction);

    }
    public static void delete(WebSitesAction webSitesAction){
        try {
            webSitesAction.deleteById(9);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void update(WebSitesAction webSitesAction){
        try {
            WebSites webSites = webSitesAction.queryById(8);
            webSites.setCountry("USA");
            webSitesAction.update(webSites);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void add(WebSitesAction webSitesAction){
        WebSites webSites2 = new WebSites();

        webSites2.setName("看看视频");
        webSites2.setUrl("http:www.sss.com/");
        webSites2.setAlexa(876);
        webSites2.setCountry("CN");
        try {
            webSitesAction.add(webSites2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void show(WebSitesAction webSitesAction){

        List<WebSites> webSitesList = null;
        try {
            webSitesList = webSitesAction.query();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for(WebSites webSites:webSitesList){
            System.out.println(webSites.getName()+"\t"+webSites.getUrl()+"\t"+webSites.getAlexa()+"\t"+webSites.getCountry() );
            System.out.println("\n");
        }
    }
}
