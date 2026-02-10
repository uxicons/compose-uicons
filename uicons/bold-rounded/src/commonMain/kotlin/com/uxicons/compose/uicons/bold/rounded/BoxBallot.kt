package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxBallot: ImageVector? = null

val Icons.Br.BoxBallot: ImageVector
    get() = _BoxBallot ?: UXIcon(name = "BoxBallot") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19f, 7.02f)
            verticalLineToRelative(-2.52f)
            curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
            verticalLineToRelative(2.52f)
            curveToRelative(-2.8f, 0.25f, -5f, 2.61f, -5f, 5.48f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -2.86f, -2.2f, -5.22f, -5f, -5.48f)
            close()
            moveTo(8f, 4.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(6.5f)
            lineTo(8f, 11f)
            lineTo(8f, 4.5f)
            close()
            moveTo(5f, 10.05f)
            verticalLineToRelative(2.45f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(11f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-2.45f)
            curveToRelative(1.14f, 0.23f, 2f, 1.24f, 2f, 2.45f)
            verticalLineToRelative(3.5f)
            lineTo(3f, 16f)
            verticalLineToRelative(-3.5f)
            curveToRelative(0f, -1.21f, 0.86f, -2.22f, 2f, -2.45f)
            close()
            moveTo(18.5f, 21f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.21f, 0f, -2.22f, -0.86f, -2.45f, -2f)
            lineTo(20.95f, 19f)
            curveToRelative(-0.23f, 1.14f, -1.24f, 2f, -2.45f, 2f)
            close()
        }
    }.also { _BoxBallot = it }
