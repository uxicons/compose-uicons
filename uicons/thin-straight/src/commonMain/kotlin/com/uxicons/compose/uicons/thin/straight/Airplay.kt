package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Airplay: ImageVector? = null

val Icons.Ts.Airplay: ImageVector
    get() = _Airplay ?: UXIcon(name = "Airplay") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(-3.2f)
                lineToRelative(-0.82f, -1f)
                horizontalLineToRelative(3.02f)
                lineTo(23f, 3.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 2f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(3.02f)
                lineToRelative(-0.82f, 1f)
                lineTo(0f, 19f)
                lineTo(0f, 3.5f)
                curveTo(0f, 2.12f, 1.12f, 1f, 2.5f, 1f)
                horizontalLineToRelative(19f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(14.11f, 13.99f)
                lineToRelative(7.38f, 9.01f)
                lineTo(2.51f, 23f)
                lineToRelative(7.38f, -9.01f)
                curveToRelative(0.53f, -0.63f, 1.3f, -0.99f, 2.12f, -0.99f)
                reflectiveCurveToRelative(1.59f, 0.36f, 2.11f, 0.99f)
                close()
                moveTo(19.38f, 22f)
                lineToRelative(-6.04f, -7.37f)
                curveToRelative(-0.66f, -0.79f, -2.02f, -0.8f, -2.69f, 0.0f)
                lineToRelative(-6.04f, 7.37f)
                horizontalLineToRelative(14.76f)
                close()
            }
        }.also { _Airplay = it}
