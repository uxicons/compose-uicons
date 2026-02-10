package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Coin: ImageVector? = null

val Icons.Rs.Coin: ImageVector
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
                moveTo(12f, 4f)
                curveToRelative(5.89f, 0f, 10f, 2.37f, 10f, 4.5f)
                reflectiveCurveToRelative(-4.11f, 4.5f, -10f, 4.5f)
                reflectiveCurveTo(2f, 10.63f, 2f, 8.5f)
                reflectiveCurveTo(6.11f, 4f, 12f, 4f)
                close()
                moveTo(7f, 14.42f)
                verticalLineToRelative(4.94f)
                curveToRelative(-0.74f, -0.2f, -1.41f, -0.45f, -2f, -0.72f)
                verticalLineToRelative(-4.84f)
                curveToRelative(0.62f, 0.24f, 1.29f, 0.45f, 2f, 0.62f)
                close()
                moveTo(9f, 14.79f)
                curveToRelative(0.65f, 0.09f, 1.31f, 0.15f, 2f, 0.18f)
                verticalLineToRelative(5.0f)
                curveToRelative(-0.7f, -0.03f, -1.36f, -0.1f, -2f, -0.19f)
                verticalLineToRelative(-4.99f)
                close()
                moveTo(13f, 14.97f)
                curveToRelative(0.69f, -0.03f, 1.35f, -0.09f, 2f, -0.18f)
                verticalLineToRelative(4.99f)
                curveToRelative(-0.64f, 0.1f, -1.3f, 0.16f, -2f, 0.19f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(17f, 14.42f)
                curveToRelative(0.71f, -0.17f, 1.38f, -0.38f, 2f, -0.62f)
                verticalLineToRelative(4.84f)
                curveToRelative(-0.59f, 0.27f, -1.26f, 0.52f, -2f, 0.72f)
                verticalLineToRelative(-4.94f)
                close()
                moveTo(2f, 15.5f)
                verticalLineToRelative(-3.36f)
                curveToRelative(0.3f, 0.25f, 0.64f, 0.47f, 1f, 0.69f)
                verticalLineToRelative(4.53f)
                curveToRelative(-0.64f, -0.6f, -1f, -1.24f, -1f, -1.86f)
                close()
                moveTo(21f, 17.36f)
                verticalLineToRelative(-4.53f)
                curveToRelative(0.36f, -0.22f, 0.7f, -0.45f, 1f, -0.69f)
                verticalLineToRelative(3.36f)
                curveToRelative(0f, 0.62f, -0.36f, 1.26f, -1f, 1.86f)
                close()
            }
        }.also { _Coin = it}
