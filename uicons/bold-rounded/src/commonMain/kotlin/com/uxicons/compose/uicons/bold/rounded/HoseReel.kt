package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HoseReel: ImageVector? = null

val Icons.Br.HoseReel: ImageVector
    get() = _HoseReel ?: UXIcon(name = "HoseReel") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(11.25f, 5f)
            curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
            reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
            reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
            reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
            close()
            moveTo(11.25f, 14f)
            curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
            reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
            reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
            close()
            moveTo(23.72f, 17.21f)
            lineToRelative(-1.3f, 6.0f)
            curveToRelative(-0.1f, 0.46f, -0.51f, 0.79f, -0.98f, 0.79f)
            horizontalLineToRelative(-1.39f)
            curveToRelative(-0.47f, 0f, -0.88f, -0.33f, -0.98f, -0.79f)
            lineToRelative(-1.3f, -5.99f)
            curveToRelative(-0.2f, -1.03f, 0.49f, -1.98f, 1.47f, -2.18f)
            verticalLineToRelative(-4.04f)
            curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
            reflectiveCurveTo(3.25f, 6.59f, 3.25f, 11f)
            reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
            curveToRelative(1.02f, 0f, 2.01f, -0.19f, 2.95f, -0.56f)
            curveToRelative(0.77f, -0.3f, 1.64f, 0.07f, 1.95f, 0.84f)
            curveToRelative(0.31f, 0.77f, -0.07f, 1.64f, -0.84f, 1.95f)
            curveToRelative(-1.29f, 0.51f, -2.65f, 0.77f, -4.05f, 0.77f)
            curveTo(5.18f, 22f, 0.25f, 17.07f, 0.25f, 11f)
            reflectiveCurveTo(5.18f, 0f, 11.25f, 0f)
            reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
            verticalLineToRelative(4.04f)
            curveToRelative(0.97f, 0.2f, 1.66f, 1.14f, 1.47f, 2.17f)
            close()
        }
    }.also { _HoseReel = it }
