package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentPen: ImageVector? = null

val Icons.Bs.CommentPen: ImageVector
    get() = _CommentPen ?: UXIcon(name = "CommentPen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                lineTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                verticalLineToRelative(12f)
                close()
                moveTo(12f, 3f)
                curveTo(7.04f, 3f, 3f, 7.04f, 3f, 12f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                horizontalLineToRelative(9f)
                lineTo(21f, 12f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                close()
                moveTo(16.36f, 10.72f)
                curveToRelative(0.85f, -0.85f, 0.85f, -2.23f, 0f, -3.09f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.85f, -0.85f, -2.23f, -0.85f, -3.09f, 0f)
                lineToRelative(-6.28f, 6.28f)
                verticalLineToRelative(3.09f)
                horizontalLineToRelative(3.09f)
                lineToRelative(6.28f, -6.28f)
                close()
            }
        }.also { _CommentPen = it}
