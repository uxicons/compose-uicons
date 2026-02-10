package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FuelGauge: ImageVector? = null

val Icons.Ss.FuelGauge: ImageVector
    get() = _FuelGauge ?: UXIcon(name = "FuelGauge") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.95f, 5.69f)
                lineToRelative(2.05f, 2.77f)
                lineToRelative(-1.6f, 1.19f)
                lineTo(0.14f, 5.25f)
                lineToRelative(0.8f, -0.6f)
                curveTo(4.15f, 2.26f, 7.98f, 1f, 12f, 1f)
                reflectiveCurveToRelative(7.85f, 1.26f, 11.06f, 3.65f)
                lineToRelative(0.81f, 0.6f)
                lineToRelative(-3.28f, 4.4f)
                lineToRelative(-1.6f, -1.2f)
                lineToRelative(2.06f, -2.77f)
                curveToRelative(-2.41f, -1.58f, -5.16f, -2.48f, -8.05f, -2.65f)
                verticalLineToRelative(3.96f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3.96f)
                curveToRelative(-2.89f, 0.17f, -5.64f, 1.07f, -8.05f, 2.65f)
                close()
                moveTo(19.45f, 11.18f)
                lineToRelative(-4.66f, 6.24f)
                curveToRelative(0.44f, 0.58f, 0.71f, 1.3f, 0.71f, 2.09f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                curveToRelative(0.42f, 0f, 0.81f, 0.09f, 1.19f, 0.22f)
                lineToRelative(4.66f, -6.24f)
                lineToRelative(1.6f, 1.2f)
                close()
                moveTo(0f, 23f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                lineTo(0f, 15f)
                verticalLineToRelative(8f)
                close()
                moveTo(24f, 17f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _FuelGauge = it}
