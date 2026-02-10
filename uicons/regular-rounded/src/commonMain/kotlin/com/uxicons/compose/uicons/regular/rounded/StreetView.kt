package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StreetView: ImageVector? = null

val Icons.Rr.StreetView: ImageVector
    get() = _StreetView ?: UXIcon(name = "StreetView") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(15f, 19f)
                verticalLineToRelative(-4.17f)
                curveToRelative(1.16f, -0.41f, 2f, -1.52f, 2f, -2.83f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.3f, 0.84f, 2.42f, 2f, 2.83f)
                verticalLineToRelative(4.17f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
                moveTo(24f, 19.5f)
                curveToRelative(0f, -1.75f, -2.06f, -3.14f, -5.8f, -3.91f)
                curveToRelative(-0.54f, -0.11f, -1.07f, 0.23f, -1.18f, 0.78f)
                curveToRelative(-0.11f, 0.54f, 0.23f, 1.07f, 0.78f, 1.18f)
                curveToRelative(3.15f, 0.65f, 4.2f, 1.62f, 4.2f, 1.96f)
                curveToRelative(0f, 0.75f, -3.4f, 2.5f, -10f, 2.5f)
                reflectiveCurveToRelative(-10f, -1.75f, -10f, -2.5f)
                curveToRelative(0f, -0.34f, 1.06f, -1.3f, 4.2f, -1.96f)
                curveToRelative(0.54f, -0.11f, 0.89f, -0.64f, 0.78f, -1.18f)
                curveToRelative(-0.11f, -0.54f, -0.65f, -0.89f, -1.18f, -0.78f)
                curveToRelative(-3.74f, 0.78f, -5.8f, 2.17f, -5.8f, 3.91f)
                curveToRelative(0f, 3.09f, 6.22f, 4.5f, 12f, 4.5f)
                reflectiveCurveToRelative(12f, -1.41f, 12f, -4.5f)
                close()
            }
        }.also { _StreetView = it}
