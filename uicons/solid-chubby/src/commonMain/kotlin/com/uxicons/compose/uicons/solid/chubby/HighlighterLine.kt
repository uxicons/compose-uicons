package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HighlighterLine: ImageVector? = null

val Icons.Sc.HighlighterLine: ImageVector
    get() = _HighlighterLine ?: UXIcon(name = "HighlighterLine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.19f, 17.93f)
                lineToRelative(-0.63f, 0.63f)
                curveToRelative(-0.59f, 0.59f, -1.53f, 0.59f, -2.12f, 0f)
                curveToRelative(-0.59f, -0.58f, -0.59f, -1.54f, 0f, -2.12f)
                lineToRelative(0.64f, -0.64f)
                curveToRelative(-0.16f, -1.91f, 0.03f, -3.95f, 0.72f, -5.8f)
                curveToRelative(0.67f, 0.79f, 2.02f, 2.35f, 3.43f, 3.76f)
                curveToRelative(1.42f, 1.41f, 2.98f, 2.77f, 3.77f, 3.43f)
                curveToRelative(-1.74f, 0.74f, -3.84f, 0.95f, -5.81f, 0.74f)
                close()
                moveTo(11.69f, 16f)
                curveToRelative(0.89f, -0.71f, 1.1f, -0.78f, 2.54f, -2.32f)
                curveToRelative(2.94f, -3.14f, 4.6f, -6.61f, 4.67f, -6.75f)
                curveToRelative(0.1f, -0.22f, 0.12f, -0.46f, 0.06f, -0.69f)
                curveToRelative(-0.02f, -0.08f, -0.54f, -1.93f, -1.91f, -3.3f)
                reflectiveCurveToRelative(-3.22f, -1.88f, -3.3f, -1.91f)
                curveToRelative(-0.23f, -0.06f, -0.48f, -0.04f, -0.69f, 0.06f)
                curveToRelative(-0.15f, 0.07f, -3.62f, 1.74f, -6.75f, 4.67f)
                curveToRelative(-1.54f, 1.44f, -1.6f, 1.65f, -2.32f, 2.54f)
                curveToRelative(0.35f, 0.42f, 1.99f, 2.37f, 3.65f, 4.04f)
                curveToRelative(1.67f, 1.67f, 3.61f, 3.3f, 4.04f, 3.65f)
                close()
                moveTo(21.5f, 20f)
                horizontalLineToRelative(-16.0f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(16f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _HighlighterLine = it}
