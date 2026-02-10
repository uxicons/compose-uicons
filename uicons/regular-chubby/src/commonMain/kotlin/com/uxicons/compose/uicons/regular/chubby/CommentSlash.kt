package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentSlash: ImageVector? = null

val Icons.Rc.CommentSlash: ImageVector
    get() = _CommentSlash ?: UXIcon(name = "CommentSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.67f, 19.88f)
                horizontalLineToRelative(-3.25f)
                curveToRelative(-5.64f, -0.03f, -8.31f, -2.71f, -8.42f, -8.4f)
                curveToRelative(0.02f, -0.96f, 0.11f, -1.85f, 0.28f, -2.64f)
                curveToRelative(0.12f, -0.54f, -0.23f, -1.07f, -0.77f, -1.19f)
                curveToRelative(-0.55f, -0.12f, -1.07f, 0.23f, -1.19f, 0.77f)
                curveToRelative(-0.2f, 0.92f, -0.31f, 1.94f, -0.33f, 3.06f)
                curveToRelative(0.12f, 6.77f, 3.72f, 10.36f, 10.41f, 10.4f)
                horizontalLineToRelative(3.26f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.7f, 21.25f)
                lineToRelative(-0.88f, -0.87f)
                verticalLineTo(11.44f)
                curveToRelative(-0.12f, -6.67f, -3.81f, -10.36f, -10.42f, -10.4f)
                curveToRelative(-2.92f, 0.02f, -5.26f, 0.72f, -6.98f, 2.08f)
                lineToRelative(-1.13f, -1.12f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.01f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.01f, 1.41f)
                lineTo(21.3f, 22.67f)
                curveToRelative(0.2f, 0.19f, 0.79f, 0.57f, 1.41f, -0.01f)
                curveToRelative(0.38f, -0.35f, 0.39f, -1.02f, -0.01f, -1.41f)
                close()
                moveTo(11.4f, 3.04f)
                curveToRelative(5.49f, 0.04f, 8.32f, 2.88f, 8.42f, 8.42f)
                verticalLineToRelative(6.94f)
                lineTo(5.86f, 4.54f)
                curveToRelative(1.35f, -0.98f, 3.22f, -1.49f, 5.54f, -1.5f)
                close()
            }
        }.also { _CommentSlash = it}
