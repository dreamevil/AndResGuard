package com.tencent.mm.androlib.res.data;

import java.util.Objects;

public class TypeAndReplaceName {
    public String mReplaceName;
    public String mTypeName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TypeAndReplaceName that = (TypeAndReplaceName) o;

        if (!Objects.equals(mReplaceName, that.mReplaceName))
            return false;
        return Objects.equals(mTypeName, that.mTypeName);
    }

    @Override
    public int hashCode() {
        int result = mReplaceName != null ? mReplaceName.hashCode() : 0;
        result = 31 * result + (mTypeName != null ? mTypeName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return mReplaceName +
                ", mTypeName : " + mTypeName;
    }
}
