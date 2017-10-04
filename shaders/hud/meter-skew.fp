const mat2 skewMatrix = mat2(1, 20./220., 0, 1);
const vec4 trans = vec4(0., 0., 0., 0.);

vec4 Process(vec4 color) {
	vec2 xy = gl_TexCoord[0].st;
	xy -= .5;
	xy.x *= 1. + (20. / 220.);
	xy *= skewMatrix;
	xy += .5;
	
	if (xy.x < 0. || xy.x > 1.)
		return trans * color;
	else
		return getTexel(xy) * color;
}
