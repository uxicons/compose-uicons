package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentCode: ImageVector? = null

val Icons.Bs.CommentCode: ImageVector
    get() = _CommentCode ?: UXIcon(name = "CommentCode") {
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
                moveTo(18.27f, 13.76f)
                curveToRelative(0.97f, -0.97f, 0.97f, -2.55f, 0f, -3.52f)
                lineToRelative(-3.3f, -3.3f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(2.94f, 2.94f)
                lineToRelative(-2.94f, 2.94f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(3.3f, -3.3f)
                close()
                moveTo(11.15f, 14.94f)
                lineToRelative(-2.94f, -2.94f)
                lineToRelative(2.94f, -2.94f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-3.3f, 3.3f)
                curveToRelative(-0.97f, 0.97f, -0.97f, 2.55f, 0f, 3.52f)
                lineToRelative(3.3f, 3.3f)
                lineToRelative(2.12f, -2.12f)
                close()
            }
        }.also { _CommentCode = it}
