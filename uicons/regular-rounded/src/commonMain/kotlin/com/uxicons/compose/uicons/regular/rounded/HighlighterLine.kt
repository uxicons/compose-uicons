package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HighlighterLine: ImageVector? = null

val Icons.Rr.HighlighterLine: ImageVector
    get() = _HighlighterLine ?: UXIcon(name = "HighlighterLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(5f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                lineTo(23f, 22f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(3.41f, 20f)
                lineToRelative(-1.71f, 1.71f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(1.71f, -1.71f)
                verticalLineToRelative(-4.35f)
                curveToRelative(0f, -1.71f, 0.73f, -3.34f, 2.01f, -4.48f)
                lineTo(14.17f, 1.1f)
                curveToRelative(1.77f, -1.54f, 4.46f, -1.44f, 6.12f, 0.22f)
                lineToRelative(0.39f, 0.39f)
                curveToRelative(1.66f, 1.66f, 1.76f, 4.36f, 0.22f, 6.13f)
                lineToRelative(-8.65f, 10.14f)
                curveToRelative(-1.15f, 1.29f, -2.78f, 2.02f, -4.49f, 2.02f)
                lineTo(3.41f, 20f)
                close()
                moveTo(7.76f, 18f)
                curveToRelative(0.25f, 0f, 0.5f, -0.03f, 0.75f, -0.08f)
                lineToRelative(-4.43f, -4.43f)
                curveToRelative(-0.05f, 0.24f, -0.08f, 0.49f, -0.08f, 0.75f)
                verticalLineToRelative(3.76f)
                horizontalLineToRelative(3.76f)
                close()
                moveTo(5.32f, 11.27f)
                curveToRelative(-0.11f, 0.1f, -0.2f, 0.22f, -0.3f, 0.33f)
                lineToRelative(5.38f, 5.38f)
                curveToRelative(0.12f, -0.1f, 0.24f, -0.2f, 0.35f, -0.32f)
                lineTo(19.38f, 6.53f)
                curveToRelative(0.86f, -0.99f, 0.81f, -2.49f, -0.11f, -3.41f)
                lineToRelative(-0.39f, -0.39f)
                curveToRelative(-0.92f, -0.92f, -2.42f, -0.98f, -3.41f, -0.12f)
                lineTo(5.32f, 11.27f)
                close()
            }
        }.also { _HighlighterLine = it}
