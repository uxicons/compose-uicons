package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTurnDownLeft: ImageVector? = null

val Icons.Bs.ArrowTurnDownLeft: ImageVector
    get() = _ArrowTurnDownLeft ?: UXIcon(name = "ArrowTurnDownLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 2f)
                verticalLineTo(12.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineTo(4.51f)
                lineToRelative(4.1f, -4.49f)
                lineToRelative(-2.22f, -2.02f)
                lineTo(0.76f, 12.66f)
                curveToRelative(-1.01f, 1.01f, -1.01f, 2.67f, -0.05f, 3.63f)
                lineToRelative(5.68f, 6.22f)
                lineToRelative(2.22f, -2.02f)
                lineToRelative(-4.1f, -4.49f)
                horizontalLineToRelative(15.99f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineTo(2f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _ArrowTurnDownLeft = it}
