package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HighlighterLine: ImageVector? = null

val Icons.Sr.HighlighterLine: ImageVector
    get() = _HighlighterLine ?: UXIcon(name = "HighlighterLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 24f)
                horizontalLineTo(5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineTo(23f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(2.48f, 11.89f)
                curveToRelative(-0.31f, 0.73f, -0.48f, 1.53f, -0.48f, 2.34f)
                verticalLineToRelative(4.35f)
                lineToRelative(-1.71f, 1.71f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(1.71f, -1.71f)
                horizontalLineTo(7.76f)
                curveToRelative(0.81f, 0f, 1.61f, -0.17f, 2.34f, -0.48f)
                lineTo(2.48f, 11.89f)
                close()
                moveTo(20.91f, 7.83f)
                lineToRelative(-8.67f, 10.15f)
                curveToRelative(-0.13f, 0.15f, -0.27f, 0.29f, -0.42f, 0.42f)
                lineTo(3.59f, 10.17f)
                curveToRelative(0.13f, -0.14f, 0.27f, -0.28f, 0.42f, -0.41f)
                lineTo(14.17f, 1.1f)
                curveToRelative(1.78f, -1.54f, 4.47f, -1.45f, 6.14f, 0.21f)
                lineToRelative(0.39f, 0.39f)
                curveToRelative(1.66f, 1.66f, 1.76f, 4.36f, 0.22f, 6.13f)
                close()
            }
        }.also { _HighlighterLine = it}
