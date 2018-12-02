/**
 * Java 11 module details
 *
 * @author mick
 * @version 1.0
 * @since Jan 11, 2018
 */

@SuppressWarnings("JavaRequiresAutoModule")
module com.packt.cardatabase {

    // List accessible packages
    exports com.packt.cardatabase;
    exports com.packt.cardatabase.domain;
    exports com.packt.cardatabase.web;

    // Required Spring modules
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.boot.starter.web;
    requires spring.boot.starter.logging;
    requires spring.web;
    requires spring.boot.starter.data.rest;
    requires spring.boot.starter.data.jpa;
    requires spring.beans;
    requires spring.context;

    // 3rd party (some transitive) dependencies
    requires reactor.core;  // remove the transitive directive going forward
    requires slf4j.api;
    requires java.xml.bind;
    //requires java.activation;
    requires commons.text;
    requires com.fasterxml.jackson.databind;


}