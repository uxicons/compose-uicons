package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentText: ImageVector? = null

val Icons.Bs.CommentText: ImageVector
    get() = _CommentText ?: UXIcon(name = "CommentText") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                horizontalLineToRelative(12f)
                lineTo(24f, 12f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                close()
                moveTo(21f, 21f)
                lineTo(12f, 21f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                reflectiveCurveTo(7.04f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                verticalLineToRelative(9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.5f, 12f)
                lineToRelative(3f, 0f)
                lineToRelative(0f, -2f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, 5.5f)
                lineToRelative(-1.5f, 0f)
                lineToRelative(0f, 3f)
                lineToRelative(6f, 0f)
                lineToRelative(0f, -3f)
                lineToRelative(-1.5f, 0f)
                lineToRelative(0f, -5.5f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(3f, 0f)
                lineToRelative(0f, -5f)
                lineToRelative(-13f, 0f)
                lineToRelative(0f, 5f)
                close()
            }
        }.also { _CommentText = it}
