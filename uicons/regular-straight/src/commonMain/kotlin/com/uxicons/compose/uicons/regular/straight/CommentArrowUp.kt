package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentArrowUp: ImageVector? = null

val Icons.Rs.CommentArrowUp: ImageVector
    get() = _CommentArrowUp ?: UXIcon(name = "CommentArrowUp") {
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
                moveTo(13.82f, 6.73f)
                lineToRelative(3.89f, 3.89f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-3.29f, -3.29f)
                verticalLineToRelative(9.26f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 8.85f)
                lineToRelative(-3.19f, 3.19f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(3.91f, -3.91f)
                curveToRelative(0.96f, -0.96f, 2.54f, -0.95f, 3.52f, 0.02f)
                close()
            }
        }.also { _CommentArrowUp = it}
