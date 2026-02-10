package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CursorText: ImageVector? = null

val Icons.Sc.CursorText: ImageVector
    get() = _CursorText ?: UXIcon(name = "CursorText") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.28f, 20.0f)
                curveToRelative(-1.75f, -0.25f, -3.14f, -1.63f, -3.46f, -3.4f)
                horizontalLineToRelative(1.32f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.61f)
                curveToRelative(-0.03f, -0.54f, -0.04f, -1.07f, -0.04f, -1.6f)
                curveToRelative(0f, -1.45f, 0.1f, -2.94f, 0.3f, -4.42f)
                curveToRelative(0.25f, -1.85f, 1.68f, -3.32f, 3.48f, -3.57f)
                curveToRelative(0.82f, -0.12f, 1.43f, -0.88f, 1.31f, -1.7f)
                curveToRelative(-0.1f, -0.75f, -0.72f, -1.3f, -1.45f, -1.3f)
                curveToRelative(-0.07f, 0f, -0.14f, 0.01f, -0.21f, 0.01f)
                curveToRelative(-2.06f, 0.29f, -3.83f, 1.44f, -4.94f, 3.08f)
                curveToRelative(-1.11f, -1.63f, -2.87f, -2.78f, -4.94f, -3.08f)
                curveToRelative(-0.07f, -0.01f, -0.14f, -0.01f, -0.21f, -0.01f)
                curveToRelative(-0.73f, 0f, -1.34f, 0.55f, -1.45f, 1.3f)
                curveToRelative(-0.12f, 0.82f, 0.49f, 1.58f, 1.31f, 1.7f)
                curveToRelative(1.8f, 0.26f, 3.24f, 1.73f, 3.48f, 3.57f)
                curveToRelative(0.2f, 1.48f, 0.3f, 2.96f, 0.3f, 4.42f)
                curveToRelative(0f, 0.53f, -0.01f, 1.06f, -0.04f, 1.6f)
                horizontalLineToRelative(-1.61f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.32f)
                curveToRelative(-0.31f, 1.76f, -1.71f, 3.15f, -3.46f, 3.4f)
                curveToRelative(-0.82f, 0.12f, -1.43f, 0.88f, -1.31f, 1.7f)
                curveToRelative(0.1f, 0.75f, 0.72f, 1.3f, 1.45f, 1.3f)
                curveToRelative(0.07f, 0f, 0.14f, -0.01f, 0.21f, -0.01f)
                curveToRelative(2.06f, -0.29f, 3.83f, -1.44f, 4.94f, -3.08f)
                curveToRelative(1.11f, 1.63f, 2.87f, 2.78f, 4.94f, 3.08f)
                curveToRelative(0.07f, 0.01f, 0.14f, 0.01f, 0.21f, 0.01f)
                curveToRelative(0.73f, 0f, 1.34f, -0.55f, 1.45f, -1.3f)
                curveToRelative(0.12f, -0.82f, -0.49f, -1.58f, -1.31f, -1.7f)
                close()
            }
        }.also { _CursorText = it}
