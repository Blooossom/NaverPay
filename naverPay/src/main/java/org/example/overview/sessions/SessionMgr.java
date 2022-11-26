package org.example.overview.sessions;


import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;

@Component
public class SessionMgr {
    private SessionMgr(){
    }

    public void create(HttpSession session, String name, String value){
        if(session.getAttribute(name)==null){
            session.setAttribute(name,value);
            session.setMaxInactiveInterval(1800);
        }
    }
    public void createuIdInSession(HttpSession session, String value){
        if(session.getAttribute("SESSION_ID")==null){
            session.setMaxInactiveInterval(1800);
            session.setAttribute("SESSION_ID",value);
        }

    }
    public void set(HttpSession session, String name, String value){
        session.setAttribute(name, value);
    }
    public String get(HttpSession session, String name){
        return session.getAttribute(name).toString();
    }
    public String getuIdInSession(HttpSession session){
        if (session.getAttribute("SESSION_ID") != null) {
            return session.getAttribute("SESSION_ID").toString();
        }
        return null;
    }
    public void delete(HttpSession session, String name){
        if (session.getAttribute(name) != null
        ) {
            session.removeAttribute(name);
        }
        session.invalidate();
    }
    public void delete(HttpSession session){
        delete(session, "SESSION_ID");
    }
}
