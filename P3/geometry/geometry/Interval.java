package geometry;

/**
 * Represents a closed interval with a {@link #begin} and an {@link #end}.
 * 
 * @author Nico Ziehe
 */
public class Interval {

    private double begin;
    private double end;

    Interval(Interval i){
        this(i.begin, i.end);
    }

    /**
     * With instantiation, begin and end are swapped if not begin < end.
     * @param begin begining of this interval.
     * @param end end of thid interval.
     */
    Interval(double begin, double end){
        this.begin = begin < end ? begin : end;
        this.end = begin < end ? begin : end;
    }

    double getBegin(){
        return begin;
    }

    double getEnd(){
        return end;
    }

    /**
     * Unions this interval with another. Returns a new Interval which contains this and the other interval.
     * @param i another Interval which should be unioned with this
     * @return the union of both untervals
     */
    Interval union(Interval i){
        return new Interval(Math.min(this.begin, i.begin), Math.max(this.end, i.end));
    }

    /**
     * Return the absolute length of this Interval.
     * @return the length of this Interval
     */
    double length(){
        return Math.abs(end - begin);
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(begin);
        result = prime * result + (int) (temp ^ (temp >>> 32 ));
        temp = Double.doubleToLongBits(end);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        Interval other = (Interval) o;
        if (Double.doubleToLongBits(begin) != Double.doubleToLongBits(other.begin)) {
            return false;
        }
        if (Double.doubleToLongBits(end) != Double.doubleToLongBits(other.end)) {
            return false;
        }    
        return true;
        
    }
}
