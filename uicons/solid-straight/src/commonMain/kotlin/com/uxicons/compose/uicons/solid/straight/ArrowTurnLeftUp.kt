package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTurnLeftUp: ImageVector? = null

val Icons.Ss.ArrowTurnLeftUp: ImageVector
    get() = _ArrowTurnLeftUp ?: UXIcon(name = "ArrowTurnLeftUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineTo(2.95f)
                lineToRelative(5.79f, 5.76f)
                lineToRelative(1.41f, -1.42f)
                lineTo(10.49f, 0.62f)
                curveToRelative(-0.82f, -0.82f, -2.15f, -0.82f, -2.97f, -0.0f)
                lineTo(0.8f, 7.29f)
                lineToRelative(1.41f, 1.42f)
                lineTo(8f, 2.95f)
                verticalLineTo(21f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-2f)
                horizontalLineTo(11f)
                close()
            }
        }.also { _ArrowTurnLeftUp = it}
