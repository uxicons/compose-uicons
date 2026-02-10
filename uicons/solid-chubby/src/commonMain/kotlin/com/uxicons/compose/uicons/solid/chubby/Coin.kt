package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Coin: ImageVector? = null

val Icons.Sc.Coin: ImageVector
    get() = _Coin ?: UXIcon(name = "Coin") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(6.17f, 0.03f, 10.86f, 1.92f, 11f, 7.01f)
                curveToRelative(-0.15f, 5.3f, -4.8f, 6.99f, -11f, 7.01f)
                curveToRelative(-6.17f, -0.02f, -10.85f, -1.72f, -11f, -7.01f)
                curveToRelative(0.14f, -5.2f, 4.8f, -6.99f, 11f, -7.01f)
                close()
                moveTo(15.5f, 22.79f)
                curveToRelative(1.12f, -0.18f, 2.13f, -0.45f, 3f, -0.81f)
                verticalLineToRelative(-5.82f)
                curveToRelative(-0.88f, 0.28f, -1.88f, 0.49f, -3f, 0.64f)
                close()
                moveTo(3.5f, 15.35f)
                curveToRelative(-1.04f, -0.54f, -1.86f, -1.19f, -2.5f, -1.9f)
                verticalLineToRelative(1.94f)
                curveToRelative(0.06f, 2.35f, 0.91f, 4.15f, 2.5f, 5.42f)
                close()
                moveTo(5.5f, 21.98f)
                curveToRelative(0.87f, 0.36f, 1.87f, 0.63f, 3f, 0.81f)
                verticalLineToRelative(-5.99f)
                curveToRelative(-1.12f, -0.15f, -2.12f, -0.36f, -3f, -0.64f)
                verticalLineToRelative(5.82f)
                close()
                moveTo(20.5f, 15.35f)
                verticalLineToRelative(5.46f)
                curveToRelative(1.59f, -1.27f, 2.44f, -3.09f, 2.5f, -5.45f)
                verticalLineToRelative(-1.91f)
                curveToRelative(-0.63f, 0.71f, -1.46f, 1.35f, -2.5f, 1.9f)
                close()
                moveTo(13.5f, 16.98f)
                curveToRelative(-0.48f, 0.03f, -0.97f, 0.04f, -1.49f, 0.04f)
                curveToRelative(-0.53f, -0.0f, -1.02f, -0.02f, -1.51f, -0.04f)
                verticalLineToRelative(6.02f)
                curveToRelative(0.48f, 0.03f, 0.98f, 0.05f, 1.5f, 0.05f)
                curveToRelative(0.52f, -0.0f, 1.01f, -0.02f, 1.5f, -0.05f)
                close()
            }
        }.also { _Coin = it}
