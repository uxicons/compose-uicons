package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TwoPaperclip: ImageVector? = null

val Icons.Bs.TwoPaperclip: ImageVector
    get() = _TwoPaperclip ?: UXIcon(name = "TwoPaperclip") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.0f, 15.68f)
                lineToRelative(2.06f, 5.16f)
                curveToRelative(-1.14f, 1.89f, -3.2f, 3.15f, -5.55f, 3.15f)
                curveToRelative(-3.58f, 0f, -6.49f, -2.92f, -6.49f, -6.5f)
                verticalLineToRelative(-13.5f)
                curveToRelative(0f, -2.21f, 1.79f, -4.0f, 3.99f, -4.0f)
                reflectiveCurveToRelative(3.99f, 1.79f, 3.99f, 4.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-2.99f)
                verticalLineToRelative(-14.0f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1.0f, -1f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1f)
                verticalLineToRelative(13.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.49f, 3.5f)
                reflectiveCurveToRelative(3.49f, -1.57f, 3.49f, -3.5f)
                verticalLineToRelative(-1.82f)
                close()
                moveTo(16.7f, 5.51f)
                lineTo(13.92f, 6.63f)
                lineTo(19.1f, 19.63f)
                curveToRelative(0.21f, 0.49f, -0.06f, 1.11f, -0.56f, 1.3f)
                curveToRelative(-0.49f, 0.21f, -1.11f, -0.06f, -1.3f, -0.56f)
                lineToRelative(-4.99f, -12.54f)
                curveToRelative(-0.71f, -1.79f, 0.16f, -3.83f, 1.95f, -4.55f)
                curveToRelative(1.73f, -0.73f, 3.88f, 0.19f, 4.54f, 1.95f)
                lineToRelative(2.51f, 6.29f)
                lineToRelative(2.78f, -1.11f)
                lineToRelative(-2.51f, -6.29f)
                curveToRelative(-1.23f, -3.27f, -5.22f, -4.99f, -8.43f, -3.63f)
                curveToRelative(-3.32f, 1.33f, -4.95f, 5.12f, -3.62f, 8.45f)
                lineToRelative(4.99f, 12.54f)
                curveToRelative(0.75f, 2.01f, 3.21f, 3.07f, 5.19f, 2.23f)
                curveToRelative(2.01f, -0.76f, 3.06f, -3.22f, 2.23f, -5.2f)
                close()
            }
        }.also { _TwoPaperclip = it}
