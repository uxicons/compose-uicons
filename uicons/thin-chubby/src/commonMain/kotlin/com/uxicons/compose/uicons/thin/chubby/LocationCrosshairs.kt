package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LocationCrosshairs: ImageVector? = null

val Icons.Tc.LocationCrosshairs: ImageVector
    get() = _LocationCrosshairs ?: UXIcon(name = "LocationCrosshairs") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.5f, 11.5f)
                horizontalLineToRelative(-1.51f)
                curveToRelative(-0.2f, -7.28f, -4.79f, -8.41f, -8.49f, -8.49f)
                verticalLineToRelative(-1.51f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.51f)
                curveToRelative(-5.55f, 0.16f, -8.34f, 2.94f, -8.49f, 8.49f)
                horizontalLineToRelative(-1.51f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.51f)
                curveToRelative(0.15f, 5.63f, 2.86f, 8.34f, 8.49f, 8.49f)
                verticalLineToRelative(1.51f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-1.51f)
                curveToRelative(3.71f, -0.09f, 8.29f, -1.22f, 8.49f, -8.49f)
                horizontalLineToRelative(1.51f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-5.61f, 0f, -8f, -2.39f, -8f, -8f)
                curveToRelative(0f, -5.53f, 2.47f, -8f, 8f, -8f)
                curveToRelative(5.61f, 0f, 8f, 2.39f, 8f, 8f)
                reflectiveCurveToRelative(-2.39f, 8f, -8f, 8f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 7f)
                curveToRelative(-3.36f, 0f, -5f, 1.64f, -5f, 5f)
                curveToRelative(0f, 4.48f, 2.85f, 5f, 5f, 5f)
                curveToRelative(2.33f, 0f, 5f, -0.57f, 5f, -5f)
                curveToRelative(0f, -4.48f, -2.85f, -5f, -5f, -5f)
                close()
                moveTo(12f, 16f)
                curveToRelative(-2.4f, 0f, -4f, -0.68f, -4f, -4f)
                curveToRelative(0f, -2.84f, 1.16f, -4f, 4f, -4f)
                curveToRelative(2.4f, 0f, 4f, 0.68f, 4f, 4f)
                reflectiveCurveToRelative(-1.6f, 4f, -4f, 4f)
                close()
            }
        }.also { _LocationCrosshairs = it}
