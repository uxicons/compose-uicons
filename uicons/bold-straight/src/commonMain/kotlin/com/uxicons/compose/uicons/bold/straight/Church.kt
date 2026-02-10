package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Church: ImageVector? = null

val Icons.Bs.Church: ImageVector
    get() = _Church ?: UXIcon(name = "Church") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 5.77f)
                verticalLineToRelative(-1.77f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                lineTo(13f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1.77f)
                lineTo(0f, 13.74f)
                verticalLineToRelative(10.26f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-10.26f)
                lineToRelative(-11f, -7.97f)
                close()
                moveTo(12f, 8.75f)
                lineToRelative(4f, 2.91f)
                verticalLineToRelative(9.34f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-9.34f)
                lineToRelative(4f, -2.91f)
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
            }
        }.also { _Church = it}
