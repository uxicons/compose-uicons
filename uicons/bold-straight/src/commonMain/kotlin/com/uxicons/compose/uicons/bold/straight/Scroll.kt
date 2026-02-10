package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scroll: ImageVector? = null

val Icons.Bs.Scroll: ImageVector
    get() = _Scroll ?: UXIcon(name = "Scroll") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 16f)
                lineTo(20f, 4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                lineTo(4f, 0f)
                curveTo(1.79f, 0f, 0f, 1.79f, 0f, 4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(11f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(5f, 5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                close()
                moveTo(10f, 20f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                lineTo(8f, 4f)
                curveToRelative(0f, -0.34f, -0.04f, -0.68f, -0.13f, -1f)
                horizontalLineToRelative(8.13f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(4f)
                close()
                moveTo(21f, 20f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-7.13f)
                curveToRelative(0.08f, -0.32f, 0.13f, -0.66f, 0.13f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _Scroll = it}
