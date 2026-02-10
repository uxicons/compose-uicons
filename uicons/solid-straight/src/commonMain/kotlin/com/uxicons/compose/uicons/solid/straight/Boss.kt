package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Boss: ImageVector? = null

val Icons.Ss.Boss: ImageVector
    get() = _Boss ?: UXIcon(name = "Boss") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                close()
                moveTo(24f, 20f)
                lineTo(0f, 20f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(11.41f, 13.62f)
                lineToRelative(-1.75f, -2.62f)
                horizontalLineToRelative(-0.67f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6.2f)
                lineToRelative(1.22f, -4.38f)
                close()
                moveTo(14.33f, 11f)
                lineToRelative(-1.75f, 2.62f)
                lineToRelative(1.22f, 4.38f)
                horizontalLineToRelative(6.2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-0.67f)
                close()
            }
        }.also { _Boss = it}
