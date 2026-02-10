package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoundCctv: ImageVector? = null

val Icons.Ts.RoundCctv: ImageVector
    get() = _RoundCctv ?: UXIcon(name = "RoundCctv") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 0f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.81f, 0.4f, 1.53f, 1f, 1.99f)
                verticalLineToRelative(7.51f)
                curveToRelative(0f, 6.07f, 4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                verticalLineToRelative(-7.51f)
                curveToRelative(0.6f, -0.46f, 1f, -1.17f, 1f, -1.99f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(22f, 13f)
                curveToRelative(0f, 5.51f, -4.49f, 10f, -10f, 10f)
                reflectiveCurveToRelative(-10f, -4.49f, -10f, -10f)
                verticalLineToRelative(-7.05f)
                curveToRelative(0.16f, 0.03f, 0.33f, 0.05f, 0.5f, 0.05f)
                horizontalLineToRelative(19f)
                curveToRelative(0.17f, 0f, 0.34f, -0.02f, 0.5f, -0.05f)
                close()
                moveTo(23f, 3.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-19f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(22f)
                close()
                moveTo(12f, 7f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                reflectiveCurveToRelative(-3.14f, -7f, -7f, -7f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(12f, 11f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                close()
                moveTo(12f, 16f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _RoundCctv = it}
