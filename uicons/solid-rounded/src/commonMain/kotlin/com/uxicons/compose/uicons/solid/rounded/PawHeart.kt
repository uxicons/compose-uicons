package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PawHeart: ImageVector? = null

val Icons.Sr.PawHeart: ImageVector
    get() = _PawHeart ?: UXIcon(name = "PawHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.24f, 1f)
                curveToRelative(-2.05f, 0f, -3.95f, 0.91f, -5.24f, 2.5f)
                curveToRelative(-1.29f, -1.59f, -3.19f, -2.5f, -5.24f, -2.5f)
                curveTo(3.03f, 1f, 0f, 4.05f, 0f, 7.79f)
                curveToRelative(0f, 4.91f, 5.56f, 11.31f, 9.06f, 14.19f)
                curveToRelative(0.82f, 0.68f, 1.83f, 1.01f, 2.84f, 1.01f)
                curveToRelative(1.0f, 0f, 2.01f, -0.33f, 2.83f, -1.0f)
                curveToRelative(3.73f, -3.03f, 9.27f, -9.32f, 9.27f, -14.2f)
                curveToRelative(0f, -3.74f, -3.03f, -6.79f, -6.76f, -6.79f)
                close()
                moveTo(13.45f, 8.01f)
                curveToRelative(0.51f, 0.06f, 0.88f, 0.65f, 0.8f, 1.53f)
                curveToRelative(-0.24f, 2.12f, -2.02f, 1.85f, -1.86f, -0.22f)
                curveToRelative(0.08f, -0.88f, 0.55f, -1.36f, 1.06f, -1.3f)
                close()
                moveTo(10.54f, 8.01f)
                curveToRelative(0.52f, -0.06f, 0.98f, 0.42f, 1.06f, 1.3f)
                curveToRelative(0.16f, 2.07f, -1.62f, 2.35f, -1.86f, 0.22f)
                curveToRelative(-0.08f, -0.88f, 0.28f, -1.46f, 0.8f, -1.53f)
                close()
                moveTo(7.51f, 11.54f)
                curveToRelative(-0.08f, -0.88f, 0.29f, -1.46f, 0.8f, -1.53f)
                curveToRelative(0.51f, -0.06f, 0.98f, 0.42f, 1.06f, 1.3f)
                curveToRelative(0.16f, 2.07f, -1.62f, 2.35f, -1.86f, 0.22f)
                close()
                moveTo(13.83f, 16.0f)
                curveToRelative(-0.27f, -0.01f, -0.54f, -0.06f, -0.8f, -0.14f)
                curveToRelative(-0.67f, -0.21f, -1.4f, -0.21f, -2.07f, 0f)
                curveToRelative(-1.1f, 0.36f, -2.01f, 0.01f, -1.97f, -0.98f)
                curveToRelative(0.0f, -1.46f, 1.49f, -2.88f, 3f, -2.88f)
                reflectiveCurveToRelative(3.0f, 1.43f, 3.0f, 2.88f)
                curveToRelative(0f, 0.51f, -0.2f, 1.12f, -1.17f, 1.12f)
                close()
                moveTo(14.51f, 11.32f)
                curveToRelative(0.08f, -0.88f, 0.55f, -1.36f, 1.06f, -1.3f)
                reflectiveCurveToRelative(0.88f, 0.65f, 0.8f, 1.53f)
                curveToRelative(-0.24f, 2.12f, -2.02f, 1.85f, -1.86f, -0.22f)
                close()
            }
        }.also { _PawHeart = it}
