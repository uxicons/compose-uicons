package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FuelGauge: ImageVector? = null

val Icons.Ts.FuelGauge: ImageVector
    get() = _FuelGauge ?: UXIcon(name = "FuelGauge") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.83f, 8.8f)
                lineTo(0.09f, 5.1f)
                lineToRelative(0.4f, -0.3f)
                curveTo(3.84f, 2.31f, 7.82f, 1f, 12f, 1f)
                reflectiveCurveToRelative(8.16f, 1.31f, 11.51f, 3.8f)
                lineToRelative(0.4f, 0.3f)
                lineToRelative(-2.76f, 3.7f)
                lineToRelative(-0.8f, -0.6f)
                lineToRelative(2.16f, -2.89f)
                curveToRelative(-2.95f, -2.07f, -6.39f, -3.19f, -10.01f, -3.29f)
                verticalLineToRelative(3.98f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3.98f)
                curveToRelative(-3.62f, 0.1f, -7.06f, 1.22f, -10.01f, 3.29f)
                lineToRelative(2.14f, 2.89f)
                lineToRelative(-0.8f, 0.6f)
                close()
                moveTo(19.05f, 10.88f)
                lineToRelative(-5.19f, 6.97f)
                curveToRelative(0.39f, 0.44f, 0.64f, 1.02f, 0.64f, 1.66f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.38f, 0f, 0.74f, 0.09f, 1.06f, 0.24f)
                lineToRelative(5.19f, -6.96f)
                lineToRelative(0.8f, 0.6f)
                close()
                moveTo(13.5f, 19.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(0f, 23f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                lineTo(1f, 22f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                lineTo(1f, 18.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                lineTo(0f, 15f)
                verticalLineToRelative(8f)
                close()
                moveTo(24f, 16f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _FuelGauge = it}
