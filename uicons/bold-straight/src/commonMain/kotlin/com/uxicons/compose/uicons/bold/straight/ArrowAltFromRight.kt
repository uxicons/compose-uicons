package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltFromRight: ImageVector? = null

val Icons.Bs.ArrowAltFromRight: ImageVector
    get() = _ArrowAltFromRight ?: UXIcon(name = "ArrowAltFromRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 3f)
                verticalLineToRelative(7.5f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                lineTo(0.45f, 11.08f)
                curveToRelative(-0.59f, 0.53f, -0.59f, 1.46f, 0f, 1.99f)
                lineToRelative(5.55f, 5.08f)
                verticalLineToRelative(-4.66f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(3f)
                verticalLineTo(3f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _ArrowAltFromRight = it}
