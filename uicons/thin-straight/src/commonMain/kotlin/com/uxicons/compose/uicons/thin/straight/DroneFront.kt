package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DroneFront: ImageVector? = null

val Icons.Ts.DroneFront: ImageVector
    get() = _DroneFront ?: UXIcon(name = "DroneFront") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                lineTo(0f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(1.79f)
                curveToRelative(-2.48f, 1.55f, -4f, 4.28f, -4f, 7.21f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -2.37f, 1.13f, -4.59f, 3f, -6f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-1f)
                curveToRelative(1.87f, 1.41f, 3f, 3.63f, 3f, 6f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -2.93f, -1.52f, -5.66f, -4f, -7.21f)
                verticalLineToRelative(-1.79f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                close()
                moveTo(16f, 16f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(5.5f)
                close()
            }
        }.also { _DroneFront = it}
