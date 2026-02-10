package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Following: ImageVector? = null

val Icons.Br.Following: ImageVector
    get() = _Following ?: UXIcon(name = "Following", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(158.99f, 299.08f)
            curveTo(68.07f, 307.3f, -1.19f, 384.12f, 0.02f, 475.4f)
            verticalLineToRelative(4.63f)
            curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
            reflectiveCurveToRelative(32f, -14.33f, 32f, -32f)
            verticalLineToRelative(-5.91f)
            curveToRelative(-0.96f, -56.04f, 40.4f, -103.84f, 96f, -110.93f)
            curveToRelative(58.69f, -5.82f, 110.99f, 37.04f, 116.81f, 95.74f)
            curveToRelative(0.34f, 3.47f, 0.52f, 6.95f, 0.52f, 10.44f)
            verticalLineToRelative(10.67f)
            curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
            curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
            verticalLineToRelative(-10.67f)
            curveToRelative(-0.1f, -94.36f, -76.68f, -170.77f, -171.05f, -170.67f)
            curveTo(166.53f, 298.7f, 162.76f, 298.83f, 158.99f, 299.08f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(170.68f, 256.03f)
            curveToRelative(70.69f, 0f, 128f, -57.31f, 128f, -128f)
            reflectiveCurveToRelative(-57.31f, -128f, -128f, -128f)
            reflectiveCurveToRelative(-128f, 57.31f, -128f, 128f)
            curveTo(42.75f, 198.7f, 100.02f, 255.96f, 170.68f, 256.03f)
            close()
            moveTo(170.68f, 64.03f)
            curveToRelative(35.35f, 0f, 64f, 28.65f, 64f, 64f)
            reflectiveCurveToRelative(-28.65f, 64f, -64f, 64f)
            reflectiveCurveToRelative(-64f, -28.65f, -64f, -64f)
            reflectiveCurveTo(135.34f, 64.03f, 170.68f, 64.03f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(469.35f, 168.03f)
            curveToRelative(-24.72f, 1.23f, -43.79f, 22.21f, -42.67f, 46.93f)
            curveToRelative(1.12f, -24.72f, -17.95f, -45.7f, -42.67f, -46.93f)
            curveToRelative(-24.72f, 1.23f, -43.79f, 22.21f, -42.67f, 46.93f)
            curveToRelative(0f, 36.91f, 48.13f, 80.15f, 72.11f, 99.39f)
            curveToRelative(7.73f, 6.19f, 18.72f, 6.19f, 26.45f, 0f)
            curveToRelative(23.98f, -19.2f, 72.11f, -62.49f, 72.11f, -99.39f)
            curveTo(513.14f, 190.24f, 494.07f, 169.26f, 469.35f, 168.03f)
            close()
        }
    }.also { _Following = it }
