package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HighlighterLine: ImageVector? = null

val Icons.Tr.HighlighterLine: ImageVector
    get() = _HighlighterLine ?: UXIcon(name = "HighlighterLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 21f)
                curveToRelative(1.64f, 0f, 3.2f, -0.7f, 4.3f, -1.93f)
                lineTo(21.98f, 7.32f)
                curveToRelative(1.43f, -1.65f, 1.34f, -4.15f, -0.2f, -5.69f)
                lineToRelative(-0.41f, -0.41f)
                curveToRelative(-1.54f, -1.54f, -4.04f, -1.63f, -5.69f, -0.2f)
                lineTo(3.92f, 11.21f)
                curveToRelative(-1.22f, 1.09f, -1.92f, 2.65f, -1.92f, 4.29f)
                verticalLineToRelative(4.79f)
                lineToRelative(-1.85f, 1.85f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                lineToRelative(1.85f, -1.85f)
                lineTo(7.5f, 21f)
                close()
                moveTo(4.59f, 11.96f)
                lineTo(16.34f, 1.78f)
                curveToRelative(1.25f, -1.09f, 3.15f, -1.02f, 4.33f, 0.15f)
                lineToRelative(0.41f, 0.41f)
                curveToRelative(1.17f, 1.17f, 1.24f, 3.07f, 0.15f, 4.33f)
                lineToRelative(-10.18f, 11.75f)
                curveToRelative(-0.24f, 0.27f, -0.51f, 0.51f, -0.81f, 0.72f)
                curveToRelative(0f, -0.01f, -0.02f, -0.02f, -0.03f, -0.03f)
                lineTo(3.9f, 12.8f)
                reflectiveCurveToRelative(-0.02f, -0.02f, -0.04f, -0.03f)
                curveToRelative(0.21f, -0.29f, 0.44f, -0.56f, 0.71f, -0.8f)
                close()
                moveTo(3.01f, 15.5f)
                curveToRelative(0f, -0.63f, 0.13f, -1.26f, 0.37f, -1.83f)
                lineToRelative(5.96f, 5.96f)
                curveToRelative(-0.57f, 0.24f, -1.19f, 0.37f, -1.83f, 0.37f)
                lineTo(3f, 20f)
                verticalLineToRelative(-4.5f)
                close()
                moveTo(24.01f, 23.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(4.5f, 24f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(23.5f, 23f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _HighlighterLine = it}
