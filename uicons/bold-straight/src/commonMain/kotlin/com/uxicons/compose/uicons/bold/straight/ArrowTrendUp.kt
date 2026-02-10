package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTrendUp: ImageVector? = null

val Icons.Bs.ArrowTrendUp: ImageVector
    get() = _ArrowTrendUp ?: UXIcon(name = "ArrowTrendUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 8.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4.88f)
                lineToRelative(-8f, 8f)
                lineToRelative(-6f, -6f)
                lineToRelative(-4.81f, 4.81f)
                lineTo(0.07f, 15.81f)
                lineToRelative(6.93f, -6.93f)
                lineToRelative(6f, 6f)
                lineToRelative(5.88f, -5.88f)
                horizontalLineToRelative(-4.88f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(7.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
            }
        }.also { _ArrowTrendUp = it}
