public class ImageLoaderProxy {
    private ImageLoader imageLoader;

    public ImageLoaderProxy(ImageLoader imageLoader) {
        this.imageLoader = imageLoader;
    }

    public String sanitizeAndTrackURL(String url) {
        String sanitizedURL = imageLoader.sanitizeURL(url);
        
        // Track the sanitized URL in a separate tracking system
        TrackingSystem.trackURL(sanitizedURL);
        
        return sanitizedURL;
    }
}
