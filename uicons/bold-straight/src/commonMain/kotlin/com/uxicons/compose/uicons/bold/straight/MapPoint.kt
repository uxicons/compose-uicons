package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapPoint: ImageVector? = null

val Icons.Bs.MapPoint: ImageVector
    get() = _MapPoint ?: UXIcon(name = "MapPoint") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 11.99f)
                lineToRelative(3.54f, -3.46f)
                curveToRelative(0.94f, -0.94f, 1.47f, -2.2f, 1.47f, -3.54f)
                reflectiveCurveToRelative(-0.52f, -2.59f, -1.47f, -3.54f)
                curveToRelative(-0.94f, -0.94f, -2.2f, -1.46f, -3.54f, -1.46f)
                reflectiveCurveToRelative(-2.59f, 0.52f, -3.54f, 1.46f)
                curveToRelative(-0.94f, 0.94f, -1.47f, 2.2f, -1.47f, 3.54f)
                reflectiveCurveToRelative(0.52f, 2.59f, 1.48f, 3.54f)
                lineToRelative(3.52f, 3.45f)
                close()
                moveTo(12f, 3f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(21f, 6f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2.29f)
                curveToRelative(-0.33f, 1.1f, -0.92f, 2.12f, -1.76f, 2.95f)
                lineToRelative(-0.05f, 0.05f)
                horizontalLineToRelative(4.1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-1.88f)
                lineToRelative(-3.56f, -3.56f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(4.44f, 4.44f)
                horizontalLineToRelative(3.12f)
                verticalLineToRelative(2f)
                lineTo(10f, 20.0f)
                verticalLineToRelative(-3.12f)
                lineToRelative(-3.88f, -3.88f)
                lineTo(3f, 13.0f)
                verticalLineToRelative(-3f)
                lineTo(7.1f, 10.0f)
                lineToRelative(-0.03f, -0.03f)
                curveToRelative(-0.85f, -0.85f, -1.46f, -1.87f, -1.78f, -2.98f)
                lineTo(3f, 7.0f)
                verticalLineToRelative(-1f)
                lineTo(0f, 6.0f)
                lineTo(0f, 24f)
                lineTo(3f, 24f)
                verticalLineToRelative(-1f)
                lineTo(21f, 23f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                lineTo(24f, 6f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(3f, 16f)
                horizontalLineToRelative(1.88f)
                lineToRelative(2.12f, 2.12f)
                verticalLineToRelative(1.88f)
                lineTo(3f, 20f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _MapPoint = it}
