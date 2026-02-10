package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThermometerThreeQuarters: ImageVector? = null

val Icons.Tr.ThermometerThreeQuarters: ImageVector
    get() = _ThermometerThreeQuarters ?: UXIcon(name = "ThermometerThreeQuarters") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 15.05f)
                verticalLineToRelative(-7.55f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(7.55f)
                curveToRelative(-1.14f, 0.23f, -2f, 1.24f, -2f, 2.45f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -1.21f, -0.86f, -2.22f, -2f, -2.45f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(16.5f, 12.82f)
                lineTo(16.5f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(8.32f)
                curveToRelative(-1.27f, 1.23f, -2f, 2.92f, -2f, 4.68f)
                curveToRelative(0f, 3.58f, 2.92f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.92f, 6.5f, -6.5f)
                curveToRelative(0f, -1.76f, -0.73f, -3.46f, -2f, -4.68f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
                curveToRelative(0f, -1.55f, 0.67f, -3.04f, 1.83f, -4.09f)
                curveToRelative(0.1f, -0.1f, 0.17f, -0.23f, 0.17f, -0.37f)
                lineTo(8.5f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(8.54f)
                curveToRelative(0f, 0.14f, 0.06f, 0.28f, 0.17f, 0.37f)
                curveToRelative(1.17f, 1.05f, 1.83f, 2.54f, 1.83f, 4.09f)
                curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
                close()
            }
        }.also { _ThermometerThreeQuarters = it}
