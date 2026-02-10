package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DollyFlatbedAlt: ImageVector? = null

val Icons.Ss.DollyFlatbedAlt: ImageVector
    get() = _DollyFlatbedAlt ?: UXIcon(name = "DollyFlatbedAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 16f)
                horizontalLineToRelative(17f)
                verticalLineToRelative(-7f)
                lineTo(7f, 9f)
                verticalLineToRelative(7f)
                close()
                moveTo(14f, 0f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                lineTo(14f, 0f)
                close()
                moveTo(16f, 2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(8f)
                lineTo(24f, 2f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(24f, 20f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-1f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(3f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(0f, 2f)
                lineTo(0f, 0f)
                horizontalLineToRelative(2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _DollyFlatbedAlt = it}
