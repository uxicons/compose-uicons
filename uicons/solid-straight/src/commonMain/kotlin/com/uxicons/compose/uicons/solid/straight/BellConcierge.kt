package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BellConcierge: ImageVector? = null

val Icons.Ss.BellConcierge: ImageVector
    get() = _BellConcierge ?: UXIcon(name = "BellConcierge") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 18f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -6.28f, -4.85f, -11.45f, -11f, -11.96f)
                verticalLineTo(0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.04f)
                curveTo(4.85f, 2.55f, 0f, 7.72f, 0f, 14f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(2f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(11f)
                close()
            }
        }.also { _BellConcierge = it}
