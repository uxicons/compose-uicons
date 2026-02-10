package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaterpoloPlayer: ImageVector? = null

val Icons.Rs.WaterpoloPlayer: ImageVector
    get() = _WaterpoloPlayer ?: UXIcon(name = "WaterpoloPlayer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(14f, 9f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                close()
                moveTo(16f, 9f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                close()
                moveTo(22.5f, 21.32f)
                curveToRelative(-0.38f, 0.43f, -0.93f, 0.68f, -1.5f, 0.68f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                curveToRelative(-0.57f, 0f, -1.12f, -0.25f, -1.5f, -0.68f)
                lineToRelative(-1.5f, 1.32f)
                curveToRelative(0.76f, 0.87f, 1.85f, 1.37f, 3f, 1.37f)
                curveToRelative(1.19f, 0f, 2.27f, -0.53f, 3f, -1.36f)
                curveToRelative(0.73f, 0.83f, 1.81f, 1.36f, 3f, 1.36f)
                reflectiveCurveToRelative(2.27f, -0.53f, 3f, -1.36f)
                curveToRelative(0.73f, 0.83f, 1.81f, 1.36f, 3f, 1.36f)
                reflectiveCurveToRelative(2.27f, -0.53f, 3f, -1.36f)
                curveToRelative(0.73f, 0.83f, 1.81f, 1.36f, 3f, 1.36f)
                curveToRelative(1.15f, 0f, 2.24f, -0.5f, 3f, -1.37f)
                lineToRelative(-1.5f, -1.31f)
                close()
                moveTo(6.25f, 18f)
                lineTo(9.84f, 12.9f)
                lineTo(17.27f, 18f)
                horizontalLineToRelative(3.54f)
                lineToRelative(-13.38f, -9.18f)
                curveToRelative(-0.27f, -0.19f, -0.42f, -0.49f, -0.42f, -0.82f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 0.98f, 0.48f, 1.89f, 1.27f, 2.45f)
                verticalLineToRelative(-0.0f)
                reflectiveCurveToRelative(0.01f, 0.01f, 0.01f, 0.01f)
                lineToRelative(1.91f, 1.31f)
                lineToRelative(-4.39f, 6.23f)
                horizontalLineToRelative(2.44f)
                close()
            }
        }.also { _WaterpoloPlayer = it}
