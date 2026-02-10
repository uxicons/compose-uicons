package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Newspaper: ImageVector? = null

val Icons.Bs.Newspaper: ImageVector
    get() = _Newspaper ?: UXIcon(name = "Newspaper") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 9f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
                moveTo(10f, 19f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(3f)
                close()
                moveTo(24f, 3.5f)
                verticalLineToRelative(16.5f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                lineTo(4f, 24f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                lineTo(0f, 6f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(12f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(5f, 9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-11f)
                close()
                moveTo(21f, 3.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-12f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(16.5f)
                curveToRelative(0f, 0.34f, -0.04f, 0.68f, -0.13f, 1f)
                horizontalLineToRelative(12.13f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                lineTo(21f, 3.5f)
                close()
                moveTo(10f, 14f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(3f)
                close()
                moveTo(16f, 9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _Newspaper = it}
