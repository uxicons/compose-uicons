package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltUp: ImageVector? = null

val Icons.Rs.ArrowAltUp: ImageVector
    get() = _ArrowAltUp ?: UXIcon(name = "ArrowAltUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.08f, 6f)
                lineTo(13.0f, 0.45f)
                curveToRelative(-0.53f, -0.59f, -1.46f, -0.59f, -1.99f, 0f)
                lineTo(5.92f, 6f)
                horizontalLineToRelative(5.08f)
                verticalLineTo(24f)
                horizontalLineToRelative(2f)
                verticalLineTo(6f)
                horizontalLineToRelative(5.08f)
                close()
            }
        }.also { _ArrowAltUp = it}
