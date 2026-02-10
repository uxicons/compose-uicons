package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Track: ImageVector? = null

val Icons.Ss.Track: ImageVector
    get() = _Track ?: UXIcon(name = "Track") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 11.99f)
                lineToRelative(3.54f, -3.46f)
                curveToRelative(1.95f, -1.95f, 1.95f, -5.12f, 0f, -7.07f)
                curveToRelative(-0.94f, -0.94f, -2.2f, -1.46f, -3.54f, -1.46f)
                reflectiveCurveToRelative(-2.59f, 0.52f, -3.54f, 1.46f)
                curveToRelative(-1.95f, 1.95f, -1.95f, 5.12f, 0.01f, 7.08f)
                lineToRelative(3.53f, 3.45f)
                close()
                moveTo(4f, 22f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(12.5f, 14f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(24f, 19f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                lineTo(5.87f, 23f)
                curveToRelative(0.08f, -0.32f, 0.13f, -0.66f, 0.13f, -1f)
                reflectiveCurveToRelative(-0.04f, -0.68f, -0.13f, -1f)
                horizontalLineToRelative(14.13f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-3.63f)
                curveToRelative(0.08f, -0.32f, 0.13f, -0.66f, 0.13f, -1f)
                reflectiveCurveToRelative(-0.04f, -0.68f, -0.13f, -1f)
                horizontalLineToRelative(3.63f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                close()
                moveTo(2f, 13f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(7.26f)
                curveToRelative(0.24f, 0.34f, 0.51f, 0.67f, 0.81f, 0.97f)
                lineToRelative(1.05f, 1.03f)
                lineTo(6f, 11f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(2.63f)
                curveToRelative(-0.08f, 0.32f, -0.13f, 0.66f, -0.13f, 1f)
                reflectiveCurveToRelative(0.04f, 0.68f, 0.13f, 1f)
                horizontalLineToRelative(-2.63f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                close()
            }
        }.also { _Track = it}
