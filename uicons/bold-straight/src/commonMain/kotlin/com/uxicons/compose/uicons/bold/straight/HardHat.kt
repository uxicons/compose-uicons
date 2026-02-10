package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HardHat: ImageVector? = null

val Icons.Bs.HardHat: ImageVector
    get() = _HardHat ?: UXIcon(name = "HardHat") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 15f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2.23f)
                curveToRelative(0f, -4.46f, -2.83f, -8.44f, -7f, -10.03f)
                verticalLineToRelative(-1.74f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(1.74f)
                curveTo(3.83f, 4.34f, 1f, 8.31f, 1f, 12.77f)
                verticalLineToRelative(2.23f)
                lineTo(0f, 15f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1.77f)
                lineToRelative(0.39f, 0.5f)
                curveToRelative(2.23f, 2.86f, 5.58f, 4.5f, 9.2f, 4.5f)
                horizontalLineToRelative(1.27f)
                curveToRelative(3.62f, 0f, 6.98f, -1.64f, 9.2f, -4.5f)
                lineToRelative(0.4f, -0.51f)
                horizontalLineToRelative(1.77f)
                verticalLineToRelative(-3f)
                close()
                moveTo(20f, 12.77f)
                verticalLineToRelative(2.23f)
                horizontalLineToRelative(-4f)
                lineTo(16f, 6.07f)
                curveToRelative(2.42f, 1.37f, 4f, 3.89f, 4f, 6.71f)
                close()
                moveTo(13f, 4f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(4f, 12.77f)
                curveToRelative(0f, -2.81f, 1.58f, -5.34f, 4f, -6.7f)
                verticalLineToRelative(8.93f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2.23f)
                close()
                moveTo(12.64f, 20f)
                horizontalLineToRelative(-1.27f)
                curveToRelative(-2.06f, 0f, -3.99f, -0.71f, -5.53f, -2f)
                horizontalLineToRelative(12.33f)
                curveToRelative(-1.54f, 1.28f, -3.47f, 2f, -5.53f, 2f)
                close()
            }
        }.also { _HardHat = it}
