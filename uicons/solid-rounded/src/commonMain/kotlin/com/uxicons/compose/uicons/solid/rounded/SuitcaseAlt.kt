package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SuitcaseAlt: ImageVector? = null

val Icons.Sr.SuitcaseAlt: ImageVector
    get() = _SuitcaseAlt ?: UXIcon(name = "SuitcaseAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 4f)
                horizontalLineToRelative(-1.1f)
                curveToRelative(-0.47f, -2.28f, -2.48f, -4f, -4.9f, -4f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.41f, 0f, -4.43f, 1.72f, -4.9f, 4f)
                horizontalLineToRelative(-1.1f)
                curveTo(2.24f, 4f, 0f, 6.24f, 0f, 9f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(1f)
                lineTo(6f, 9f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(8f)
                lineTo(16f, 9f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(1f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 9f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(8.17f, 4f)
                curveToRelative(0.41f, -1.16f, 1.52f, -2f, 2.83f, -2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.3f, 0f, 2.42f, 0.84f, 2.83f, 2f)
                horizontalLineToRelative(-7.66f)
                close()
            }
        }.also { _SuitcaseAlt = it}
