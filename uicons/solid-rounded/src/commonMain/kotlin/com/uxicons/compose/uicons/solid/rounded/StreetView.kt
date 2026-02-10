package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StreetView: ImageVector? = null

val Icons.Sr.StreetView: ImageVector
    get() = _StreetView ?: UXIcon(name = "StreetView") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(7f, 12f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.3f, -0.84f, 2.42f, -2f, 2.83f)
                verticalLineToRelative(4.17f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4.17f)
                curveToRelative(-1.16f, -0.41f, -2f, -1.52f, -2f, -2.83f)
                close()
                moveTo(18.2f, 15.59f)
                curveToRelative(-0.3f, -0.06f, -0.6f, 0.01f, -0.83f, 0.2f)
                curveToRelative(-0.23f, 0.19f, -0.37f, 0.47f, -0.37f, 0.78f)
                verticalLineToRelative(2.37f)
                curveToRelative(0f, 1.56f, -1.2f, 2.89f, -2.76f, 2.99f)
                curveToRelative(-0.7f, 0.05f, -1.45f, 0.07f, -2.24f, 0.07f)
                reflectiveCurveToRelative(-1.54f, -0.03f, -2.24f, -0.07f)
                curveToRelative(-1.56f, -0.1f, -2.76f, -1.43f, -2.76f, -2.99f)
                verticalLineToRelative(-2.37f)
                curveToRelative(0f, -0.3f, -0.14f, -0.59f, -0.37f, -0.78f)
                curveToRelative(-0.23f, -0.19f, -0.54f, -0.27f, -0.83f, -0.2f)
                curveToRelative(-3.74f, 0.78f, -5.8f, 2.17f, -5.8f, 3.91f)
                curveToRelative(0f, 3.09f, 6.22f, 4.5f, 12f, 4.5f)
                reflectiveCurveToRelative(12f, -1.41f, 12f, -4.5f)
                curveToRelative(0f, -1.75f, -2.06f, -3.14f, -5.8f, -3.91f)
                close()
            }
        }.also { _StreetView = it}
