package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentArrowDown: ImageVector? = null

val Icons.Sr.CommentArrowDown: ImageVector
    get() = _CommentArrowDown ?: UXIcon(name = "CommentArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.84f, 0.03f)
                curveTo(9.37f, -0.21f, 5.96f, 1.06f, 3.51f, 3.52f)
                reflectiveCurveTo(-0.21f, 9.38f, 0.03f, 12.85f)
                curveToRelative(0.44f, 6.35f, 6.05f, 11.15f, 13.05f, 11.15f)
                horizontalLineToRelative(5.92f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-6.66f)
                curveTo(24f, 5.86f, 19.1f, 0.45f, 12.84f, 0.03f)
                close()
                moveTo(16.71f, 14.59f)
                lineToRelative(-2.54f, 2.54f)
                curveToRelative(-0.58f, 0.58f, -1.35f, 0.88f, -2.12f, 0.88f)
                horizontalLineToRelative(-0.05f)
                curveToRelative(-0.02f, 0f, -0.04f, -0.0f, -0.06f, -0.0f)
                curveToRelative(-0.73f, -0.03f, -1.45f, -0.32f, -2.01f, -0.87f)
                lineToRelative(-2.64f, -2.64f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(2.29f, 2.29f)
                lineTo(11f, 7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                lineTo(13f, 15.47f)
                lineToRelative(2.29f, -2.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                close()
            }
        }.also { _CommentArrowDown = it}
