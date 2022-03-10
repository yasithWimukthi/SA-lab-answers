package com.lab.exercise3;

public class Query {
    private String select;
    private String from;
    private String where;
    private String orderBy;

    public void setSelect(String select) {
        this.select = select;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getSelect() {
        return select;
    }

    public String getFrom() {
        return from;
    }


    @Override
    public String toString() {
        if (select != null && from != null && where != null && orderBy != null){
            return
                    "select='" + select +
                            "from " + from +
                            " where " + where  +
                            " orderBy " + orderBy ;
        }
        else if (select != null && from != null && where != null && orderBy == null){
            return
                    "select " + select +
                            " from " + from+
                            " where " + where ;
        }
        else if (select != null && from != null && where == null && orderBy != null){
            return "select " + select+
                    " from " + from+
                    " orderBy " + orderBy ;
        }else {
            return "select " + select +
                    " from " + from ;
        }
    }
}
