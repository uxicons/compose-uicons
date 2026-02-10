package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TemperatureDown: ImageVector? = null

val Icons.Ts.TemperatureDown: ImageVector
    get() = _TemperatureDown ?: UXIcon(name = "TemperatureDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.99f, 11.33f)
                lineToRelative(-3.1f, 3.1f)
                curveToRelative(-0.38f, 0.38f, -0.89f, 0.58f, -1.39f, 0.58f)
                reflectiveCurveToRelative(-1.01f, -0.19f, -1.39f, -0.58f)
                lineToRelative(-3.11f, -3.11f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.11f, 3.11f)
                curveToRelative(0.06f, 0.06f, 0.12f, 0.11f, 0.19f, 0.15f)
                lineTo(19.0f, 0f)
                horizontalLineToRelative(1f)
                lineTo(20.0f, 13.87f)
                curveToRelative(0.07f, -0.04f, 0.13f, -0.09f, 0.19f, -0.15f)
                lineToRelative(3.1f, -3.1f)
                lineToRelative(0.71f, 0.71f)
                close()
                moveTo(9f, 17.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -1.21f, 0.86f, -2.22f, 2f, -2.45f)
                verticalLineToRelative(-2.05f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2.05f)
                curveToRelative(1.14f, 0.23f, 2f, 1.24f, 2f, 2.45f)
                close()
                moveTo(8f, 17.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(13f, 17.5f)
                curveToRelative(0f, 1.96f, -0.88f, 3.8f, -2.4f, 5.04f)
                curveToRelative(-1.17f, 0.95f, -2.62f, 1.45f, -4.11f, 1.45f)
                curveToRelative(-0.46f, 0f, -0.92f, -0.05f, -1.38f, -0.14f)
                curveToRelative(-2.47f, -0.51f, -4.46f, -2.52f, -4.97f, -4.99f)
                curveToRelative(-0.46f, -2.25f, 0.23f, -4.49f, 1.86f, -6.05f)
                lineTo(2f, 4.5f)
                curveTo(2f, 2.02f, 4.02f, 0f, 6.5f, 0f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                lineTo(11f, 12.82f)
                curveToRelative(1.27f, 1.23f, 2f, 2.92f, 2f, 4.68f)
                close()
                moveTo(12f, 17.5f)
                curveToRelative(0f, -1.55f, -0.67f, -3.04f, -1.83f, -4.09f)
                lineToRelative(-0.17f, -0.15f)
                lineTo(10f, 4.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                lineTo(3f, 13.26f)
                lineToRelative(-0.17f, 0.15f)
                curveToRelative(-1.48f, 1.32f, -2.12f, 3.29f, -1.71f, 5.26f)
                curveToRelative(0.43f, 2.09f, 2.11f, 3.78f, 4.2f, 4.21f)
                curveToRelative(1.66f, 0.35f, 3.36f, -0.06f, 4.65f, -1.11f)
                curveToRelative(1.29f, -1.05f, 2.03f, -2.61f, 2.03f, -4.27f)
                close()
            }
        }.also { _TemperatureDown = it}
