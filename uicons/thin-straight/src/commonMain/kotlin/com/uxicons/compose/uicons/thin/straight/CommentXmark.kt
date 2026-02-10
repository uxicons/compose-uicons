package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentXmark: ImageVector? = null

val Icons.Ts.CommentXmark: ImageVector
    get() = _CommentXmark ?: UXIcon(name = "CommentXmark") {
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
                moveTo(16.85f, 7.85f)
                lineToRelative(-4.15f, 4.15f)
                lineToRelative(4.15f, 4.15f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-4.15f, -4.15f)
                lineToRelative(-4.15f, 4.15f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(4.15f, -4.15f)
                lineTo(7.15f, 7.85f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(4.15f, 4.15f)
                lineToRelative(4.15f, -4.15f)
                lineToRelative(0.71f, 0.71f)
                close()
            }
        }.also { _CommentXmark = it}
