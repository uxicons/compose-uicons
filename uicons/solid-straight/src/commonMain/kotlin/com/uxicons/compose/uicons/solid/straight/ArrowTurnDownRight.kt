package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTurnDownRight: ImageVector? = null

val Icons.Ss.ArrowTurnDownRight: ImageVector
    get() = _ArrowTurnDownRight ?: UXIcon(name = "ArrowTurnDownRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.42f, 13.55f)
                lineToRelative(-5.68f, -6.22f)
                lineToRelative(-1.48f, 1.35f)
                lineToRelative(4.86f, 5.33f)
                horizontalLineTo(3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineTo(3f)
                horizontalLineTo(0f)
                verticalLineTo(13f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineTo(21.12f)
                lineToRelative(-4.86f, 5.33f)
                lineToRelative(1.48f, 1.35f)
                lineToRelative(5.65f, -6.19f)
                curveToRelative(0.82f, -0.82f, 0.82f, -2.15f, 0.03f, -2.94f)
                close()
            }
        }.also { _ArrowTurnDownRight = it}
