package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentPen: ImageVector? = null

val Icons.Sr.CommentPen: ImageVector
    get() = _CommentPen ?: UXIcon(name = "CommentPen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.71f, 8.29f)
                curveToRelative(0.19f, 0.19f, 0.29f, 0.44f, 0.29f, 0.71f)
                reflectiveCurveToRelative(-0.1f, 0.52f, -0.29f, 0.71f)
                lineToRelative(-5.71f, 5.71f)
                curveToRelative(-0.38f, 0.38f, -0.88f, 0.59f, -1.41f, 0.59f)
                horizontalLineToRelative(-0.59f)
                verticalLineToRelative(-0.59f)
                curveToRelative(0f, -0.53f, 0.21f, -1.04f, 0.59f, -1.41f)
                lineToRelative(5.71f, -5.71f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                close()
                moveTo(24f, 12.34f)
                verticalLineToRelative(6.66f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-5.92f)
                curveTo(6.08f, 24f, 0.47f, 19.21f, 0.03f, 12.85f)
                curveTo(-0.21f, 9.38f, 1.06f, 5.98f, 3.51f, 3.52f)
                curveTo(5.96f, 1.06f, 9.37f, -0.2f, 12.84f, 0.03f)
                curveToRelative(6.26f, 0.42f, 11.16f, 5.83f, 11.16f, 12.31f)
                close()
                moveTo(18f, 9f)
                curveToRelative(0f, -0.8f, -0.31f, -1.55f, -0.88f, -2.12f)
                curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0f)
                lineToRelative(-5.71f, 5.71f)
                curveToRelative(-0.76f, 0.76f, -1.17f, 1.76f, -1.17f, 2.83f)
                verticalLineToRelative(1.59f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.59f)
                curveToRelative(1.07f, 0f, 2.07f, -0.42f, 2.83f, -1.17f)
                lineToRelative(5.71f, -5.71f)
                curveToRelative(0.57f, -0.57f, 0.88f, -1.32f, 0.88f, -2.12f)
                close()
            }
        }.also { _CommentPen = it}
