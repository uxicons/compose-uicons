package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTurnDownLeft: ImageVector? = null

val Icons.Rs.ArrowTurnDownLeft: ImageVector
    get() = _ArrowTurnDownLeft ?: UXIcon(name = "ArrowTurnDownLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 3f)
                verticalLineTo(13f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineTo(2.88f)
                lineToRelative(4.86f, 5.33f)
                lineToRelative(-1.48f, 1.35f)
                lineTo(0.58f, 16.45f)
                curveToRelative(-0.79f, -0.79f, -0.79f, -2.12f, 0.03f, -2.94f)
                lineTo(6.26f, 7.33f)
                lineToRelative(1.48f, 1.35f)
                lineTo(2.88f, 14f)
                horizontalLineTo(21f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(3f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _ArrowTurnDownLeft = it}
