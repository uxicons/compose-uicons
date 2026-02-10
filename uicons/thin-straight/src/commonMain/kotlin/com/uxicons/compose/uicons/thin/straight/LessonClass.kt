package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LessonClass: ImageVector? = null

val Icons.Ts.LessonClass: ImageVector
    get() = _LessonClass ?: UXIcon(name = "LessonClass") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(5.88f, 0f, 4.5f, 0f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(4.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(6f, 9f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-7f)
                lineTo(0f, 17f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(12.5f)
                verticalLineToRelative(1f)
                lineTo(2.5f, 7f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-7f)
                close()
                moveTo(21.5f, 0f)
                horizontalLineToRelative(-13.26f)
                curveToRelative(0.21f, 0.31f, 0.37f, 0.64f, 0.49f, 1f)
                horizontalLineToRelative(12.77f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(15f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(16f, 13f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _LessonClass = it}
