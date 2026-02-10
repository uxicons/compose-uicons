package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapPin: ImageVector? = null

val Icons.Rs.MapPin: ImageVector
    get() = _MapPin ?: UXIcon(name = "MapPin") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 6f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveTo(6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 2.97f, 2.17f, 5.44f, 5f, 5.92f)
                verticalLineToRelative(12.08f)
                horizontalLineToRelative(2f)
                lineTo(13f, 11.92f)
                curveToRelative(2.83f, -0.48f, 5f, -2.95f, 5f, -5.92f)
                close()
                moveTo(12f, 10f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
            }
        }.also { _MapPin = it}
