package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentArrowUp: ImageVector? = null

val Icons.Ts.CommentArrowUp: ImageVector
    get() = _CommentArrowUp ?: UXIcon(name = "CommentArrowUp") {
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
                moveTo(13.46f, 6.59f)
                lineToRelative(3.89f, 3.89f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-3.89f, -3.89f)
                curveToRelative(-0.08f, -0.08f, -0.16f, -0.14f, -0.26f, -0.18f)
                verticalLineToRelative(10.89f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 7.16f)
                curveToRelative(-0.05f, 0.03f, -0.09f, 0.07f, -0.14f, 0.11f)
                lineToRelative(-3.91f, 3.91f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(3.91f, -3.91f)
                curveToRelative(0.77f, -0.77f, 2.03f, -0.76f, 2.81f, 0.02f)
                close()
            }
        }.also { _CommentArrowUp = it}
