package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentImage: ImageVector? = null

val Icons.Ss.CommentImage: ImageVector
    get() = _CommentImage ?: UXIcon(name = "CommentImage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                horizontalLineToRelative(12f)
                lineTo(24f, 12f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                close()
                moveTo(6.5f, 7f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(15f, 16.41f)
                lineToRelative(-4f, -4f)
                lineToRelative(-6.35f, 6.35f)
                curveToRelative(-0.46f, -0.5f, -0.86f, -1.04f, -1.21f, -1.62f)
                lineToRelative(7.56f, -7.56f)
                lineToRelative(4f, 4f)
                lineToRelative(5.97f, -5.97f)
                curveToRelative(0.32f, 0.66f, 0.57f, 1.35f, 0.75f, 2.08f)
                lineToRelative(-6.72f, 6.72f)
                close()
            }
        }.also { _CommentImage = it}
