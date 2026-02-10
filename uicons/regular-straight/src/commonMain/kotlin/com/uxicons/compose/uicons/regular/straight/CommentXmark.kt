package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentXmark: ImageVector? = null

val Icons.Rs.CommentXmark: ImageVector
    get() = _CommentXmark ?: UXIcon(name = "CommentXmark") {
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
                moveTo(16.46f, 8.96f)
                lineToRelative(-3.04f, 3.04f)
                lineToRelative(3.04f, 3.04f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-3.04f, -3.04f)
                lineToRelative(-3.04f, 3.04f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(3.04f, -3.04f)
                lineToRelative(-3.04f, -3.04f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.04f, 3.04f)
                lineToRelative(3.04f, -3.04f)
                lineToRelative(1.41f, 1.41f)
                close()
            }
        }.also { _CommentXmark = it}
