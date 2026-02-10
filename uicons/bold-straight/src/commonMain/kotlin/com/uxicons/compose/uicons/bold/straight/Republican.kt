package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Republican: ImageVector? = null

val Icons.Bs.Republican: ImageVector
    get() = _Republican ?: UXIcon(name = "Republican") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.98f, 17f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                curveToRelative(-0.17f, 0f, -0.28f, -0.08f, -0.34f, -0.14f)
                curveToRelative(-0.05f, -0.06f, -0.14f, -0.17f, -0.14f, -0.36f)
                lineTo(20.0f, 8.5f)
                curveToRelative(0.0f, -1.74f, -0.67f, -3.37f, -1.9f, -4.6f)
                curveToRelative(-1.23f, -1.23f, -2.86f, -1.91f, -4.6f, -1.91f)
                lineTo(6.5f, 2.0f)
                curveTo(2.92f, 2.0f, 0f, 4.91f, 0f, 8.49f)
                verticalLineToRelative(13.51f)
                lineTo(5.99f, 22f)
                lineToRelative(0.01f, -4f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.93f, 0.36f, 1.81f, 1.01f, 2.47f)
                curveToRelative(0.66f, 0.67f, 1.54f, 1.03f, 2.47f, 1.03f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(6.5f, 5.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.94f, 0f, 1.82f, 0.36f, 2.48f, 1.03f)
                curveToRelative(0.66f, 0.66f, 1.02f, 1.54f, 1.02f, 2.48f)
                verticalLineToRelative(4.5f)
                lineTo(3f, 13f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(11f, 9.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(6f, 9.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
            }
        }.also { _Republican = it}
