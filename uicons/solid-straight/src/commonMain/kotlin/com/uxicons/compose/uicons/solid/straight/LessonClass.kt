package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LessonClass: ImageVector? = null

val Icons.Ss.LessonClass: ImageVector
    get() = _LessonClass ?: UXIcon(name = "LessonClass") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(15f, 6f)
                lineTo(3f, 6f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                lineTo(8f, 8f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2f)
                close()
                moveTo(21f, 0f)
                lineTo(7.6f, 0f)
                curveToRelative(0.56f, 0.69f, 0.9f, 1.55f, 0.9f, 2.5f)
                curveToRelative(0f, 0.53f, -0.11f, 1.04f, -0.3f, 1.5f)
                horizontalLineToRelative(8.8f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
            }
        }.also { _LessonClass = it}
