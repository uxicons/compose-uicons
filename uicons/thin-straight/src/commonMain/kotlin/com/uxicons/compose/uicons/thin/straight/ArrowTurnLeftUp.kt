package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTurnLeftUp: ImageVector? = null

val Icons.Ts.ArrowTurnLeftUp: ImageVector
    get() = _ArrowTurnLeftUp ?: UXIcon(name = "ArrowTurnLeftUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 23f)
                verticalLineToRelative(1f)
                horizontalLineTo(10.5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineTo(1.25f)
                lineTo(1.35f, 7.85f)
                lineToRelative(-0.7f, -0.71f)
                lineTo(7.37f, 0.47f)
                curveToRelative(0.62f, -0.62f, 1.64f, -0.62f, 2.27f, 0f)
                lineToRelative(6.72f, 6.68f)
                lineToRelative(-0.7f, 0.71f)
                lineTo(9f, 1.25f)
                verticalLineTo(21.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(11.5f)
                close()
            }
        }.also { _ArrowTurnLeftUp = it}
