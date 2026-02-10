package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTrendDown: ImageVector? = null

val Icons.Bs.ArrowTrendDown: ImageVector
    get() = _ArrowTrendDown ?: UXIcon(name = "ArrowTrendDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 8f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4.88f)
                lineToRelative(-5.88f, -5.88f)
                lineToRelative(-6f, 6f)
                lineTo(0.06f, 8.19f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(4.81f, 4.81f)
                lineToRelative(6f, -6f)
                lineToRelative(8f, 8f)
                verticalLineToRelative(-4.88f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _ArrowTrendDown = it}
