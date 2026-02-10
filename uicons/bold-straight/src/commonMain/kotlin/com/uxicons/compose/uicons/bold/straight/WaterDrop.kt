package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaterDrop: ImageVector? = null

val Icons.Bs.WaterDrop: ImageVector
    get() = _WaterDrop ?: UXIcon(name = "WaterDrop") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(8f, 16f)
                horizontalLineToRelative(-0.79f)
                curveToRelative(-0.76f, 0.31f, -1.21f, 0.7f, -1.21f, 1.12f)
                curveToRelative(0f, 1.04f, 2.69f, 1.88f, 6f, 1.88f)
                reflectiveCurveToRelative(6f, -0.84f, 6f, -1.88f)
                curveToRelative(0f, -0.42f, -0.45f, -0.81f, -1.21f, -1.12f)
                horizontalLineToRelative(-0.79f)
                curveToRelative(-1.18f, 0f, -2.5f, -0.85f, -2.5f, -2f)
                curveToRelative(0.0f, -1.55f, 1.56f, -2.43f, 1.5f, -4f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                curveToRelative(-0.06f, 1.57f, 1.5f, 2.45f, 1.5f, 4f)
                curveToRelative(0f, 1.15f, -1.32f, 2f, -2.5f, 2f)
                close()
                moveTo(16.95f, 10.61f)
                curveToRelative(-0.18f, 1.27f, -0.73f, 2.03f, -1.19f, 2.79f)
                curveToRelative(3.15f, 0.7f, 5.23f, 2.21f, 5.23f, 3.6f)
                curveToRelative(0f, 1.89f, -3.85f, 4f, -9f, 4f)
                reflectiveCurveToRelative(-9f, -2.11f, -9f, -4f)
                curveToRelative(0f, -1.39f, 2.08f, -2.89f, 5.23f, -3.6f)
                curveToRelative(-0.46f, -0.76f, -1.0f, -1.53f, -1.19f, -2.79f)
                curveToRelative(-4.19f, 1.08f, -7.04f, 3.5f, -7.04f, 6.39f)
                curveToRelative(0f, 3.92f, 5.27f, 7f, 12f, 7f)
                reflectiveCurveToRelative(12f, -3.08f, 12f, -7f)
                curveToRelative(0f, -2.89f, -2.86f, -5.31f, -7.04f, -6.39f)
                close()
            }
        }.also { _WaterDrop = it}
