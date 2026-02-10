package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TemperatureList: ImageVector? = null

val Icons.Ts.TemperatureList: ImageVector
    get() = _TemperatureList ?: UXIcon(name = "TemperatureList") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-9f)
                lineTo(15f, 0f)
                horizontalLineToRelative(9f)
                close()
                moveTo(15f, 5f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(1f)
                close()
                moveTo(15f, 9f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(1f)
                close()
                moveTo(17f, 13f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(1f)
                close()
                moveTo(10f, 17.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -1.21f, 0.86f, -2.22f, 2f, -2.45f)
                lineTo(7f, 7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(8.05f)
                curveToRelative(1.14f, 0.23f, 2f, 1.24f, 2f, 2.45f)
                close()
                moveTo(9f, 17.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(12f, 12.82f)
                curveToRelative(1.27f, 1.23f, 2f, 2.92f, 2f, 4.68f)
                curveToRelative(0f, 1.96f, -0.88f, 3.8f, -2.4f, 5.04f)
                curveToRelative(-1.17f, 0.95f, -2.62f, 1.45f, -4.11f, 1.45f)
                curveToRelative(-0.46f, 0f, -0.92f, -0.05f, -1.38f, -0.14f)
                curveToRelative(-2.47f, -0.51f, -4.46f, -2.52f, -4.97f, -4.99f)
                curveToRelative(-0.46f, -2.24f, 0.23f, -4.49f, 1.86f, -6.05f)
                lineTo(3f, 4.5f)
                curveTo(3f, 2.02f, 5.02f, 0f, 7.5f, 0f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(8.32f)
                close()
                moveTo(11.17f, 13.41f)
                lineToRelative(-0.17f, -0.15f)
                lineTo(11f, 4.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(8.76f)
                lineToRelative(-0.17f, 0.15f)
                curveToRelative(-1.48f, 1.32f, -2.12f, 3.29f, -1.71f, 5.26f)
                curveToRelative(0.43f, 2.09f, 2.11f, 3.78f, 4.19f, 4.21f)
                curveToRelative(1.66f, 0.35f, 3.36f, -0.06f, 4.65f, -1.11f)
                reflectiveCurveToRelative(2.03f, -2.61f, 2.03f, -4.27f)
                curveToRelative(0f, -1.55f, -0.67f, -3.04f, -1.83f, -4.09f)
                close()
            }
        }.also { _TemperatureList = it}
