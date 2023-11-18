package com.onlyex.naxtech.api.pattern;

import com.onlyex.naxtech.api.block.impl.WrappedIntTier;
import com.onlyex.naxtech.api.pattern.predicates.TierTraceabilityPredicate;

import java.util.Comparator;
import java.util.function.Supplier;

import static com.onlyex.naxtech.api.NTAPI.*;


public class NTTraceabilityPredicate {

    //  Tier Traceability Predicates
    public static Supplier<TierTraceabilityPredicate> MACHINE_CASINGS = () -> new TierTraceabilityPredicate(MAP_MACHINE_CASING,"MachineCasingType",null);
    public static Supplier<TierTraceabilityPredicate> CP_CASING = () -> new TierTraceabilityPredicate(MAP_CP_CASING,
            Comparator.comparing((s) -> ((WrappedIntTier)MAP_CP_CASING.get(s)).getIntTier()),"ChemicalPlantCasing",null);
    public static Supplier<TierTraceabilityPredicate> CP_TUBE = () -> new TierTraceabilityPredicate(MAP_CP_TUBE,
            Comparator.comparing((s) -> ((WrappedIntTier)MAP_CP_TUBE.get(s)).getIntTier()),"ChemicalPlantTube",null);
    public static Supplier<TierTraceabilityPredicate> CA_TIERED_CASING = () -> new TierTraceabilityPredicate(MAP_CA_TIRED_CASING,
            Comparator.comparing((s) -> ((WrappedIntTier)MAP_CA_TIRED_CASING.get(s)).getIntTier()), "CATieredCasing", null);
    public static Supplier<TierTraceabilityPredicate> PA_CASING = () -> new TierTraceabilityPredicate(MAP_PA_CASING,
            Comparator.comparing((s) -> ((WrappedIntTier)MAP_PA_CASING.get(s)).getIntTier()), "PACasing", null);
    public static Supplier<TierTraceabilityPredicate> PA_INTERNAL_CASING = () -> new TierTraceabilityPredicate(MAP_PA_INTERNAL_CASING,
            Comparator.comparing((s) -> ((WrappedIntTier)MAP_PA_INTERNAL_CASING.get(s)).getIntTier()), "PAInternalCasing", null);
}
