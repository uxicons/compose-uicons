package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentSlash: ImageVector? = null

val Icons.Bs.CommentSlash: ImageVector
    get() = _CommentSlash ?: UXIcon(name = "CommentSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 20.88f)
                lineTo(23f, 12f)
                curveToRelative(0f, -6.07f, -4.93f, -11f, -11f, -11f)
                curveToRelative(-2.4f, 0f, -4.74f, 0.8f, -6.64f, 2.24f)
                lineTo(2.16f, 0.04f)
                lineTo(0.04f, 2.16f)
                lineTo(21.84f, 23.96f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-0.96f, -0.96f)
                close()
                moveTo(12f, 4f)
                curveToRelative(4.41f, 0f, 8f, 3.59f, 8f, 8f)
                verticalLineToRelative(5.88f)
                lineTo(7.5f, 5.38f)
                curveToRelative(1.31f, -0.9f, 2.86f, -1.38f, 4.5f, -1.38f)
                close()
                moveTo(15.05f, 20f)
                lineToRelative(3f, 3f)
                horizontalLineToRelative(-6.05f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                curveToRelative(0f, -1.72f, 0.4f, -3.39f, 1.15f, -4.9f)
                lineToRelative(2.29f, 2.29f)
                curveToRelative(-0.29f, 0.83f, -0.44f, 1.71f, -0.44f, 2.61f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                horizontalLineToRelative(3.05f)
                close()
            }
        }.also { _CommentSlash = it}
