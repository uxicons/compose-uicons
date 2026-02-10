package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BellSlash: ImageVector? = null

val Icons.Sr.BellSlash: ImageVector
    get() = _BellSlash ?: UXIcon(name = "BellSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.71f, 23.71f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineTo(0.29f, 1.71f)
                curveTo(-0.1f, 1.32f, -0.1f, 0.68f, 0.29f, 0.29f)
                reflectiveCurveTo(1.32f, -0.1f, 1.71f, 0.29f)
                lineToRelative(2.93f, 2.93f)
                curveToRelative(1.72f, -1.99f, 4.23f, -3.22f, 7.04f, -3.22f)
                curveToRelative(4.17f, 0f, 7.87f, 2.81f, 8.98f, 6.83f)
                lineToRelative(1.74f, 5.72f)
                curveToRelative(0.46f, 1.53f, 0.18f, 3.15f, -0.77f, 4.43f)
                curveToRelative(-0.47f, 0.64f, -1.07f, 1.14f, -1.75f, 1.48f)
                lineToRelative(3.83f, 3.83f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(12f, 24f)
                curveToRelative(2.04f, 0f, 3.8f, -1.24f, 4.58f, -3f)
                lineTo(7.42f, 21f)
                curveToRelative(0.77f, 1.76f, 2.53f, 3f, 4.58f, 3f)
                close()
                moveTo(2.69f, 6.87f)
                curveToRelative(-0.04f, 0.14f, -0.08f, 0.27f, -0.11f, 0.41f)
                lineToRelative(-1.35f, 5.54f)
                curveToRelative(-0.36f, 1.5f, -0.03f, 3.06f, 0.93f, 4.27f)
                curveToRelative(0.95f, 1.22f, 2.39f, 1.91f, 3.93f, 1.91f)
                horizontalLineToRelative(8.73f)
                lineTo(2.69f, 6.87f)
                close()
            }
        }.also { _BellSlash = it}
