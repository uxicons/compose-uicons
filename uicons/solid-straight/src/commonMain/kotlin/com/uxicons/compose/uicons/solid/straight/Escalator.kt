package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Escalator: ImageVector? = null

val Icons.Ss.Escalator: ImageVector
    get() = _Escalator ?: UXIcon(name = "Escalator") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.5f, 0f)
                curveTo(9.88f, 0f, 11f, 1.12f, 11f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveTo(7.12f, 0f, 8.5f, 0f)
                close()
                moveTo(8.76f, 22.82f)
                lineToRelative(11.6f, -9.82f)
                horizontalLineToRelative(3.63f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-5.54f)
                curveToRelative(-1.18f, 0f, -2.33f, 0.42f, -3.23f, 1.18f)
                lineTo(3.63f, 17f)
                lineTo(0f, 17f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(5.54f)
                curveToRelative(1.18f, 0f, 2.33f, -0.42f, 3.23f, -1.18f)
                close()
                moveTo(11.65f, 7.6f)
                curveToRelative(-0.5f, -0.95f, -1.5f, -1.6f, -2.65f, -1.6f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3.0f)
                lineToRelative(-0.01f, 4.24f)
                lineToRelative(6.66f, -5.64f)
                close()
            }
        }.also { _Escalator = it}
