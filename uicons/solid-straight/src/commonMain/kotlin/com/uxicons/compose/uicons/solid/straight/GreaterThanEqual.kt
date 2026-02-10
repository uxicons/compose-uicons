package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GreaterThanEqual: ImageVector? = null

val Icons.Ss.GreaterThanEqual: ImageVector
    get() = _GreaterThanEqual ?: UXIcon(name = "GreaterThanEqual") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 16.82f)
                lineToRelative(14.03f, -7.32f)
                lineTo(3f, 2.27f)
                lineTo(3f, 0.03f)
                reflectiveCurveToRelative(18.5f, 9.47f, 18.5f, 9.47f)
                lineTo(3f, 18.99f)
                verticalLineToRelative(-2.17f)
                close()
                moveTo(21f, 22f)
                lineTo(3f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _GreaterThanEqual = it}
