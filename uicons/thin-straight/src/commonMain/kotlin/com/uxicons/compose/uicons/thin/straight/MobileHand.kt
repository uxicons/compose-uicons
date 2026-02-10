package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MobileHand: ImageVector? = null

val Icons.Ts.MobileHand: ImageVector
    get() = _MobileHand ?: UXIcon(name = "MobileHand") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 0f)
                lineTo(9f, 10.42f)
                lineToRelative(0.26f, -0.24f)
                curveToRelative(0.23f, -0.2f, 0.48f, -0.37f, 0.74f, -0.51f)
                lineTo(10f, 1f)
                horizontalLineToRelative(13f)
                lineTo(23f, 15f)
                lineTo(14.61f, 15f)
                curveToRelative(0.66f, -1.09f, 0.45f, -2.52f, -0.55f, -3.37f)
                curveToRelative(-1.0f, -0.85f, -2.48f, -0.83f, -3.47f, 0.04f)
                lineToRelative(-4.44f, 4f)
                lineToRelative(0.67f, 0.74f)
                lineToRelative(4.43f, -4.0f)
                curveToRelative(0.61f, -0.54f, 1.53f, -0.55f, 2.15f, -0.02f)
                curveToRelative(0.69f, 0.59f, 0.77f, 1.62f, 0.16f, 2.35f)
                lineToRelative(-4.58f, 6.6f)
                verticalLineToRelative(2.66f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2.34f)
                lineToRelative(0.08f, -0.11f)
                curveToRelative(0.41f, 0.29f, 0.91f, 0.45f, 1.42f, 0.45f)
                horizontalLineToRelative(10f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(24.0f, 0f)
                lineTo(9f, 0f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(11.5f, 21f)
                curveToRelative(-0.31f, 0f, -0.61f, -0.1f, -0.86f, -0.27f)
                lineToRelative(3.28f, -4.73f)
                horizontalLineToRelative(9.08f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(15f, 19f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(7f, 7.65f)
                lineTo(1f, 13.22f)
                verticalLineToRelative(10.78f)
                lineTo(0f, 24f)
                lineTo(0f, 12.78f)
                lineTo(7f, 6.28f)
                verticalLineToRelative(1.36f)
                close()
            }
        }.also { _MobileHand = it}
