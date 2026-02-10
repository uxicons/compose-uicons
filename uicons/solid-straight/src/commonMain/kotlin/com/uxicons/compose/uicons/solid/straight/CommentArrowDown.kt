package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentArrowDown: ImageVector? = null

val Icons.Ss.CommentArrowDown: ImageVector
    get() = _CommentArrowDown ?: UXIcon(name = "CommentArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                horizontalLineToRelative(12f)
                lineTo(24f, 12f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                close()
                moveTo(13.82f, 17.27f)
                curveToRelative(-0.49f, 0.49f, -1.14f, 0.74f, -1.78f, 0.74f)
                curveToRelative(-0.63f, 0f, -1.26f, -0.24f, -1.74f, -0.72f)
                lineToRelative(-3.91f, -3.91f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.19f, 3.19f)
                lineTo(11.0f, 6f)
                horizontalLineToRelative(2f)
                lineTo(13.0f, 15.26f)
                lineToRelative(3.29f, -3.29f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.89f, 3.89f)
                close()
            }
        }.also { _CommentArrowDown = it}
