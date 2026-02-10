package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LocationExclamation: ImageVector? = null

val Icons.Sc.LocationExclamation: ImageVector
    get() = _LocationExclamation ?: UXIcon(name = "LocationExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.01f, 1f)
                curveToRelative(-0.01f, 0f, -0.02f, 0f, -0.03f, 0f)
                curveToRelative(-4.79f, 0.09f, -9.48f, 4.79f, -9.48f, 9.5f)
                curveToRelative(0f, 6.15f, 8.05f, 11.72f, 8.97f, 12.33f)
                curveToRelative(0.34f, 0.23f, 0.79f, 0.23f, 1.12f, -0.01f)
                curveToRelative(0.09f, -0.06f, 8.8f, -6.11f, 8.91f, -12.36f)
                curveToRelative(-0.14f, -4.8f, -4.75f, -9.4f, -9.49f, -9.47f)
                close()
                moveTo(11f, 6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _LocationExclamation = it}
