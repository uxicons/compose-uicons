package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HighlighterLine: ImageVector? = null

val Icons.Rc.HighlighterLine: ImageVector
    get() = _HighlighterLine ?: UXIcon(name = "HighlighterLine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 21f)
                horizontalLineToRelative(-17f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(17f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.66f, 19.02f)
                curveToRelative(1.53f, 0f, 2.96f, -0.26f, 4.26f, -0.78f)
                curveToRelative(0.26f, -0.14f, 2.14f, -1.18f, 5.31f, -4.55f)
                curveToRelative(2.94f, -3.14f, 4.6f, -6.61f, 4.67f, -6.75f)
                curveToRelative(0.1f, -0.22f, 0.12f, -0.46f, 0.06f, -0.69f)
                curveToRelative(-0.02f, -0.08f, -0.54f, -1.93f, -1.91f, -3.3f)
                reflectiveCurveToRelative(-3.22f, -1.88f, -3.3f, -1.91f)
                curveToRelative(-0.23f, -0.06f, -0.48f, -0.04f, -0.69f, 0.06f)
                curveToRelative(-0.15f, 0.07f, -3.62f, 1.74f, -6.75f, 4.67f)
                curveToRelative(-3.42f, 3.25f, -4.39f, 4.98f, -4.57f, 5.36f)
                curveToRelative(-0.69f, 2.04f, -0.88f, 4.24f, -0.59f, 6.29f)
                lineToRelative(-0.86f, 0.86f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                reflectiveCurveToRelative(1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(0.86f, -0.86f)
                curveToRelative(0.72f, 0.1f, 1.42f, 0.17f, 2.09f, 0.17f)
                close()
                moveTo(4.08f, 16.91f)
                curveToRelative(-0.16f, -1.38f, -0.05f, -2.84f, 0.31f, -4.25f)
                curveToRelative(0.52f, 0.59f, 1.2f, 1.34f, 1.9f, 2.04f)
                curveToRelative(0.71f, 0.71f, 1.48f, 1.4f, 2.07f, 1.93f)
                curveToRelative(-1.29f, 0.37f, -2.72f, 0.47f, -4.28f, 0.28f)
                close()
                moveTo(8.68f, 7.23f)
                curveToRelative(2.35f, -2.2f, 4.96f, -3.66f, 5.9f, -4.15f)
                curveToRelative(0.48f, 0.18f, 1.38f, 0.59f, 2.07f, 1.27f)
                reflectiveCurveToRelative(1.09f, 1.58f, 1.27f, 2.07f)
                curveToRelative(-0.49f, 0.93f, -1.95f, 3.55f, -4.15f, 5.9f)
                curveToRelative(-1.49f, 1.59f, -2.71f, 2.64f, -3.54f, 3.29f)
                curveToRelative(-0.58f, -0.5f, -1.61f, -1.4f, -2.52f, -2.31f)
                reflectiveCurveToRelative(-1.81f, -1.94f, -2.31f, -2.52f)
                curveToRelative(0.65f, -0.83f, 1.69f, -2.05f, 3.29f, -3.54f)
                close()
            }
        }.also { _HighlighterLine = it}
