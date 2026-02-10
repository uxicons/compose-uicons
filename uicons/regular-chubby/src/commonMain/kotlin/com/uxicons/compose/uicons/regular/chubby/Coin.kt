package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Coin: ImageVector? = null

val Icons.Rc.Coin: ImageVector
    get() = _Coin ?: UXIcon(name = "Coin") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.0f, 8.44f)
                curveToRelative(-0.07f, -2.78f, -1.6f, -7.45f, -11.0f, -7.49f)
                curveToRelative(-8.92f, 0.04f, -10.9f, 4.09f, -10.99f, 7.48f)
                verticalLineToRelative(6.91f)
                curveToRelative(0.14f, 5.05f, 3.84f, 7.63f, 11.0f, 7.66f)
                curveToRelative(7.16f, -0.03f, 10.86f, -2.6f, 11.0f, -7.68f)
                curveToRelative(0f, 0f, -0.0f, -6.83f, 0f, -6.88f)
                close()
                moveTo(11.99f, 2.95f)
                curveToRelative(5.88f, 0.02f, 8.91f, 1.89f, 9.0f, 5.48f)
                curveToRelative(-0.07f, 2.36f, -1.07f, 5.51f, -9.0f, 5.54f)
                curveToRelative(-7.9f, -0.03f, -8.93f, -3.15f, -9.0f, -5.51f)
                curveToRelative(0.04f, -1.39f, 0.21f, -5.48f, 8.99f, -5.51f)
                close()
                moveTo(17.0f, 15.41f)
                verticalLineToRelative(4.94f)
                curveToRelative(-0.58f, 0.18f, -1.24f, 0.33f, -2f, 0.44f)
                verticalLineToRelative(-5.01f)
                curveToRelative(0.71f, -0.09f, 1.38f, -0.21f, 2f, -0.37f)
                close()
                moveTo(9.0f, 15.79f)
                verticalLineToRelative(5.01f)
                curveToRelative(-0.76f, -0.11f, -1.42f, -0.26f, -2f, -0.44f)
                verticalLineToRelative(-4.94f)
                curveToRelative(0.62f, 0.16f, 1.29f, 0.28f, 2f, 0.37f)
                close()
                moveTo(3.0f, 15.32f)
                verticalLineToRelative(-1.96f)
                curveToRelative(0.55f, 0.53f, 1.22f, 0.97f, 2f, 1.34f)
                verticalLineToRelative(4.7f)
                curveToRelative(-1.63f, -1.16f, -1.96f, -2.75f, -2f, -4.08f)
                close()
                moveTo(11.0f, 20.97f)
                verticalLineToRelative(-5.02f)
                curveToRelative(0.33f, 0.01f, 0.66f, 0.03f, 1.0f, 0.03f)
                curveToRelative(0.34f, -0.0f, 0.67f, -0.01f, 1.0f, -0.03f)
                verticalLineToRelative(5.02f)
                curveToRelative(-0.32f, 0.01f, -0.65f, 0.03f, -1.0f, 0.03f)
                curveToRelative(-0.35f, -0.0f, -0.68f, -0.02f, -1.0f, -0.03f)
                close()
                moveTo(19.0f, 19.4f)
                verticalLineToRelative(-4.7f)
                curveToRelative(0.78f, -0.37f, 1.45f, -0.82f, 2f, -1.35f)
                verticalLineToRelative(1.94f)
                curveToRelative(-0.04f, 1.35f, -0.37f, 2.95f, -2f, 4.11f)
                close()
            }
        }.also { _Coin = it}
