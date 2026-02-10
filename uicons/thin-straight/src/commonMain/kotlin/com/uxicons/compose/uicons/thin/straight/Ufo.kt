package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ufo: ImageVector? = null

val Icons.Ts.Ufo: ImageVector
    get() = _Ufo ?: UXIcon(name = "Ufo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 15f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(18f, 14f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(12f, 15f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(24f, 14.56f)
                curveToRelative(0f, 3.05f, -5.27f, 5.44f, -12f, 5.44f)
                reflectiveCurveTo(0f, 17.61f, 0f, 14.56f)
                curveToRelative(0f, -1.77f, 1.73f, -3.23f, 5f, -4.25f)
                verticalLineToRelative(-0.31f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                verticalLineToRelative(0.31f)
                curveToRelative(3.27f, 1.02f, 5f, 2.48f, 5f, 4.25f)
                close()
                moveTo(6f, 10.81f)
                curveToRelative(0.47f, 0.31f, 2.12f, 1.19f, 6f, 1.19f)
                reflectiveCurveToRelative(5.53f, -0.87f, 6f, -1.19f)
                verticalLineToRelative(-0.81f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                verticalLineToRelative(0.81f)
                close()
                moveTo(23f, 14.56f)
                curveToRelative(0f, -1.24f, -1.44f, -2.37f, -4.07f, -3.22f)
                curveToRelative(-0.07f, 0.07f, -1.73f, 1.67f, -6.93f, 1.67f)
                reflectiveCurveToRelative(-6.86f, -1.6f, -6.93f, -1.67f)
                curveToRelative(-2.63f, 0.86f, -4.07f, 1.99f, -4.07f, 3.22f)
                curveToRelative(0f, 2.15f, 4.42f, 4.44f, 11f, 4.44f)
                reflectiveCurveToRelative(11f, -2.3f, 11f, -4.44f)
                close()
            }
        }.also { _Ufo = it}
