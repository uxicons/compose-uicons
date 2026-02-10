package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BitcoinSign: ImageVector? = null

val Icons.Bs.BitcoinSign: ImageVector
    get() = _BitcoinSign ?: UXIcon(name = "BitcoinSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.92f, 10.76f)
                curveToRelative(0.68f, -0.91f, 1.08f, -2.04f, 1.08f, -3.26f)
                curveToRelative(0f, -2.86f, -2.2f, -5.22f, -5f, -5.48f)
                lineTo(15f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(12f, 2f)
                horizontalLineToRelative(-2f)
                lineTo(10f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(7f, 2f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                curveToRelative(0f, -2.25f, -1.24f, -4.21f, -3.08f, -5.24f)
                close()
                moveTo(6f, 5.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(14.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                lineTo(6f, 10f)
                lineTo(6f, 5.5f)
                close()
                moveTo(16f, 19f)
                lineTo(6.5f, 19f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
            }
        }.also { _BitcoinSign = it}
