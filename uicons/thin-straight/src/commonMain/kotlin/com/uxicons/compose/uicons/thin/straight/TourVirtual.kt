package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TourVirtual: ImageVector? = null

val Icons.Ts.TourVirtual: ImageVector
    get() = _TourVirtual ?: UXIcon(name = "TourVirtual") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 10f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(15f, 18f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(5.5f)
                close()
                moveTo(14.5f, 6.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                close()
                moveTo(10.5f, 6.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(12f, 0f)
                curveTo(4.93f, 0f, 0f, 2.26f, 0f, 5.5f)
                verticalLineToRelative(13.37f)
                curveToRelative(0f, 2.04f, 2f, 4.11f, 6f, 5.02f)
                verticalLineToRelative(-14.58f)
                curveToRelative(-2.95f, -0.83f, -5f, -2.28f, -5f, -3.82f)
                curveTo(1f, 2.94f, 5.73f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 1.94f, 11f, 4.5f)
                curveToRelative(0f, 1.53f, -2.05f, 2.99f, -5f, 3.82f)
                verticalLineToRelative(14.58f)
                curveToRelative(3.79f, -0.97f, 6f, -2.98f, 6f, -5.02f)
                lineTo(24f, 5.5f)
                curveToRelative(0f, -3.24f, -4.93f, -5.5f, -12f, -5.5f)
                close()
                moveTo(5f, 10.07f)
                verticalLineToRelative(12.46f)
                curveToRelative(-2.52f, -0.89f, -4f, -2.23f, -4f, -3.66f)
                lineTo(1f, 7.87f)
                curveToRelative(0.84f, 0.9f, 2.19f, 1.65f, 4f, 2.2f)
                close()
                moveTo(23f, 18.87f)
                curveToRelative(0f, 1.43f, -1.48f, 2.77f, -4f, 3.66f)
                verticalLineToRelative(-12.46f)
                curveToRelative(1.81f, -0.55f, 3.16f, -1.3f, 4f, -2.2f)
                verticalLineToRelative(11.0f)
                close()
            }
        }.also { _TourVirtual = it}
