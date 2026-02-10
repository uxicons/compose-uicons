package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DollyFlatbedEmpty: ImageVector? = null

val Icons.Bs.DollyFlatbedEmpty: ImageVector
    get() = _DollyFlatbedEmpty ?: UXIcon(name = "DollyFlatbedEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 21f)
                horizontalLineToRelative(-2.55f)
                curveToRelative(0.03f, 0.16f, 0.05f, 0.33f, 0.05f, 0.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -0.17f, 0.02f, -0.34f, 0.05f, -0.5f)
                horizontalLineToRelative(-5.6f)
                curveToRelative(0.03f, 0.16f, 0.05f, 0.33f, 0.05f, 0.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -0.18f, 0.02f, -0.36f, 0.06f, -0.53f)
                curveToRelative(-1.72f, -0.22f, -3.06f, -1.69f, -3.06f, -3.47f)
                verticalLineTo(3.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(17.5f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _DollyFlatbedEmpty = it}
