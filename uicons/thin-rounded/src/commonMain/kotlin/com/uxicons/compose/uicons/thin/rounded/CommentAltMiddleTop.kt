package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentAltMiddleTop: ImageVector? = null

val Icons.Tr.CommentAltMiddleTop: ImageVector
    get() = _CommentAltMiddleTop ?: UXIcon(name = "CommentAltMiddleTop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 24f)
                horizontalLineTo(3.5f)
                curveTo(1.57f, 24f, 0f, 22.43f, 0f, 20.5f)
                verticalLineTo(7.5f)
                curveTo(0f, 5.57f, 1.57f, 4f, 3.5f, 4f)
                horizontalLineToRelative(3.61f)
                lineTo(11.01f, 0.71f)
                curveToRelative(0.56f, -0.5f, 1.42f, -0.5f, 1.98f, 0.01f)
                lineToRelative(3.97f, 3.28f)
                horizontalLineToRelative(3.53f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(3.5f, 5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineTo(20.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineTo(7.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3.71f)
                curveToRelative(-0.12f, 0f, -0.23f, -0.04f, -0.32f, -0.12f)
                lineTo(12.35f, 1.48f)
                curveToRelative(-0.2f, -0.18f, -0.49f, -0.18f, -0.68f, -0.01f)
                lineToRelative(-4.06f, 3.42f)
                curveToRelative(-0.09f, 0.08f, -0.2f, 0.12f, -0.32f, 0.12f)
                horizontalLineTo(3.5f)
                close()
            }
        }.also { _CommentAltMiddleTop = it}
