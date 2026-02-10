package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TemperatureList: ImageVector? = null

val Icons.Rs.TemperatureList: ImageVector
    get() = _TemperatureList ?: UXIcon(name = "TemperatureList") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 10f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-2f)
                close()
                moveTo(15f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(9f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-9f)
                close()
                moveTo(11f, 17f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                curveToRelative(0f, -1.3f, 0.84f, -2.42f, 2f, -2.83f)
                verticalLineToRelative(-7.17f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7.17f)
                curveToRelative(1.16f, 0.41f, 2f, 1.52f, 2f, 2.83f)
                close()
                moveTo(9f, 17f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
                moveTo(15f, 7f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(2f)
                close()
                moveTo(13f, 12.11f)
                curveToRelative(1.28f, 1.3f, 2f, 3.06f, 2f, 4.89f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                curveToRelative(0f, -1.83f, 0.72f, -3.58f, 2f, -4.89f)
                verticalLineToRelative(-7.11f)
                curveTo(3f, 2.24f, 5.24f, 0f, 8f, 0f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                verticalLineToRelative(7.11f)
                close()
                moveTo(13f, 17f)
                curveToRelative(0f, -1.41f, -0.61f, -2.77f, -1.67f, -3.72f)
                lineToRelative(-0.33f, -0.3f)
                verticalLineToRelative(-7.98f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                verticalLineToRelative(7.98f)
                lineToRelative(-0.33f, 0.3f)
                curveToRelative(-1.06f, 0.95f, -1.67f, 2.31f, -1.67f, 3.72f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                close()
            }
        }.also { _TemperatureList = it}
