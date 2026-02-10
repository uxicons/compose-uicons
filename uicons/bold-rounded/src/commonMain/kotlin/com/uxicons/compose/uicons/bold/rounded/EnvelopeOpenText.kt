package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeOpenText: ImageVector? = null

val Icons.Br.EnvelopeOpenText: ImageVector
    get() = _EnvelopeOpenText ?: UXIcon(name = "EnvelopeOpenText") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.32f, 7.84f)
            lineToRelative(-1.2f, -1.17f)
            verticalLineToRelative(-2.67f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            lineTo(7.12f, 0f)
            curveTo(4.91f, 0f, 3.12f, 1.79f, 3.12f, 4f)
            verticalLineToRelative(2.45f)
            curveToRelative(-0.02f, 0.02f, -1.42f, 1.37f, -1.42f, 1.37f)
            curveToRelative(-1.08f, 1.03f, -1.7f, 2.48f, -1.7f, 3.97f)
            verticalLineToRelative(6.7f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-6.7f)
            curveToRelative(0f, -1.49f, -0.62f, -2.94f, -1.69f, -3.96f)
            close()
            moveTo(8.62f, 4f)
            horizontalLineToRelative(7f)
            curveToRelative(1.97f, 0.03f, 1.97f, 2.97f, 0f, 3f)
            horizontalLineToRelative(-7f)
            curveToRelative(-1.97f, -0.03f, -1.97f, -2.97f, 0f, -3f)
            close()
            moveTo(8.62f, 9f)
            horizontalLineToRelative(5f)
            curveToRelative(1.97f, 0.03f, 1.97f, 2.97f, 0f, 3f)
            horizontalLineToRelative(-5f)
            curveToRelative(-1.97f, -0.03f, -1.97f, -2.97f, 0f, -3f)
            close()
            moveTo(18.5f, 21f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-6.34f)
            lineToRelative(5.23f, 5.23f)
            curveToRelative(2.06f, 2.14f, 5.73f, 2.13f, 7.79f, -0.01f)
            lineToRelative(4.98f, -5.11f)
            verticalLineToRelative(6.23f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            close()
        }
    }.also { _EnvelopeOpenText = it }
