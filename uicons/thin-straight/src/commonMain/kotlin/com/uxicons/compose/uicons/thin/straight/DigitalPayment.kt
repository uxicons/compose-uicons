package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DigitalPayment: ImageVector? = null

val Icons.Ts.DigitalPayment: ImageVector
    get() = _DigitalPayment ?: UXIcon(name = "DigitalPayment") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 3f)
                horizontalLineToRelative(-6f)
                lineTo(16f, 0f)
                lineTo(0f, 0f)
                lineTo(0f, 21.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                lineTo(13.5f, 24f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(8f)
                lineTo(24f, 5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(15f, 21.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(2.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-3.5f)
                lineTo(15f, 18f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(15f, 17f)
                lineTo(1f, 17f)
                lineTo(1f, 1f)
                lineTo(15f, 1f)
                lineTo(15f, 17f)
                close()
                moveTo(23f, 15f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(7f)
                close()
                moveTo(23f, 7f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                close()
                moveTo(6.25f, 11.56f)
                lineToRelative(-2.85f, -2.77f)
                lineToRelative(0.69f, -0.72f)
                lineToRelative(2.86f, 2.77f)
                curveToRelative(0.2f, 0.2f, 0.52f, 0.2f, 0.71f, 0.01f)
                lineToRelative(4.79f, -4.83f)
                lineToRelative(0.71f, 0.7f)
                lineToRelative(-4.79f, 4.83f)
                curveToRelative(-0.28f, 0.28f, -0.66f, 0.44f, -1.06f, 0.44f)
                reflectiveCurveToRelative(-0.78f, -0.16f, -1.06f, -0.44f)
                close()
                moveTo(10f, 21f)
                lineTo(6f, 21f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _DigitalPayment = it}
