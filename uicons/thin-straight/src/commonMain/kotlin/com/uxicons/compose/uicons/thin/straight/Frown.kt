package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Frown: ImageVector? = null

val Icons.Ts.Frown: ImageVector
    get() = _Frown ?: UXIcon(name = "Frown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 1f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                reflectiveCurveTo(18.07f, 1f, 12f, 1f)
                close()
                moveTo(18f, 19f)
                lineTo(6f, 19f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -2.19f, 2.41f, -5.5f, 6.04f, -5.5f)
                curveToRelative(3.59f, 0f, 5.96f, 3.31f, 5.96f, 5.5f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(7.05f, 18f)
                horizontalLineToRelative(9.9f)
                curveToRelative(-0.33f, -1.77f, -2.29f, -4f, -4.92f, -4f)
                curveToRelative(-2.66f, 0f, -4.65f, 2.23f, -4.99f, 4f)
                close()
                moveTo(10f, 11f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(6f, 10f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(19f, 11f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(15f, 10f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                close()
            }
        }.also { _Frown = it}
