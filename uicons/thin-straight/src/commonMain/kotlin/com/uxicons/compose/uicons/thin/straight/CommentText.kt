package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentText: ImageVector? = null

val Icons.Ts.CommentText: ImageVector
    get() = _CommentText ?: UXIcon(name = "CommentText") {
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
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 10f)
                lineToRelative(1f, 0f)
                lineToRelative(0f, -2f)
                lineToRelative(4f, 0f)
                lineToRelative(0f, 9f)
                lineToRelative(-2f, 0f)
                lineToRelative(0f, 1f)
                lineToRelative(5f, 0f)
                lineToRelative(0f, -1f)
                lineToRelative(-2f, 0f)
                lineToRelative(0f, -9f)
                lineToRelative(4f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(1f, 0f)
                lineToRelative(0f, -3f)
                lineToRelative(-11f, 0f)
                lineToRelative(0f, 3f)
                close()
            }
        }.also { _CommentText = it}
