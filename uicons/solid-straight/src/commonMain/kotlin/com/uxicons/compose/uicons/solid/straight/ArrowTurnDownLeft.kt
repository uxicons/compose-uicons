package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTurnDownLeft: ImageVector? = null

val Icons.Ss.ArrowTurnDownLeft: ImageVector
    get() = _ArrowTurnDownLeft ?: UXIcon(name = "ArrowTurnDownLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 3f)
                verticalLineTo(13f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineTo(2.88f)
                lineToRelative(4.86f, -5.33f)
                lineToRelative(-1.48f, -1.35f)
                lineTo(0.62f, 13.51f)
                curveToRelative(-0.82f, 0.82f, -0.82f, 2.15f, -0.03f, 2.94f)
                lineToRelative(5.68f, 6.22f)
                lineToRelative(1.48f, -1.35f)
                lineToRelative(-4.86f, -5.33f)
                horizontalLineTo(21f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineTo(3f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _ArrowTurnDownLeft = it}
