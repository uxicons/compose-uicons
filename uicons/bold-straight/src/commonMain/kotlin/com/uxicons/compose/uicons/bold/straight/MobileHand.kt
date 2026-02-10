package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MobileHand: ImageVector? = null

val Icons.Bs.MobileHand: ImageVector
    get() = _MobileHand ?: UXIcon(name = "MobileHand") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 0f)
                lineTo(9f, 10.12f)
                curveToRelative(0.89f, -0.66f, 1.93f, -1.02f, 3f, -1.08f)
                lineTo(12f, 3f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-5.3f)
                curveToRelative(0.21f, -0.52f, 0.31f, -1.08f, 0.27f, -1.65f)
                curveToRelative(-0.08f, -0.97f, -0.53f, -1.85f, -1.27f, -2.48f)
                curveToRelative(-1.37f, -1.17f, -3.42f, -1.15f, -4.77f, 0.05f)
                lineToRelative(-3.92f, 3.47f)
                lineToRelative(1.99f, 2.25f)
                lineToRelative(3.92f, -3.47f)
                curveToRelative(0.24f, -0.21f, 0.6f, -0.21f, 0.84f, -0.01f)
                curveToRelative(0.31f, 0.38f, 0.32f, 0.51f, 0.03f, 0.96f)
                lineToRelative(-4.79f, 6.24f)
                lineToRelative(0.02f, 2.66f)
                lineToRelative(3f, -0.02f)
                lineToRelative(-0.01f, -1.63f)
                lineToRelative(0.28f, -0.36f)
                horizontalLineToRelative(9.73f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                lineTo(24.0f, 0f)
                lineTo(9f, 0f)
                close()
                moveTo(18.0f, 20.01f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                close()
                moveTo(7f, 9.87f)
                lineToRelative(-4f, 3.63f)
                verticalLineToRelative(10.5f)
                lineTo(0f, 24f)
                lineTo(0f, 12.14f)
                lineTo(7f, 5.86f)
                verticalLineToRelative(4.01f)
                close()
            }
        }.also { _MobileHand = it}
