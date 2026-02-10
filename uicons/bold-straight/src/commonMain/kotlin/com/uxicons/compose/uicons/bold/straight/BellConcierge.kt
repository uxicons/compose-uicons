package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BellConcierge: ImageVector? = null

val Icons.Bs.BellConcierge: ImageVector
    get() = _BellConcierge ?: UXIcon(name = "BellConcierge") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 18f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -6.11f, -4.59f, -11.17f, -10.5f, -11.91f)
                verticalLineTo(0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2.59f)
                curveTo(4.59f, 3.33f, 0f, 8.39f, 0f, 14.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(2f)
                horizontalLineTo(0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-10.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10.5f)
                close()
                moveTo(3f, 14.5f)
                curveToRelative(0f, -4.96f, 4.04f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                verticalLineToRelative(0.5f)
                horizontalLineTo(3f)
                verticalLineToRelative(-0.5f)
                close()
            }
        }.also { _BellConcierge = it}
