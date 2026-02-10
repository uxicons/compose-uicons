package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stamp: ImageVector? = null

val Icons.Bs.Stamp: ImageVector
    get() = _Stamp ?: UXIcon(name = "Stamp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 24f)
                lineTo(2f, 24f)
                verticalLineToRelative(-3f)
                lineTo(22f, 21f)
                verticalLineToRelative(3f)
                close()
                moveTo(24f, 14.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-5.37f)
                curveToRelative(0.45f, -2.89f, 0.87f, -6.08f, 0.87f, -7.09f)
                curveTo(16f, 1.7f, 14.21f, -0.09f, 12f, -0.09f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                curveToRelative(0f, 1.01f, 0.42f, 4.21f, 0.87f, 7.09f)
                lineTo(3.5f, 11f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(4.5f)
                lineTo(24f, 19f)
                verticalLineToRelative(-4.5f)
                close()
                moveTo(3f, 14.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 14f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                lineTo(3f, 16f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(13f, 3.91f)
                curveToRelative(0f, 0.77f, -0.45f, 4.33f, -1f, 7.66f)
                curveToRelative(-0.55f, -3.33f, -1f, -6.89f, -1f, -7.66f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _Stamp = it}
