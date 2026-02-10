package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MagnifyingGlassWave: ImageVector? = null

val Icons.Ts.MagnifyingGlassWave: ImageVector
    get() = _MagnifyingGlassWave ?: UXIcon(name = "MagnifyingGlassWave") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.99f, 23.28f)
                lineToRelative(-6.58f, -6.58f)
                curveToRelative(1.61f, -1.77f, 2.6f, -4.12f, 2.6f, -6.7f)
                curveTo(20f, 4.49f, 15.51f, 0f, 10f, 0f)
                reflectiveCurveTo(0f, 4.49f, 0f, 10f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                curveToRelative(2.58f, 0f, 4.92f, -0.99f, 6.7f, -2.6f)
                lineToRelative(6.58f, 6.58f)
                lineToRelative(0.71f, -0.71f)
                close()
                moveTo(1f, 10f)
                curveTo(1f, 5.04f, 5.04f, 1f, 10f, 1f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                reflectiveCurveTo(1f, 14.96f, 1f, 10f)
                close()
                moveTo(8.49f, 16f)
                horizontalLineToRelative(3f)
                lineToRelative(0.01f, -12f)
                horizontalLineToRelative(-3f)
                lineToRelative(-0.01f, 12f)
                close()
                moveTo(9.5f, 5f)
                horizontalLineToRelative(1f)
                lineToRelative(-0.01f, 10f)
                horizontalLineToRelative(-1f)
                lineToRelative(0.01f, -10f)
                close()
                moveTo(12.99f, 13.99f)
                horizontalLineToRelative(3f)
                lineToRelative(0.01f, -7.99f)
                horizontalLineToRelative(-3f)
                lineToRelative(-0.01f, 7.99f)
                close()
                moveTo(14f, 7f)
                horizontalLineToRelative(1f)
                lineToRelative(-0.01f, 5.99f)
                horizontalLineToRelative(-1f)
                lineToRelative(0.01f, -5.99f)
                close()
                moveTo(4f, 13f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6f)
                close()
                moveTo(5f, 8f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _MagnifyingGlassWave = it}
