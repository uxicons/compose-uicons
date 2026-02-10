package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sticker: ImageVector? = null

val Icons.Ts.Sticker: ImageVector
    get() = _Sticker ?: UXIcon(name = "Sticker") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5f, 12f, 12.21f, 12f)
                lineToRelative(11.79f, -11.79f)
                curveTo(24f, 5f, 18.62f, 0f, 12f, 0f)
                close()
                moveTo(1f, 12f)
                curveTo(1f, 5.93f, 5.93f, 1f, 12f, 1f)
                curveToRelative(5.73f, 0f, 10.45f, 4.4f, 10.96f, 10.0f)
                curveToRelative(-6.58f, 0.03f, -11.93f, 5.37f, -11.95f, 11.95f)
                curveToRelative(-5.6f, -0.51f, -10.0f, -5.23f, -10.0f, -10.96f)
                close()
                moveTo(12.0f, 22.79f)
                curveToRelative(0.11f, -5.9f, 4.89f, -10.68f, 10.79f, -10.79f)
                lineToRelative(-10.79f, 10.79f)
                close()
            }
        }.also { _Sticker = it}
