package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Vision: ImageVector? = null

val Icons.Bs.Vision: ImageVector
    get() = _Vision ?: UXIcon(name = "Vision") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.71f, 5.26f)
                lineToRelative(-1.71f, -2.89f)
                lineTo(5.58f, 0.85f)
                lineToRelative(1.71f, 2.89f)
                lineToRelative(-2.58f, 1.53f)
                close()
                moveTo(22.09f, 11.9f)
                curveToRelative(-0.13f, 0.68f, -3.05f, 6.89f, -10.09f, 7.1f)
                curveToRelative(-6.33f, -0.18f, -9.3f, -5.02f, -10.09f, -6.9f)
                curveToRelative(0.14f, -0.69f, 3.05f, -6.89f, 10.09f, -7.1f)
                curveToRelative(6.29f, 0.19f, 9.34f, 5.1f, 10.09f, 6.9f)
                close()
                moveTo(18.74f, 11.98f)
                curveToRelative(-0.86f, -1.24f, -3.16f, -3.98f, -6.74f, -3.98f)
                curveToRelative(-3.5f, 0f, -5.83f, 2.72f, -6.74f, 4.02f)
                curveToRelative(0.86f, 1.27f, 3.12f, 3.98f, 6.74f, 3.98f)
                curveToRelative(3.5f, 0f, 5.83f, -2.72f, 6.74f, -4.02f)
                close()
                moveTo(12f, 9f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                close()
                moveTo(13.5f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 3f)
                horizontalLineToRelative(3f)
                lineTo(13.5f, 0f)
                close()
                moveTo(21.0f, 2.38f)
                lineToRelative(-2.58f, -1.53f)
                lineToRelative(-1.71f, 2.89f)
                lineToRelative(2.58f, 1.53f)
                lineToRelative(1.71f, -2.89f)
                close()
                moveTo(16.71f, 20.27f)
                lineToRelative(1.71f, 2.89f)
                lineToRelative(2.58f, -1.53f)
                lineToRelative(-1.71f, -2.89f)
                lineToRelative(-2.58f, 1.53f)
                close()
                moveTo(10.5f, 24f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
                moveTo(3.0f, 21.62f)
                lineToRelative(2.58f, 1.53f)
                lineToRelative(1.71f, -2.89f)
                lineToRelative(-2.58f, -1.53f)
                lineToRelative(-1.71f, 2.89f)
                close()
            }
        }.also { _Vision = it}
