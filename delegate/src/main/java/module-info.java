module com.pk.delegate {
    requires log4j.core;
    requires log4j.api;
    requires java.sql;
    requires h2;
    requires com.pk.business;
    exports com.pk.delegate;
}