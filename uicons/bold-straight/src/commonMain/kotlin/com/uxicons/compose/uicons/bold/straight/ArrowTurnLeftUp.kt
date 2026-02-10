package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTurnLeftUp: ImageVector? = null

val Icons.Bs.ArrowTurnLeftUp: ImageVector
    get() = _ArrowTurnLeftUp ?: UXIcon(name = "ArrowTurnLeftUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 21f)
                verticalLineToRelative(3f)
                horizontalLineTo(11.5f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineTo(4.65f)
                lineTo(3.56f, 9.06f)
                lineTo(1.44f, 6.94f)
                lineTo(7.66f, 0.76f)
                curveToRelative(1.01f, -1.01f, 2.66f, -1.01f, 3.68f, 0.0f)
                lineToRelative(6.22f, 6.17f)
                lineToRelative(-2.11f, 2.13f)
                lineToRelative(-4.44f, -4.41f)
                verticalLineToRelative(15.85f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(10.5f)
                close()
            }
        }.also { _ArrowTurnLeftUp = it}
