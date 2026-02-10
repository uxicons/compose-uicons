package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTurnDownLeft: ImageVector? = null

val Icons.Ts.ArrowTurnDownLeft: ImageVector
    get() = _ArrowTurnDownLeft ?: UXIcon(name = "ArrowTurnDownLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 2f)
                verticalLineTo(12.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineTo(1.24f)
                lineTo(7.37f, 7.34f)
                lineToRelative(-0.74f, -0.68f)
                lineTo(0.47f, 13.37f)
                curveToRelative(-0.62f, 0.62f, -0.62f, 1.64f, -0.01f, 2.25f)
                lineToRelative(6.18f, 6.72f)
                lineToRelative(0.74f, -0.68f)
                lineTo(1.24f, 15f)
                horizontalLineTo(21.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineTo(2f)
                horizontalLineToRelative(-1f)
                close()
            }
        }.also { _ArrowTurnDownLeft = it}
