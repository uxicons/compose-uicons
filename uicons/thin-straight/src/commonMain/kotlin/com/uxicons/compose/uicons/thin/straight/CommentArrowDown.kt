package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentArrowDown: ImageVector? = null

val Icons.Ts.CommentArrowDown: ImageVector
    get() = _CommentArrowDown ?: UXIcon(name = "CommentArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                horizontalLineToRelative(12f)
                lineTo(24f, 12f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                close()
                moveTo(23f, 23f)
                lineTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                verticalLineToRelative(11f)
                close()
                moveTo(16.65f, 12.82f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-3.89f, 3.89f)
                curveToRelative(-0.39f, 0.39f, -0.91f, 0.59f, -1.42f, 0.59f)
                curveToRelative(-0.5f, 0f, -1.0f, -0.19f, -1.39f, -0.57f)
                lineToRelative(-3.91f, -3.91f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.91f, 3.91f)
                curveToRelative(0.04f, 0.04f, 0.09f, 0.08f, 0.14f, 0.11f)
                lineTo(11.5f, 6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(10.89f)
                curveToRelative(0.09f, -0.05f, 0.18f, -0.11f, 0.26f, -0.19f)
                lineToRelative(3.89f, -3.89f)
                close()
            }
        }.also { _CommentArrowDown = it}
