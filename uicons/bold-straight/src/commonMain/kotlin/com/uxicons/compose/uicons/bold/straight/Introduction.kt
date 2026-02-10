package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Introduction: ImageVector? = null

val Icons.Bs.Introduction: ImageVector
    get() = _Introduction ?: UXIcon(name = "Introduction") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.0f, 0f)
                lineToRelative(-6f, 0.0f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2.0f, 2.0f)
                lineToRelative(0.0f, 7.77f)
                curveToRelative(0f, 0.86f, 0.95f, 1.38f, 1.67f, 0.92f)
                lineToRelative(2.45f, -1.69f)
                horizontalLineToRelative(5.87f)
                lineTo(24f, 2f)
                curveTo(24f, 0.9f, 23.1f, 0f, 22.0f, 0f)
                close()
                moveTo(5f, 8.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                close()
                moveTo(15f, 18.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(0f, 17f)
                lineTo(0f, 5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(7.5f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(4f, 19f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                close()
            }
        }.also { _Introduction = it}
