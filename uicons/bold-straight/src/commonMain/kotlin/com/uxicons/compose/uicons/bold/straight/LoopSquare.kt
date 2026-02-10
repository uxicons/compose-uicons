package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LoopSquare: ImageVector? = null

val Icons.Bs.LoopSquare: ImageVector
    get() = _LoopSquare ?: UXIcon(name = "LoopSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.36f, 18.53f)
                curveToRelative(-0.48f, 0.48f, -1.25f, 0.48f, -1.73f, 0f)
                lineTo(0f, 14f)
                horizontalLineTo(4f)
                verticalLineTo(4.5f)
                curveTo(4f, 2.02f, 6.02f, 0f, 8.5f, 0f)
                horizontalLineToRelative(9.5f)
                verticalLineTo(3f)
                horizontalLineTo(8.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineTo(14f)
                horizontalLineToRelative(4f)
                lineToRelative(-4.64f, 4.53f)
                close()
                moveTo(24f, 10f)
                lineToRelative(-4.64f, -4.53f)
                curveToRelative(-0.48f, -0.48f, -1.25f, -0.48f, -1.73f, 0f)
                lineToRelative(-4.64f, 4.53f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(9.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineTo(6f)
                verticalLineToRelative(3f)
                horizontalLineTo(15.5f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineTo(10f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _LoopSquare = it}
