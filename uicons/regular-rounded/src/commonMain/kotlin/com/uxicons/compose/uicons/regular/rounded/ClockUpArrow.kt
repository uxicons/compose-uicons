package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockUpArrow: ImageVector? = null

val Icons.Rr.ClockUpArrow: ImageVector
    get() = _ClockUpArrow ?: UXIcon(name = "ClockUpArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5.88f)
                curveToRelative(0f, 0.35f, -0.18f, 0.67f, -0.48f, 0.85f)
                lineToRelative(-4.41f, 2.7f)
                curveToRelative(-0.16f, 0.1f, -0.34f, 0.15f, -0.52f, 0.15f)
                curveToRelative(-0.34f, 0f, -0.67f, -0.17f, -0.85f, -0.48f)
                curveToRelative(-0.29f, -0.47f, -0.14f, -1.09f, 0.33f, -1.38f)
                lineToRelative(3.93f, -2.4f)
                verticalLineToRelative(-5.32f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(22f, 13f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2.57f)
                lineToRelative(-4.33f, 4.33f)
                curveToRelative(-0.19f, 0.19f, -0.53f, 0.19f, -0.73f, 0f)
                lineToRelative(-1.1f, -1.1f)
                curveToRelative(-0.95f, -0.95f, -2.61f, -0.95f, -3.56f, 0f)
                lineToRelative(-4.05f, 4.07f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.42f)
                curveToRelative(0.2f, 0.19f, 0.45f, 0.29f, 0.71f, 0.29f)
                curveToRelative(0.26f, 0f, 0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(4.05f, -4.07f)
                curveToRelative(0.19f, -0.19f, 0.53f, -0.19f, 0.73f, 0f)
                lineToRelative(1.1f, 1.1f)
                curveToRelative(0.95f, 0.95f, 2.61f, 0.95f, 3.56f, 0f)
                lineToRelative(4.35f, -4.34f)
                verticalLineToRelative(2.6f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(2f, 12f)
                curveTo(2f, 6.49f, 6.49f, 2f, 12f, 2f)
                curveToRelative(4.83f, 0f, 8.96f, 3.44f, 9.84f, 8.18f)
                curveToRelative(0.1f, 0.54f, 0.62f, 0.91f, 1.16f, 0.8f)
                curveToRelative(0.54f, -0.1f, 0.9f, -0.62f, 0.8f, -1.16f)
                curveTo(22.76f, 4.13f, 17.79f, 0f, 12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                curveToRelative(0f, 3.32f, 1.39f, 6.52f, 3.82f, 8.78f)
                curveToRelative(0.19f, 0.18f, 0.44f, 0.27f, 0.68f, 0.27f)
                curveToRelative(0.27f, 0f, 0.53f, -0.11f, 0.73f, -0.32f)
                curveToRelative(0.38f, -0.4f, 0.35f, -1.04f, -0.05f, -1.41f)
                curveToRelative(-2.02f, -1.89f, -3.18f, -4.55f, -3.18f, -7.32f)
                close()
            }
        }.also { _ClockUpArrow = it}
