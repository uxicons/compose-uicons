package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Track: ImageVector? = null

val Icons.Bs.Track: ImageVector
    get() = _Track ?: UXIcon(name = "Track") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.28f, 17f)
                horizontalLineToRelative(-1.78f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                reflectiveCurveToRelative(2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(6.19f)
                curveToRelative(0.34f, 0.71f, 0.79f, 1.39f, 1.39f, 1.98f)
                lineToRelative(1.05f, 1.02f)
                lineTo(6.5f, 11f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.78f)
                curveToRelative(-0.17f, 0.47f, -0.28f, 0.97f, -0.28f, 1.5f)
                reflectiveCurveToRelative(0.11f, 1.03f, 0.28f, 1.5f)
                close()
                moveTo(19.5f, 14f)
                horizontalLineToRelative(-2.78f)
                curveToRelative(0.17f, 0.47f, 0.28f, 0.97f, 0.28f, 1.5f)
                reflectiveCurveToRelative(-0.11f, 1.03f, -0.28f, 1.5f)
                horizontalLineToRelative(2.78f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(6.72f, 20f)
                curveToRelative(0.17f, 0.47f, 0.28f, 0.97f, 0.28f, 1.5f)
                reflectiveCurveToRelative(-0.11f, 1.03f, -0.28f, 1.5f)
                horizontalLineToRelative(12.78f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(2.5f, 19f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(10f, 15.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.54f, 1.46f)
                curveToRelative(-0.94f, -0.94f, -2.2f, -1.46f, -3.54f, -1.46f)
                reflectiveCurveToRelative(-2.59f, 0.52f, -3.54f, 1.46f)
                curveToRelative(-1.95f, 1.95f, -1.95f, 5.12f, 0.01f, 7.08f)
                lineToRelative(3.52f, 3.45f)
                lineToRelative(3.54f, -3.46f)
                curveToRelative(0.94f, -0.94f, 1.47f, -2.2f, 1.47f, -3.54f)
                reflectiveCurveToRelative(-0.52f, -2.59f, -1.47f, -3.54f)
                close()
                moveTo(19f, 7f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _Track = it}
