package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTurnDownRight: ImageVector? = null

val Icons.Bs.ArrowTurnDownRight: ImageVector
    get() = _ArrowTurnDownRight ?: UXIcon(name = "ArrowTurnDownRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.29f, 12.71f)
                lineToRelative(-5.68f, -6.22f)
                lineToRelative(-2.22f, 2.02f)
                lineToRelative(4.1f, 4.49f)
                horizontalLineTo(3.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineTo(2f)
                horizontalLineTo(0f)
                verticalLineTo(12.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(15.99f)
                lineToRelative(-4.1f, 4.49f)
                lineToRelative(2.22f, 2.02f)
                lineToRelative(5.63f, -6.17f)
                curveToRelative(1.01f, -1.01f, 1.01f, -2.67f, 0.05f, -3.63f)
                close()
            }
        }.also { _ArrowTurnDownRight = it}
