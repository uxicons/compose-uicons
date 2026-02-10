package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Brightness: ImageVector? = null

val Icons.Bs.Brightness: ImageVector
    get() = _Brightness ?: UXIcon(name = "Brightness") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 17f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(12f, 10f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(13.5f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 5f)
                horizontalLineToRelative(3f)
                lineTo(13.5f, 0f)
                close()
                moveTo(13.5f, 19f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5f)
                close()
                moveTo(5f, 10.5f)
                lineTo(0f, 10.5f)
                verticalLineToRelative(3f)
                lineTo(5f, 13.5f)
                verticalLineToRelative(-3f)
                close()
                moveTo(24f, 10.5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3f)
                close()
                moveTo(21.55f, 4.58f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-3.54f, 3.54f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(3.54f, -3.54f)
                close()
                moveTo(8.11f, 18.02f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-3.54f, 3.54f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(3.54f, -3.54f)
                close()
                moveTo(8.11f, 6f)
                lineToRelative(-3.54f, -3.54f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(3.54f, 3.54f)
                lineToRelative(2.12f, -2.12f)
                close()
                moveTo(21.55f, 19.44f)
                lineToRelative(-3.54f, -3.54f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(3.54f, 3.54f)
                lineToRelative(2.12f, -2.12f)
                close()
            }
        }.also { _Brightness = it}
