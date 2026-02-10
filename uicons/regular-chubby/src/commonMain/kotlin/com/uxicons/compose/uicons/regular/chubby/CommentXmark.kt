package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentXmark: ImageVector? = null

val Icons.Rc.CommentXmark: ImageVector
    get() = _CommentXmark ?: UXIcon(name = "CommentXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.01f, 1f)
                reflectiveCurveToRelative(-0.01f, 0f, -0.01f, 0f)
                curveTo(4.95f, 1.04f, 1.15f, 4.84f, 1.03f, 12.02f)
                curveToRelative(0.13f, 7.14f, 3.92f, 10.94f, 10.97f, 10.98f)
                horizontalLineToRelative(9.97f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                lineTo(22.97f, 11.98f)
                curveToRelative(-0.12f, -7.04f, -4.02f, -10.94f, -10.97f, -10.98f)
                close()
                moveTo(20.97f, 21f)
                lineTo(12.01f, 21f)
                curveToRelative(-6.01f, -0.04f, -8.87f, -2.9f, -8.98f, -8.98f)
                curveToRelative(0.11f, -6.03f, 3.04f, -8.98f, 8.97f, -9.02f)
                curveToRelative(5.85f, 0.04f, 8.87f, 3.07f, 8.97f, 9f)
                verticalLineToRelative(9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.66f, 8.34f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-2.25f, 2.25f)
                lineToRelative(-2.25f, -2.25f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(2.25f, 2.25f)
                lineToRelative(-2.25f, 2.25f)
                curveToRelative(-0.39f, 0.39f, -0.42f, 1.06f, 0f, 1.41f)
                curveToRelative(0.66f, 0.56f, 1.22f, 0.2f, 1.41f, 0f)
                lineToRelative(2.25f, -2.25f)
                lineToRelative(2.25f, 2.25f)
                curveToRelative(0.2f, 0.2f, 0.81f, 0.58f, 1.41f, 0f)
                curveToRelative(0.4f, -0.38f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-2.25f, -2.25f)
                lineToRelative(2.25f, -2.25f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
            }
        }.also { _CommentXmark = it}
