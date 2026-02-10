package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PunchingBag: ImageVector? = null

val Icons.Bs.PunchingBag: ImageVector
    get() = _PunchingBag ?: UXIcon(name = "PunchingBag") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.14f, 7.23f)
                lineToRelative(-4.64f, -5.76f)
                verticalLineToRelative(-1.47f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1.47f)
                lineToRelative(-4.64f, 5.76f)
                curveToRelative(-0.53f, 0.61f, -0.86f, 1.4f, -0.86f, 2.27f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(7f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -0.87f, -0.33f, -1.66f, -0.86f, -2.27f)
                close()
                moveTo(12f, 4.38f)
                lineTo(13.32f, 6f)
                horizontalLineToRelative(-2.63f)
                close()
                moveTo(16f, 20.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(7f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                close()
            }
        }.also { _PunchingBag = it}
