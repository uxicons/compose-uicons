package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareEnvelope: ImageVector? = null

val Icons.Br.SquareEnvelope: ImageVector
    get() = _SquareEnvelope ?: UXIcon(name = "SquareEnvelope") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(11.65f, 10.85f)
            lineToRelative(-3.73f, -3.85f)
            curveToRelative(0.03f, -0.0f, 8.21f, 0.0f, 8.27f, 0.01f)
            lineToRelative(-3.83f, 3.83f)
            curveToRelative(-0.18f, 0.18f, -0.53f, 0.18f, -0.71f, 0f)
            close()
            moveTo(11.35f, 13.94f)
            curveToRelative(-0.73f, -0.13f, -1.39f, -0.53f, -1.91f, -1.06f)
            lineToRelative(-3.41f, -3.41f)
            curveToRelative(-0.01f, 0.17f, -0.03f, 0.33f, -0.03f, 0.52f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-5.05f)
            lineToRelative(-3.52f, 3.52f)
            curveToRelative(-0.81f, 0.81f, -1.96f, 1.18f, -3.13f, 0.97f)
            close()
            moveTo(24f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            horizontalLineToRelative(-13f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineToRelative(-13f)
            curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
            moveTo(21f, 5.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineToRelative(-13f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            close()
        }
    }.also { _SquareEnvelope = it }
