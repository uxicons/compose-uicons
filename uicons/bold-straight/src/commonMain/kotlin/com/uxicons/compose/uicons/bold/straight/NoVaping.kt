package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoVaping: ImageVector? = null

val Icons.Bs.NoVaping: ImageVector
    get() = _NoVaping ?: UXIcon(name = "NoVaping") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.72f, 24f)
                horizontalLineToRelative(-12.72f)
                verticalLineToRelative(-22f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(5.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(0.76f)
                curveToRelative(-1.11f, 0.29f, -2.13f, 0.8f, -3f, 1.5f)
                verticalLineToRelative(-2.26f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-9.5f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(7.59f)
                curveToRelative(0.47f, 1.16f, 1.21f, 2.19f, 2.13f, 3f)
                close()
                moveTo(24f, 18f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(18f, 15f)
                curveToRelative(-0.27f, 0f, -0.52f, 0.05f, -0.77f, 0.11f)
                lineToRelative(3.65f, 3.65f)
                curveToRelative(0.07f, -0.25f, 0.11f, -0.5f, 0.11f, -0.77f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(18f, 21f)
                curveToRelative(0.27f, 0f, 0.52f, -0.05f, 0.77f, -0.11f)
                lineToRelative(-3.65f, -3.65f)
                curveToRelative(-0.07f, 0.25f, -0.11f, 0.5f, -0.11f, 0.77f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                close()
            }
        }.also { _NoVaping = it}
