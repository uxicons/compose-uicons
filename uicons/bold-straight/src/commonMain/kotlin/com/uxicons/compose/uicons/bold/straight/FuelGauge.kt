package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FuelGauge: ImageVector? = null

val Icons.Bs.FuelGauge: ImageVector
    get() = _FuelGauge ?: UXIcon(name = "FuelGauge") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 4.08f)
                verticalLineToRelative(2.9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.9f)
                curveToRelative(2.21f, 0.22f, 4.33f, 0.91f, 6.23f, 2.04f)
                lineToRelative(-1.46f, 1.96f)
                lineToRelative(2.4f, 1.79f)
                lineToRelative(3.31f, -4.42f)
                lineToRelative(-1.21f, -0.9f)
                curveToRelative(-3.13f, -2.33f, -6.85f, -3.56f, -10.77f, -3.56f)
                reflectiveCurveTo(4.36f, 2.23f, 1.23f, 4.56f)
                lineTo(0.03f, 5.45f)
                lineToRelative(3.28f, 4.42f)
                lineToRelative(2.39f, -1.81f)
                lineToRelative(-1.43f, -1.93f)
                curveToRelative(1.9f, -1.14f, 4.02f, -1.83f, 6.23f, -2.05f)
                close()
                moveTo(16.9f, 10.21f)
                lineToRelative(-4.56f, 5.81f)
                curveToRelative(-0.11f, -0.01f, -0.23f, -0.03f, -0.34f, -0.03f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                curveToRelative(0f, -0.42f, -0.09f, -0.82f, -0.24f, -1.18f)
                lineToRelative(4.55f, -5.8f)
                lineToRelative(-2.4f, -1.79f)
                close()
                moveTo(0f, 15f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                lineTo(0f, 23f)
                verticalLineToRelative(-8f)
                close()
                moveTo(22f, 17f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _FuelGauge = it}
