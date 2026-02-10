package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Handstand: ImageVector? = null

val Icons.Ss.Handstand: ImageVector
    get() = _Handstand ?: UXIcon(name = "Handstand") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.5f, 19.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(20.62f, 24f)
                horizontalLineToRelative(-2.24f)
                lineToRelative(-4f, -8f)
                horizontalLineToRelative(-4.76f)
                lineToRelative(-4f, 8f)
                horizontalLineToRelative(-2.24f)
                lineToRelative(4.62f, -9.24f)
                verticalLineToRelative(-14.76f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(14.76f)
                close()
            }
        }.also { _Handstand = it}
