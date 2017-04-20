package sql.action;

import sql.dao.WebSitesDao;
import sql.model.WebSites;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by admin on 2017/4/18.
 */
public class WebSitesAction {

    public List<WebSites> query() throws Exception{
        WebSitesDao webSitesDao = new WebSitesDao();
        return webSitesDao.query();
    }

    public WebSites queryById(int i)throws Exception{
        WebSitesDao webSitesDao = new WebSitesDao();
        return webSitesDao.queryById(i);
    }
    public void add(WebSites webSites)throws Exception{
        WebSitesDao webSitesDao = new WebSitesDao();
        webSitesDao.addWebSites(webSites);
    }
    public void update(WebSites webSites) throws Exception{
        WebSitesDao webSitesDao = new WebSitesDao();
        webSitesDao.updateWebSites(webSites);
    }
    public void deleteById(int i) throws Exception{
        WebSitesDao webSitesDao = new WebSitesDao();
        webSitesDao.deleteWebSites(i);
    }
}
