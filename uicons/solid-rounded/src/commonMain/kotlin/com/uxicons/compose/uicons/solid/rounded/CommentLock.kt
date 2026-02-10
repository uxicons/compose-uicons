package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentLock: ImageVector? = null

val Icons.Sr.CommentLock: ImageVector
    get() = _CommentLock ?: UXIcon(name = "CommentLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 4.56f)
                verticalLineToRelative(-1.06f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(1.06f)
                curveToRelative(-1.19f, 0.69f, -2f, 1.97f, -2f, 3.44f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(3f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.47f, -0.81f, -2.75f, -2f, -3.44f)
                close()
                moveTo(5.5f, 10.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(7f, 4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(24f, 5.0f)
                verticalLineToRelative(16.85f)
                curveToRelative(0f, 0.79f, -0.43f, 1.52f, -1.13f, 1.89f)
                curveToRelative(-0.7f, 0.38f, -1.54f, 0.34f, -2.21f, -0.1f)
                lineToRelative(-4.51f, -3.64f)
                horizontalLineToRelative(-11.15f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-0.54f)
                curveToRelative(1.06f, 0.95f, 2.46f, 1.54f, 4f, 1.54f)
                horizontalLineToRelative(3f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.7f, -0.74f, -3.32f, -2f, -4.45f)
                verticalLineToRelative(-0.05f)
                curveToRelative(0f, -1.33f, -0.47f, -2.55f, -1.26f, -3.5f)
                horizontalLineToRelative(9.26f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5.0f)
                close()
            }
        }.also { _CommentLock = it}
