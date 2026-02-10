package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EditMessage: ImageVector? = null

val Icons.Sr.EditMessage: ImageVector
    get() = _EditMessage ?: UXIcon(name = "EditMessage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.27f, 7.48f)
                curveToRelative(-0.81f, 0.81f, -1.27f, 1.92f, -1.27f, 3.06f)
                verticalLineToRelative(1.46f)
                horizontalLineToRelative(1.46f)
                curveToRelative(1.15f, 0f, 2.25f, -0.46f, 3.06f, -1.27f)
                lineToRelative(6.81f, -6.81f)
                curveToRelative(0.9f, -0.9f, 0.9f, -2.35f, 0f, -3.25f)
                curveToRelative(-0.9f, -0.9f, -2.35f, -0.9f, -3.25f, 0f)
                lineToRelative(-6.81f, 6.81f)
                close()
                moveTo(24f, 6.08f)
                verticalLineToRelative(9.92f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-2.85f)
                lineToRelative(-3.85f, 3.18f)
                curveToRelative(-0.36f, 0.32f, -0.82f, 0.48f, -1.29f, 0.48f)
                curveToRelative(-0.48f, 0f, -0.95f, -0.17f, -1.34f, -0.51f)
                lineToRelative(-3.75f, -3.16f)
                horizontalLineToRelative(-2.92f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                lineTo(-0.0f, 4f)
                curveTo(0f, 1.79f, 1.79f, 0f, 4f, 0f)
                horizontalLineToRelative(13.92f)
                lineToRelative(-6.07f, 6.07f)
                curveToRelative(-1.19f, 1.19f, -1.85f, 2.8f, -1.85f, 4.48f)
                verticalLineToRelative(2.46f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2.46f)
                curveToRelative(1.68f, 0f, 3.29f, -0.67f, 4.48f, -1.85f)
                lineToRelative(6.07f, -6.07f)
                close()
            }
        }.also { _EditMessage = it}
