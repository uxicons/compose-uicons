package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LocationCrosshairs: ImageVector? = null

val Icons.Ss.LocationCrosshairs: ImageVector
    get() = _LocationCrosshairs ?: UXIcon(name = "LocationCrosshairs") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.95f, 11f)
                curveToRelative(-0.47f, -4.72f, -4.23f, -8.48f, -8.95f, -8.95f)
                lineTo(13f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 2.05f)
                curveTo(6.28f, 2.52f, 2.52f, 6.28f, 2.05f, 11f)
                lineTo(0f, 11f)
                verticalLineToRelative(2f)
                lineTo(2.05f, 13f)
                curveToRelative(0.47f, 4.72f, 4.23f, 8.48f, 8.95f, 8.95f)
                verticalLineToRelative(2.05f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.05f)
                curveToRelative(4.72f, -0.47f, 8.48f, -4.23f, 8.95f, -8.95f)
                horizontalLineToRelative(2.05f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.05f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(15f, 12f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                close()
            }
        }.also { _LocationCrosshairs = it}
