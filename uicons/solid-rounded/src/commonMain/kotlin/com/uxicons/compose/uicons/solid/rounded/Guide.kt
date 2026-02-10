package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Guide: ImageVector? = null

val Icons.Sr.Guide: ImageVector
    get() = _Guide ?: UXIcon(name = "Guide") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 5f)
                lineTo(1.09f, 5f)
                curveTo(1.57f, 2.17f, 4.03f, 0f, 7f, 0f)
                curveToRelative(2.21f, 0f, 4.15f, 1.21f, 5.19f, 3f)
                horizontalLineToRelative(1.81f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(7f, 12f)
                curveToRelative(2.97f, 0f, 5.43f, -2.17f, 5.91f, -5f)
                lineTo(1.09f, 7f)
                curveToRelative(0.48f, 2.83f, 2.94f, 5f, 5.91f, 5f)
                close()
                moveTo(23.57f, 3.36f)
                lineToRelative(-3.56f, 1.89f)
                verticalLineToRelative(4.95f)
                curveToRelative(0f, 0.77f, -0.3f, 1.51f, -0.83f, 2.07f)
                lineToRelative(-5.73f, 6.01f)
                curveToRelative(0.35f, 0.84f, 0.55f, 1.76f, 0.55f, 2.72f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                lineTo(2f, 24.0f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -3.87f, 3.13f, -7f, 7f, -7f)
                horizontalLineToRelative(5.28f)
                curveToRelative(0.23f, 0f, 0.46f, -0.08f, 0.64f, -0.23f)
                lineToRelative(4.72f, -3.94f)
                curveToRelative(0.23f, -0.19f, 0.36f, -0.47f, 0.36f, -0.77f)
                lineTo(18f, 1f)
                curveToRelative(0f, -0.53f, 0.42f, -0.99f, 0.95f, -1f)
                curveToRelative(0.62f, -0.01f, 1.23f, 0.12f, 1.8f, 0.38f)
                lineToRelative(2.81f, 1.26f)
                curveToRelative(0.58f, 0.4f, 0.58f, 1.33f, 0f, 1.73f)
                close()
            }
        }.also { _Guide = it}
