package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ExchangeAlt: ImageVector? = null

val Icons.Ts.ExchangeAlt: ImageVector
    get() = _ExchangeAlt ?: UXIcon(name = "ExchangeAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 0.24f)
                lineTo(18f, 6f)
                lineTo(0f, 6f)
                verticalLineToRelative(1f)
                lineTo(18f, 7f)
                verticalLineToRelative(5.64f)
                lineToRelative(5.46f, -5f)
                curveToRelative(0.34f, -0.31f, 0.54f, -0.74f, 0.54f, -1.2f)
                curveToRelative(0f, -0.46f, -0.2f, -0.9f, -0.54f, -1.2f)
                lineTo(18f, 0.24f)
                close()
                moveTo(22.79f, 6.9f)
                lineToRelative(-3.79f, 3.47f)
                lineTo(19f, 2.51f)
                lineToRelative(3.79f, 3.47f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.13f, 0.12f, 0.2f, 0.28f, 0.2f, 0.46f)
                curveToRelative(0f, 0.18f, -0.07f, 0.34f, -0.21f, 0.46f)
                close()
                moveTo(6f, 11.24f)
                lineTo(0.54f, 16.24f)
                curveToRelative(-0.34f, 0.31f, -0.54f, 0.74f, -0.54f, 1.2f)
                curveToRelative(0f, 0.46f, 0.2f, 0.9f, 0.53f, 1.2f)
                lineToRelative(5.47f, 5.0f)
                verticalLineToRelative(-5.64f)
                lineTo(24f, 18.0f)
                verticalLineToRelative(-1f)
                lineTo(6f, 17.0f)
                verticalLineToRelative(-5.76f)
                close()
                moveTo(5f, 21.37f)
                lineToRelative(-3.79f, -3.47f)
                curveToRelative(-0.13f, -0.12f, -0.2f, -0.28f, -0.2f, -0.46f)
                curveToRelative(0f, -0.18f, 0.07f, -0.34f, 0.2f, -0.46f)
                lineToRelative(3.8f, -3.47f)
                verticalLineToRelative(7.86f)
                close()
            }
        }.also { _ExchangeAlt = it}
