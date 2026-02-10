package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Highlighter: ImageVector? = null

val Icons.Rc.Highlighter: ImageVector
    get() = _Highlighter ?: UXIcon(name = "Highlighter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.16f, 1.91f)
                curveToRelative(-1.02f, -1.02f, -4.25f, -2.62f, -12.16f, 4.35f)
                curveToRelative(-4.61f, 4.07f, -5.89f, 5.44f, -6.82f, 8.04f)
                curveToRelative(-0.48f, 1.34f, -0.76f, 4.75f, -0.84f, 5.95f)
                lineToRelative(-1.05f, 1.05f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, -0.0f, 1.42f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(1.04f, -1.04f)
                curveToRelative(1.24f, -0.06f, 4.77f, -0.25f, 6.12f, -0.77f)
                curveToRelative(2.57f, -0.99f, 3.76f, -2.24f, 7.9f, -6.87f)
                curveToRelative(5.68f, -6.34f, 6.0f, -10.41f, 4.39f, -12.12f)
                close()
                moveTo(4.9f, 15.63f)
                lineTo(8.49f, 19.2f)
                curveToRelative(-1.02f, 0.2f, -2.7f, 0.35f, -4.09f, 0.43f)
                curveToRelative(0.1f, -1.25f, 0.28f, -2.95f, 0.5f, -4.01f)
                close()
                moveTo(16.28f, 12.7f)
                curveToRelative(-3.06f, 3.41f, -4.36f, 4.83f, -5.78f, 5.69f)
                lineToRelative(-4.81f, -4.8f)
                curveToRelative(0.79f, -1.4f, 2.16f, -2.76f, 5.64f, -5.83f)
                curveToRelative(4.26f, -3.76f, 6.96f, -4.77f, 8.36f, -4.77f)
                curveToRelative(0.51f, 0f, 0.85f, 0.13f, 1.04f, 0.32f)
                curveToRelative(0.53f, 0.56f, 0.84f, 3.49f, -4.45f, 9.39f)
                close()
            }
        }.also { _Highlighter = it}
