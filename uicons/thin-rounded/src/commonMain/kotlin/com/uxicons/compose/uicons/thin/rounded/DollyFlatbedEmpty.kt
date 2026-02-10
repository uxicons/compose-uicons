package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DollyFlatbedEmpty: ImageVector? = null

val Icons.Tr.DollyFlatbedEmpty: ImageVector
    get() = _DollyFlatbedEmpty ?: UXIcon(name = "DollyFlatbedEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.5f, 19f)
                lineTo(7.5f, 19f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(4f, 3.5f)
                curveTo(4f, 1.57f, 2.43f, 0f, 0.5f, 0f)
                curveTo(0.22f, 0f, 0f, 0.22f, 0f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.96f, 1.25f, 3.62f, 3f, 4.24f)
                verticalLineToRelative(1.26f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(11f, 21f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-1.03f)
                curveToRelative(0.16f, 0.02f, 0.33f, 0.03f, 0.5f, 0.03f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1f)
                close()
                moveTo(21f, 21f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _DollyFlatbedEmpty = it}
