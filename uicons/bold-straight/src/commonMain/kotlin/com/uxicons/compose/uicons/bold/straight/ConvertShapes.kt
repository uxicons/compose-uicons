package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ConvertShapes: ImageVector? = null

val Icons.Bs.ConvertShapes: ImageVector
    get() = _ConvertShapes ?: UXIcon(name = "ConvertShapes") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 1.27f)
                verticalLineToRelative(5.73f)
                lineToRelative(-2.68f, -2.68f)
                curveToRelative(-2.7f, 1.65f, -4.32f, 4.52f, -4.32f, 7.68f)
                lineTo(0f, 12f)
                curveToRelative(0f, -3.98f, 1.93f, -7.59f, 5.17f, -9.84f)
                lineTo(3f, 0f)
                horizontalLineToRelative(5.73f)
                curveTo(9.43f, 0f, 10f, 0.57f, 10f, 1.27f)
                close()
                moveTo(24f, 12f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, 3.17f, -1.61f, 6.03f, -4.32f, 7.68f)
                lineToRelative(-2.68f, -2.68f)
                verticalLineToRelative(5.73f)
                curveToRelative(0f, 0.7f, 0.57f, 1.27f, 1.27f, 1.27f)
                horizontalLineToRelative(5.73f)
                lineToRelative(-2.17f, -2.17f)
                curveToRelative(3.19f, -2.23f, 5.17f, -5.92f, 5.17f, -9.83f)
                close()
                moveTo(0f, 14f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(10f)
                lineTo(0f, 24f)
                verticalLineToRelative(-10f)
                close()
                moveTo(3f, 21f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                lineTo(3f, 17f)
                verticalLineToRelative(4f)
                close()
                moveTo(13f, 5.5f)
                curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
                reflectiveCurveToRelative(-5.5f, -2.47f, -5.5f, -5.5f)
                close()
                moveTo(16f, 5.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                close()
            }
        }.also { _ConvertShapes = it}
