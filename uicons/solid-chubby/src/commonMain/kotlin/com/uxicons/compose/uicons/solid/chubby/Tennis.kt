package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tennis: ImageVector? = null

val Icons.Sc.Tennis: ImageVector
    get() = _Tennis ?: UXIcon(name = "Tennis") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.32f, 20.79f)
                curveToRelative(0f, -5.9f, -2.87f, -7.11f, -7.17f, -7.11f)
                curveToRelative(-0.7f, 0f, -1.33f, 0.04f, -1.91f, 0.11f)
                curveToRelative(0.47f, 1.77f, 1.63f, 3.56f, 3.5f, 5.42f)
                curveToRelative(1.98f, 1.97f, 3.79f, 3.04f, 5.46f, 3.48f)
                curveToRelative(0.08f, -0.58f, 0.12f, -1.22f, 0.12f, -1.91f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.69f, 3.21f)
                curveToRelative(0f, 4.27f, 1.22f, 7.11f, 7.17f, 7.11f)
                curveToRelative(0.68f, 0f, 1.32f, -0.04f, 1.9f, -0.11f)
                curveToRelative(-0.47f, -1.77f, -1.63f, -3.56f, -3.5f, -5.42f)
                curveToRelative(-1.98f, -1.97f, -3.79f, -3.04f, -5.46f, -3.48f)
                curveToRelative(-0.07f, 0.57f, -0.11f, 1.2f, -0.11f, 1.91f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.86f, 12.32f)
                curveToRelative(-8.22f, 0f, -9.17f, -5.2f, -9.17f, -9.11f)
                curveToRelative(0f, -0.79f, 0.04f, -1.51f, 0.12f, -2.17f)
                curveToRelative(-2.83f, 0.05f, -5.16f, 1.84f, -7.07f, 3.74f)
                curveToRelative(-2.5f, 2.48f, -3.69f, 4.71f, -3.74f, 7.02f)
                curveToRelative(0.65f, -0.08f, 1.36f, -0.12f, 2.15f, -0.12f)
                curveToRelative(3.94f, 0f, 9.17f, 0.94f, 9.17f, 9.11f)
                curveToRelative(0f, 0.77f, -0.04f, 1.49f, -0.13f, 2.16f)
                curveToRelative(2.83f, -0.05f, 5.16f, -1.84f, 7.07f, -3.74f)
                curveToRelative(2.5f, -2.48f, 3.69f, -4.71f, 3.74f, -7.02f)
                curveToRelative(-0.66f, 0.09f, -1.38f, 0.13f, -2.14f, 0.13f)
                close()
            }
        }.also { _Tennis = it}
