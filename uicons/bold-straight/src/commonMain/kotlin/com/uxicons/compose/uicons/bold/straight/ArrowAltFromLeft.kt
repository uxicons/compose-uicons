package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltFromLeft: ImageVector? = null

val Icons.Bs.ArrowAltFromLeft: ImageVector
    get() = _ArrowAltFromLeft ?: UXIcon(name = "ArrowAltFromLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.55f, 11.08f)
                lineToRelative(-5.55f, -5.08f)
                verticalLineToRelative(4.5f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(0f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(4.66f)
                lineToRelative(5.55f, -5.08f)
                curveToRelative(0.59f, -0.53f, 0.59f, -1.46f, 0f, -1.99f)
                close()
            }
        }.also { _ArrowAltFromLeft = it}
