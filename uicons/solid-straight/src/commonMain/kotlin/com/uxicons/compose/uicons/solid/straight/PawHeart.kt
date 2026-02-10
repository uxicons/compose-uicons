package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PawHeart: ImageVector? = null

val Icons.Ss.PawHeart: ImageVector
    get() = _PawHeart ?: UXIcon(name = "PawHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 1f)
                curveToRelative(-2.32f, 0f, -4.35f, 1.22f, -5.5f, 3.05f)
                curveToRelative(-1.15f, -1.83f, -3.18f, -3.05f, -5.5f, -3.05f)
                curveTo(2.92f, 1f, 0f, 3.92f, 0f, 7.5f)
                curveToRelative(0f, 6.98f, 11.31f, 15.23f, 11.42f, 15.31f)
                lineToRelative(0.58f, 0.41f)
                lineToRelative(0.58f, -0.41f)
                curveToRelative(3.95f, -2.8f, 11.42f, -9.6f, 11.42f, -15.32f)
                curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
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
