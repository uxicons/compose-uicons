package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LocationCrosshairs: ImageVector? = null

val Icons.Ts.LocationCrosshairs: ImageVector
    get() = _LocationCrosshairs ?: UXIcon(name = "LocationCrosshairs") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                close()
                moveTo(12f, 16f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(21.99f, 11.5f)
                curveToRelative(-0.25f, -5.12f, -4.37f, -9.23f, -9.49f, -9.49f)
                lineTo(12.5f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 2.01f)
                curveTo(6.38f, 2.27f, 2.27f, 6.38f, 2.01f, 11.5f)
                lineTo(0f, 11.5f)
                verticalLineToRelative(1f)
                lineTo(2.01f, 12.5f)
                curveToRelative(0.25f, 5.12f, 4.37f, 9.23f, 9.49f, 9.49f)
                verticalLineToRelative(2.01f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2.01f)
                curveToRelative(5.12f, -0.25f, 9.23f, -4.37f, 9.49f, -9.49f)
                horizontalLineToRelative(2.01f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2.01f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                reflectiveCurveTo(7.04f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                close()
            }
        }.also { _LocationCrosshairs = it}
