package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentArrowUpRight: ImageVector? = null

val Icons.Sr.CommentArrowUpRight: ImageVector
    get() = _CommentArrowUpRight ?: UXIcon(name = "CommentArrowUpRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.84f, 0.03f)
                curveTo(9.37f, -0.2f, 5.96f, 1.06f, 3.51f, 3.52f)
                curveTo(1.06f, 5.98f, -0.21f, 9.38f, 0.03f, 12.85f)
                curveToRelative(0.44f, 6.35f, 6.05f, 11.15f, 13.05f, 11.15f)
                horizontalLineToRelative(5.92f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-6.66f)
                curveTo(24f, 5.86f, 19.1f, 0.45f, 12.84f, 0.03f)
                close()
                moveTo(17f, 14f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3.56f)
                lineToRelative(-6.29f, 6.27f)
                curveToRelative(-0.2f, 0.19f, -0.45f, 0.29f, -0.71f, 0.29f)
                curveToRelative(-0.26f, 0f, -0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(6.32f, -6.29f)
                horizontalLineToRelative(-3.61f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _CommentArrowUpRight = it}
