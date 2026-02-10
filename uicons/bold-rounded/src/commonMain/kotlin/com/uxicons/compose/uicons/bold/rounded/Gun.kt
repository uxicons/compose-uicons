package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gun: ImageVector? = null

val Icons.Br.Gun: ImageVector
    get() = _Gun ?: UXIcon(name = "Gun") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 6f)
            curveToRelative(0f, -0.65f, -0.42f, -1.2f, -1f, -1.41f)
            verticalLineToRelative(-0.09f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            lineTo(3.5f, 2f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(2.14f)
            curveToRelative(0f, 1.09f, 0.73f, 2.06f, 1.81f, 2.4f)
            curveToRelative(0.5f, 0.16f, 0.22f, 1.17f, 0.22f, 1.17f)
            lineTo(0.15f, 17.5f)
            curveToRelative(-0.71f, 2.16f, 1.08f, 4.57f, 3.35f, 4.5f)
            horizontalLineToRelative(1.07f)
            curveToRelative(1.78f, 0f, 3.36f, -1.19f, 3.85f, -2.9f)
            lineToRelative(0.89f, -3.1f)
            horizontalLineToRelative(2.18f)
            curveToRelative(2.45f, 0f, 4.56f, -1.57f, 5.28f, -3.96f)
            lineToRelative(0.55f, -2.04f)
            horizontalLineToRelative(2.95f)
            curveToRelative(1.56f, 0f, 2.75f, -1.07f, 2.75f, -2.5f)
            verticalLineToRelative(-0.09f)
            curveToRelative(0.58f, -0.21f, 1f, -0.76f, 1f, -1.41f)
            close()
            moveTo(4.57f, 19f)
            horizontalLineToRelative(-1.07f)
            curveToRelative(-0.4f, -0.06f, -0.54f, -0.24f, -0.48f, -0.64f)
            lineToRelative(1.89f, -6.3f)
            curveToRelative(0.21f, -0.72f, 0.25f, -1.42f, 0.16f, -2.05f)
            horizontalLineToRelative(2.82f)
            lineToRelative(-2.36f, 8.28f)
            curveToRelative(-0.12f, 0.43f, -0.52f, 0.72f, -0.96f, 0.72f)
            close()
            moveTo(13.87f, 11.22f)
            curveToRelative(-0.32f, 1.07f, -1.28f, 1.78f, -2.4f, 1.78f)
            horizontalLineToRelative(-1.32f)
            lineToRelative(0.86f, -3f)
            horizontalLineToRelative(3.19f)
            lineToRelative(-0.33f, 1.22f)
            close()
            moveTo(20f, 7f)
            lineTo(3f, 7f)
            verticalLineToRelative(-0.34f)
            curveToRelative(0.73f, -0.35f, 1.32f, -0.94f, 1.66f, -1.66f)
            horizontalLineToRelative(15.34f)
            verticalLineToRelative(2f)
            close()
        }
    }.also { _Gun = it }
