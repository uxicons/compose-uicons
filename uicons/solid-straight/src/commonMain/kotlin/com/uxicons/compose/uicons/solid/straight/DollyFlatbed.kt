package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DollyFlatbed: ImageVector? = null

val Icons.Ss.DollyFlatbed: ImageVector
    get() = _DollyFlatbed ?: UXIcon(name = "DollyFlatbed") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 8f)
                horizontalLineToRelative(-2f)
                lineTo(14f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                close()
                moveTo(23f, 6f)
                verticalLineToRelative(10f)
                lineTo(7f, 16f)
                lineTo(7f, 6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(6f)
                lineTo(18f, 3f)
                horizontalLineToRelative(2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(24f, 18f)
                lineTo(6f, 18f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(5f, 3f)
                curveTo(5f, 1.35f, 3.65f, 0f, 2f, 0f)
                lineTo(0f, 0f)
                lineTo(0f, 2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _DollyFlatbed = it}
