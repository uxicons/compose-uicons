package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentSlash: ImageVector? = null

val Icons.Sc.CommentSlash: ImageVector
    get() = _CommentSlash ?: UXIcon(name = "CommentSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.02f, 7.79f)
                curveToRelative(-0.26f, -0.26f, -0.64f, -0.36f, -0.99f, -0.26f)
                curveToRelative(-0.35f, 0.1f, -0.62f, 0.39f, -0.7f, 0.75f)
                curveToRelative(-0.2f, 0.93f, -0.31f, 1.96f, -0.33f, 3.09f)
                curveToRelative(0.12f, 6.83f, 3.7f, 10.46f, 10.35f, 10.5f)
                horizontalLineToRelative(3.23f)
                curveToRelative(0.4f, 0f, 0.77f, -0.24f, 0.92f, -0.61f)
                reflectiveCurveToRelative(0.07f, -0.8f, -0.21f, -1.09f)
                lineTo(3.02f, 7.79f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.57f, 20.44f)
                lineToRelative(-1.15f, -1.16f)
                verticalLineToRelative(-7.78f)
                curveToRelative(-0.12f, -6.73f, -3.79f, -10.46f, -10.35f, -10.5f)
                curveToRelative(-2.5f, 0.02f, -4.57f, 0.55f, -6.2f, 1.58f)
                lineToRelative(-1.09f, -1.1f)
                curveToRelative(-0.58f, -0.59f, -1.53f, -0.59f, -2.12f, -0.01f)
                curveToRelative(-0.59f, 0.58f, -0.59f, 1.53f, -0.01f, 2.12f)
                lineTo(20.43f, 22.56f)
                curveToRelative(0.29f, 0.3f, 1.17f, 0.86f, 2.12f, 0.01f)
                curveToRelative(0.62f, -0.55f, 0.59f, -1.53f, 0.01f, -2.12f)
                close()
            }
        }.also { _CommentSlash = it}
