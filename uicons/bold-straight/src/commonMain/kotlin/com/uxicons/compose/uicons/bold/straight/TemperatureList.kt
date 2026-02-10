package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TemperatureList: ImageVector? = null

val Icons.Bs.TemperatureList: ImageVector
    get() = _TemperatureList ?: UXIcon(name = "TemperatureList") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 16.02f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                curveToRelative(0f, -1.11f, 0.6f, -2.08f, 1.5f, -2.6f)
                verticalLineToRelative(-6.42f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6.42f)
                curveToRelative(0.9f, 0.52f, 1.5f, 1.49f, 1.5f, 2.6f)
                close()
                moveTo(14f, 10.71f)
                curveToRelative(1.29f, 1.46f, 2f, 3.31f, 2f, 5.27f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                reflectiveCurveTo(0f, 20.39f, 0f, 15.98f)
                curveToRelative(0f, -1.96f, 0.71f, -3.81f, 2f, -5.27f)
                verticalLineToRelative(-4.69f)
                curveTo(2f, 2.71f, 4.69f, 0.02f, 8f, 0.02f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                verticalLineToRelative(4.69f)
                close()
                moveTo(13f, 15.98f)
                curveToRelative(0f, -1.36f, -0.55f, -2.63f, -1.54f, -3.59f)
                lineToRelative(-0.46f, -0.44f)
                verticalLineToRelative(-5.93f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                verticalLineToRelative(5.93f)
                lineToRelative(-0.46f, 0.44f)
                curveToRelative(-0.99f, 0.96f, -1.54f, 2.23f, -1.54f, 3.59f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                close()
                moveTo(16f, 0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(8f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(16f, 8f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(3f)
                close()
                moveTo(18f, 13f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _TemperatureList = it}
