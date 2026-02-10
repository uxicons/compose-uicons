package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Radiation: ImageVector? = null

val Icons.Ss.Radiation: ImageVector
    get() = _Radiation ?: UXIcon(name = "Radiation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 11f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
                moveTo(24f, 11f)
                curveToRelative(0f, -4.31f, -2.33f, -8.31f, -6.09f, -10.44f)
                lineToRelative(-0.83f, -0.47f)
                lineToRelative(-4.32f, 6.84f)
                lineToRelative(1.0f, 0.49f)
                curveToRelative(1.39f, 0.68f, 2.25f, 2.05f, 2.25f, 3.57f)
                verticalLineToRelative(1.0f)
                reflectiveCurveToRelative(8f, 0.0f, 8f, 0.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(8.0f, 12.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.52f, 0.86f, -2.89f, 2.25f, -3.57f)
                lineToRelative(1.0f, -0.49f)
                lineTo(6.92f, 0.09f)
                lineToRelative(-0.83f, 0.47f)
                curveTo(2.33f, 2.69f, 0f, 6.69f, 0f, 11.0f)
                verticalLineToRelative(1.0f)
                lineToRelative(8.0f, -0.0f)
                close()
                moveTo(18.34f, 21.18f)
                lineToRelative(0.81f, -0.51f)
                lineToRelative(-3.96f, -7.04f)
                lineToRelative(-0.9f, 0.64f)
                curveToRelative(-1.37f, 0.97f, -3.2f, 0.96f, -4.57f, 0.0f)
                lineToRelative(-0.9f, -0.63f)
                lineToRelative(-3.96f, 7.04f)
                lineToRelative(0.81f, 0.51f)
                curveToRelative(1.91f, 1.19f, 4.1f, 1.83f, 6.34f, 1.83f)
                reflectiveCurveToRelative(4.43f, -0.63f, 6.34f, -1.82f)
                close()
            }
        }.also { _Radiation = it}
