package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Escalator: ImageVector? = null

val Icons.Ts.Escalator: ImageVector
    get() = _Escalator ?: UXIcon(name = "Escalator") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(8.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(18.46f, 5f)
                curveToRelative(-1.06f, 0f, -2.1f, 0.38f, -2.91f, 1.06f)
                lineToRelative(-3.56f, 3.01f)
                verticalLineToRelative(-0.58f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(6.5f)
                lineToRelative(-1.18f, 1.0f)
                lineTo(0f, 16f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(5.54f)
                curveToRelative(1.06f, 0f, 2.1f, -0.38f, 2.91f, -1.06f)
                lineToRelative(11.74f, -9.94f)
                horizontalLineToRelative(3.82f)
                lineTo(24.0f, 5f)
                horizontalLineToRelative(-5.54f)
                close()
                moveTo(6f, 8.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.42f)
                lineToRelative(-5f, 4.23f)
                verticalLineToRelative(-5.65f)
                close()
                moveTo(23f, 12f)
                horizontalLineToRelative(-3.18f)
                lineToRelative(-12.02f, 10.17f)
                curveToRelative(-0.63f, 0.53f, -1.43f, 0.83f, -2.26f, 0.83f)
                lineTo(1f, 23f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(3.18f)
                lineToRelative(12.02f, -10.17f)
                curveToRelative(0.63f, -0.53f, 1.43f, -0.83f, 2.26f, -0.83f)
                horizontalLineToRelative(4.54f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _Escalator = it}
