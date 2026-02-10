package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentAltMiddleTop: ImageVector? = null

val Icons.Rs.CommentAltMiddleTop: ImageVector
    get() = _CommentAltMiddleTop ?: UXIcon(name = "CommentAltMiddleTop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 24f)
                horizontalLineTo(3f)
                curveTo(1.35f, 24f, 0f, 22.65f, 0f, 21f)
                verticalLineTo(4f)
                horizontalLineTo(6.92f)
                lineTo(10.69f, 0.83f)
                curveToRelative(0.74f, -0.66f, 1.88f, -0.66f, 2.64f, 0.02f)
                lineToRelative(3.82f, 3.16f)
                horizontalLineToRelative(6.85f)
                verticalLineTo(21f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
                moveTo(2f, 6f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineTo(21f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(6f)
                horizontalLineToRelative(-5.57f)
                lineToRelative(-4.4f, -3.64f)
                lineToRelative(-4.37f, 3.64f)
                horizontalLineTo(2f)
                close()
            }
        }.also { _CommentAltMiddleTop = it}
