package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Brightness: ImageVector? = null

val Icons.Ss.Brightness: ImageVector
    get() = _Brightness ?: UXIcon(name = "Brightness") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 17f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(13f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 5f)
                horizontalLineToRelative(2f)
                lineTo(13f, 0f)
                close()
                moveTo(13f, 19f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                close()
                moveTo(5f, 11f)
                lineTo(0f, 11f)
                verticalLineToRelative(2f)
                lineTo(5f, 13f)
                verticalLineToRelative(-2f)
                close()
                moveTo(24f, 11f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                close()
                moveTo(21.19f, 4.22f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-3.54f, 3.54f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(3.54f, -3.54f)
                close()
                moveTo(7.76f, 17.66f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-3.54f, 3.54f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(3.54f, -3.54f)
                close()
                moveTo(7.76f, 6.35f)
                lineToRelative(-3.54f, -3.54f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(3.54f, 3.54f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(21.2f, 19.79f)
                lineToRelative(-3.54f, -3.54f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(3.54f, 3.54f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }.also { _Brightness = it}
