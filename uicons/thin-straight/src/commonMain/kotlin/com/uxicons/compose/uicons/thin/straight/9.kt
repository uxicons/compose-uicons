package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ts9: ImageVector? = null

val Icons.Ts.Ts9: ImageVector
    get() = _Ts9 ?: UXIcon(name = "Ts9") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.0f, 8f)
                curveTo(20.0f, 3.5f, 16.43f, 0.2f, 12.39f, 0.01f)
                curveToRelative(-2.36f, -0.1f, -4.64f, 0.81f, -6.24f, 2.54f)
                curveToRelative(-1.61f, 1.73f, -2.37f, 4.07f, -2.09f, 6.43f)
                curveToRelative(0.43f, 3.63f, 3.39f, 6.56f, 7.02f, 6.97f)
                curveToRelative(2.31f, 0.26f, 4.53f, -0.45f, 6.25f, -1.99f)
                curveToRelative(0.68f, -0.6f, 1.24f, -1.31f, 1.67f, -2.09f)
                verticalLineToRelative(3.63f)
                curveToRelative(0f, 4.14f, -3.36f, 7.5f, -7.5f, 7.5f)
                lineTo(6f, 23f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(5.5f)
                curveToRelative(4.69f, 0f, 8.5f, -3.81f, 8.5f, -8.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(-0.01f)
                close()
                moveTo(12f, 15f)
                curveToRelative(-3.87f, 0f, -7f, -3.13f, -7f, -7f)
                reflectiveCurveTo(8.13f, 1f, 12f, 1f)
                reflectiveCurveToRelative(7f, 3.13f, 7f, 7f)
                reflectiveCurveToRelative(-3.13f, 7f, -7f, 7f)
                close()
            }
        }.also { _Ts9 = it}
