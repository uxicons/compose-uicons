package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Method: ImageVector? = null

val Icons.Ss.Method: ImageVector
    get() = _Method ?: UXIcon(name = "Method") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 10f)
                lineTo(0f, 10f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(8f)
                lineToRelative(2.5f, 2.5f)
                lineToRelative(-2.5f, 2.5f)
                close()
                moveTo(0f, 19f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(20f)
                lineToRelative(2.5f, -2.5f)
                lineToRelative(-2.5f, -2.5f)
                lineTo(0f, 19f)
                close()
                moveTo(16.5f, 14.5f)
                lineToRelative(-2.5f, -2.5f)
                lineTo(0f, 12f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(14f)
                lineToRelative(2.5f, -2.5f)
                close()
                moveTo(22.28f, 7.31f)
                lineToRelative(1.42f, 0.82f)
                lineToRelative(-1.0f, 1.73f)
                lineToRelative(-1.41f, -0.81f)
                curveToRelative(-0.6f, 0.65f, -1.39f, 1.13f, -2.29f, 1.33f)
                verticalLineToRelative(1.62f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.62f)
                curveToRelative(-0.9f, -0.2f, -1.69f, -0.68f, -2.29f, -1.33f)
                lineToRelative(-1.41f, 0.81f)
                lineToRelative(-1.0f, -1.73f)
                lineToRelative(1.42f, -0.82f)
                curveToRelative(-0.13f, -0.42f, -0.22f, -0.85f, -0.22f, -1.31f)
                reflectiveCurveToRelative(0.09f, -0.9f, 0.22f, -1.31f)
                lineToRelative(-1.42f, -0.82f)
                lineToRelative(1.0f, -1.73f)
                lineToRelative(1.41f, 0.81f)
                curveToRelative(0.6f, -0.65f, 1.39f, -1.13f, 2.29f, -1.33f)
                lineTo(17.0f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1.62f)
                curveToRelative(0.9f, 0.2f, 1.69f, 0.68f, 2.29f, 1.33f)
                lineToRelative(1.41f, -0.81f)
                lineToRelative(1.0f, 1.73f)
                lineToRelative(-1.42f, 0.82f)
                curveToRelative(0.13f, 0.42f, 0.22f, 0.85f, 0.22f, 1.31f)
                reflectiveCurveToRelative(-0.09f, 0.9f, -0.22f, 1.31f)
                close()
                moveTo(19.5f, 6f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _Method = it}
