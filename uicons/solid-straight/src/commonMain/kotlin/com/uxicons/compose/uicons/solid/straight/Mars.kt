package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mars: ImageVector? = null

val Icons.Ss.Mars: ImageVector
    get() = _Mars ?: UXIcon(name = "Mars", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(469.27f, 0f)
                horizontalLineTo(341.56f)
                verticalLineToRelative(42.57f)
                horizontalLineToRelative(97.61f)
                lineTo(293.75f, 187.99f)
                curveToRelative(-78.7f, -62.08f, -192.83f, -48.6f, -254.91f, 30.1f)
                reflectiveCurveTo(-9.76f, 410.92f, 68.94f, 473f)
                reflectiveCurveToRelative(192.83f, 48.6f, 254.91f, -30.1f)
                curveToRelative(51.99f, -65.92f, 51.99f, -158.89f, 0f, -224.81f)
                lineTo(469.27f, 72.67f)
                verticalLineToRelative(97.61f)
                horizontalLineToRelative(42.57f)
                verticalLineTo(42.57f)
                curveTo(511.84f, 19.06f, 492.78f, 0f, 469.27f, 0f)
                close()
            }
        }.also { _Mars = it}
