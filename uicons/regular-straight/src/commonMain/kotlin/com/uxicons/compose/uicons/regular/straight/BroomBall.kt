package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BroomBall: ImageVector? = null

val Icons.Rs.BroomBall: ImageVector
    get() = _BroomBall ?: UXIcon(name = "BroomBall") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 17f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(20.5f, 22f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(14.13f, 11.29f)
                lineTo(23.95f, 1.47f)
                lineTo(22.53f, 0.05f)
                lineToRelative(-9.82f, 9.82f)
                lineToRelative(-1.85f, -1.85f)
                lineToRelative(-1.59f, 3.19f)
                curveToRelative(-0.47f, -0.14f, -0.96f, -0.21f, -1.47f, -0.21f)
                curveToRelative(-1.39f, 0f, -2.69f, 0.54f, -3.68f, 1.52f)
                curveToRelative(-1.76f, 1.76f, -3.31f, 8.44f, -3.6f, 9.76f)
                lineToRelative(-0.34f, 1.53f)
                lineToRelative(1.53f, -0.34f)
                curveToRelative(1.32f, -0.29f, 8.0f, -1.84f, 9.76f, -3.6f)
                curveToRelative(0.98f, -0.98f, 1.52f, -2.29f, 1.52f, -3.68f)
                curveToRelative(0f, -0.5f, -0.07f, -1.0f, -0.21f, -1.47f)
                lineToRelative(3.19f, -1.59f)
                lineToRelative(-1.85f, -1.85f)
                close()
                moveTo(10.06f, 18.46f)
                curveToRelative(-0.87f, 0.87f, -4.41f, 1.98f, -7.21f, 2.69f)
                curveToRelative(0.71f, -2.8f, 1.82f, -6.34f, 2.69f, -7.21f)
                curveToRelative(0.6f, -0.6f, 1.41f, -0.94f, 2.26f, -0.94f)
                reflectiveCurveToRelative(1.66f, 0.33f, 2.26f, 0.94f)
                curveToRelative(0.6f, 0.6f, 0.94f, 1.41f, 0.94f, 2.26f)
                reflectiveCurveToRelative(-0.33f, 1.66f, -0.94f, 2.26f)
                close()
            }
        }.also { _BroomBall = it}
