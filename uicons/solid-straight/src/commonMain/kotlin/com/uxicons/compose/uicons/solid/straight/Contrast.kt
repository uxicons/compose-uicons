package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Contrast: ImageVector? = null

val Icons.Ss.Contrast: ImageVector
    get() = _Contrast ?: UXIcon(name = "Contrast") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 21f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(13f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                close()
                moveTo(21f, 11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                close()
                moveTo(3f, 11f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                close()
                moveTo(2.81f, 19.78f)
                lineTo(4.22f, 21.19f)
                lineTo(6.34f, 19.07f)
                lineTo(4.93f, 17.66f)
                close()
                moveTo(21.19f, 4.22f)
                lineTo(19.78f, 2.81f)
                lineTo(17.66f, 4.93f)
                lineTo(19.07f, 6.34f)
                close()
                moveTo(17.66f, 19.07f)
                lineTo(19.78f, 21.19f)
                lineTo(21.19f, 19.78f)
                lineTo(19.07f, 17.66f)
                close()
                moveTo(6.34f, 4.93f)
                lineTo(4.22f, 2.81f)
                lineTo(2.81f, 4.22f)
                lineTo(4.93f, 6.34f)
                close()
                moveTo(19f, 12f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                close()
                moveTo(17f, 12f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                verticalLineToRelative(10f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                close()
            }
        }.also { _Contrast = it}
