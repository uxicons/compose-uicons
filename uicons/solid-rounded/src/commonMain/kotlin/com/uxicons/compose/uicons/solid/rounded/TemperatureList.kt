package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TemperatureList: ImageVector? = null

val Icons.Sr.TemperatureList: ImageVector
    get() = _TemperatureList ?: UXIcon(name = "TemperatureList") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 2f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(24f, 6f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(24f, 11f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(14f, 17f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                reflectiveCurveTo(0f, 20.86f, 0f, 17f)
                curveToRelative(0f, -1.83f, 0.72f, -3.58f, 2f, -4.89f)
                verticalLineToRelative(-7.11f)
                curveTo(2f, 2.24f, 4.24f, 0f, 7f, 0f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                verticalLineToRelative(7.11f)
                curveToRelative(1.28f, 1.3f, 2f, 3.06f, 2f, 4.89f)
                close()
                moveTo(10f, 17f)
                curveToRelative(0f, -1.3f, -0.84f, -2.4f, -2f, -2.82f)
                verticalLineToRelative(-5.18f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(5.18f)
                curveToRelative(-1.16f, 0.41f, -2f, 1.51f, -2f, 2.82f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                close()
            }
        }.also { _TemperatureList = it}
