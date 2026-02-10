package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentPen: ImageVector? = null

val Icons.Rr.CommentPen: ImageVector
    get() = _CommentPen ?: UXIcon(name = "CommentPen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.59f, 18f)
                horizontalLineToRelative(-1.59f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.59f)
                curveToRelative(0f, -1.07f, 0.42f, -2.07f, 1.17f, -2.83f)
                lineToRelative(5.71f, -5.71f)
                curveToRelative(1.17f, -1.17f, 3.07f, -1.17f, 4.24f, 0f)
                curveToRelative(0.57f, 0.57f, 0.88f, 1.32f, 0.88f, 2.12f)
                reflectiveCurveToRelative(-0.31f, 1.55f, -0.88f, 2.12f)
                lineToRelative(-5.71f, 5.71f)
                curveToRelative(-0.76f, 0.76f, -1.76f, 1.17f, -2.83f, 1.17f)
                close()
                moveTo(8f, 16f)
                horizontalLineToRelative(0.59f)
                curveToRelative(0.53f, 0f, 1.04f, -0.21f, 1.41f, -0.59f)
                lineToRelative(5.71f, -5.71f)
                curveToRelative(0.19f, -0.19f, 0.29f, -0.44f, 0.29f, -0.71f)
                reflectiveCurveToRelative(-0.1f, -0.52f, -0.29f, -0.71f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-5.71f, 5.71f)
                curveToRelative(-0.37f, 0.37f, -0.59f, 0.89f, -0.59f, 1.41f)
                verticalLineToRelative(0.59f)
                close()
                moveTo(19f, 24f)
                horizontalLineToRelative(-5.92f)
                curveTo(6.08f, 24f, 0.47f, 19.21f, 0.03f, 12.85f)
                curveTo(-0.21f, 9.38f, 1.06f, 5.98f, 3.51f, 3.52f)
                curveTo(5.96f, 1.06f, 9.37f, -0.2f, 12.84f, 0.03f)
                curveToRelative(6.26f, 0.42f, 11.16f, 5.83f, 11.16f, 12.31f)
                verticalLineToRelative(6.66f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                close()
                moveTo(12.02f, 2.0f)
                curveToRelative(-2.66f, 0f, -5.21f, 1.05f, -7.09f, 2.93f)
                curveToRelative(-2.04f, 2.05f, -3.1f, 4.88f, -2.9f, 7.78f)
                curveToRelative(0.37f, 5.38f, 5.02f, 9.29f, 11.06f, 9.29f)
                horizontalLineToRelative(5.92f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-6.66f)
                curveToRelative(0f, -5.43f, -4.08f, -9.96f, -9.3f, -10.32f)
                curveToRelative(-0.23f, -0.02f, -0.46f, -0.02f, -0.69f, -0.02f)
                close()
            }
        }.also { _CommentPen = it}
