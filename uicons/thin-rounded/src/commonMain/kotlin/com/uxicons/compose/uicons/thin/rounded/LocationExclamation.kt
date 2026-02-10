package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LocationExclamation: ImageVector? = null

val Icons.Tr.LocationExclamation: ImageVector
    get() = _LocationExclamation ?: UXIcon(name = "LocationExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.78f, 3.21f)
                curveToRelative(-2.08f, -2.07f, -4.84f, -3.21f, -7.78f, -3.21f)
                reflectiveCurveToRelative(-5.7f, 1.14f, -7.78f, 3.21f)
                curveToRelative(-2.08f, 2.07f, -3.22f, 4.82f, -3.22f, 7.75f)
                reflectiveCurveToRelative(1.15f, 5.68f, 3.24f, 7.76f)
                lineToRelative(4.15f, 3.82f)
                curveToRelative(0.97f, 0.94f, 2.25f, 1.47f, 3.61f, 1.47f)
                reflectiveCurveToRelative(2.64f, -0.52f, 3.6f, -1.46f)
                lineToRelative(4.17f, -3.84f)
                curveToRelative(2.08f, -2.07f, 3.22f, -4.82f, 3.22f, -7.75f)
                reflectiveCurveToRelative(-1.15f, -5.68f, -3.22f, -7.75f)
                close()
                moveTo(19.09f, 17.98f)
                lineToRelative(-4.17f, 3.84f)
                curveToRelative(-1.57f, 1.52f, -4.25f, 1.53f, -5.84f, -0.01f)
                lineToRelative(-4.15f, -3.81f)
                curveToRelative(-1.89f, -1.88f, -2.93f, -4.38f, -2.93f, -7.04f)
                reflectiveCurveToRelative(1.04f, -5.16f, 2.93f, -7.04f)
                curveToRelative(1.89f, -1.88f, 4.4f, -2.92f, 7.07f, -2.92f)
                reflectiveCurveToRelative(5.18f, 1.04f, 7.07f, 2.92f)
                curveToRelative(1.89f, 1.88f, 2.93f, 4.38f, 2.93f, 7.04f)
                reflectiveCurveToRelative(-1.04f, 5.16f, -2.91f, 7.02f)
                close()
                moveTo(11.5f, 12.5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                close()
                moveTo(13f, 16f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _LocationExclamation = it}
