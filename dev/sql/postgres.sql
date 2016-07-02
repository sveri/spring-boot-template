--
-- PostgreSQL database dump
--

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


--
-- Name: btree_gin; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS btree_gin WITH SCHEMA public;


--
-- Name: EXTENSION btree_gin; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION btree_gin IS 'support for indexing common datatypes in GIN';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;
--
-- Name: hibernate_sequence; Type: SEQUENCE; Schema: public; Owner: template
--

CREATE SEQUENCE hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.hibernate_sequence OWNER TO template;

--
-- Name: users; Type: TABLE; Schema: public; Owner: template; Tablespace: 
--

CREATE TABLE users (
    id bigserial NOT NULL PRIMARY KEY,
    email character varying(255) NOT NULL,
    last_login character varying(255),
    password character varying(100) NOT NULL,
    role character varying(255),
    token character varying(255),
    user_name character varying(100) NOT NULL
);


ALTER TABLE public.users OWNER TO template;

--
-- Name: uk_6dotkott2kjsp8vw4d0m25fb7; Type: CONSTRAINT; Schema: public; Owner: template; Tablespace: 
--

ALTER TABLE ONLY users
    ADD CONSTRAINT uk_6dotkott2kjsp8vw4d0m25fb7 UNIQUE (email);


--
-- Name: uk_k8d0f2n7n88w1a16yhua64onx; Type: CONSTRAINT; Schema: public; Owner: template; Tablespace: 
--

ALTER TABLE ONLY users
    ADD CONSTRAINT uk_k8d0f2n7n88w1a16yhua64onx UNIQUE (user_name);


--
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


--
-- PostgreSQL database dump complete
--