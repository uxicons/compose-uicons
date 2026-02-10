package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentSlash: ImageVector? = null

val Icons.Ss.CommentSlash: ImageVector
    get() = _CommentSlash ?: UXIcon(name = "CommentSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.76f, 23f)
                horizontalLineToRelative(-6.76f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                curveToRelative(0f, -1.91f, 0.49f, -3.74f, 1.4f, -5.36f)
                lineTo(18.76f, 23f)
                close()
                moveTo(23.96f, 22.54f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                lineToRelative(3.51f, 3.51f)
                curveToRelative(1.97f, -1.65f, 4.43f, -2.55f, 7.04f, -2.55f)
                curveToRelative(6.07f, 0f, 11f, 4.93f, 11f, 11f)
                verticalLineToRelative(9.59f)
                lineToRelative(0.96f, 0.96f)
                close()
            }
        }.also { _CommentSlash = it}
