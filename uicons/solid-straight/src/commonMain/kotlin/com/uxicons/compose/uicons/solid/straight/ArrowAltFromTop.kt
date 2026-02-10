package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltFromTop: ImageVector? = null

val Icons.Ss.ArrowAltFromTop: ImageVector
    get() = _ArrowAltFromTop ?: UXIcon(name = "ArrowAltFromTop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 2f)
                verticalLineTo(0f)
                horizontalLineTo(3f)
                verticalLineTo(2f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                lineToRelative(5.02f, 5.55f)
                curveToRelative(0.53f, 0.59f, 1.44f, 0.59f, 1.97f, 0f)
                lineToRelative(5.02f, -5.55f)
                horizontalLineToRelative(-5f)
                verticalLineTo(2f)
                horizontalLineToRelative(8f)
                close()
            }
        }.also { _ArrowAltFromTop = it}
