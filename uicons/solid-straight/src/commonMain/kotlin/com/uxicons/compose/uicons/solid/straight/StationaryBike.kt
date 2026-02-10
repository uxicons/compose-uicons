package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StationaryBike: ImageVector? = null

val Icons.Ss.StationaryBike: ImageVector
    get() = _StationaryBike ?: UXIcon(name = "StationaryBike") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 15.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(24f, 17.67f)
                curveToRelative(0f, 2.51f, -1.92f, 4.62f, -4.5f, 5.18f)
                verticalLineToRelative(1.15f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                lineTo(7.5f, 23f)
                curveToRelative(-0.34f, 0f, -0.67f, -0.03f, -1f, -0.07f)
                verticalLineToRelative(1.07f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.63f)
                curveToRelative(-2.65f, -1.16f, -4.5f, -3.8f, -4.5f, -6.87f)
                curveToRelative(0f, -2.68f, 1.42f, -5.03f, 3.54f, -6.36f)
                lineToRelative(-1.27f, -4.14f)
                lineTo(0f, 5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.65f)
                lineToRelative(1.02f, 3.31f)
                curveToRelative(0.68f, -0.2f, 1.39f, -0.31f, 2.13f, -0.31f)
                curveToRelative(2.44f, 0f, 3.48f, 0.41f, 5.76f, 1.32f)
                curveToRelative(0.72f, 0.29f, 1.6f, 0.64f, 2.71f, 1.05f)
                curveToRelative(1.19f, -4.12f, 1.53f, -7.44f, 1.54f, -7.47f)
                lineToRelative(0.09f, -0.9f)
                horizontalLineToRelative(3.79f)
                lineToRelative(0.58f, -2f)
                horizontalLineToRelative(2.03f)
                lineToRelative(-1.04f, 4f)
                horizontalLineToRelative(-3.58f)
                curveToRelative(-0.18f, 1.32f, -0.63f, 3.96f, -1.53f, 7.05f)
                curveToRelative(0.46f, 0.16f, 0.94f, 0.33f, 1.47f, 0.5f)
                curveToRelative(3.17f, 1.27f, 4.68f, 3.26f, 4.68f, 6.12f)
                close()
                moveTo(14f, 14.5f)
                horizontalLineToRelative(-3.16f)
                curveToRelative(-0.43f, -1.44f, -1.76f, -2.5f, -3.34f, -2.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(1.58f, 0f, 2.9f, -1.06f, 3.34f, -2.5f)
                horizontalLineToRelative(3.16f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _StationaryBike = it}
