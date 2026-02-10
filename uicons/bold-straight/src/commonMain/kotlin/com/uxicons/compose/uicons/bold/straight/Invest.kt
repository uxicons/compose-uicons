package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Invest: ImageVector? = null

val Icons.Bs.Invest: ImageVector
    get() = _Invest ?: UXIcon(name = "Invest") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 6.95f)
                verticalLineToRelative(3.59f)
                curveToRelative(1.22f, 1.1f, 2f, 2.69f, 2f, 4.46f)
                curveToRelative(0f, 1.11f, -0.31f, 2.15f, -0.84f, 3.04f)
                lineToRelative(-3.66f, -3.66f)
                verticalLineTo(4.02f)
                horizontalLineToRelative(2.48f)
                lineTo(12.83f, 0.37f)
                curveToRelative(-0.44f, -0.49f, -1.22f, -0.49f, -1.66f, 0f)
                lineToRelative(-3.18f, 3.65f)
                horizontalLineToRelative(2.52f)
                verticalLineToRelative(2.12f)
                curveToRelative(-4.25f, 0.72f, -7.5f, 4.41f, -7.5f, 8.87f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                curveToRelative(0f, -3.52f, -2.04f, -6.57f, -5f, -8.05f)
                close()
                moveTo(6f, 15f)
                curveToRelative(0f, -2.79f, 1.92f, -5.13f, 4.5f, -5.8f)
                verticalLineToRelative(6.42f)
                lineToRelative(4.54f, 4.54f)
                curveToRelative(-0.89f, 0.53f, -1.93f, 0.84f, -3.04f, 0.84f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                close()
            }
        }.also { _Invest = it}
