package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LandLayerLocation: ImageVector? = null

val Icons.Ts.LandLayerLocation: ImageVector
    get() = _LandLayerLocation ?: UXIcon(name = "LandLayerLocation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 16.79f)
                lineToRelative(4.95f, -4.84f)
                curveToRelative(1.32f, -1.32f, 2.05f, -3.08f, 2.05f, -4.95f)
                reflectiveCurveToRelative(-0.73f, -3.63f, -2.05f, -4.95f)
                curveToRelative(-1.32f, -1.32f, -3.08f, -2.05f, -4.95f, -2.05f)
                reflectiveCurveToRelative(-3.63f, 0.73f, -4.95f, 2.05f)
                curveToRelative(-2.73f, 2.73f, -2.73f, 7.17f, 0.0f, 9.9f)
                lineToRelative(4.95f, 4.84f)
                close()
                moveTo(7.76f, 2.76f)
                curveToRelative(1.13f, -1.13f, 2.64f, -1.76f, 4.24f, -1.76f)
                reflectiveCurveToRelative(3.11f, 0.62f, 4.24f, 1.76f)
                curveToRelative(1.13f, 1.13f, 1.76f, 2.64f, 1.76f, 4.24f)
                reflectiveCurveToRelative(-0.62f, 3.11f, -1.75f, 4.24f)
                lineToRelative(-4.25f, 4.15f)
                lineToRelative(-4.24f, -4.15f)
                curveToRelative(-2.34f, -2.34f, -2.34f, -6.15f, 0f, -8.48f)
                close()
                moveTo(12f, 9.98f)
                curveToRelative(1.65f, 0f, 2.99f, -1.34f, 2.99f, -2.99f)
                reflectiveCurveToRelative(-1.34f, -2.99f, -2.99f, -2.99f)
                reflectiveCurveToRelative(-2.99f, 1.34f, -2.99f, 2.99f)
                reflectiveCurveToRelative(1.34f, 2.99f, 2.99f, 2.99f)
                close()
                moveTo(12f, 5f)
                curveToRelative(1.1f, 0f, 1.99f, 0.89f, 1.99f, 1.99f)
                reflectiveCurveToRelative(-0.89f, 1.99f, -1.99f, 1.99f)
                reflectiveCurveToRelative(-1.99f, -0.89f, -1.99f, -1.99f)
                reflectiveCurveToRelative(0.89f, -1.99f, 1.99f, -1.99f)
                close()
                moveTo(23.94f, 16.85f)
                lineToRelative(-11.94f, 7.17f)
                lineTo(0.06f, 16.85f)
                lineToRelative(5.66f, -3.4f)
                horizontalLineToRelative(0f)
                lineToRelative(0.78f, 0.77f)
                lineToRelative(-4.5f, 2.63f)
                lineToRelative(10f, 6f)
                lineToRelative(10f, -6f)
                lineToRelative(-4.48f, -2.65f)
                lineToRelative(0.76f, -0.74f)
                lineToRelative(5.67f, 3.4f)
                close()
            }
        }.also { _LandLayerLocation = it}
