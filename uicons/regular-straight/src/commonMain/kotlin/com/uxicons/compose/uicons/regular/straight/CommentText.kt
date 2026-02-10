package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentText: ImageVector? = null

val Icons.Rs.CommentText: ImageVector
    get() = _CommentText ?: UXIcon(name = "CommentText") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                horizontalLineToRelative(12f)
                lineTo(24f, 12f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                close()
                moveTo(22f, 22f)
                lineTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                verticalLineToRelative(10f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 11f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, -2f)
                lineToRelative(3f, 0f)
                lineToRelative(0f, 8f)
                lineToRelative(-2f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(6f, 0f)
                lineToRelative(0f, -2f)
                lineToRelative(-2f, 0f)
                lineToRelative(0f, -8f)
                lineToRelative(3f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, -4f)
                lineToRelative(-12f, 0f)
                lineToRelative(0f, 4f)
                close()
            }
        }.also { _CommentText = it}
