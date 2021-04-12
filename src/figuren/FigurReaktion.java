package figuren;

/*import tools.Klang;
import tools.Vektor2D;

public abstract class FigurReaktion {
    protected SpielFigur f1, f2;
    protected static Klang klang;
    protected double klangFaktor;
    protected Vektor2D v1, v2, relativBewegung;

    public FigurReaktion(SpielFigur f1, SpielFigur f2, Klang klang, double klangFaktor) {
        this.f1 = f1;
        this.f2 = f2;
        if(this.klang==null) this.klang = klang;
        this.klangFaktor = klangFaktor;
        v1=new Vektor2D();
        v2=new Vektor2D();
        relativBewegung = new Vektor2D();
    }

    public final void reagiere() {
        if(f1.intersects(f2)) {
            this.v1.setLocation(f1.getBewegung());
            this.v2.setLocation(f2.getBewegung());
            this.relativBewegung.setLocation(v1);
            this.relativBewegung.subtrahiere(v2);
            if(klang!=null) klang.play(klangFaktor*this.relativBewegung.distance(0,0));
            //  Reaktion in der abgeleiteten Klasse
            reaktion();
        }
    }
    protected abstract void reaktion();
}

 */
