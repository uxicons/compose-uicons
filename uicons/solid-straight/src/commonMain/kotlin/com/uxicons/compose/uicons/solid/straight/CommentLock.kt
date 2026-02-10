package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentLock: ImageVector? = null

val Icons.Ss.CommentLock: ImageVector
    get() = _CommentLock ?: UXIcon(name = "CommentLock") {
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
                moveTo(24f, 3f)
                verticalLineToRelative(18.85f)
                curveToRelative(0.03f, 1.16f, -1.0f, 2.17f, -2.15f, 2.15f)
                curveToRelative(-0.42f, 0f, -0.83f, -0.12f, -1.19f, -0.36f)
                lineToRelative(-4.51f, -3.64f)
                horizontalLineToRelative(-16.15f)
                verticalLineToRelative(-5.03f)
                curveToRelative(0.84f, 0.64f, 1.87f, 1.03f, 3f, 1.03f)
                horizontalLineToRelative(5f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(-2.21f)
                curveToRelative(-0.21f, -0.75f, -0.59f, -1.42f, -1.07f, -2f)
                horizontalLineToRelative(11.28f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
            }
        }.also { _CommentLock = it}
