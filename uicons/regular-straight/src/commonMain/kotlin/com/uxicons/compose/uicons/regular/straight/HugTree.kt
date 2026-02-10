package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HugTree: ImageVector? = null

val Icons.Rs.HugTree: ImageVector
    get() = _HugTree ?: UXIcon(name = "HugTree") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.5f, 12f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(12f, 13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-4.91f)
                lineToRelative(-10f, -6.09f)
                verticalLineToRelative(-2f)
                lineToRelative(10f, 4.78f)
                verticalLineToRelative(-4.78f)
                horizontalLineToRelative(2f)
                close()
                moveTo(5f, 15f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                close()
                moveTo(10f, 24f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(24f, 1.9f)
                lineTo(21.86f, 3.47f)
                lineTo(21.33f, -0f)
                horizontalLineToRelative(-1.33f)
                verticalLineToRelative(4.84f)
                lineToRelative(-2f, 1.47f)
                verticalLineToRelative(-6.31f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-13.93f)
                lineToRelative(6f, -6.17f)
                close()
            }
        }.also { _HugTree = it}
