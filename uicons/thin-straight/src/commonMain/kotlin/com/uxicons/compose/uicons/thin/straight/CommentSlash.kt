package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentSlash: ImageVector? = null

val Icons.Ts.CommentSlash: ImageVector
    get() = _CommentSlash ?: UXIcon(name = "CommentSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 22.29f)
                lineTo(23f, 12f)
                curveToRelative(0f, -6.07f, -4.93f, -11f, -11f, -11f)
                curveToRelative(-2.77f, 0f, -5.38f, 1.02f, -7.42f, 2.88f)
                lineTo(0.75f, 0.05f)
                lineTo(0.05f, 0.75f)
                lineTo(23.25f, 23.95f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-0.95f, -0.95f)
                close()
                moveTo(12f, 2f)
                curveToRelative(5.51f, 0f, 10f, 4.49f, 10f, 10f)
                verticalLineToRelative(9.29f)
                lineTo(5.29f, 4.58f)
                curveToRelative(1.84f, -1.67f, 4.21f, -2.58f, 6.71f, -2.58f)
                close()
                moveTo(18.46f, 22f)
                lineToRelative(1f, 1f)
                horizontalLineToRelative(-7.46f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                curveToRelative(0f, -2.09f, 0.59f, -4.08f, 1.66f, -5.8f)
                lineToRelative(0.73f, 0.73f)
                curveToRelative(-0.9f, 1.52f, -1.39f, 3.26f, -1.39f, 5.07f)
                curveToRelative(0f, 5.51f, 4.49f, 10f, 10f, 10f)
                horizontalLineToRelative(6.46f)
                close()
            }
        }.also { _CommentSlash = it}
