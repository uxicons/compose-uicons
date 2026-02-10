package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTrendDown: ImageVector? = null

val Icons.Rs.ArrowTrendDown: ImageVector
    get() = _ArrowTrendDown ?: UXIcon(name = "ArrowTrendDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 9f)
                verticalLineToRelative(5.59f)
                lineTo(13f, 5.59f)
                lineToRelative(-6f, 6f)
                lineTo(1.44f, 6.03f)
                lineTo(0.03f, 7.44f)
                lineToRelative(6.97f, 6.97f)
                lineToRelative(6f, -6f)
                lineToRelative(7.59f, 7.59f)
                horizontalLineToRelative(-5.59f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(7f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _ArrowTrendDown = it}
