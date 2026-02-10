package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GiftCard: ImageVector? = null

val Icons.Br.GiftCard: ImageVector
    get() = _GiftCard ?: UXIcon(name = "GiftCard") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 5f)
            horizontalLineToRelative(-0.56f)
            curveToRelative(1.2f, -1.18f, 1.43f, -2.65f, 0.51f, -3.88f)
            curveToRelative(-0.93f, -1.24f, -2.69f, -1.49f, -3.93f, -0.56f)
            curveToRelative(-1.65f, 1.24f, -2.33f, 3.39f, -2.52f, 4.44f)
            curveToRelative(-0.2f, -1.05f, -0.84f, -3.2f, -2.5f, -4.44f)
            curveToRelative(-1.24f, -0.93f, -3.0f, -0.68f, -3.93f, 0.56f)
            curveToRelative(-0.92f, 1.22f, -0.69f, 2.7f, 0.51f, 3.88f)
            horizontalLineToRelative(-0.58f)
            curveTo(2.47f, 5f, 0f, 7.47f, 0f, 10.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 10.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(18.5f, 21f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.21f, 0f, -2.22f, -0.86f, -2.45f, -2f)
            lineTo(20.95f, 19f)
            curveToRelative(-0.23f, 1.14f, -1.24f, 2f, -2.45f, 2f)
            close()
            moveTo(21f, 16f)
            lineTo(3f, 16f)
            verticalLineToRelative(-5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(4.83f)
            curveToRelative(-0.62f, 1.66f, -2.72f, 1.98f, -3.0f, 2.01f)
            curveToRelative(-0.82f, 0.1f, -1.41f, 0.83f, -1.32f, 1.66f)
            curveToRelative(0.09f, 0.77f, 0.74f, 1.33f, 1.49f, 1.33f)
            curveToRelative(1.5f, 0f, 3.21f, -0.74f, 4.5f, -2.1f)
            curveToRelative(1.29f, 1.36f, 3f, 2.1f, 4.5f, 2.1f)
            horizontalLineToRelative(0.0f)
            curveToRelative(0.75f, 0f, 1.4f, -0.57f, 1.49f, -1.33f)
            curveToRelative(0.09f, -0.82f, -0.5f, -1.56f, -1.32f, -1.66f)
            curveToRelative(-0.11f, -0.01f, -2.35f, -0.28f, -2.99f, -2.01f)
            horizontalLineToRelative(4.83f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(5.5f)
            close()
        }
    }.also { _GiftCard = it }
