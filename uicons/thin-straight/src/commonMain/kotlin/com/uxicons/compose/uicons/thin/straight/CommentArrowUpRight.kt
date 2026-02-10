package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentArrowUpRight: ImageVector? = null

val Icons.Ts.CommentArrowUpRight: ImageVector
    get() = _CommentArrowUpRight ?: UXIcon(name = "CommentArrowUpRight") {
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
                moveTo(17f, 9f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.08f, -0.01f, -0.16f, -0.03f, -0.23f)
                lineTo(7.75f, 16.99f)
                lineToRelative(-0.71f, -0.71f)
                lineTo(15.29f, 8.04f)
                curveToRelative(-0.08f, -0.02f, -0.17f, -0.04f, -0.26f, -0.04f)
                horizontalLineToRelative(-6.03f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(6.03f)
                curveToRelative(1.09f, 0f, 1.97f, 0.9f, 1.97f, 2f)
                close()
            }
        }.also { _CommentArrowUpRight = it}
