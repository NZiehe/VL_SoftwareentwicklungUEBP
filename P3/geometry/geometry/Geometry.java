package geometry;
/**
 * Every Geometry represents a body in a data-space with {@link #dimensions()}.
 * 
 * @author Nico Ziehe
 */
public abstract class Geometry {
    
    /**
     * Holds the number of dimensions for this Geometry.
     */
    private int dimension;

    /**
     * Create a new Geometry. Every Geometry must have a simension of at least 2.
     * @param dimension number of dimensions of data space of this Geometry.
     * @throws RuntimeExeption if the number of dimension is lesser than 2.
     */
    public Geometry(int dimension){
        if (dimension < 2) {
            throw new RuntimeException("dimension is < 2");
        }
        this.dimension = dimension;
    }

    /**
     * Returns the number of dimensions of the this Geometry.
     * @return number of dimensions of this Geometry.
     */
    public int dimensions(){
        return this.dimension;
    }

    /**
     * Returns the volume of this Geometry. if {@link #dimensions()} is 2, the volume is the area.
     * @return volume of this Geometry
     */
    public abstract double volume();

    /**
     * Encapsulates this Geometry and the given Geometry ba a new Geometry and returns the new Geometry.
     * Thus the new Geometry then contains at least this and the given Geometry.
     * If the other and this have a different number of dimensions null is returned.
     * @param other the Geometry to be encapsulated togther with this Geometry.
     * @return a new Geometry containing this nd other or null.
     * @throws RuntimeExeption if the type of other is unknown
     */
    public abstract Geometry encapsulate(Geometry other);
}
