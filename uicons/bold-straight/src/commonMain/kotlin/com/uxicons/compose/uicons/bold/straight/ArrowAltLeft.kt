package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltLeft: ImageVector? = null

val Icons.Bs.ArrowAltLeft: ImageVector
    get() = _ArrowAltLeft ?: UXIcon(name = "ArrowAltLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 10.5f)
                horizontalLineTo(6f)
                verticalLineTo(5.92f)
                lineTo(0.45f, 11.0f)
                curveToRelative(-0.59f, 0.53f, -0.59f, 1.46f, 0f, 1.99f)
                lineToRelative(5.55f, 5.08f)
                verticalLineToRelative(-4.58f)
                horizontalLineTo(24f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _ArrowAltLeft = it}
