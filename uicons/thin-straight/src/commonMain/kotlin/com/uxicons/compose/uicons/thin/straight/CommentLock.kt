package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentLock: ImageVector? = null

val Icons.Ts.CommentLock: ImageVector
    get() = _CommentLock ?: UXIcon(name = "CommentLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 2.5f)
                verticalLineToRelative(19.85f)
                curveToRelative(0.02f, 0.89f, -0.77f, 1.67f, -1.65f, 1.65f)
                curveToRelative(-0.32f, 0f, -0.64f, -0.09f, -0.91f, -0.28f)
                lineToRelative(-4.61f, -3.72f)
                horizontalLineToRelative(-16.82f)
                verticalLineToRelative(-5.76f)
                curveToRelative(0.31f, 0.21f, 0.64f, 0.37f, 1f, 0.49f)
                verticalLineToRelative(4.27f)
                horizontalLineToRelative(16.18f)
                lineToRelative(4.85f, 3.92f)
                curveToRelative(0.17f, 0.11f, 0.41f, 0.12f, 0.63f, 0.0f)
                curveToRelative(0.21f, -0.11f, 0.34f, -0.33f, 0.34f, -0.57f)
                verticalLineToRelative(-19.85f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-11.93f)
                curveToRelative(-0.16f, -0.36f, -0.36f, -0.69f, -0.59f, -1f)
                horizontalLineToRelative(12.53f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(0f, 10.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(3f, 4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                close()
                moveTo(1f, 10.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(5f, 9.5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
            }
        }.also { _CommentLock = it}
