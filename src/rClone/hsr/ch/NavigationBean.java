package rClone.hsr.ch;

import java.util.Map;

import javax.faces.context.FacesContext;

public class NavigationBean
{
    private String viewedPage;

    public NavigationBean()
    {
        viewedPage = "linklist.xhtml";
    }

    public String getViewedPage()
    {
        return viewedPage;
    }

    public void setViewedPage(String viewedPage)
    {
        this.viewedPage = viewedPage;
    }

    public void requestPage()
    {
        Map<String,String> map = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        viewedPage = map.get("requestedPage");
    }
}
