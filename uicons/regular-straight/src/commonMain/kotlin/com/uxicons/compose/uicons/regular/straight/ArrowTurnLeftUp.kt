package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTurnLeftUp: ImageVector? = null

val Icons.Rs.ArrowTurnLeftUp: ImageVector
    get() = _ArrowTurnLeftUp ?: UXIcon(name = "ArrowTurnLeftUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 22f)
                verticalLineToRelative(2f)
                horizontalLineTo(11f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineTo(2.95f)
                lineTo(2.21f, 8.71f)
                lineToRelative(-1.41f, -1.42f)
                lineTo(7.52f, 0.61f)
                curveToRelative(0.82f, -0.82f, 2.15f, -0.82f, 2.97f, 0.0f)
                lineToRelative(6.72f, 6.67f)
                lineToRelative(-1.41f, 1.42f)
                lineTo(10f, 2.95f)
                verticalLineTo(21f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(11f)
                close()
            }
        }.also { _ArrowTurnLeftUp = it}
