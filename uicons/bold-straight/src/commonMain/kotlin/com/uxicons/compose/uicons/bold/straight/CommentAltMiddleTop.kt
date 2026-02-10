package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentAltMiddleTop: ImageVector? = null

val Icons.Bs.CommentAltMiddleTop: ImageVector
    get() = _CommentAltMiddleTop ?: UXIcon(name = "CommentAltMiddleTop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 24f)
                lineTo(3.5f, 24f)
                curveTo(1.57f, 24f, 0f, 22.43f, 0f, 20.5f)
                lineTo(0f, 4f)
                lineTo(6.74f, 4f)
                lineTo(10.37f, 0.94f)
                curveToRelative(0.92f, -0.82f, 2.35f, -0.82f, 3.29f, 0.03f)
                lineToRelative(3.67f, 3.03f)
                horizontalLineToRelative(6.67f)
                lineTo(24f, 20.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(3f, 7f)
                verticalLineToRelative(13.5f)
                curveToRelative(0f, 0.28f, 0.23f, 0.5f, 0.5f, 0.5f)
                lineTo(20.5f, 21f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(21f, 7f)
                horizontalLineToRelative(-4.75f)
                lineToRelative(-4.25f, -3.51f)
                lineToRelative(-4.17f, 3.51f)
                lineTo(3f, 7f)
                close()
                moveTo(11.71f, 3.25f)
                lineToRelative(0.02f, 0.02f)
                lineToRelative(-0.02f, -0.02f)
                close()
                moveTo(12.33f, 3.21f)
                lineToRelative(-0.02f, 0.02f)
                lineToRelative(0.02f, -0.02f)
                close()
            }
        }.also { _CommentAltMiddleTop = it}
