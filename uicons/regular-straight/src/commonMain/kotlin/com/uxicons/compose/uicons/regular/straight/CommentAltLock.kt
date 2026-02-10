package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentAltLock: ImageVector? = null

val Icons.Rs.CommentAltLock: ImageVector
    get() = _CommentAltLock ?: UXIcon(name = "CommentAltLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-12f)
                curveToRelative(-5.48f, 0f, -10.1f, -3.69f, -11.53f, -8.71f)
                curveToRelative(0.7f, 0.41f, 1.5f, 0.67f, 2.36f, 0.69f)
                curveToRelative(1.54f, 3.54f, 5.07f, 6.02f, 9.17f, 6.02f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -5.51f, -4.49f, -10f, -10f, -10f)
                horizontalLineToRelative(-1.21f)
                curveToRelative(-0.19f, -0.66f, -0.51f, -1.26f, -0.91f, -1.8f)
                curveToRelative(0.69f, -0.12f, 1.4f, -0.2f, 2.13f, -0.2f)
                curveToRelative(6.62f, 0f, 12f, 5.38f, 12f, 12f)
                close()
                moveTo(0f, 11f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                close()
                moveTo(4f, 4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(2f, 11f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-7f)
                close()
                moveTo(6.5f, 8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _CommentAltLock = it}
