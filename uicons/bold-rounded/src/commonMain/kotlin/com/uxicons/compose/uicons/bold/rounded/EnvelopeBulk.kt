package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeBulk: ImageVector? = null

val Icons.Br.EnvelopeBulk: ImageVector
    get() = _EnvelopeBulk ?: UXIcon(name = "EnvelopeBulk") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20f, 7f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
            lineTo(7.5f, 0f)
            curveTo(5.02f, 0f, 3f, 2.02f, 3f, 4.5f)
            verticalLineToRelative(5.76f)
            curveToRelative(-1.75f, 0.62f, -3f, 2.29f, -3f, 4.24f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
            horizontalLineToRelative(7f)
            curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(4f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            close()
            moveTo(7.5f, 3f)
            horizontalLineToRelative(7f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(2.5f)
            horizontalLineToRelative(-4f)
            curveToRelative(-1.86f, 0f, -3.43f, 1.27f, -3.87f, 3f)
            horizontalLineToRelative(-2.13f)
            lineTo(6f, 4.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            close()
            moveTo(11.38f, 13f)
            lineToRelative(-2.74f, 2.74f)
            curveToRelative(-0.34f, 0.34f, -0.93f, 0.34f, -1.27f, 0f)
            lineToRelative(-2.74f, -2.74f)
            horizontalLineToRelative(6.74f)
            close()
            moveTo(13f, 19.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(4.5f, 21f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-3.9f)
            lineToRelative(2.25f, 2.25f)
            curveToRelative(1.45f, 1.51f, 4.06f, 1.51f, 5.51f, 0f)
            lineToRelative(2.24f, -2.24f)
            verticalLineToRelative(3.88f)
            close()
            moveTo(19.5f, 13f)
            curveToRelative(-1.97f, -0.03f, -1.97f, -2.97f, 0f, -3f)
            curveToRelative(1.97f, 0.03f, 1.97f, 2.97f, 0f, 3f)
            close()
        }
    }.also { _EnvelopeBulk = it }
