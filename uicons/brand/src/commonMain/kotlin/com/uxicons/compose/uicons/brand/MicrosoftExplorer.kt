package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MicrosoftExplorer: ImageVector? = null

val Icons.Brand.MicrosoftExplorer: ImageVector
    get() = _MicrosoftExplorer ?: UXIcon(name = "MicrosoftExplorer") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.99f, 12.6f)
            curveToRelative(-0.03f, -1.91f, -0.49f, -3.71f, -1.35f, -5.28f)
            curveToRelative(3.71f, -8.31f, -3.78f, -7.19f, -4.38f, -7.08f)
            curveToRelative(-1.57f, 0.32f, -3.15f, 0.82f, -4.49f, 1.46f)
            curveTo(8.6f, 1.64f, 4.11f, 4.4f, 2.65f, 10.13f)
            curveToRelative(2.7f, -3.03f, 4.61f, -4.27f, 5.73f, -4.72f)
            curveTo(8.14f, 5.62f, 7.91f, 5.85f, 7.67f, 6.07f)
            curveToRelative(-1.8f, 1.8f, -3.26f, 3.6f, -4.49f, 5.5f)
            curveToRelative(-0.95f, 1.69f, -2.02f, 3.15f, -2.58f, 5.05f)
            curveToRelative(-3.03f, 11.01f, 6.52f, 6.4f, 7.86f, 5.62f)
            curveToRelative(1.46f, 0.72f, 3.03f, 1.11f, 4.83f, 1.11f)
            curveToRelative(4.72f, 0f, 8.76f, -3.03f, 10.22f, -7.19f)
            horizontalLineToRelative(-5.73f)
            curveToRelative(-2.7f, 4.27f, -9.1f, 2.36f, -9.32f, -2.25f)
            horizontalLineToRelative(15.5f)
            curveTo(24.02f, 13.46f, 24.0f, 12.93f, 23.99f, 12.6f)
            close()
            moveTo(22.36f, 6.87f)
            curveToRelative(-1.24f, -2.02f, -3.03f, -3.6f, -5.28f, -4.38f)
            curveToRelative(1f, -0.48f, 3.56f, -1.46f, 4.94f, -0.56f)
            curveTo(23.07f, 2.6f, 23.52f, 3.92f, 22.36f, 6.87f)
            close()
            moveTo(2.09f, 22.26f)
            curveToRelative(-0.79f, -0.72f, -0.9f, -2.7f, 0.79f, -6.18f)
            curveToRelative(0.84f, 2.47f, 2.58f, 4.49f, 4.72f, 5.73f)
            curveTo(6.5f, 22.41f, 3.61f, 23.65f, 2.09f, 22.26f)
            close()
            moveTo(8.38f, 11.03f)
            curveToRelative(0.09f, -2.47f, 2.25f, -4.49f, 4.94f, -4.49f)
            reflectiveCurveToRelative(4.83f, 2.02f, 4.94f, 4.49f)
            horizontalLineTo(8.38f)
            close()
        }
    }.also { _MicrosoftExplorer = it }
