package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BitcoinSign: ImageVector? = null

val Icons.Ss.BitcoinSign: ImageVector
    get() = _BitcoinSign ?: UXIcon(name = "BitcoinSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.43f, 11.35f)
                curveToRelative(0.97f, -0.99f, 1.57f, -2.35f, 1.57f, -3.85f)
                curveToRelative(0f, -2.86f, -2.2f, -5.22f, -5f, -5.47f)
                lineTo(14f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(12f, 2f)
                horizontalLineToRelative(-2f)
                lineTo(10f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(8f, 2f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.5f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                curveToRelative(0f, -2.36f, -1.49f, -4.37f, -3.57f, -5.15f)
                close()
                moveTo(6f, 5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(6f, 11f)
                lineTo(6f, 5f)
                close()
                moveTo(15.5f, 20f)
                lineTo(7f, 20f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-6f)
                lineTo(15.5f, 13f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                close()
            }
        }.also { _BitcoinSign = it}
