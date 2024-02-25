package geometry;

@SuppressWarnings("rawtypes")
/**
 * Every Geometry represents a body in a data-space with {@link #dimensions()}.
 * 
 * @author Nico Ziehe
 */
public abstract class ComparableGeometry extends Geometry implements Comparable{
    
    /**
     * Create a new ComparableGeometry. Every ComparableGeometry must have a dimension 1.
     * @param dimension dimension number of dimension of the data space of this Geometry.
     */
    public ComparableGeometry(int dimension){
        super (dimension);
    }

    /**
     *Compares this Geometry with another one. Throws a RuntimeExeptionerror if o is nit of type Geometry.
     *Otherwise compare two Geometries by thier volume.
     *@throws RuntimeExeption is o is not of type Geometry.
     *@return if o is of type Geometry, the difference between the volumes.
     */
    public int compareTo(Object o){
        if (o instanceof Geometry) {
            return (int) ((this.volume()) - ((Geometry) o).volume());

        }else{
            throw new RuntimeException(o.getClass() + "is not a Geometry");
        }
    }
}
