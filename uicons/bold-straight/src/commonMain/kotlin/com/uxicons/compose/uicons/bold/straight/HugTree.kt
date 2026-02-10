package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HugTree: ImageVector? = null

val Icons.Bs.HugTree: ImageVector
    get() = _HugTree ?: UXIcon(name = "HugTree") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.5f, 12f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(10f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-4.91f)
                lineToRelative(-10f, -6.09f)
                verticalLineToRelative(-2f)
                lineToRelative(10f, 4.78f)
                close()
                moveTo(5f, 16f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(2f)
                close()
                moveTo(10f, 24f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(24f, 1.9f)
                lineTo(21.86f, 3.47f)
                lineTo(21.33f, -0f)
                horizontalLineToRelative(-1.33f)
                verticalLineToRelative(4.84f)
                lineToRelative(-2f, 1.47f)
                verticalLineToRelative(-6.31f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-13.93f)
                lineToRelative(6f, -6.17f)
                close()
            }
        }.also { _HugTree = it}
