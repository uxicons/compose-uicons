package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gun: ImageVector? = null

val Icons.Rs.Gun: ImageVector
    get() = _Gun ?: UXIcon(name = "Gun") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 4f)
                horizontalLineToRelative(-1f)
                lineTo(23f, 2f)
                horizontalLineToRelative(-2f)
                lineTo(21f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                lineTo(2f, 2f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(0f, 4f)
                verticalLineToRelative(6f)
                lineTo(1f, 10f)
                curveToRelative(1.4f, 0.03f, 2.33f, 0.46f, 1.94f, 1.81f)
                lineTo(0f, 20.33f)
                verticalLineToRelative(1.67f)
                lineTo(7.42f, 22f)
                lineToRelative(1.99f, -6f)
                horizontalLineToRelative(3.93f)
                curveToRelative(1.56f, 0f, 2.9f, -1.0f, 3.35f, -2.49f)
                lineToRelative(1.05f, -3.51f)
                horizontalLineToRelative(5.26f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                lineTo(24f, 4f)
                close()
                moveTo(5.98f, 20f)
                lineTo(2.23f, 20f)
                lineToRelative(2.62f, -7.58f)
                curveToRelative(0.3f, -1.05f, 0.18f, -1.84f, -0.07f, -2.42f)
                horizontalLineToRelative(4.51f)
                lineToRelative(-3.31f, 10f)
                close()
                moveTo(14.78f, 12.93f)
                curveToRelative(-0.19f, 0.63f, -0.78f, 1.07f, -1.44f, 1.07f)
                horizontalLineToRelative(-3.27f)
                lineToRelative(0.66f, -2f)
                horizontalLineToRelative(2.27f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.66f)
                lineToRelative(-0.88f, 2.93f)
                close()
                moveTo(21f, 8f)
                lineTo(2f, 8f)
                verticalLineToRelative(-2.17f)
                curveToRelative(0.85f, -0.3f, 1.53f, -0.98f, 1.83f, -1.83f)
                lineTo(21f, 4f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _Gun = it}
