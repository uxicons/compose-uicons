package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentAltMiddleTop: ImageVector? = null

val Icons.Sr.CommentAltMiddleTop: ImageVector
    get() = _CommentAltMiddleTop ?: UXIcon(name = "CommentAltMiddleTop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 24f)
                horizontalLineTo(4f)
                curveTo(1.79f, 24f, 0f, 22.21f, 0f, 20f)
                verticalLineTo(8f)
                curveTo(0f, 5.79f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(2.92f)
                lineTo(10.69f, 0.83f)
                curveToRelative(0.74f, -0.66f, 1.88f, -0.66f, 2.64f, 0.02f)
                lineToRelative(3.82f, 3.16f)
                horizontalLineToRelative(2.85f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                close()
            }
        }.also { _CommentAltMiddleTop = it}
