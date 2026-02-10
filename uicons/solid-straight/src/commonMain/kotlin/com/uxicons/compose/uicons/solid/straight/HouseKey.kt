package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseKey: ImageVector? = null

val Icons.Ss.HouseKey: ImageVector
    get() = _HouseKey ?: UXIcon(name = "HouseKey") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.0f, 10f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                curveToRelative(0f, 0.57f, 0.12f, 1.11f, 0.29f, 1.62f)
                lineToRelative(-0.32f, 0.3f)
                verticalLineToRelative(2.07f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1.98f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2.6f)
                lineToRelative(4.41f, -4.41f)
                curveToRelative(0.61f, 0.26f, 1.28f, 0.41f, 1.98f, 0.41f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(0f)
                close()
                moveTo(20.0f, 12.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(8.0f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 10.04f)
                curveToRelative(0f, -0.93f, 0.42f, -1.79f, 1.15f, -2.36f)
                lineTo(10.15f, 0.64f)
                curveToRelative(1.05f, -0.82f, 2.65f, -0.82f, 3.7f, 0f)
                lineToRelative(9f, 7.04f)
                curveToRelative(0.73f, 0.57f, 1.15f, 1.43f, 1.15f, 2.36f)
                verticalLineToRelative(0.07f)
                curveToRelative(-1.27f, -1.3f, -3.04f, -2.11f, -5.0f, -2.11f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                curveToRelative(0f, 0.33f, -0.02f, 2f, -0.02f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1.98f)
                verticalLineToRelative(5f)
                close()
            }
        }.also { _HouseKey = it}
