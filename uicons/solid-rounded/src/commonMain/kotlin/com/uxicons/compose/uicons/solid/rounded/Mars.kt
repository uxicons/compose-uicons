package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mars: ImageVector? = null

val Icons.Sr.Mars: ImageVector
    get() = _Mars ?: UXIcon(name = "Mars", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(447.99f, 0f)
                horizontalLineTo(341.56f)
                curveToRelative(-11.76f, 0f, -21.28f, 9.53f, -21.28f, 21.28f)
                reflectiveCurveToRelative(9.53f, 21.28f, 21.28f, 21.28f)
                horizontalLineToRelative(97.61f)
                lineTo(293.75f, 187.99f)
                curveToRelative(-78.7f, -62.08f, -192.83f, -48.6f, -254.91f, 30.1f)
                reflectiveCurveTo(-9.76f, 410.92f, 68.94f, 473f)
                reflectiveCurveToRelative(192.83f, 48.6f, 254.91f, -30.1f)
                curveToRelative(51.99f, -65.92f, 51.99f, -158.89f, 0f, -224.81f)
                lineTo(469.27f, 72.67f)
                verticalLineToRelative(97.61f)
                curveToRelative(0f, 11.76f, 9.53f, 21.28f, 21.28f, 21.28f)
                curveToRelative(11.76f, 0f, 21.28f, -9.53f, 21.28f, -21.28f)
                verticalLineTo(63.86f)
                curveTo(511.84f, 28.59f, 483.25f, 0f, 447.99f, 0f)
                close()
            }
        }.also { _Mars = it}
