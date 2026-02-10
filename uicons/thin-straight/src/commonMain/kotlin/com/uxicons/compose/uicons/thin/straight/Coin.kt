package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Coin: ImageVector? = null

val Icons.Ts.Coin: ImageVector
    get() = _Coin ?: UXIcon(name = "Coin") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(5.27f, 2f, 0f, 4.86f, 0f, 8.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 3.65f, 5.27f, 6.5f, 12f, 6.5f)
                reflectiveCurveToRelative(12f, -2.85f, 12f, -6.5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -3.65f, -5.27f, -6.5f, -12f, -6.5f)
                close()
                moveTo(12f, 3f)
                curveToRelative(5.96f, 0f, 11f, 2.52f, 11f, 5.5f)
                reflectiveCurveToRelative(-5.04f, 5.5f, -11f, 5.5f)
                reflectiveCurveTo(1f, 11.48f, 1f, 8.5f)
                reflectiveCurveTo(6.04f, 3f, 12f, 3f)
                close()
                moveTo(7f, 14.42f)
                verticalLineToRelative(5.95f)
                curveToRelative(-1.12f, -0.3f, -2.14f, -0.69f, -3f, -1.15f)
                verticalLineToRelative(-5.85f)
                curveToRelative(0.89f, 0.43f, 1.9f, 0.78f, 3f, 1.05f)
                close()
                moveTo(8f, 14.64f)
                curveToRelative(1.1f, 0.2f, 2.27f, 0.33f, 3.5f, 0.35f)
                verticalLineToRelative(6f)
                curveToRelative(-1.22f, -0.03f, -2.4f, -0.16f, -3.5f, -0.38f)
                verticalLineToRelative(-5.97f)
                close()
                moveTo(12.5f, 14.99f)
                curveToRelative(1.23f, -0.03f, 2.4f, -0.15f, 3.5f, -0.35f)
                verticalLineToRelative(5.97f)
                curveToRelative(-1.1f, 0.22f, -2.28f, 0.35f, -3.5f, 0.38f)
                verticalLineToRelative(-6f)
                close()
                moveTo(17f, 14.42f)
                curveToRelative(1.1f, -0.27f, 2.11f, -0.62f, 3f, -1.05f)
                verticalLineToRelative(5.85f)
                curveToRelative(-0.86f, 0.46f, -1.88f, 0.85f, -3f, 1.15f)
                verticalLineToRelative(-5.95f)
                close()
                moveTo(1f, 15.5f)
                verticalLineToRelative(-4.37f)
                curveToRelative(0.5f, 0.63f, 1.18f, 1.2f, 2f, 1.7f)
                verticalLineToRelative(5.78f)
                curveToRelative(-1.25f, -0.89f, -2f, -1.97f, -2f, -3.11f)
                close()
                moveTo(23f, 15.5f)
                curveToRelative(0f, 1.15f, -0.75f, 2.22f, -2f, 3.11f)
                verticalLineToRelative(-5.78f)
                curveToRelative(0.82f, -0.5f, 1.5f, -1.07f, 2f, -1.7f)
                verticalLineToRelative(4.37f)
                close()
            }
        }.also { _Coin = it}
