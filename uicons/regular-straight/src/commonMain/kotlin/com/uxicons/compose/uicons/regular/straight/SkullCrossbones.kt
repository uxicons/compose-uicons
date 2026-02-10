package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkullCrossbones: ImageVector? = null

val Icons.Rs.SkullCrossbones: ImageVector
    get() = _SkullCrossbones ?: UXIcon(name = "SkullCrossbones") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.07f, 19.01f)
                lineToRelative(8.85f, 3.05f)
                lineToRelative(-0.65f, 1.89f)
                lineToRelative(-11.26f, -3.88f)
                lineTo(0.74f, 23.95f)
                lineToRelative(-0.65f, -1.89f)
                lineToRelative(8.85f, -3.05f)
                lineTo(0.08f, 15.96f)
                lineToRelative(0.65f, -1.89f)
                lineToRelative(11.26f, 3.88f)
                lineToRelative(11.26f, -3.88f)
                lineToRelative(0.65f, 1.89f)
                lineToRelative(-8.85f, 3.05f)
                close()
                moveTo(11f, 7.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(14.5f, 9f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(8f, 12f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-3f)
                close()
                moveTo(10f, 10f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _SkullCrossbones = it}
