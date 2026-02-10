package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DollyFlatbedEmpty: ImageVector? = null

val Icons.Sr.DollyFlatbedEmpty: ImageVector
    get() = _DollyFlatbedEmpty ?: UXIcon(name = "DollyFlatbedEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 18f)
                horizontalLineToRelative(-15f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineTo(4f)
                curveTo(5f, 1.79f, 3.21f, 0f, 1f, 0f)
                curveTo(0.45f, 0f, 0f, 0.45f, 0f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 2.04f, 1.24f, 3.8f, 3f, 4.58f)
                verticalLineToRelative(1.42f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _DollyFlatbedEmpty = it}
