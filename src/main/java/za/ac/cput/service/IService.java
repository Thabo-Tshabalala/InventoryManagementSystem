package za.ac.cput.service;

public interface IService <T,ID> {

    T create(T t);
    T read(ID t);
    T update(T t);



}
