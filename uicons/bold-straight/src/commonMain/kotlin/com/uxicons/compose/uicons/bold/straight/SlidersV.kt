package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SlidersV: ImageVector? = null

val Icons.Bs.SlidersV: ImageVector
    get() = _SlidersV ?: UXIcon(name = "SlidersV") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.5f, 7.5f)
                curveToRelative(0f, 1.4f, -0.82f, 2.6f, -2f, 3.16f)
                verticalLineToRelative(13.34f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-13.34f)
                curveToRelative(-1.18f, -0.56f, -2f, -1.77f, -2f, -3.16f)
                reflectiveCurveToRelative(0.82f, -2.6f, 2f, -3.16f)
                lineTo(2.5f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4.34f)
                curveToRelative(1.18f, 0.56f, 2f, 1.77f, 2f, 3.16f)
                close()
                moveTo(13.5f, 13.34f)
                lineTo(13.5f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(13.34f)
                curveToRelative(-1.18f, 0.56f, -2f, 1.77f, -2f, 3.16f)
                reflectiveCurveToRelative(0.82f, 2.6f, 2f, 3.16f)
                verticalLineToRelative(4.34f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4.34f)
                curveToRelative(1.18f, -0.56f, 2f, -1.77f, 2f, -3.16f)
                reflectiveCurveToRelative(-0.82f, -2.6f, -2f, -3.16f)
                close()
                moveTo(23.5f, 7.5f)
                curveToRelative(0f, -1.4f, -0.82f, -2.6f, -2f, -3.16f)
                lineTo(21.5f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4.34f)
                curveToRelative(-1.18f, 0.56f, -2f, 1.77f, -2f, 3.16f)
                reflectiveCurveToRelative(0.82f, 2.6f, 2f, 3.16f)
                verticalLineToRelative(13.34f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-13.34f)
                curveToRelative(1.18f, -0.56f, 2f, -1.77f, 2f, -3.16f)
                close()
            }
        }.also { _SlidersV = it}
