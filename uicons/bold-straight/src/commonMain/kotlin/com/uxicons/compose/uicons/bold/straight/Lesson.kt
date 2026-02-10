package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lesson: ImageVector? = null

val Icons.Bs.Lesson: ImageVector
    get() = _Lesson ?: UXIcon(name = "Lesson") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.24f, 11.36f)
                lineToRelative(5.76f, 3.64f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5.74f)
                lineToRelative(-3.76f, 2.38f)
                curveToRelative(-0.76f, 0.48f, -1.72f, 0.48f, -2.47f, 0f)
                lineToRelative(-5.76f, -3.64f)
                lineToRelative(5.76f, -3.64f)
                curveToRelative(0.76f, -0.48f, 1.72f, -0.48f, 2.47f, 0f)
                close()
                moveTo(24f, 3.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(-3f)
                lineTo(21f, 7f)
                lineTo(3f, 7f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                lineTo(0f, 22f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(17f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(6f, 3.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(11f, 3.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(12f, 21.0f)
                curveToRelative(-0.8f, 0f, -1.6f, -0.22f, -2.3f, -0.66f)
                lineToRelative(-1.7f, -1.07f)
                verticalLineToRelative(3.28f)
                reflectiveCurveToRelative(1.14f, 1.46f, 4f, 1.46f)
                reflectiveCurveToRelative(4f, -1.46f, 4f, -1.46f)
                verticalLineToRelative(-3.28f)
                lineToRelative(-1.7f, 1.07f)
                curveToRelative(-0.7f, 0.44f, -1.5f, 0.66f, -2.31f, 0.66f)
                close()
            }
        }.also { _Lesson = it}
