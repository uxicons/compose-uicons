package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentAltMiddleTop: ImageVector? = null

val Icons.Ts.CommentAltMiddleTop: ImageVector
    get() = _CommentAltMiddleTop ?: UXIcon(name = "CommentAltMiddleTop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.98f, 0.7f)
                lineToRelative(3.98f, 3.29f)
                horizontalLineToRelative(7.03f)
                verticalLineTo(21.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineTo(2.5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineTo(4f)
                horizontalLineTo(7.11f)
                lineTo(11.0f, 0.72f)
                curveToRelative(0.28f, -0.25f, 0.65f, -0.38f, 1.0f, -0.38f)
                curveToRelative(0.35f, 0f, 0.7f, 0.12f, 0.98f, 0.37f)
                close()
                moveTo(1f, 21.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineTo(21.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineTo(5f)
                horizontalLineToRelative(-6.39f)
                lineTo(12.33f, 1.46f)
                curveToRelative(-0.19f, -0.17f, -0.47f, -0.17f, -0.67f, 0.01f)
                lineToRelative(-4.19f, 3.53f)
                horizontalLineTo(1f)
                verticalLineTo(21.5f)
                close()
            }
        }.also { _CommentAltMiddleTop = it}
