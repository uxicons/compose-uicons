package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lesson: ImageVector? = null

val Icons.Ss.Lesson: ImageVector
    get() = _Lesson ?: UXIcon(name = "Lesson") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(3.5f, 5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(7.5f, 5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(13.24f, 10.36f)
                lineToRelative(5.76f, 3.64f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6.74f)
                lineToRelative(-3.76f, 2.38f)
                curveToRelative(-0.76f, 0.48f, -1.72f, 0.48f, -2.47f, 0f)
                lineToRelative(-5.76f, -3.64f)
                lineToRelative(5.76f, -3.64f)
                curveToRelative(0.76f, -0.48f, 1.72f, -0.48f, 2.47f, 0f)
                close()
                moveTo(14.3f, 19.33f)
                lineToRelative(1.7f, -1.07f)
                verticalLineToRelative(4.28f)
                reflectiveCurveToRelative(-1.14f, 1.46f, -4f, 1.46f)
                reflectiveCurveToRelative(-4f, -1.46f, -4f, -1.46f)
                verticalLineToRelative(-4.28f)
                lineToRelative(1.7f, 1.07f)
                curveToRelative(0.7f, 0.44f, 1.5f, 0.66f, 2.3f, 0.66f)
                reflectiveCurveToRelative(1.6f, -0.22f, 2.31f, -0.66f)
                close()
                moveTo(3f, 15.1f)
                lineToRelative(3f, 1.9f)
                verticalLineToRelative(5.0f)
                lineTo(0f, 22f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(9.17f)
                lineToRelative(-6.17f, 3.9f)
                verticalLineToRelative(2.2f)
                close()
                moveTo(24f, 9f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-9.1f)
                lineToRelative(-6.17f, -3.9f)
                horizontalLineToRelative(9.17f)
                close()
            }
        }.also { _Lesson = it}
