package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LocationCrosshairs: ImageVector? = null

val Icons.Bs.LocationCrosshairs: ImageVector
    get() = _LocationCrosshairs ?: UXIcon(name = "LocationCrosshairs") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                close()
                moveTo(12f, 14f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(21.89f, 10.5f)
                curveToRelative(-0.65f, -4.32f, -4.07f, -7.74f, -8.39f, -8.39f)
                lineTo(13.5f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 2.11f)
                curveTo(6.18f, 2.76f, 2.76f, 6.18f, 2.11f, 10.5f)
                lineTo(0f, 10.5f)
                verticalLineToRelative(3f)
                lineTo(2.11f, 13.5f)
                curveToRelative(0.65f, 4.32f, 4.07f, 7.74f, 8.39f, 8.39f)
                verticalLineToRelative(2.11f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.11f)
                curveToRelative(4.32f, -0.65f, 7.74f, -4.07f, 8.39f, -8.39f)
                horizontalLineToRelative(2.11f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.11f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                close()
            }
        }.also { _LocationCrosshairs = it}
