package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DigitalPayment: ImageVector? = null

val Icons.Rr.DigitalPayment: ImageVector
    get() = _DigitalPayment ?: UXIcon(name = "DigitalPayment") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 3f)
                horizontalLineToRelative(-4.42f)
                curveToRelative(-0.77f, -1.76f, -2.53f, -3f, -4.58f, -3f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(6f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                lineTo(24f, 7f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(20f, 5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                close()
                moveTo(14f, 19f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(5f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-1f)
                lineTo(14f, 18f)
                verticalLineToRelative(1f)
                close()
                moveTo(14f, 16f)
                lineTo(2f, 16f)
                lineTo(2f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(11f)
                close()
                moveTo(20f, 14f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
                moveTo(12.18f, 6.4f)
                curveToRelative(0.4f, 0.38f, 0.43f, 1.01f, 0.05f, 1.41f)
                lineToRelative(-3.13f, 3.36f)
                curveToRelative(-1.04f, 1.09f, -2.85f, 1.09f, -3.88f, 0.03f)
                lineToRelative(-1.43f, -1.43f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(1.43f, 1.43f)
                curveToRelative(0.28f, 0.28f, 0.76f, 0.28f, 1.03f, 0f)
                lineToRelative(3.1f, -3.33f)
                curveToRelative(0.38f, -0.4f, 1.01f, -0.43f, 1.41f, -0.05f)
                close()
                moveTo(6f, 20f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
            }
        }.also { _DigitalPayment = it}
