package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DollyFlatbedEmpty: ImageVector? = null

val Icons.Br.DollyFlatbedEmpty: ImageVector
    get() = _DollyFlatbedEmpty ?: UXIcon(name = "DollyFlatbedEmpty") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.5f, 18.01f)
            horizontalLineToRelative(-14f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineTo(4.51f)
            curveTo(6f, 2.03f, 3.98f, 0.01f, 1.5f, 0.01f)
            curveTo(0.67f, 0.01f, 0f, 0.69f, 0f, 1.51f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 2.13f, 1.22f, 3.99f, 3f, 4.9f)
            verticalLineToRelative(1.1f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _DollyFlatbedEmpty = it }
