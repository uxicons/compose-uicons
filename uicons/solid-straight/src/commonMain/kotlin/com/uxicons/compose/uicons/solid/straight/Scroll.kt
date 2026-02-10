package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scroll: ImageVector? = null

val Icons.Ss.Scroll: ImageVector
    get() = _Scroll ?: UXIcon(name = "Scroll") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 19f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-9.26f)
                curveToRelative(0.48f, -0.72f, 0.76f, -1.58f, 0.76f, -2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(12f)
                close()
                moveTo(1.5f, 0f)
                curveTo(0.67f, 0f, 0f, 0.67f, 0f, 1.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3f)
                lineTo(3f, 1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(4.66f, 0f)
                curveToRelative(0.22f, 0.46f, 0.34f, 0.96f, 0.34f, 1.5f)
                verticalLineToRelative(19.86f)
                curveToRelative(0f, 1.31f, 0.94f, 2.5f, 2.24f, 2.63f)
                curveToRelative(1.5f, 0.15f, 2.76f, -1.02f, 2.76f, -2.49f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(10f)
                lineTo(20f, 4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                lineTo(4.66f, 0f)
                close()
            }
        }.also { _Scroll = it}
