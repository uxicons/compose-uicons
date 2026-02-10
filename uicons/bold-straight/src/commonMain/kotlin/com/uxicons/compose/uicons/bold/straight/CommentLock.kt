package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentLock: ImageVector? = null

val Icons.Bs.CommentLock: ImageVector
    get() = _CommentLock ?: UXIcon(name = "CommentLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3.51f)
                lineToRelative(-0.01f, 18.62f)
                curveToRelative(0f, 1.03f, -0.84f, 1.87f, -1.87f, 1.87f)
                curveToRelative(-0.25f, 0.01f, -0.51f, -0.07f, -0.75f, -0.14f)
                lineToRelative(-5.83f, -3.85f)
                horizontalLineToRelative(-15.55f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(13.45f)
                lineToRelative(4.54f, 3.0f)
                lineToRelative(0.01f, -16.5f)
                curveToRelative(0f, -0.27f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineToRelative(-8.5f, -0.0f)
                verticalLineToRelative(-3.0f)
                reflectiveCurveToRelative(8.5f, 0.0f, 8.5f, 0.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(0f, 10f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                close()
                moveTo(4f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                close()
                moveTo(4f, 9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _CommentLock = it}
