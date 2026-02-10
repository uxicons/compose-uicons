package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BellConcierge: ImageVector? = null

val Icons.Ts.BellConcierge: ImageVector
    get() = _BellConcierge ?: UXIcon(name = "BellConcierge") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 18f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -6.45f, -5.11f, -11.73f, -11.5f, -11.99f)
                verticalLineTo(0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3.01f)
                curveTo(5.11f, 3.27f, 0f, 8.55f, 0f, 15f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(11.5f)
                verticalLineToRelative(3f)
                horizontalLineTo(0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-11.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(1f, 15f)
                curveToRelative(0f, -6.07f, 4.93f, -11f, 11f, -11f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                verticalLineToRelative(2f)
                horizontalLineTo(1f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _BellConcierge = it}
