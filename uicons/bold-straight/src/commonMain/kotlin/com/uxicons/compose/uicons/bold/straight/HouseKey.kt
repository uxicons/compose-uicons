package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseKey: ImageVector? = null

val Icons.Bs.HouseKey: ImageVector
    get() = _HouseKey ?: UXIcon(name = "HouseKey") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 21f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                lineTo(0f, 24f)
                lineTo(0f, 10.13f)
                curveToRelative(0f, -1.06f, 0.48f, -2.03f, 1.31f, -2.69f)
                lineTo(9.9f, 0.72f)
                curveToRelative(1.24f, -0.97f, 2.96f, -0.97f, 4.2f, 0f)
                lineToRelative(8.59f, 6.72f)
                curveToRelative(0.82f, 0.65f, 1.3f, 1.61f, 1.3f, 2.66f)
                curveToRelative(-1.27f, -1.3f, -3.04f, -2.11f, -5.0f, -2.11f)
                curveToRelative(-0.15f, 0f, -0.29f, 0.01f, -0.44f, 0.02f)
                lineTo(12.25f, 3.09f)
                curveToRelative(-0.15f, -0.12f, -0.36f, -0.12f, -0.51f, 0f)
                lineTo(3.16f, 9.81f)
                curveToRelative(-0.1f, 0.08f, -0.16f, 0.2f, -0.16f, 0.32f)
                verticalLineToRelative(10.87f)
                close()
                moveTo(24f, 15f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                curveToRelative(-0.7f, 0f, -1.38f, -0.15f, -1.98f, -0.41f)
                lineToRelative(-4.41f, 4.41f)
                horizontalLineToRelative(-2.6f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.98f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.07f)
                lineToRelative(0.32f, -0.3f)
                curveToRelative(-0.18f, -0.51f, -0.29f, -1.05f, -0.29f, -1.62f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                close()
                moveTo(21.5f, 14f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _HouseKey = it}
