package rClone.hsr.ch;

import java.io.Serializable;
import java.util.Locale;
import java.util.logging.Logger;

import javax.faces.context.FacesContext;

public class LanguageBean implements Serializable {

    private static final long serialVersionUID = 2756934361134603857L;
    private static final Logger LOG = Logger.getLogger(LanguageBean.class.getName());
    
    private Locale locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();

    public Locale getLocale() {
        return locale;
    }

    public String getLanguage() {
        return locale.getLanguage();
    }

    /**
     * Sets the current {@code Locale} for each user session
     * 
     * @param languageCode - ISO-639 language code
     */
    public String changeLanguage(String language) {
        locale = new Locale(language);
        FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
        
        return locale.toString();
    }
    
}