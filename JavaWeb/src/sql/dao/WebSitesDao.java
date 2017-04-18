package sql.dao;

import sql.db.DBUtil;
import sql.model.WebSites;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017/4/18.
 */
public class WebSitesDao {
    /**
     * 查询所有网站
     * */
    public List<WebSites> query() throws SQLException{
        List<WebSites> webSitesList = new ArrayList<WebSites>();

        Connection conn = DBUtil.getConn();

        StringBuffer sb = new StringBuffer();
        sb.append("select id,name,url,country,alexa from websites");

        Statement stmt = conn.createStatement();
        ResultSet rs =stmt.executeQuery(sb.toString());

        WebSites webSites = null;

        while (rs.next()){
            webSites = new WebSites();
            webSites.setId(rs.getInt("id"));
            webSites.setName(rs.getString("name"));
            webSites.setUrl(rs.getString("url"));
            webSites.setAlexa(rs.getInt("alexa"));
            webSites.setCountry(rs.getString("country"));

            webSitesList.add(webSites);
        }
        return webSitesList;
    }

    /**
     * 查询单个地址
     * */
    public WebSites queryById(Integer id) throws SQLException{
        WebSites webSites = null;

        Connection conn = DBUtil.getConn();
        StringBuffer sb = new StringBuffer();
        sb.append("select * from websites "+"where id=? ");
        PreparedStatement stmt = conn.prepareStatement(sb.toString());

        stmt.setInt(1,id);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()){
            webSites = new WebSites();
            webSites.setId(rs.getInt("id"));
            webSites.setName(rs.getString("name"));
            webSites.setUrl(rs.getString("url"));
            webSites.setAlexa(rs.getInt("alexa"));
            webSites.setCountry(rs.getString("country"));

        }
        return  webSites;
    }
    /**
     * 添加
     * */
    public void addWebSites(WebSites webSites) throws SQLException{
        Connection conn = DBUtil.getConn();

        String sql ="insert into websites(name,url,alexa,country values(?,?,?,?)";

        PreparedStatement ptmt = conn.prepareStatement(sql);
        ptmt.setString(1,webSites.getName());
        ptmt.setString(2,webSites.getUrl());
        ptmt.setInt(3,webSites.getAlexa());
        ptmt.setString(4,webSites.getCountry());

        ptmt.execute();
    }
    /**
     * 修改
     * */
    public void updateWebSites(WebSites webSites) throws SQLException{
        Connection conn = DBUtil.getConn();

        String sql ="update websites set name=?,url=?,alexa=?,country=? where id=?";

        PreparedStatement ptmt = conn.prepareStatement(sql);
        ptmt.setString(1,webSites.getName());
        ptmt.setString(2,webSites.getUrl());
        ptmt.setInt(3,webSites.getAlexa());
        ptmt.setString(4,webSites.getCountry());
        ptmt.setInt(5,webSites.getId());

        ptmt.execute();
    }
    /*
    **/
    public void deleteWebSites(Integer id) throws SQLException
    {
        Connection conn = DBUtil.getConn();

        String sql = "delete from websites where id=?";

        PreparedStatement ptmt = conn.prepareStatement(sql);

        ptmt.setInt(1, id);

        ptmt.execute();
    }

}
