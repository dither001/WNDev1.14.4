package com.matez.wildnature.world.gen.noise.another;

import com.matez.wildnature.world.gen.noise.OpenSimplexNoise;

import java.util.Random;

public class DuneNoise extends Noise {
    protected OpenSimplexNoise generator;
    protected double scale;
    protected double mixscale;

    public DuneNoise(Random rand, double scale, double mixscale) {
        this.generator = new OpenSimplexNoise(rand.nextLong());
        this.scale = scale;
        this.mixscale = mixscale;
    }

    @Override
    public double getValue(double x, double z) {
        double output = 0.0;

        double dscale = 4.0/scale;
        double distortion = generator.eval(x*dscale, z*dscale, 73533.5) * 0.2;

        double dx = ((x * 2.0 + z * 0.6))/scale;
        double dz = ((z * 0.8 - x * 0.4))/scale;

        double dune1 = (1.0-Math.abs(generator.eval(dx, dz, 0.5 + distortion))) * 2.0 - 1.0;
        double dune2 = (1.0-Math.abs(generator.eval(dx, dz, 72039.5 + distortion))) * 2.0 - 1.0;

        double bscale = 0.4/scale;

        double mdune1 = dune1 * (0.2 + 0.8 * generator.eval(x*bscale*1.5, z*bscale, 773.5));
        double mdune2 = dune2 * (0.2 + 0.8 * generator.eval(x*bscale, z*bscale*0.8, 9482542.5));

        output += polymax(mdune1, mdune2, this.mixscale);

        return output;
    }

    /**
     * Polynomial smoothed maximum of a and b. Equivalent to Math.max until the difference between the two values is less than div, where it has a smooth transition between the values.
     * @param a First input
     * @param b Second input
     * @param div Smoothing threshold in absolute value
     * @return The maximum value out of a and b, smoothed to avoid discontinuities
     */
    public static double polymax(double a, double b, double div) {
        double h = clamp(0.5 + 0.5 * (b-a) / div, 0.0,1.0);
        return (b * h + a * (1.0-h)) + div * h * (1.0 - h);
    }

    public static double clamp(double num, double min, double max) {
        return Math.max(min, Math.min(max, num));
    }

}