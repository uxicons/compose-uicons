package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PesoSign: ImageVector? = null

val Icons.Bs.PesoSign: ImageVector
    get() = _PesoSign ?: UXIcon(name = "PesoSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 5f)
                horizontalLineToRelative(-2.94f)
                curveTo(18.59f, 2.04f, 15.53f, 0f, 12f, 0f)
                lineTo(6.5f, 0f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(1.5f)
                lineTo(1f, 5f)
                verticalLineToRelative(3f)
                lineTo(3f, 8f)
                verticalLineToRelative(2f)
                lineTo(1f, 10f)
                verticalLineToRelative(3f)
                lineTo(3f, 13f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(6f)
                curveToRelative(3.53f, 0f, 6.59f, -2.04f, 8.06f, -5f)
                horizontalLineToRelative(2.94f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.06f)
                curveToRelative(0.04f, -0.33f, 0.06f, -0.66f, 0.06f, -1f)
                reflectiveCurveToRelative(-0.02f, -0.67f, -0.06f, -1f)
                horizontalLineToRelative(2.06f)
                verticalLineToRelative(-3f)
                close()
                moveTo(6f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(5.5f)
                curveToRelative(1.77f, 0f, 3.37f, 0.77f, 4.47f, 2f)
                lineTo(6f, 5f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(12f, 15f)
                lineTo(6f, 15f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10.47f)
                curveToRelative(-1.1f, 1.23f, -2.7f, 2f, -4.47f, 2f)
                close()
                moveTo(18f, 9f)
                curveToRelative(0f, 0.34f, -0.03f, 0.67f, -0.08f, 1f)
                lineTo(6f, 10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(11.92f)
                curveToRelative(0.05f, 0.33f, 0.08f, 0.66f, 0.08f, 1f)
                close()
            }
        }.also { _PesoSign = it}
