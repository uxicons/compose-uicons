package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BedEmpty: ImageVector? = null

val Icons.Sc.BedEmpty: ImageVector
    get() = _BedEmpty ?: UXIcon(name = "BedEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 12.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-0.82f)
                curveToRelative(-1.86f, 0.14f, -4.77f, 0.32f, -8f, 0.32f)
                reflectiveCurveToRelative(-6.14f, -0.17f, -8f, -0.32f)
                verticalLineToRelative(0.82f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-15f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(6.82f)
                curveToRelative(1.86f, -0.14f, 4.77f, -0.32f, 8f, -0.32f)
                curveToRelative(5.49f, 0f, 10.06f, 0.5f, 10.11f, 0.51f)
                curveToRelative(0.51f, 0.06f, 0.89f, 0.48f, 0.89f, 0.99f)
                close()
            }
        }.also { _BedEmpty = it}
