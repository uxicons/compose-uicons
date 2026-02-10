package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockUpArrow: ImageVector? = null

val Icons.Br.ClockUpArrow: ImageVector
    get() = _ClockUpArrow ?: UXIcon(name = "ClockUpArrow") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(5.29f, 18.0f)
            curveToRelative(0.55f, 0.62f, 0.5f, 1.56f, -0.12f, 2.12f)
            curveToRelative(-0.29f, 0.26f, -0.65f, 0.38f, -1f, 0.38f)
            curveToRelative(-0.41f, 0f, -0.82f, -0.17f, -1.12f, -0.5f)
            curveToRelative(-1.97f, -2.2f, -3.06f, -5.04f, -3.06f, -8.0f)
            curveTo(0f, 5.38f, 5.38f, 0f, 12f, 0f)
            curveToRelative(5.55f, 0f, 10.34f, 3.76f, 11.66f, 9.14f)
            curveToRelative(0.2f, 0.81f, -0.3f, 1.62f, -1.1f, 1.81f)
            curveToRelative(-0.81f, 0.2f, -1.62f, -0.3f, -1.81f, -1.1f)
            curveToRelative(-0.98f, -4.04f, -4.58f, -6.86f, -8.74f, -6.86f)
            curveTo(7.04f, 3f, 3f, 7.04f, 3f, 12f)
            curveToRelative(0f, 2.22f, 0.81f, 4.35f, 2.29f, 6.0f)
            close()
            moveTo(11f, 6.5f)
            verticalLineToRelative(4.63f)
            lineToRelative(-2.71f, 1.57f)
            curveToRelative(-0.72f, 0.41f, -0.96f, 1.33f, -0.55f, 2.05f)
            curveToRelative(0.28f, 0.48f, 0.78f, 0.75f, 1.3f, 0.75f)
            curveToRelative(0.26f, 0f, 0.51f, -0.06f, 0.75f, -0.2f)
            lineToRelative(3.46f, -2f)
            curveToRelative(0.46f, -0.27f, 0.75f, -0.76f, 0.75f, -1.3f)
            verticalLineToRelative(-5.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            close()
            moveTo(23.07f, 13f)
            horizontalLineToRelative(-4.14f)
            curveToRelative(-0.82f, 0f, -1.24f, 1.0f, -0.66f, 1.58f)
            lineToRelative(1.0f, 1.0f)
            lineToRelative(-3.35f, 3.35f)
            curveToRelative(-0.03f, 0.03f, -0.07f, 0.03f, -0.1f, 0f)
            lineToRelative(-1.03f, -1.03f)
            curveToRelative(-1.2f, -1.2f, -3.15f, -1.2f, -4.34f, 0f)
            lineToRelative(-3.53f, 3.53f)
            curveToRelative(-0.59f, 0.59f, -0.59f, 1.53f, 0f, 2.12f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            lineToRelative(3.53f, -3.53f)
            curveToRelative(0.03f, -0.03f, 0.07f, -0.03f, 0.1f, 0f)
            lineToRelative(1.03f, 1.03f)
            curveToRelative(1.2f, 1.2f, 3.15f, 1.2f, 4.34f, 0f)
            lineToRelative(3.35f, -3.35f)
            lineToRelative(1.02f, 1.02f)
            curveToRelative(0.58f, 0.58f, 1.58f, 0.17f, 1.58f, -0.66f)
            verticalLineToRelative(-4.14f)
            curveToRelative(0f, -0.51f, -0.41f, -0.93f, -0.93f, -0.93f)
            close()
        }
    }.also { _ClockUpArrow = it }
