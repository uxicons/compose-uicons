package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTrendUp: ImageVector? = null

val Icons.Ss.ArrowTrendUp: ImageVector
    get() = _ArrowTrendUp ?: UXIcon(name = "ArrowTrendUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 6f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5.59f)
                lineToRelative(-7.59f, 7.59f)
                lineToRelative(-6f, -6f)
                lineTo(0.03f, 16.56f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(5.56f, -5.56f)
                lineToRelative(6f, 6f)
                lineToRelative(9f, -9f)
                verticalLineToRelative(5.59f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
            }
        }.also { _ArrowTrendUp = it}
