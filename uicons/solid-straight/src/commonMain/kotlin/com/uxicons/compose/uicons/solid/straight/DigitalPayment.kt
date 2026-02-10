package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DigitalPayment: ImageVector? = null

val Icons.Ss.DigitalPayment: ImageVector
    get() = _DigitalPayment ?: UXIcon(name = "DigitalPayment") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 7f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(18f, 9f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(16f, 0f)
                lineTo(16f, 16f)
                lineTo(0f, 16f)
                lineTo(0f, 0f)
                lineTo(16f, 0f)
                close()
                moveTo(8.75f, 11.44f)
                lineToRelative(3.61f, -3.7f)
                lineToRelative(-1.4f, -1.43f)
                lineToRelative(-3.61f, 3.7f)
                lineToRelative(-2.22f, -2.3f)
                lineToRelative(-1.39f, 1.44f)
                lineToRelative(2.18f, 2.27f)
                curveToRelative(0.77f, 0.77f, 2.08f, 0.76f, 2.82f, 0.02f)
                lineToRelative(0.0f, -0.0f)
                horizontalLineToRelative(-0.0f)
                close()
                moveTo(16f, 18f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                lineTo(3f, 24f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                verticalLineToRelative(-3f)
                lineTo(16f, 18f)
                close()
                moveTo(10f, 20f)
                lineTo(6f, 20f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _DigitalPayment = it}
