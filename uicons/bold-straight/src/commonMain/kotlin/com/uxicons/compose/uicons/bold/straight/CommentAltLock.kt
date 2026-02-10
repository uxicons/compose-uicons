package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentAltLock: ImageVector? = null

val Icons.Bs.CommentAltLock: ImageVector
    get() = _CommentAltLock ?: UXIcon(name = "CommentAltLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 12f)
                horizontalLineToRelative(6f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                close()
                moveTo(4f, 3.5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(4f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(24f, 12f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-12f)
                curveToRelative(-4.41f, 0f, -8.45f, -2.41f, -10.55f, -6.28f)
                curveToRelative(-0.71f, -1.31f, -1.17f, -2.74f, -1.35f, -4.22f)
                curveToRelative(0.57f, 0.31f, 1.21f, 0.51f, 1.91f, 0.51f)
                horizontalLineToRelative(1.24f)
                curveToRelative(0.18f, 0.8f, 0.46f, 1.57f, 0.85f, 2.28f)
                curveToRelative(1.58f, 2.91f, 4.61f, 4.72f, 7.92f, 4.72f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                curveToRelative(-0.01f, 0f, -0.02f, 0.0f, -0.03f, 0.0f)
                curveToRelative(-0.08f, -1.07f, -0.39f, -2.08f, -0.9f, -2.96f)
                curveToRelative(0.3f, -0.02f, 0.61f, -0.04f, 0.92f, -0.04f)
                curveToRelative(6.62f, 0f, 12f, 5.38f, 12f, 12f)
                close()
            }
        }.also { _CommentAltLock = it}
