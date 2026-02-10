package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Invest: ImageVector? = null

val Icons.Ss.Invest: ImageVector
    get() = _Invest ?: UXIcon(name = "Invest") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 14.59f)
                lineTo(13f, 6.06f)
                curveToRelative(4.49f, 0.5f, 8f, 4.32f, 8f, 8.94f)
                curveToRelative(0f, 2.12f, -0.74f, 4.07f, -1.97f, 5.62f)
                lineToRelative(-6.03f, -6.03f)
                close()
                moveTo(3f, 15f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                curveToRelative(2.12f, 0f, 4.07f, -0.74f, 5.61f, -1.97f)
                lineToRelative(-6.61f, -6.62f)
                lineTo(11f, 6.06f)
                curveToRelative(-4.49f, 0.5f, -8f, 4.32f, -8f, 8.94f)
                close()
                moveTo(14.6f, 4.6f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.6f, -2.6f)
                curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0f)
                lineToRelative(-2.58f, 2.58f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.58f, -1.58f)
                verticalLineToRelative(3.06f)
                curveToRelative(0.33f, -0.04f, 0.66f, -0.06f, 1f, -0.06f)
                reflectiveCurveToRelative(0.67f, 0.02f, 1f, 0.06f)
                verticalLineToRelative(-3.06f)
                lineToRelative(1.6f, 1.6f)
                close()
            }
        }.also { _Invest = it}
