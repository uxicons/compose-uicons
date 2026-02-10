package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cross: ImageVector? = null

val Icons.Sr.Cross: ImageVector
    get() = _Cross ?: UXIcon(name = "Cross") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(286.16f, 255.87f)
                lineTo(505.74f, 36.28f)
                curveToRelative(8.19f, -8.47f, 7.95f, -21.98f, -0.52f, -30.17f)
                curveToRelative(-8.27f, -7.99f, -21.38f, -7.99f, -29.64f, 0f)
                lineTo(255.99f, 225.7f)
                lineTo(36.41f, 6.12f)
                curveToRelative(-8.48f, -8.19f, -21.98f, -7.95f, -30.17f, 0.52f)
                curveToRelative(-7.99f, 8.27f, -7.99f, 21.37f, 0f, 29.64f)
                lineTo(225.83f, 255.87f)
                lineTo(6.25f, 475.45f)
                curveToRelative(-8.33f, 8.33f, -8.33f, 21.83f, 0f, 30.17f)
                lineToRelative(0f, 0f)
                curveToRelative(8.33f, 8.33f, 21.83f, 8.33f, 30.17f, 0f)
                lineToRelative(219.58f, -219.58f)
                lineToRelative(219.58f, 219.58f)
                curveToRelative(8.33f, 8.33f, 21.83f, 8.33f, 30.17f, 0f)
                lineToRelative(0f, 0f)
                curveToRelative(8.33f, -8.33f, 8.33f, -21.83f, 0f, -30.17f)
                lineTo(286.16f, 255.87f)
                close()
            }
        }.also { _Cross = it}
