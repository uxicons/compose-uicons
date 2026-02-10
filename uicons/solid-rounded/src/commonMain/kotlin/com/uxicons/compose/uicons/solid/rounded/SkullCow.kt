package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkullCow: ImageVector? = null

val Icons.Sr.SkullCow: ImageVector
    get() = _SkullCow ?: UXIcon(name = "SkullCow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.12f, 0.03f)
                curveToRelative(-0.53f, -0.14f, -1.08f, 0.18f, -1.22f, 0.72f)
                curveToRelative(-0.34f, 1.32f, -1.53f, 2.25f, -2.9f, 2.25f)
                lineTo(4.87f, 3f)
                curveToRelative(-1.37f, 0f, -2.56f, -0.93f, -2.91f, -2.25f)
                curveTo(1.83f, 0.22f, 1.29f, -0.11f, 0.75f, 0.03f)
                curveTo(0.22f, 0.17f, -0.11f, 0.71f, 0.03f, 1.25f)
                curveToRelative(0.54f, 2.11f, 2.38f, 3.61f, 4.53f, 3.74f)
                lineToRelative(-2.33f, 6.19f)
                curveToRelative(-0.66f, 1.9f, 0.19f, 4.0f, 1.99f, 4.9f)
                curveToRelative(0.04f, 0.02f, 1.93f, 0.68f, 1.93f, 0.68f)
                lineToRelative(0.87f, 4.08f)
                curveToRelative(0.39f, 1.83f, 2.04f, 3.16f, 3.91f, 3.16f)
                horizontalLineToRelative(2.15f)
                curveToRelative(1.87f, 0f, 3.52f, -1.33f, 3.91f, -3.16f)
                lineToRelative(0.88f, -4.08f)
                reflectiveCurveToRelative(1.89f, -0.66f, 1.93f, -0.68f)
                curveToRelative(1.8f, -0.9f, 2.65f, -3.0f, 1.98f, -4.92f)
                lineToRelative(-2.33f, -6.17f)
                curveToRelative(2.1f, -0.18f, 3.87f, -1.67f, 4.4f, -3.73f)
                curveToRelative(0.14f, -0.53f, -0.18f, -1.08f, -0.72f, -1.22f)
                close()
                moveTo(8.5f, 12f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(15.5f, 12f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _SkullCow = it}
