package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Coin: ImageVector? = null

val Icons.Ss.Coin: ImageVector
    get() = _Coin ?: UXIcon(name = "Coin") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 15f)
                curveTo(5.27f, 15f, 0f, 12.14f, 0f, 8.5f)
                reflectiveCurveTo(5.27f, 2f, 12f, 2f)
                reflectiveCurveToRelative(12f, 2.85f, 12f, 6.5f)
                reflectiveCurveToRelative(-5.27f, 6.5f, -12f, 6.5f)
                close()
                moveTo(16f, 21.64f)
                curveToRelative(1.08f, -0.2f, 2.09f, -0.48f, 3f, -0.83f)
                verticalLineToRelative(-4.88f)
                curveToRelative(-0.93f, 0.31f, -1.94f, 0.56f, -3f, 0.74f)
                verticalLineToRelative(4.97f)
                close()
                moveTo(5f, 20.8f)
                curveToRelative(0.91f, 0.35f, 1.92f, 0.63f, 3f, 0.83f)
                verticalLineToRelative(-4.97f)
                curveToRelative(-1.06f, -0.18f, -2.07f, -0.42f, -3f, -0.74f)
                verticalLineToRelative(4.88f)
                close()
                moveTo(14f, 16.92f)
                curveToRelative(-0.65f, 0.05f, -1.32f, 0.08f, -2f, 0.08f)
                reflectiveCurveToRelative(-1.35f, -0.03f, -2f, -0.08f)
                verticalLineToRelative(4.99f)
                curveToRelative(0.65f, 0.06f, 1.31f, 0.09f, 2f, 0.09f)
                reflectiveCurveToRelative(1.35f, -0.04f, 2f, -0.09f)
                verticalLineToRelative(-4.99f)
                close()
                moveTo(21f, 15.08f)
                verticalLineToRelative(4.75f)
                curveToRelative(1.87f, -1.14f, 3f, -2.65f, 3f, -4.33f)
                verticalLineToRelative(-2.51f)
                curveToRelative(-0.79f, 0.81f, -1.82f, 1.5f, -3f, 2.1f)
                close()
                moveTo(3f, 15.08f)
                curveToRelative(-1.18f, -0.59f, -2.21f, -1.29f, -3f, -2.1f)
                verticalLineToRelative(2.51f)
                curveToRelative(0f, 1.68f, 1.13f, 3.19f, 3f, 4.33f)
                verticalLineToRelative(-4.75f)
                close()
            }
        }.also { _Coin = it}
