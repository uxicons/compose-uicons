package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PipeSmoking: ImageVector? = null

val Icons.Sr.PipeSmoking: ImageVector
    get() = _PipeSmoking ?: UXIcon(name = "PipeSmoking") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.67f, 11.96f)
                curveToRelative(0.77f, -1.04f, 2.22f, -1.29f, 3.29f, -0.55f)
                horizontalLineToRelative(0f)
                curveToRelative(1.07f, 0.74f, 1.35f, 2.21f, 0.62f, 3.29f)
                lineToRelative(-4.45f, 6.51f)
                curveToRelative(-1.23f, 1.75f, -3.23f, 2.79f, -5.36f, 2.79f)
                horizontalLineToRelative(-1.21f)
                curveToRelative(-2.51f, 0f, -4.57f, -2.02f, -4.57f, -4.53f)
                curveToRelative(-0.0f, -2.85f, 0.38f, -4.89f, 0.81f, -6.88f)
                curveToRelative(0.2f, -0.92f, 1.01f, -1.58f, 1.96f, -1.58f)
                lineToRelative(3.89f, 0.01f)
                curveToRelative(0.93f, 0.0f, 1.74f, 0.65f, 1.95f, 1.56f)
                curveToRelative(0.2f, 0.9f, 0.4f, 1.79f, 0.55f, 2.78f)
                lineToRelative(2.53f, -3.4f)
                close()
                moveTo(23f, 0f)
                curveToRelative(-1.22f, 0f, -2.36f, 0.6f, -3.08f, 1.64f)
                lineToRelative(-4.7f, 7.66f)
                curveToRelative(0.3f, 0.12f, 0.6f, 0.27f, 0.88f, 0.46f)
                curveToRelative(0.29f, 0.2f, 0.54f, 0.44f, 0.76f, 0.69f)
                lineToRelative(4.73f, -7.71f)
                curveToRelative(0.32f, -0.46f, 0.85f, -0.74f, 1.41f, -0.74f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _PipeSmoking = it}
