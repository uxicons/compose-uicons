package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapPoint: ImageVector? = null

val Icons.Ss.MapPoint: ImageVector
    get() = _MapPoint ?: UXIcon(name = "MapPoint") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.54f, 1.46f)
                curveToRelative(-0.94f, -0.94f, -2.2f, -1.46f, -3.54f, -1.46f)
                reflectiveCurveToRelative(-2.59f, 0.52f, -3.54f, 1.46f)
                curveToRelative(-0.94f, 0.94f, -1.47f, 2.2f, -1.47f, 3.54f)
                reflectiveCurveToRelative(0.52f, 2.6f, 1.48f, 3.55f)
                lineToRelative(3.52f, 3.44f)
                lineToRelative(3.54f, -3.46f)
                curveToRelative(0.94f, -0.94f, 1.47f, -2.2f, 1.47f, -3.54f)
                reflectiveCurveToRelative(-0.52f, -2.59f, -1.47f, -3.54f)
                close()
                moveTo(12f, 6.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(22f, 6f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3.29f)
                curveToRelative(-0.33f, 1.1f, -0.92f, 2.11f, -1.76f, 2.95f)
                lineToRelative(-2.06f, 2.02f)
                lineToRelative(4.03f, 4.03f)
                horizontalLineToRelative(3.09f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3.91f)
                lineToRelative(-4.63f, -4.63f)
                lineToRelative(-1.45f, 1.42f)
                lineToRelative(-4.92f, -4.81f)
                curveToRelative(-0.85f, -0.85f, -1.46f, -1.87f, -1.79f, -2.98f)
                lineTo(2f, 7f)
                verticalLineToRelative(-1f)
                lineTo(0f, 6f)
                lineTo(0f, 24f)
                lineTo(2f, 24f)
                verticalLineToRelative(-1f)
                lineTo(22f, 23f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                lineTo(24f, 6f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(10f, 21f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.59f)
                lineToRelative(-3.41f, -3.41f)
                lineTo(2f, 15f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3.41f)
                lineToRelative(4.59f, 4.59f)
                verticalLineToRelative(3.41f)
                close()
            }
        }.also { _MapPoint = it}
