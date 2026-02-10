package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentLock: ImageVector? = null

val Icons.Rr.CommentLock: ImageVector
    get() = _CommentLock ?: UXIcon(name = "CommentLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 9f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(0f, 10f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.47f, 0.81f, -2.75f, 2f, -3.44f)
                verticalLineToRelative(-1.06f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(1.06f)
                curveToRelative(1.19f, 0.69f, 2f, 1.97f, 2f, 3.44f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-3f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                close()
                moveTo(4f, 4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(2f, 10f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                close()
                moveTo(19f, 0f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(7f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(16.85f)
                curveToRelative(0f, 0.15f, -0.17f, 0.17f, -0.18f, 0.16f)
                lineToRelative(-4.7f, -3.79f)
                curveToRelative(-0.18f, -0.14f, -0.4f, -0.22f, -0.63f, -0.22f)
                horizontalLineToRelative(-11.5f)
                curveToRelative(-1.37f, 0f, -2.56f, -0.93f, -2.91f, -2.25f)
                curveToRelative(-0.14f, -0.53f, -0.68f, -0.86f, -1.22f, -0.72f)
                curveToRelative(-0.54f, 0.14f, -0.86f, 0.68f, -0.72f, 1.22f)
                curveToRelative(0.57f, 2.21f, 2.56f, 3.75f, 4.84f, 3.75f)
                horizontalLineToRelative(11.15f)
                lineToRelative(4.51f, 3.64f)
                curveToRelative(0.66f, 0.44f, 1.51f, 0.48f, 2.21f, 0.11f)
                curveToRelative(0.7f, -0.37f, 1.14f, -1.1f, 1.14f, -1.89f)
                verticalLineToRelative(-16.85f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
            }
        }.also { _CommentLock = it}
