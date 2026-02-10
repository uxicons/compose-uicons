package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TwitterAltCircle: ImageVector? = null

val Icons.Brand.TwitterAltCircle: ImageVector
    get() = _TwitterAltCircle ?: UXIcon(name = "TwitterAltCircle") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.86f, 6.16f)
            lineToRelative(8.88f, 11.61f)
            lineToRelative(1.36f, 0f)
            lineToRelative(-8.78f, -11.61f)
            lineToRelative(-1.46f, 0f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 0f)
            curveTo(5.37f, 0f, 0f, 5.37f, 0f, 12f)
            reflectiveCurveToRelative(5.37f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.37f, 12f, -12f)
            reflectiveCurveTo(18.63f, 0f, 12f, 0f)
            close()
            moveTo(15.06f, 19.23f)
            lineToRelative(-3.87f, -5.05f)
            lineToRelative(-4.42f, 5.05f)
            horizontalLineToRelative(-2.46f)
            lineToRelative(5.73f, -6.55f)
            lineToRelative(-6.05f, -7.91f)
            horizontalLineToRelative(5.06f)
            lineToRelative(3.49f, 4.62f)
            lineToRelative(4.04f, -4.62f)
            horizontalLineToRelative(2.46f)
            lineToRelative(-5.36f, 6.13f)
            lineToRelative(6.31f, 8.34f)
            horizontalLineToRelative(-4.94f)
            close()
        }
    }.also { _TwitterAltCircle = it }
