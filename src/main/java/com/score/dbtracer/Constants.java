package com.score.dbtracer;

public interface Constants {
    String PKG_PREFIX          = "com.score.dbtracer";

    String PKG_MYBATIS_DAO     = PKG_PREFIX + ".dao";

    String PKG_JPA_REPOSITORY  = PKG_PREFIX + ".repository.jpa";

    String PKG_ES_REPOSITORY   = PKG_PREFIX + ".repository.es";

    String API_URI_PREFIX      = "/api";

    String JSON_DATE_FORMAT    = "yyyy-MM-dd'T'HH:mm:ssZZ";

    String YMD_DATE_FORMAT     = "yyyy-MM-dd";

    String USER_PWD_SYMBOLS    = "!@#$%^&*";

    String ROLE_SUPERVISOR     = "ROLE_SUPERVISOR";
    String ROLE_ADMIN          = "ROLE_ADMIN";
    String ROLE_USER           = "ROLE_USER";
    String ROLE_ANONYMOUS      = "ROLE_ANONYMOUS";

    String PROFILE_LOCAL       = "LOCAL";
    String PROFILE_DEV         = "DEV";
    String PROFILE_STAGE       = "STAGE";
    String PROFILE_PROD        = "PROD";

    /** Default administrator user id **/
    String DEF_ADMIN_USER_ID   = "U00000001";

    /** Default administrator user name **/
    String DEF_ADMIN_USER_NAME = "admin";

    /** Default root department id **/
    String DEF_ROOT_DEPT_ID    = "D00000001";

}
