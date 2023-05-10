package tema05.interfaces;

public class CocheCRUDImpl implements CocheCRUD{

  @Override
  public void save() {
    System.out.println("Ahora estoy guardando un registro...");
  }

  @Override
  public void findAll() {
    System.out.println("Ahora estoy buscando todos los registros...");
  }

  @Override
  public void delete() {
      System.out.println("Ahora estoy eliminando un registro...");
  }
}
