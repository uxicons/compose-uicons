package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapPin: ImageVector? = null

val Icons.Ss.MapPin: ImageVector
    get() = _MapPin ?: UXIcon(name = "MapPin") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 6f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveTo(6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 2.97f, 2.17f, 5.43f, 5f, 5.91f)
                verticalLineToRelative(12.09f)
                horizontalLineToRelative(2f)
                verticalLineTo(11.91f)
                curveToRelative(2.83f, -0.48f, 5f, -2.94f, 5f, -5.91f)
                close()
            }
        }.also { _MapPin = it}
