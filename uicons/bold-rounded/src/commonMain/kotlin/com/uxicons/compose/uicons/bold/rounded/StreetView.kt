package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StreetView: ImageVector? = null

val Icons.Br.StreetView: ImageVector
    get() = _StreetView ?: UXIcon(name = "StreetView") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.5f, 2.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(8f, 11.5f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 1.39f, -0.82f, 2.6f, -2f, 3.16f)
            verticalLineToRelative(2.84f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-2.84f)
            curveToRelative(-1.18f, -0.56f, -2f, -1.77f, -2f, -3.16f)
            close()
            moveTo(11f, 11.5f)
            curveToRelative(0f, 0.28f, 0.23f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
            verticalLineToRelative(1.5f)
            close()
            moveTo(18.86f, 15.04f)
            curveToRelative(-0.81f, -0.2f, -1.62f, 0.29f, -1.82f, 1.09f)
            curveToRelative(-0.2f, 0.8f, 0.29f, 1.62f, 1.09f, 1.82f)
            curveToRelative(1.7f, 0.43f, 2.5f, 0.94f, 2.78f, 1.2f)
            curveToRelative(-0.67f, 0.64f, -3.67f, 1.84f, -8.91f, 1.84f)
            reflectiveCurveToRelative(-8.24f, -1.2f, -8.91f, -1.84f)
            curveToRelative(0.28f, -0.27f, 1.08f, -0.78f, 2.78f, -1.2f)
            curveToRelative(0.8f, -0.2f, 1.29f, -1.02f, 1.09f, -1.82f)
            curveToRelative(-0.2f, -0.8f, -1.02f, -1.29f, -1.82f, -1.09f)
            curveToRelative(-3.31f, 0.83f, -5.13f, 2.29f, -5.13f, 4.11f)
            curveToRelative(0f, 3.34f, 6.03f, 4.84f, 12f, 4.84f)
            reflectiveCurveToRelative(12f, -1.5f, 12f, -4.84f)
            curveToRelative(0f, -1.82f, -1.82f, -3.28f, -5.13f, -4.11f)
            close()
        }
    }.also { _StreetView = it }
