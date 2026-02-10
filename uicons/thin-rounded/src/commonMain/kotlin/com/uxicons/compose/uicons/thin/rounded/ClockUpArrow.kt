package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockUpArrow: ImageVector? = null

val Icons.Tr.ClockUpArrow: ImageVector
    get() = _ClockUpArrow ?: UXIcon(name = "ClockUpArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(6.38f)
                curveToRelative(0f, 0.18f, -0.1f, 0.34f, -0.25f, 0.43f)
                lineToRelative(-4.5f, 2.62f)
                curveToRelative(-0.08f, 0.05f, -0.17f, 0.07f, -0.25f, 0.07f)
                curveToRelative(-0.17f, 0f, -0.34f, -0.09f, -0.43f, -0.25f)
                curveToRelative(-0.14f, -0.24f, -0.06f, -0.55f, 0.18f, -0.68f)
                lineToRelative(4.25f, -2.48f)
                verticalLineToRelative(-6.09f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(24f, 14.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(4.28f)
                lineToRelative(-5.73f, 5.73f)
                curveToRelative(-0.37f, 0.37f, -0.98f, 0.37f, -1.35f, 0f)
                lineToRelative(-1.2f, -1.2f)
                curveToRelative(-0.76f, -0.76f, -2.0f, -0.76f, -2.76f, 0f)
                lineToRelative(-4.61f, 4.61f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                lineToRelative(4.61f, -4.61f)
                curveToRelative(0.37f, -0.37f, 0.98f, -0.37f, 1.35f, 0f)
                lineToRelative(1.2f, 1.2f)
                curveToRelative(0.76f, 0.76f, 2.0f, 0.76f, 2.76f, 0f)
                lineToRelative(5.74f, -5.74f)
                verticalLineToRelative(4.31f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-4.5f)
                close()
                moveTo(1f, 12f)
                curveTo(1f, 5.93f, 5.93f, 1f, 12f, 1f)
                curveToRelative(5.51f, 0f, 10.2f, 4.11f, 10.91f, 9.56f)
                curveToRelative(0.04f, 0.27f, 0.29f, 0.47f, 0.56f, 0.43f)
                curveToRelative(0.27f, -0.04f, 0.47f, -0.29f, 0.43f, -0.56f)
                curveTo(23.12f, 4.49f, 18.01f, 0f, 12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                curveToRelative(0f, 3.96f, 1.95f, 7.66f, 5.22f, 9.9f)
                curveToRelative(0.09f, 0.06f, 0.19f, 0.09f, 0.28f, 0.09f)
                curveToRelative(0.16f, 0f, 0.32f, -0.08f, 0.41f, -0.22f)
                curveToRelative(0.16f, -0.23f, 0.1f, -0.54f, -0.13f, -0.69f)
                curveToRelative(-3.0f, -2.06f, -4.78f, -5.45f, -4.78f, -9.08f)
                close()
            }
        }.also { _ClockUpArrow = it}
