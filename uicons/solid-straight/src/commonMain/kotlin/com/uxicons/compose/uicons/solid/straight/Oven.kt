package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Oven: ImageVector? = null

val Icons.Ss.Oven: ImageVector
    get() = _Oven ?: UXIcon(name = "Oven") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 10f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-14f)
                lineTo(2f, 10f)
                close()
                moveTo(19f, 13f)
                verticalLineToRelative(8f)
                lineTo(5f, 21f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(14f)
                close()
                moveTo(17f, 15f)
                lineToRelative(0.0f, 4f)
                lineTo(7f, 19f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(10f)
                close()
                moveTo(22f, 8f)
                lineTo(22f, 3f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                lineTo(5f, 0f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(20f)
                close()
                moveTo(17.5f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(12f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(6.5f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
            }
        }.also { _Oven = it}
