package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CardSpade: ImageVector? = null

val Icons.Ts.CardSpade: ImageVector
    get() = _CardSpade ?: UXIcon(name = "CardSpade") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 0f)
                lineTo(5.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(18f)
                lineTo(21f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(20f, 23f)
                lineTo(4f, 23f)
                lineTo(4f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(20.5f)
                close()
                moveTo(12.29f, 7.79f)
                lineToRelative(-0.28f, -0.2f)
                lineToRelative(-0.28f, 0.2f)
                curveToRelative(-0.38f, 0.26f, -3.71f, 2.64f, -3.71f, 4.82f)
                curveToRelative(0f, 1.32f, 1.01f, 2.39f, 2.25f, 2.39f)
                curveToRelative(0.39f, 0f, 0.75f, -0.09f, 1.06f, -0.25f)
                curveToRelative(-0.29f, 0.87f, -0.71f, 1.65f, -1.31f, 2.25f)
                horizontalLineToRelative(4f)
                curveToRelative(-0.6f, -0.6f, -1.02f, -1.38f, -1.31f, -2.25f)
                curveToRelative(0.31f, 0.16f, 0.67f, 0.25f, 1.06f, 0.25f)
                curveToRelative(1.24f, 0f, 2.25f, -1.07f, 2.25f, -2.39f)
                curveToRelative(0f, -2.18f, -3.33f, -4.56f, -3.71f, -4.82f)
                close()
                moveTo(13.75f, 14f)
                curveToRelative(-0.68f, 0f, -1.17f, -0.43f, -1.24f, -1.06f)
                horizontalLineToRelative(0.01f)
                verticalLineToRelative(-0.21f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(0.05f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(0f, 0.72f, -0.51f, 1.22f, -1.25f, 1.22f)
                curveToRelative(-0.69f, 0f, -1.25f, -0.62f, -1.25f, -1.39f)
                curveToRelative(0f, -1.28f, 1.96f, -3.01f, 3f, -3.79f)
                curveToRelative(1.04f, 0.78f, 3f, 2.51f, 3f, 3.79f)
                curveToRelative(0f, 0.77f, -0.56f, 1.39f, -1.25f, 1.39f)
                close()
            }
        }.also { _CardSpade = it}
