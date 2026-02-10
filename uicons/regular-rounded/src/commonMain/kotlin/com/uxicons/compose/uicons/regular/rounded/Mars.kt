package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mars: ImageVector? = null

val Icons.Rr.Mars: ImageVector
    get() = _Mars ?: UXIcon(name = "Mars", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(448.25f, 0f)
                horizontalLineTo(342f)
                curveToRelative(-11.74f, 0f, -21.25f, 9.53f, -21.25f, 21.28f)
                reflectiveCurveToRelative(9.51f, 21.28f, 21.25f, 21.28f)
                horizontalLineToRelative(97.45f)
                lineTo(294.27f, 187.99f)
                curveToRelative(-78.57f, -62.08f, -192.51f, -48.6f, -254.49f, 30.1f)
                reflectiveCurveTo(-8.74f, 410.92f, 69.83f, 473f)
                reflectiveCurveToRelative(192.51f, 48.6f, 254.49f, -30.1f)
                curveToRelative(51.91f, -65.92f, 51.91f, -158.89f, 0f, -224.81f)
                lineTo(469.5f, 72.67f)
                verticalLineToRelative(97.61f)
                curveToRelative(0f, 11.76f, 9.51f, 21.28f, 21.25f, 21.28f)
                reflectiveCurveToRelative(21.25f, -9.53f, 21.25f, -21.28f)
                verticalLineTo(63.86f)
                curveTo(512f, 28.59f, 483.46f, 0f, 448.25f, 0f)
                close()
                moveTo(182.62f, 468.27f)
                curveToRelative(-76.29f, 0f, -138.13f, -61.94f, -138.13f, -138.35f)
                reflectiveCurveToRelative(61.84f, -138.35f, 138.13f, -138.35f)
                reflectiveCurveToRelative(138.13f, 61.94f, 138.13f, 138.35f)
                curveTo(320.65f, 406.29f, 258.87f, 468.18f, 182.62f, 468.27f)
                close()
            }
        }.also { _Mars = it}
