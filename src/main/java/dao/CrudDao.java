package dao;

import java.util.List;

public interface CrudDao<T,ID> extends SuperDao{

    public boolean save(T t);
    public boolean update(T t);
    public boolean delete(ID id);
    public T get(ID id);
    public List<T> getAll(T t);

}
