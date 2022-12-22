package ormExpressCorreos;

import ormExpressCorreos.model.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import java.sql.*;

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
                Iden_Vive_Dir vive = new Iden_Vive_Dir();
                UsuarioIdentificado usuario = new UsuarioIdentificado();
                // se deja el campo de direccion vacio ya que no se especifica una aun.
                usuario.setNombre(nombre);
                usuario.setApellidos(apellidos);
                usuario.setDNI(DNI);
                usuario.setEmail(email);
                vive.setUsuarioIdentificado(usuario);
                usuario.setIden_Vive_Dir(vive);
                session.beginTransaction();
                session.saveOrUpdate(usuario);
                session.saveOrUpdate(vive);
                session.getTransaction().commit();
                return usuario;
        }

        public UsuarioIdentificado createDireccion(Integer numero, Integer piso, String letra, String portal,
                        String calle, String municipio,
                        String provincia, UsuarioIdentificado user) throws SQLException {
                Provincia prov = new Provincia(provincia);
                Municipio mun = new Municipio(municipio, prov);
                Calle cal = new Calle(calle, mun);
                Direccion dir = new Direccion(numero, piso, letra, portal, cal, mun);
                Iden_Vive_Dir vive = new Iden_Vive_Dir(dir, user);
                session.beginTransaction();
                session.saveOrUpdate(mun);
                session.saveOrUpdate(cal);
                session.saveOrUpdate(dir);
                session.saveOrUpdate(user);
                session.saveOrUpdate(vive);
                session.getTransaction().commit();
                return user;
        }

}
