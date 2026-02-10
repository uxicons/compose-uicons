package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BellConcierge: ImageVector? = null

val Icons.Sr.BellConcierge: ImageVector
    get() = _BellConcierge ?: UXIcon(name = "BellConcierge") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.4f, 18f)
                curveToRelative(1.43f, 0f, 2.6f, -1.17f, 2.6f, -2.6f)
                verticalLineToRelative(-1.4f)
                curveToRelative(0f, -6.28f, -4.85f, -11.44f, -11f, -11.95f)
                verticalLineToRelative(-1.05f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.05f)
                curveTo(4.85f, 2.56f, 0f, 7.72f, 0f, 14f)
                verticalLineToRelative(1.4f)
                curveToRelative(0f, 1.43f, 1.17f, 2.6f, 2.6f, 2.6f)
                horizontalLineToRelative(8.4f)
                verticalLineToRelative(2f)
                horizontalLineTo(1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(22f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8.4f)
                close()
            }
        }.also { _BellConcierge = it}
