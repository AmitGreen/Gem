//  Copyright (c) 2018 Amit Green.  All rights reserved.


package link.crystal.Gem.Silver;


import java.lang.Comparable;
import link.crystal.Gem.Core.Gem_Object;
import link.crystal.Gem.Core.Gem_StringBuilder;
import link.crystal.Gem.Interface.Gem_Comparable;
import link.crystal.Gem.Interface.Inspectable;
import link.crystal.Gem.Inspection.Comparable_Inspection;
import link.crystal.Gem.World.World_String;


public final class  Silver_String
    extends         Gem_Object    <Comparable_Inspection>
//  extends         Object
    implements      Gem_Comparable<Comparable_Inspection>,
                    Comparable<Gem_Comparable<? extends Comparable_Inspection>>,    //  Via Gem_Comparable
                    Inspectable   <Comparable_Inspection>//,
{
    private static final Comparable_Inspection  inspection = Comparable_Inspection.create(
            "Silver_String",
            Comparable_Inspection.CLASS_ORDER__Silver_String//,
        );


    //
    //  Members
    //
    private /*:*/ String                world_name;
    public  final World_String          world_s;
    public  final String                s_0;


    //
    //  Constructor & Factory
    //
    protected                           Silver_String(final World_String world_s)
    {
        this.world_name = null;
        this.world_s    = world_s;
        this.s_0        = null;
    }


    public static final Silver_String   create__ALLY__Gem(final World_String world_s)
    {
        return new Silver_String(world_s);
    }


    //
    //  Interface java.lang.Comparable
    //
    @Override
    public final int                    compareTo(final Gem_Comparable<? extends Comparable_Inspection> that)
    {
        final int                       class_compare = (
                  Comparable_Inspection.CLASS_ORDER__Silver_String
                - that.inspect().class_order
            );

        if (class_compare != 0) {
            return class_compare;
        }

        final Silver_String            that_2 = (Silver_String) that;

        return this.world_s.compareTo(that_2.world_s);
    }


    //
    //  Interface Gem_Comparable
    //
    //<empty>


    //
    //  Interface Inspectable
    //
    @Override
    public final Comparable_Inspection  inspect()
    {
        return /*static*/ this.inspection;
    }


    @Override
    public final void                   portray(final Gem_StringBuilder builder)
    {
        builder.append("<");
        builder.java_quote(this.world_s.s);
        builder.append(">");
    }
}
