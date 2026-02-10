package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentClock: ImageVector? = null

val Icons.Ss.CommentClock: ImageVector
    get() = _CommentClock ?: UXIcon(name = "CommentClock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                close()
                moveTo(20.29f, 7.71f)
                lineTo(18f, 5.41f)
                verticalLineToRelative(-3.41f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.59f)
                lineToRelative(1.71f, 1.71f)
                close()
                moveTo(19f, 12f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                curveToRelative(0f, -1.96f, 0.81f, -3.73f, 2.11f, -5f)
                horizontalLineToRelative(-11.11f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(6.92f)
                lineToRelative(3.75f, 3.16f)
                curveToRelative(0.38f, 0.34f, 0.86f, 0.51f, 1.34f, 0.51f)
                curveToRelative(0.47f, 0f, 0.93f, -0.16f, 1.29f, -0.48f)
                lineToRelative(3.85f, -3.18f)
                horizontalLineToRelative(6.85f)
                verticalLineToRelative(-10.11f)
                curveToRelative(-1.27f, 1.3f, -3.04f, 2.11f, -5f, 2.11f)
                close()
                moveTo(5.5f, 12f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(10.5f, 12f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _CommentClock = it}
