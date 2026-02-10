package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTrendDown: ImageVector? = null

val Icons.Ts.ArrowTrendDown: ImageVector
    get() = _ArrowTrendDown ?: UXIcon(name = "ArrowTrendDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 9f)
                verticalLineToRelative(7.29f)
                lineTo(13f, 6.29f)
                lineToRelative(-6f, 6f)
                lineTo(0.73f, 6.02f)
                lineTo(0.02f, 6.73f)
                lineToRelative(6.98f, 6.98f)
                lineToRelative(6f, -6f)
                lineToRelative(9.29f, 9.29f)
                horizontalLineToRelative(-7.29f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(-1f)
                close()
            }
        }.also { _ArrowTrendDown = it}
