package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentSmile: ImageVector? = null

val Icons.Ts.CommentSmile: ImageVector
    get() = _CommentSmile ?: UXIcon(name = "CommentSmile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.67f, 14.13f)
                lineToRelative(0.67f, 0.75f)
                curveToRelative(-0.1f, 0.09f, -2.41f, 2.13f, -5.33f, 2.13f)
                reflectiveCurveToRelative(-5.24f, -2.04f, -5.33f, -2.13f)
                lineToRelative(0.67f, -0.75f)
                curveToRelative(0.02f, 0.02f, 2.14f, 1.87f, 4.67f, 1.87f)
                reflectiveCurveToRelative(4.65f, -1.85f, 4.67f, -1.87f)
                close()
                moveTo(24f, 12f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-12f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, -6.07f, -4.93f, -11f, -11f, -11f)
                reflectiveCurveTo(1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-11f)
                close()
                moveTo(8f, 11f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(16f, 11f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
            }
        }.also { _CommentSmile = it}
