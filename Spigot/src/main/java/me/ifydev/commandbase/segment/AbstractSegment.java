package me.ifydev.commandbase.segment;

/**
 * @author Innectic
 * @since 9/24/2019
 */
public abstract class AbstractSegment<T> {

    public abstract T getContents();

    public abstract SegmentType getType();
}
