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
}
