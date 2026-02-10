package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentAltMiddle: ImageVector? = null

val Icons.Ts.CommentAltMiddle: ImageVector
    get() = _CommentAltMiddle ?: UXIcon(name = "CommentAltMiddle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.01f, 23.66f)
                curveToRelative(-0.36f, 0f, -0.72f, -0.13f, -1.0f, -0.38f)
                lineToRelative(-3.9f, -3.28f)
                horizontalLineTo(0f)
                verticalLineTo(2.5f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                horizontalLineTo(21.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineTo(20f)
                horizontalLineToRelative(-7.03f)
                lineToRelative(-3.98f, 3.29f)
                curveToRelative(-0.28f, 0.24f, -0.63f, 0.37f, -0.98f, 0.37f)
                close()
                moveTo(1f, 19f)
                horizontalLineTo(7.47f)
                lineToRelative(4.19f, 3.53f)
                curveToRelative(0.2f, 0.18f, 0.48f, 0.18f, 0.67f, 0.01f)
                lineToRelative(4.28f, -3.54f)
                horizontalLineToRelative(6.39f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineTo(2.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineTo(19f)
                close()
            }
        }.also { _CommentAltMiddle = it}
