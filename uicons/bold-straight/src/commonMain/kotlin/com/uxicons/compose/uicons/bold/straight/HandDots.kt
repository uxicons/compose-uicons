package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandDots: ImageVector? = null

val Icons.Bs.HandDots: ImageVector
    get() = _HandDots ?: UXIcon(name = "HandDots") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 3.5f)
                lineTo(24f, 24f)
                lineTo(8.92f, 24f)
                lineToRelative(-3.67f, -3.35f)
                lineTo(0.75f, 16.61f)
                curveToRelative(-0.87f, -0.72f, -0.98f, -2.01f, -0.26f, -2.87f)
                curveToRelative(0.72f, -0.87f, 2.01f, -0.98f, 2.87f, -0.26f)
                lineToRelative(2.64f, 2.3f)
                lineTo(6f, 3.5f)
                curveToRelative(0f, -0.91f, 0.8f, -1.63f, 1.74f, -1.48f)
                curveToRelative(0.74f, 0.12f, 1.25f, 0.81f, 1.25f, 1.56f)
                lineTo(8.99f, 20.0f)
                lineToRelative(1.09f, 1.0f)
                horizontalLineToRelative(10.92f)
                lineTo(21f, 3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(14f, 1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(11f, 11f)
                horizontalLineToRelative(3f)
                lineTo(14f, 1.5f)
                close()
                moveTo(19f, 1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(16f, 11f)
                horizontalLineToRelative(3f)
                lineTo(19f, 1.5f)
                close()
                moveTo(12f, 14.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(17f, 14.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(16.5f, 20f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(11.5f, 20f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
            }
        }.also { _HandDots = it}
