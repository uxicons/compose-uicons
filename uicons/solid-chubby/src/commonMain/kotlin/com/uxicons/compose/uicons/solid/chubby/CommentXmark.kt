package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentXmark: ImageVector? = null

val Icons.Sc.CommentXmark: ImageVector
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
                moveTo(15.66f, 15.66f)
                curveToRelative(-0.61f, 0.58f, -1.22f, 0.2f, -1.41f, 0f)
                lineToRelative(-2.25f, -2.25f)
                lineToRelative(-2.25f, 2.25f)
                curveToRelative(-0.2f, 0.2f, -0.76f, 0.56f, -1.41f, 0f)
                curveToRelative(-0.42f, -0.36f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(2.25f, -2.25f)
                lineToRelative(-2.25f, -2.25f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(2.25f, 2.25f)
                lineToRelative(2.25f, -2.25f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-2.25f, 2.25f)
                lineToRelative(2.25f, 2.25f)
                curveToRelative(0.39f, 0.39f, 0.4f, 1.03f, 0f, 1.41f)
                close()
            }
        }.also { _CommentXmark = it}
