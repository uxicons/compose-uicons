package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentXmark: ImageVector? = null

val Icons.Tc.CommentXmark: ImageVector
    get() = _CommentXmark ?: UXIcon(name = "CommentXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.0f, 1f)
                horizontalLineToRelative(-0.01f)
                curveTo(4.93f, 1.04f, 1.13f, 4.84f, 1.0f, 12.01f)
                curveToRelative(0.13f, 7.25f, 3.83f, 10.95f, 11.0f, 10.99f)
                horizontalLineToRelative(10.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(23.0f, 11.99f)
                curveToRelative(-0.12f, -7.04f, -4.03f, -10.95f, -10.99f, -10.99f)
                close()
                moveTo(22.0f, 22f)
                lineTo(12.0f, 22f)
                curveToRelative(-6.61f, -0.04f, -9.88f, -3.31f, -10f, -9.99f)
                curveToRelative(0.12f, -6.6f, 3.48f, -9.97f, 10.0f, -10.01f)
                curveToRelative(4.48f, 0.03f, 9.86f, 1.79f, 10.0f, 10f)
                verticalLineToRelative(10f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.46f, 8.54f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                lineToRelative(-2.76f, 2.75f)
                lineToRelative(-2.76f, -2.75f)
                curveToRelative(-0.2f, -0.19f, -0.51f, -0.2f, -0.71f, 0f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(2.76f, 2.75f)
                lineToRelative(-2.76f, 2.75f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.52f, 0f, 0.71f)
                curveToRelative(0.29f, 0.28f, 0.61f, 0.1f, 0.71f, 0f)
                lineToRelative(2.76f, -2.75f)
                lineToRelative(2.76f, 2.75f)
                curveToRelative(0.1f, 0.1f, 0.43f, 0.28f, 0.71f, 0f)
                curveToRelative(0.19f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(-2.76f, -2.75f)
                lineToRelative(2.76f, -2.75f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                close()
            }
        }.also { _CommentXmark = it}
