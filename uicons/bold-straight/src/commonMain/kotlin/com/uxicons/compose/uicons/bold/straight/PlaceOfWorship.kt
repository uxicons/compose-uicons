package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaceOfWorship: ImageVector? = null

val Icons.Bs.PlaceOfWorship: ImageVector
    get() = _PlaceOfWorship ?: UXIcon(name = "PlaceOfWorship") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 8.68f)
                lineTo(17f, 3.68f)
                lineTo(12f, 0.04f)
                lineToRelative(-5f, 3.64f)
                verticalLineToRelative(5f)
                lineTo(0f, 13.74f)
                verticalLineToRelative(10.26f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-10.26f)
                lineToRelative(-7f, -5.06f)
                close()
                moveTo(10f, 10.21f)
                verticalLineToRelative(-5f)
                lineToRelative(2f, -1.46f)
                lineToRelative(2f, 1.46f)
                verticalLineToRelative(5f)
                lineToRelative(2f, 1.46f)
                verticalLineToRelative(9.34f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-9.34f)
                lineToRelative(2f, -1.46f)
                close()
                moveTo(3f, 15.26f)
                lineToRelative(2f, -1.46f)
                verticalLineToRelative(7.19f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5.74f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7.19f)
                lineToRelative(2f, 1.46f)
                verticalLineToRelative(5.74f)
                close()
                moveTo(10.5f, 12.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
            }
        }.also { _PlaceOfWorship = it}
