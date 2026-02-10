package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CardSpade: ImageVector? = null

val Icons.Tr.CardSpade: ImageVector
    get() = _CardSpade ?: UXIcon(name = "CardSpade") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 0f)
                lineTo(7.5f, 0f)
                curveTo(5.02f, 0f, 3f, 2.02f, 3f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(9f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(21f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(20f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(7.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(4f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(9f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(15f)
                close()
                moveTo(13.15f, 8.46f)
                curveToRelative(-0.67f, -0.55f, -1.64f, -0.55f, -2.31f, 0f)
                curveToRelative(-1.3f, 1.07f, -2.85f, 2.66f, -2.85f, 4.15f)
                curveToRelative(0f, 1.32f, 1.01f, 2.39f, 2.25f, 2.39f)
                curveToRelative(0.39f, 0f, 0.75f, -0.09f, 1.06f, -0.25f)
                curveToRelative(-0.18f, 0.52f, -0.4f, 1.01f, -0.68f, 1.45f)
                curveToRelative(-0.22f, 0.34f, 0.0f, 0.8f, 0.41f, 0.8f)
                horizontalLineToRelative(1.91f)
                curveToRelative(0.41f, 0f, 0.63f, -0.45f, 0.41f, -0.8f)
                curveToRelative(-0.28f, -0.44f, -0.5f, -0.93f, -0.68f, -1.45f)
                curveToRelative(0.31f, 0.16f, 0.67f, 0.25f, 1.06f, 0.25f)
                curveToRelative(1.24f, 0f, 2.25f, -1.07f, 2.25f, -2.39f)
                curveToRelative(0f, -1.49f, -1.55f, -3.08f, -2.85f, -4.15f)
                close()
                moveTo(13.75f, 14f)
                curveToRelative(-0.67f, 0f, -1.15f, -0.41f, -1.24f, -1.02f)
                curveToRelative(0f, -0.01f, 0.0f, -0.02f, 0.0f, -0.03f)
                verticalLineToRelative(-0.21f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                curveToRelative(-0.24f, 0f, -0.43f, 0.16f, -0.49f, 0.38f)
                curveToRelative(-0.02f, 0.05f, -0.03f, 0.11f, -0.03f, 0.17f)
                curveToRelative(0f, 0.72f, -0.51f, 1.22f, -1.25f, 1.22f)
                curveToRelative(-0.69f, 0f, -1.25f, -0.62f, -1.25f, -1.39f)
                curveToRelative(0f, -0.84f, 0.9f, -2.08f, 2.48f, -3.38f)
                curveToRelative(0.3f, -0.25f, 0.74f, -0.25f, 1.04f, 0f)
                curveToRelative(1.58f, 1.3f, 2.48f, 2.54f, 2.48f, 3.38f)
                curveToRelative(0f, 0.77f, -0.56f, 1.39f, -1.25f, 1.39f)
                close()
            }
        }.also { _CardSpade = it}
