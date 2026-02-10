package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentCode: ImageVector? = null

val Icons.Ts.CommentCode: ImageVector
    get() = _CommentCode ?: UXIcon(name = "CommentCode") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                lineTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                verticalLineToRelative(12f)
                close()
                moveTo(12f, 1f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                horizontalLineToRelative(11f)
                lineTo(23f, 12f)
                curveToRelative(0f, -6.07f, -4.93f, -11f, -11f, -11f)
                close()
                moveTo(9.98f, 16.18f)
                lineToRelative(-3.83f, -3.83f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(3.83f, -3.83f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-3.83f, 3.83f)
                curveToRelative(-0.58f, 0.58f, -0.58f, 1.54f, 0f, 2.12f)
                lineToRelative(3.83f, 3.83f)
                lineToRelative(0.71f, -0.71f)
                close()
                moveTo(18.56f, 13.06f)
                curveToRelative(0.58f, -0.58f, 0.58f, -1.54f, 0f, -2.12f)
                lineToRelative(-3.83f, -3.83f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(3.83f, 3.83f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(-3.83f, 3.83f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(3.83f, -3.83f)
                close()
            }
        }.also { _CommentCode = it}
