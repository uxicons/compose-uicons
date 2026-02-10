package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentSlash: ImageVector? = null

val Icons.Rs.CommentSlash: ImageVector
    get() = _CommentSlash ?: UXIcon(name = "CommentSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 21.59f)
                lineTo(23f, 12f)
                curveToRelative(0f, -6.07f, -4.93f, -11f, -11f, -11f)
                curveToRelative(-2.6f, 0f, -5.06f, 0.9f, -7.04f, 2.55f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineTo(22.54f, 23.96f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-0.96f, -0.96f)
                close()
                moveTo(12f, 3f)
                curveToRelative(4.96f, 0f, 9f, 4.04f, 9f, 9f)
                verticalLineToRelative(7.59f)
                lineTo(6.38f, 4.97f)
                curveToRelative(1.59f, -1.27f, 3.55f, -1.97f, 5.62f, -1.97f)
                close()
                moveTo(16.76f, 21f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(-6.76f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                curveToRelative(0f, -1.91f, 0.49f, -3.74f, 1.4f, -5.36f)
                lineToRelative(1.49f, 1.49f)
                curveToRelative(-0.57f, 1.2f, -0.88f, 2.51f, -0.88f, 3.87f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                horizontalLineToRelative(4.76f)
                close()
            }
        }.also { _CommentSlash = it}
