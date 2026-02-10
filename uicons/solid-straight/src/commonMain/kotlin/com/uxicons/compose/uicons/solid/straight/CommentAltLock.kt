package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentAltLock: ImageVector? = null

val Icons.Ss.CommentAltLock: ImageVector
    get() = _CommentAltLock ?: UXIcon(name = "CommentAltLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 4f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(5f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-7f)
                close()
                moveTo(6.5f, 10f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(7f, 4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(24f, 12f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-12f)
                curveToRelative(-5.48f, 0f, -10.1f, -3.69f, -11.53f, -8.71f)
                curveToRelative(0.74f, 0.44f, 1.6f, 0.71f, 2.53f, 0.71f)
                horizontalLineToRelative(5f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(-2.21f)
                curveToRelative(-0.19f, -0.66f, -0.51f, -1.26f, -0.91f, -1.8f)
                curveToRelative(0.69f, -0.12f, 1.4f, -0.2f, 2.12f, -0.2f)
                curveToRelative(6.62f, 0f, 12f, 5.38f, 12f, 12f)
                close()
            }
        }.also { _CommentAltLock = it}
