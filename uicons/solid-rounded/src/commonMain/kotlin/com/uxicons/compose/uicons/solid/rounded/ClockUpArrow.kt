package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockUpArrow: ImageVector? = null

val Icons.Sr.ClockUpArrow: ImageVector
    get() = _ClockUpArrow ?: UXIcon(name = "ClockUpArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 15f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2.6f)
                lineToRelative(-4.35f, 4.34f)
                curveToRelative(-0.95f, 0.95f, -2.61f, 0.95f, -3.56f, 0f)
                lineToRelative(-1.1f, -1.1f)
                curveToRelative(-0.2f, -0.2f, -0.54f, -0.19f, -0.73f, 0f)
                lineToRelative(-4.05f, 4.07f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                curveToRelative(-0.26f, 0f, -0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, -0.0f, -1.42f)
                lineToRelative(4.05f, -4.07f)
                curveToRelative(0.95f, -0.95f, 2.61f, -0.95f, 3.56f, 0f)
                lineToRelative(1.1f, 1.1f)
                curveToRelative(0.2f, 0.2f, 0.54f, 0.19f, 0.73f, 0f)
                lineToRelative(4.33f, -4.33f)
                horizontalLineToRelative(-2.57f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(9.43f, 16.81f)
                lineToRelative(-4.7f, 4.71f)
                curveTo(1.86f, 19.33f, 0f, 15.89f, 0f, 12f)
                curveTo(0f, 5.37f, 5.37f, 0f, 12f, 0f)
                curveToRelative(6.47f, 0f, 11.73f, 5.13f, 11.98f, 11.54f)
                curveToRelative(-0.59f, -0.34f, -1.25f, -0.54f, -1.98f, -0.54f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                curveToRelative(0f, 1.02f, 0.51f, 1.91f, 1.28f, 2.46f)
                lineToRelative(-0.41f, 0.41f)
                lineToRelative(-0.05f, -0.05f)
                curveToRelative(-0.82f, -0.83f, -1.99f, -1.3f, -3.19f, -1.3f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-1.2f, 0f, -2.37f, 0.47f, -3.2f, 1.3f)
                close()
                moveTo(8.11f, 15.43f)
                lineToRelative(4.41f, -2.7f)
                curveToRelative(0.3f, -0.18f, 0.48f, -0.51f, 0.48f, -0.85f)
                verticalLineToRelative(-5.88f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(5.32f)
                lineToRelative(-3.93f, 2.4f)
                curveToRelative(-0.47f, 0.29f, -0.62f, 0.9f, -0.33f, 1.38f)
                curveToRelative(0.19f, 0.31f, 0.52f, 0.48f, 0.85f, 0.48f)
                curveToRelative(0.18f, 0f, 0.36f, -0.05f, 0.52f, -0.15f)
                close()
            }
        }.also { _ClockUpArrow = it}
