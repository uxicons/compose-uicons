package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HighlighterLine: ImageVector? = null

val Icons.Tc.HighlighterLine: ImageVector
    get() = _HighlighterLine ?: UXIcon(name = "HighlighterLine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 22.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-18f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(18f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(2.88f, 19.82f)
                lineTo(1.85f, 20.85f)
                curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(1.04f, -1.04f)
                curveToRelative(-0.33f, -2.08f, -0.18f, -4.39f, 0.6f, -6.44f)
                curveToRelative(3.16f, -4.59f, 7.52f, -8.49f, 12.97f, -11.6f)
                curveToRelative(0.11f, -0.07f, 0.25f, -0.08f, 0.38f, -0.05f)
                curveToRelative(0.07f, 0.02f, 1.8f, 0.5f, 3.08f, 1.78f)
                reflectiveCurveToRelative(1.76f, 3.0f, 1.78f, 3.08f)
                curveToRelative(0.04f, 0.13f, 0.02f, 0.26f, -0.05f, 0.38f)
                curveToRelative(-3.11f, 5.45f, -7.01f, 9.81f, -11.6f, 12.97f)
                curveToRelative(-1.93f, 0.85f, -4.28f, 0.95f, -6.45f, 0.6f)
                close()
                moveTo(4.28f, 12.31f)
                curveToRelative(0.4f, 0.48f, 1.47f, 1.73f, 2.57f, 2.83f)
                reflectiveCurveToRelative(2.35f, 2.17f, 2.83f, 2.57f)
                curveToRelative(4.01f, -2.97f, 7.47f, -6.92f, 10.27f, -11.78f)
                curveToRelative(-0.15f, -0.45f, -0.6f, -1.58f, -1.46f, -2.44f)
                curveToRelative(-0.86f, -0.86f, -2.0f, -1.31f, -2.44f, -1.46f)
                curveToRelative(-4.86f, 2.8f, -8.81f, 6.26f, -11.78f, 10.27f)
                close()
                moveTo(3.14f, 18.86f)
                curveToRelative(2.11f, 0.32f, 4.02f, 0.15f, 5.67f, -0.49f)
                curveToRelative(0.02f, -0.01f, 0.03f, -0.02f, 0.05f, -0.04f)
                curveToRelative(-0.58f, -0.49f, -1.7f, -1.46f, -2.71f, -2.48f)
                reflectiveCurveToRelative(-1.98f, -2.13f, -2.48f, -2.71f)
                curveToRelative(-0.01f, 0.01f, -0.02f, 0.02f, -0.03f, 0.04f)
                curveToRelative(-0.61f, 1.84f, -0.79f, 3.84f, -0.51f, 5.68f)
                close()
            }
        }.also { _HighlighterLine = it}
