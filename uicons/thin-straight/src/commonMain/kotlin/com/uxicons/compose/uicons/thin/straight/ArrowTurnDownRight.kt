package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTurnDownRight: ImageVector? = null

val Icons.Ts.ArrowTurnDownRight: ImageVector
    get() = _ArrowTurnDownRight ?: UXIcon(name = "ArrowTurnDownRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.55f, 13.38f)
                lineToRelative(-6.18f, -6.72f)
                lineToRelative(-0.74f, 0.68f)
                lineToRelative(6.12f, 6.66f)
                horizontalLineTo(2.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineTo(2f)
                horizontalLineTo(0f)
                verticalLineTo(12.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineTo(22.76f)
                lineToRelative(-6.12f, 6.66f)
                lineToRelative(0.74f, 0.68f)
                lineToRelative(6.16f, -6.71f)
                curveToRelative(0.62f, -0.62f, 0.62f, -1.64f, 0.01f, -2.25f)
                close()
            }
        }.also { _ArrowTurnDownRight = it}
