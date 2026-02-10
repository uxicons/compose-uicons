package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltLeft: ImageVector? = null

val Icons.Ss.ArrowAltLeft: ImageVector
    get() = _ArrowAltLeft ?: UXIcon(name = "ArrowAltLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11f)
                horizontalLineTo(6f)
                verticalLineTo(5.92f)
                lineTo(0.45f, 11.0f)
                curveToRelative(-0.59f, 0.53f, -0.59f, 1.46f, 0f, 1.99f)
                lineToRelative(5.55f, 5.08f)
                verticalLineToRelative(-5.08f)
                horizontalLineTo(24f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _ArrowAltLeft = it}
