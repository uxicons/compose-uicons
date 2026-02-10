package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentPen: ImageVector? = null

val Icons.Ts.CommentPen: ImageVector
    get() = _CommentPen ?: UXIcon(name = "CommentPen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                lineTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                verticalLineToRelative(12f)
                close()
                moveTo(12f, 1f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                horizontalLineToRelative(11f)
                lineTo(23f, 12f)
                curveToRelative(0f, -6.07f, -4.93f, -11f, -11f, -11f)
                close()
                moveTo(9.82f, 18f)
                horizontalLineToRelative(-3.82f)
                verticalLineToRelative(-3.82f)
                lineToRelative(7.39f, -7.39f)
                curveToRelative(1.02f, -1.02f, 2.8f, -1.02f, 3.82f, 0f)
                curveToRelative(0.51f, 0.51f, 0.79f, 1.19f, 0.79f, 1.91f)
                reflectiveCurveToRelative(-0.28f, 1.4f, -0.79f, 1.91f)
                lineToRelative(-7.39f, 7.39f)
                close()
                moveTo(7f, 17f)
                horizontalLineToRelative(2.4f)
                lineToRelative(7.1f, -7.1f)
                curveToRelative(0.32f, -0.32f, 0.5f, -0.75f, 0.5f, -1.2f)
                reflectiveCurveToRelative(-0.18f, -0.88f, -0.5f, -1.2f)
                curveToRelative(-0.66f, -0.66f, -1.74f, -0.66f, -2.4f, 0f)
                lineToRelative(-7.1f, 7.1f)
                verticalLineToRelative(2.4f)
                close()
            }
        }.also { _CommentPen = it}
