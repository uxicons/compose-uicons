package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DigitalWallet: ImageVector? = null

val Icons.Ts.DigitalWallet: ImageVector
    get() = _DigitalWallet ?: UXIcon(name = "DigitalWallet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 2.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                lineTo(24f, 4f)
                lineTo(24f, 20f)
                lineTo(13.41f, 20f)
                curveToRelative(-0.1f, -0.34f, -0.22f, -0.67f, -0.35f, -1f)
                horizontalLineToRelative(9.94f)
                lineTo(23f, 5f)
                lineTo(2.5f, 5f)
                curveToRelative(-0.56f, 0f, -1.08f, -0.2f, -1.5f, -0.51f)
                verticalLineToRelative(5.56f)
                curveToRelative(-0.33f, -0.02f, -0.66f, -0.05f, -1f, -0.05f)
                lineTo(0f, 2.5f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                lineTo(24f, 0f)
                lineTo(24f, 1f)
                lineTo(2.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(0f, 17f)
                verticalLineToRelative(1f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                close()
                moveTo(0f, 12f)
                verticalLineToRelative(1f)
                curveToRelative(6.07f, 0f, 11f, 4.93f, 11f, 11f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -6.62f, -5.38f, -12f, -12f, -12f)
                close()
                moveTo(1f, 22f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _DigitalWallet = it}
