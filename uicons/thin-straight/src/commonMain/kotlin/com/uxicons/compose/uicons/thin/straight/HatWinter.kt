package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatWinter: ImageVector? = null

val Icons.Ts.HatWinter: ImageVector
    get() = _HatWinter ?: UXIcon(name = "HatWinter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.86f, 18.13f)
                curveToRelative(-0.68f, -5.56f, -3.76f, -11.41f, -7.96f, -12.81f)
                curveToRelative(0.67f, -0.55f, 1.09f, -1.38f, 1.09f, -2.31f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                curveToRelative(0f, 0.93f, 0.43f, 1.76f, 1.09f, 2.31f)
                curveToRelative(-4.19f, 1.4f, -7.28f, 7.25f, -7.96f, 12.81f)
                curveToRelative(-1.23f, 0.37f, -2.14f, 1.52f, -2.14f, 2.87f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.35f, -0.9f, -2.5f, -2.14f, -2.87f)
                close()
                moveTo(10f, 3f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
                moveTo(12f, 6f)
                curveToRelative(4.39f, 0f, 8.04f, 6.1f, 8.84f, 12f)
                lineTo(3.16f, 18f)
                curveToRelative(0.14f, -1.0f, 0.36f, -2.02f, 0.65f, -3f)
                horizontalLineToRelative(14.29f)
                curveToRelative(-0.11f, -0.34f, -0.23f, -0.67f, -0.36f, -1f)
                lineTo(4.13f, 14f)
                curveToRelative(1.54f, -4.37f, 4.48f, -8f, 7.87f, -8f)
                close()
                moveTo(21f, 23f)
                lineTo(3f, 23f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(18f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _HatWinter = it}
