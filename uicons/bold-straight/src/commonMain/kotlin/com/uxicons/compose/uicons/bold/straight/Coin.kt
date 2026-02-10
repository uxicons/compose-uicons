package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Coin: ImageVector? = null

val Icons.Bs.Coin: ImageVector
    get() = _Coin ?: UXIcon(name = "Coin") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(5.16f, 2f, 0f, 4.79f, 0f, 8.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 3.71f, 5.16f, 6.5f, 12f, 6.5f)
                reflectiveCurveToRelative(12f, -2.79f, 12f, -6.5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -3.71f, -5.16f, -6.5f, -12f, -6.5f)
                close()
                moveTo(12f, 5f)
                curveToRelative(5.49f, 0f, 9f, 2.07f, 9f, 3.5f)
                reflectiveCurveToRelative(-3.51f, 3.5f, -9f, 3.5f)
                reflectiveCurveTo(3f, 9.93f, 3f, 8.5f)
                reflectiveCurveToRelative(3.51f, -3.5f, 9f, -3.5f)
                close()
                moveTo(10.5f, 14.95f)
                verticalLineToRelative(3.99f)
                curveToRelative(-0.9f, -0.07f, -1.74f, -0.19f, -2.5f, -0.35f)
                verticalLineToRelative(-3.94f)
                curveToRelative(0.79f, 0.14f, 1.63f, 0.24f, 2.5f, 0.3f)
                close()
                moveTo(13.5f, 14.95f)
                curveToRelative(0.87f, -0.05f, 1.71f, -0.15f, 2.5f, -0.3f)
                verticalLineToRelative(3.94f)
                curveToRelative(-0.76f, 0.16f, -1.6f, 0.28f, -2.5f, 0.35f)
                verticalLineToRelative(-3.99f)
                close()
                moveTo(3f, 15.5f)
                verticalLineToRelative(-2.61f)
                curveToRelative(0.59f, 0.36f, 1.26f, 0.68f, 2f, 0.96f)
                verticalLineToRelative(3.73f)
                curveToRelative(-1.29f, -0.66f, -2f, -1.43f, -2f, -2.08f)
                close()
                moveTo(19f, 17.57f)
                verticalLineToRelative(-3.73f)
                curveToRelative(0.74f, -0.28f, 1.41f, -0.6f, 2f, -0.96f)
                verticalLineToRelative(2.61f)
                curveToRelative(0f, 0.64f, -0.71f, 1.42f, -2f, 2.08f)
                close()
            }
        }.also { _Coin = it}
