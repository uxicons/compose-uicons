package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DigitalWallet: ImageVector? = null

val Icons.Rs.DigitalWallet: ImageVector
    get() = _DigitalWallet ?: UXIcon(name = "DigitalWallet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 3f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                lineTo(24f, 4f)
                lineTo(24f, 20f)
                lineTo(14.67f, 20f)
                curveToRelative(-0.15f, -0.69f, -0.36f, -1.35f, -0.61f, -2f)
                horizontalLineToRelative(7.94f)
                lineTo(22f, 6f)
                lineTo(4f, 6f)
                curveToRelative(-0.35f, 0f, -0.69f, -0.07f, -1f, -0.18f)
                verticalLineToRelative(3.34f)
                curveToRelative(-0.66f, -0.09f, -1.32f, -0.16f, -2f, -0.16f)
                lineTo(1f, 3f)
                curveTo(1f, 1.35f, 2.35f, 0f, 4f, 0f)
                lineTo(24f, 0f)
                lineTo(24f, 2f)
                lineTo(4f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(20f, 12f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(1.5f, 21f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(1f, 16f)
                verticalLineToRelative(2f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                close()
                moveTo(1f, 11f)
                verticalLineToRelative(2f)
                curveToRelative(5.51f, 0f, 10f, 4.49f, 10f, 10f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -6.62f, -5.38f, -12f, -12f, -12f)
                close()
            }
        }.also { _DigitalWallet = it}
