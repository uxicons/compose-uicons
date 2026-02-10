package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Split: ImageVector? = null

val Icons.Rr.Split: ImageVector
    get() = _Split ?: UXIcon(name = "Split") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.73f, 14.32f)
                curveToRelative(-0.38f, -0.4f, -1.01f, -0.42f, -1.41f, -0.05f)
                curveToRelative(-0.4f, 0.38f, -0.42f, 1.01f, -0.05f, 1.41f)
                lineToRelative(2.16f, 2.32f)
                horizontalLineToRelative(-6.59f)
                curveToRelative(-0.88f, 0f, -1.71f, -0.38f, -2.28f, -1.05f)
                lineToRelative(-4.25f, -4.95f)
                lineToRelative(4.25f, -4.95f)
                curveToRelative(0.57f, -0.67f, 1.4f, -1.05f, 2.28f, -1.05f)
                horizontalLineToRelative(6.59f)
                lineToRelative(-2.16f, 2.32f)
                curveToRelative(-0.38f, 0.4f, -0.35f, 1.04f, 0.05f, 1.41f)
                curveToRelative(0.19f, 0.18f, 0.44f, 0.27f, 0.68f, 0.27f)
                curveToRelative(0.27f, 0f, 0.53f, -0.11f, 0.73f, -0.32f)
                lineToRelative(2.39f, -2.56f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0.02f, -4.22f)
                lineTo(20.73f, 0.32f)
                curveToRelative(-0.38f, -0.4f, -1.01f, -0.42f, -1.41f, -0.05f)
                curveToRelative(-0.4f, 0.38f, -0.42f, 1.01f, -0.05f, 1.41f)
                lineToRelative(2.16f, 2.32f)
                horizontalLineToRelative(-6.59f)
                curveToRelative(-1.46f, 0f, -2.85f, 0.64f, -3.8f, 1.75f)
                lineToRelative(-4.5f, 5.25f)
                horizontalLineTo(1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineTo(6.54f)
                lineToRelative(4.5f, 5.25f)
                curveToRelative(0.95f, 1.11f, 2.33f, 1.75f, 3.8f, 1.75f)
                horizontalLineToRelative(6.59f)
                lineToRelative(-2.16f, 2.32f)
                curveToRelative(-0.38f, 0.4f, -0.35f, 1.04f, 0.05f, 1.41f)
                curveToRelative(0.19f, 0.18f, 0.44f, 0.27f, 0.68f, 0.27f)
                curveToRelative(0.27f, 0f, 0.53f, -0.11f, 0.73f, -0.32f)
                lineToRelative(2.39f, -2.56f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0.02f, -4.22f)
                lineToRelative(-2.41f, -2.59f)
                close()
            }
        }.also { _Split = it}
