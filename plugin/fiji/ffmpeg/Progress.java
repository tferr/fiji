package fiji.ffmpeg;

public interface Progress {
	public void step(String message, double progress);
	public void done(String message);
}
