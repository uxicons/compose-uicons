package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RotateReverse: ImageVector? = null

val Icons.Ts.RotateReverse: ImageVector
    get() = _RotateReverse ?: UXIcon(name = "RotateReverse") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -6.07f, -4.93f, -11f, -11f, -11f)
                curveToRelative(-3.71f, 0f, -7.17f, 1.91f, -9.19f, 5f)
                horizontalLineToRelative(4.19f)
                verticalLineToRelative(1f)
                lineTo(2.5f, 7f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(1f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4.41f)
                curveTo(4.21f, 2.07f, 7.97f, 0f, 12f, 0f)
                curveToRelative(6.62f, 0f, 12f, 5.38f, 12f, 12f)
                close()
                moveTo(21.5f, 17f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4.19f)
                curveToRelative(-2.02f, 3.09f, -5.48f, 5f, -9.19f, 5f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                lineTo(0f, 12f)
                curveToRelative(0f, 6.62f, 5.38f, 12f, 12f, 12f)
                curveToRelative(4.03f, 0f, 7.79f, -2.07f, 10f, -5.41f)
                verticalLineToRelative(4.41f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _RotateReverse = it}
