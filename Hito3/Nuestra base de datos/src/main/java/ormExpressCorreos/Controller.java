package ormExpressCorreos;

import org.hibernate.tool.hbm2ddl.SchemaExportTask;
import ormExpressCorreos.model.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.sql.*;
import java.util.Set;

/**
 * Controlador de la aplicación. Por favor, revise detenidamente la clase y
 * complete las partes omitidas
 * atendiendo a los comentarios indicados mediante @TODO
 */
public class Controller {

        private Session session;

        /**
         * Crea un nuevo controlador
         */
        public Controller() {

                StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                                .configure()
                                .build();

                SessionFactory sessionFactory = new MetadataSources(registry)
                                .buildMetadata()
                                .buildSessionFactory();

                this.session = sessionFactory.openSession();
        }

        /**
         * Crea un nuevo usuario_generico
         * param id id del usuario
         * param nombre nombre del usuario
         * param apellidos apellidos del usuario
         * 
         * @return el nuevo usuario creado
         * @throws SQLException
         */
        public UsuarioGenerico createUsuarioGenerico(Long id, String nombre, String apellidos, Direccion dir)
                        throws SQLException {
                // @TODO completa este metodo para crear de forma presistente un usuario
                // genérico
                UsuarioGenerico usuario = new UsuarioGenerico(id, nombre, apellidos, dir);
                session.beginTransaction();
                session.saveOrUpdate(usuario);
                session.getTransaction().commit();
                return usuario;

        }

        public UsuarioIdentificado createUsuarioIdentificado(String DNI, String nombre, String apellidos, String email)
                        throws SQLException {
                // @TODO completa este metodo para crear de forma presistente un usuario
                // identificado
                UsuarioIdentificado usuario = new UsuarioIdentificado(DNI, nombre, apellidos, email);
                session.beginTransaction();
                session.saveOrUpdate(usuario);
                session.getTransaction().commit();
                return usuario;
        }

        public Municipio createMunicipio(String nombre) {
                Municipio municipio = new Municipio(nombre);
                session.beginTransaction();
                session.saveOrUpdate(municipio);
                session.getTransaction().commit();
                return municipio;
        }

        public Calle createCalle(String nombre, Municipio municipio) throws SQLException {
                Calle calle = new Calle(nombre, municipio);
                session.beginTransaction();
                session.saveOrUpdate(calle);
                session.getTransaction().commit();
                return calle;
        }

        public Direccion createDireccion(Integer numero, Integer piso, String letra, String portal, Calle calle)
                        throws SQLException {
                // @TODO completa este metodo para crear de forma presistente una direccion
                Direccion direccion = new Direccion(numero, piso, letra, portal, calle);
                session.beginTransaction();
                session.saveOrUpdate(calle);
                session.getTransaction().commit();
                return direccion;
        }

        public UsuarioIdentificado addDireccionUsuario(Direccion direccion, UsuarioIdentificado usuarioIdentificado)
                        throws SQLException {
                usuarioIdentificado.getDireccionIden().add(direccion);
                session.beginTransaction();
                session.saveOrUpdate(usuarioIdentificado);
                session.getTransaction().commit();
                return usuarioIdentificado;
        }
}
