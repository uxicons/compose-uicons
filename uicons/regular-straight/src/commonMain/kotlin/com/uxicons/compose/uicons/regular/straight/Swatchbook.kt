package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Swatchbook: ImageVector? = null

val Icons.Rs.Swatchbook: ImageVector
    get() = _Swatchbook ?: UXIcon(name = "Swatchbook") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.78f, 13f)
                lineToRelative(3.69f, -3.69f)
                lineTo(14.69f, 1.53f)
                lineToRelative(-3.69f, 3.69f)
                lineTo(11f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(18.5f)
                curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(18.5f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(-5.22f)
                close()
                moveTo(14.69f, 4.36f)
                lineToRelative(4.95f, 4.95f)
                lineToRelative(-8.64f, 8.64f)
                verticalLineToRelative(-9.9f)
                lineToRelative(3.69f, -3.69f)
                close()
                moveTo(9.0f, 12f)
                lineTo(2f, 12f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(4f)
                close()
                moveTo(9.0f, 2f)
                verticalLineToRelative(4f)
                lineTo(2f, 6f)
                lineTo(2f, 2f)
                horizontalLineToRelative(7f)
                close()
                moveTo(2f, 18.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                close()
                moveTo(22f, 22f)
                horizontalLineToRelative(-12.22f)
                lineToRelative(7f, -7f)
                horizontalLineToRelative(5.22f)
                verticalLineToRelative(7f)
                close()
                moveTo(7f, 18.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _Swatchbook = it}
