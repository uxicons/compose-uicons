package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartHalfStroke: ImageVector? = null

val Icons.Ts.HeartHalfStroke: ImageVector
    get() = _HeartHalfStroke ?: UXIcon(name = "HeartHalfStroke") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.19f, 2.82f)
                curveToRelative(-1.15f, -1.19f, -2.69f, -1.82f, -4.46f, -1.82f)
                curveToRelative(-2.18f, 0.05f, -4.19f, 1.26f, -5.24f, 3.15f)
                curveToRelative(-0.02f, 0.03f, -0.24f, 0.4f, -0.48f, 1.04f)
                curveToRelative(-0.22f, -0.53f, -0.44f, -0.94f, -0.48f, -1.02f)
                curveToRelative(-1.06f, -1.91f, -3.07f, -3.12f, -5.26f, -3.17f)
                curveToRelative(-1.77f, 0f, -3.31f, 0.63f, -4.46f, 1.83f)
                curveTo(0.59f, 4.09f, -0.07f, 5.9f, 0f, 7.78f)
                curveToRelative(0f, 6.89f, 11.59f, 15.24f, 11.7f, 15.32f)
                lineToRelative(0.29f, 0.21f)
                lineToRelative(0.29f, -0.21f)
                curveToRelative(4.05f, -2.87f, 11.71f, -9.75f, 11.71f, -15.27f)
                curveToRelative(0.07f, -1.92f, -0.59f, -3.75f, -1.81f, -5.02f)
                close()
                moveTo(12f, 22.08f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                verticalLineToRelative(-5.1f)
                curveToRelative(0f, -6.82f, 0.39f, -9.06f, 0.4f, -9.12f)
                curveToRelative(0.21f, -1.97f, 0.93f, -3.18f, 0.95f, -3.21f)
                curveToRelative(0.88f, -1.6f, 2.57f, -2.61f, 4.38f, -2.65f)
                curveToRelative(1.49f, 0f, 2.78f, 0.52f, 3.73f, 1.52f)
                curveToRelative(1.03f, 1.07f, 1.59f, 2.63f, 1.53f, 4.3f)
                curveToRelative(0f, 4.65f, -6.47f, 10.98f, -10.99f, 14.26f)
                close()
            }
        }.also { _HeartHalfStroke = it}
