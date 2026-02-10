package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Swatchbook: ImageVector? = null

val Icons.Bs.Swatchbook: ImageVector
    get() = _Swatchbook ?: UXIcon(name = "Swatchbook") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.48f, 12f)
                lineToRelative(2.48f, -2.48f)
                lineTo(14.48f, 1.03f)
                lineToRelative(-2.48f, 2.48f)
                lineTo(12f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(18f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(-3.52f)
                close()
                moveTo(14.48f, 5.27f)
                lineToRelative(4.24f, 4.24f)
                lineToRelative(-6.73f, 6.73f)
                lineTo(12f, 7.76f)
                lineToRelative(2.48f, -2.48f)
                close()
                moveTo(9f, 12f)
                lineTo(3f, 12f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                close()
                moveTo(9f, 3f)
                verticalLineToRelative(3f)
                lineTo(3f, 6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6f)
                close()
                moveTo(3f, 18f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-9.52f)
                lineToRelative(6f, -6f)
                horizontalLineToRelative(3.52f)
                verticalLineToRelative(6f)
                close()
                moveTo(7.5f, 18f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _Swatchbook = it}
