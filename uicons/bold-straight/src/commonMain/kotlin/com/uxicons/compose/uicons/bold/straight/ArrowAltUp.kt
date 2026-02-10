package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltUp: ImageVector? = null

val Icons.Bs.ArrowAltUp: ImageVector
    get() = _ArrowAltUp ?: UXIcon(name = "ArrowAltUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.08f, 6f)
                lineTo(13.0f, 0.45f)
                curveToRelative(-0.53f, -0.59f, -1.46f, -0.59f, -1.99f, 0f)
                lineTo(5.92f, 6f)
                horizontalLineToRelative(4.58f)
                verticalLineTo(24f)
                horizontalLineToRelative(3f)
                verticalLineTo(6f)
                horizontalLineToRelative(4.58f)
                close()
            }
        }.also { _ArrowAltUp = it}
