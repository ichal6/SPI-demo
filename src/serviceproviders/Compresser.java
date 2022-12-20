package serviceproviders;

public interface Compresser {
    byte[] compress(byte[] bytes);
    byte[] decompress(byte[] bytes);
}
