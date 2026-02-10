package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MinusHexagon: ImageVector? = null

val Icons.Sr.MinusHexagon: ImageVector
    get() = _MinusHexagon ?: UXIcon(name = "MinusHexagon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.34f, 9.48f)
                lineToRelative(-3.5f, -6f)
                curveToRelative(-0.89f, -1.53f, -2.55f, -2.48f, -4.32f, -2.48f)
                horizontalLineToRelative(-7.07f)
                curveToRelative(-1.77f, 0f, -3.43f, 0.95f, -4.32f, 2.48f)
                lineTo(0.63f, 9.48f)
                curveToRelative(-0.91f, 1.55f, -0.91f, 3.48f, 0f, 5.04f)
                lineToRelative(3.5f, 6f)
                curveToRelative(0.89f, 1.53f, 2.55f, 2.48f, 4.32f, 2.48f)
                horizontalLineToRelative(7.07f)
                curveToRelative(1.77f, 0f, 3.43f, -0.95f, 4.32f, -2.48f)
                lineToRelative(3.5f, -6f)
                curveToRelative(0.91f, -1.55f, 0.91f, -3.48f, 0f, -5.04f)
                close()
                moveTo(16f, 13f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _MinusHexagon = it}
