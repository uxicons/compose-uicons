package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltFromTop: ImageVector? = null

val Icons.Bs.ArrowAltFromTop: ImageVector
    get() = _ArrowAltFromTop ?: UXIcon(name = "ArrowAltFromTop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 3f)
                verticalLineTo(0f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(15f)
                horizontalLineTo(6f)
                lineToRelative(5.02f, 5.55f)
                curveToRelative(0.53f, 0.59f, 1.44f, 0.59f, 1.97f, 0f)
                lineToRelative(5.02f, -5.55f)
                horizontalLineToRelative(-4.5f)
                verticalLineTo(3f)
                horizontalLineToRelative(7.5f)
                close()
            }
        }.also { _ArrowAltFromTop = it}
