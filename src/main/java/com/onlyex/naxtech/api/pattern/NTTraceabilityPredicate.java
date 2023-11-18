package com.onlyex.naxtech.api.pattern;

import com.onlyex.naxtech.api.block.impl.WrappedIntTier;
import com.onlyex.naxtech.api.pattern.predicates.TierTraceabilityPredicate;

import java.util.Comparator;
import java.util.function.Supplier;

import static com.onlyex.naxtech.api.NTAPI.*;


public class NTTraceabilityPredicate {

    //  Tier Traceability Predicates
    public static Supplier<TierTraceabilityPredicate> CA_TIERED_CASING = () -> new TierTraceabilityPredicate(MAP_CA_TIRED_CASING,
            Comparator.comparing((s) -> ((WrappedIntTier)MAP_CA_TIRED_CASING.get(s)).getIntTier()), "CATieredCasing", null);
    public static Supplier<TierTraceabilityPredicate> PA_CASING = () -> new TierTraceabilityPredicate(MAP_PA_CASING,
            Comparator.comparing((s) -> ((WrappedIntTier)MAP_PA_CASING.get(s)).getIntTier()), "PACasing", null);
    public static Supplier<TierTraceabilityPredicate> PA_INTERNAL_CASING = () -> new TierTraceabilityPredicate(MAP_PA_INTERNAL_CASING,
            Comparator.comparing((s) -> ((WrappedIntTier)MAP_PA_INTERNAL_CASING.get(s)).getIntTier()), "PAInternalCasing", null);
}
