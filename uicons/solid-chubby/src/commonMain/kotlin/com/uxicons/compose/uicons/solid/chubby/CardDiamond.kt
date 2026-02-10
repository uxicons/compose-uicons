package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CardDiamond: ImageVector? = null

val Icons.Sc.CardDiamond: ImageVector
    get() = _CardDiamond ?: UXIcon(name = "CardDiamond") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.05f, 2.91f)
                curveToRelative(-0.08f, -0.33f, -0.32f, -0.59f, -0.64f, -0.71f)
                curveToRelative(-0.14f, -0.05f, -3.47f, -1.21f, -7.41f, -1.21f)
                reflectiveCurveToRelative(-7.27f, 1.16f, -7.41f, 1.21f)
                curveToRelative(-0.32f, 0.11f, -0.56f, 0.38f, -0.64f, 0.71f)
                curveToRelative(-0.04f, 0.16f, -0.95f, 3.98f, -0.95f, 9.08f)
                curveToRelative(0f, 5.15f, 0.91f, 8.93f, 0.95f, 9.09f)
                curveToRelative(0.08f, 0.33f, 0.32f, 0.59f, 0.64f, 0.71f)
                curveToRelative(0.14f, 0.05f, 3.47f, 1.21f, 7.41f, 1.21f)
                reflectiveCurveToRelative(7.27f, -1.16f, 7.41f, -1.21f)
                curveToRelative(0.32f, -0.11f, 0.56f, -0.38f, 0.64f, -0.71f)
                curveToRelative(0.04f, -0.16f, 0.95f, -3.98f, 0.95f, -9.08f)
                curveToRelative(0f, -5.15f, -0.91f, -8.93f, -0.95f, -9.09f)
                close()
                moveTo(15.41f, 12.4f)
                curveToRelative(-0.02f, 0.04f, -0.43f, 0.97f, -1.23f, 1.93f)
                curveToRelative(-0.79f, 0.95f, -1.55f, 1.45f, -1.64f, 1.51f)
                curveToRelative(-0.17f, 0.11f, -0.35f, 0.16f, -0.54f, 0.16f)
                curveToRelative(-0.2f, 0f, -0.39f, -0.06f, -0.56f, -0.17f)
                curveToRelative(-0.04f, -0.02f, -0.87f, -0.59f, -1.62f, -1.5f)
                curveToRelative(-0.75f, -0.9f, -1.21f, -1.87f, -1.23f, -1.91f)
                curveToRelative(-0.12f, -0.26f, -0.12f, -0.56f, -0.01f, -0.83f)
                curveToRelative(0.02f, -0.04f, 0.43f, -0.97f, 1.23f, -1.93f)
                curveToRelative(0.79f, -0.95f, 1.55f, -1.45f, 1.64f, -1.51f)
                curveToRelative(0.34f, -0.22f, 0.77f, -0.21f, 1.1f, 0.01f)
                curveToRelative(0.04f, 0.02f, 0.87f, 0.59f, 1.62f, 1.5f)
                curveToRelative(0.75f, 0.9f, 1.21f, 1.87f, 1.23f, 1.91f)
                curveToRelative(0.12f, 0.26f, 0.12f, 0.56f, 0.01f, 0.83f)
                close()
            }
        }.also { _CardDiamond = it}
