package abstraction;

import org.bukkit.Bukkit;

public enum Version {

    v1_18(18) ,v1_17(17), v1_16(16), v1_13(13), v1_12(12), v1_8(8);

    private final int version;

    Version(int version) {
        this.version = version;
    }

    public int getVersion() {
        return version;
    }

    private static int getServerVersion() {
        String version = Bukkit.getVersion();
        // getVersion()
        int index = version.lastIndexOf("MC:");
        if (index != -1) {
            version = version.substring(index + 4, version.length() - 1);
        } else if (version.endsWith("SNAPSHOT")) {
            // getBukkitVersion()
            index = version.indexOf('-');
            version = version.substring(0, index);
        }

        // 1.13.2, 1.14.4, etc...
        int lastDot = version.lastIndexOf('.');
        if (version.indexOf('.') != lastDot) version = version.substring(0, lastDot);

        return Integer.parseInt(version.substring(2));
    }

    public static Version findVersion() {
        int version = getServerVersion();

        for (Version vr: Version.values())
            if (vr.getVersion() == version)
                return vr;

        return null;
    }

}