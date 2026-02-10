package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DigitalPayment: ImageVector? = null

val Icons.Bs.DigitalPayment: ImageVector
    get() = _DigitalPayment ?: UXIcon(name = "DigitalPayment") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 3f)
                horizontalLineToRelative(-5f)
                lineTo(16f, 0f)
                lineTo(0f, 0f)
                lineTo(0f, 21f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                lineTo(13f, 24f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8f)
                lineTo(24f, 6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(21f, 6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                close()
                moveTo(10.0f, 22.01f)
                lineTo(6.0f, 22.01f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
                moveTo(3f, 18f)
                lineTo(3f, 3f)
                lineTo(13f, 3f)
                verticalLineToRelative(15f)
                lineTo(3f, 18f)
                close()
                moveTo(16f, 15f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(8.75f, 13.44f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.0f, 0.0f)
                curveToRelative(-0.74f, 0.74f, -2.06f, 0.75f, -2.82f, -0.02f)
                lineToRelative(-2.18f, -2.27f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(2.22f, 2.3f)
                lineToRelative(3.61f, -3.7f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(-3.61f, 3.7f)
                close()
            }
        }.also { _DigitalPayment = it}
