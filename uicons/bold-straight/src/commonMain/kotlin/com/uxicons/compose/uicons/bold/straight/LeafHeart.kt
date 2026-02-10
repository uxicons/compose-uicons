package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LeafHeart: ImageVector? = null

val Icons.Bs.LeafHeart: ImageVector
    get() = _LeafHeart ?: UXIcon(name = "LeafHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.84f, 1.05f)
                curveToRelative(-2.38f, 1.17f, -4.9f, 1.14f, -7.33f, 1.1f)
                curveToRelative(-3.29f, -0.04f, -6.71f, -0.09f, -9.58f, 2.77f)
                curveToRelative(-3.54f, 3.54f, -3.87f, 9.09f, -0.98f, 13.0f)
                lineTo(0.0f, 21.88f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(3.94f, -3.94f)
                curveToRelative(1.71f, 1.26f, 3.77f, 1.95f, 5.93f, 1.95f)
                curveToRelative(2.67f, 0f, 5.18f, -1.04f, 7.07f, -2.93f)
                curveToRelative(4.55f, -4.55f, 4.93f, -10.99f, 4.93f, -16.67f)
                lineTo(24f, -0.01f)
                lineToRelative(-2.16f, 1.06f)
                close()
                moveTo(16.95f, 16.95f)
                curveToRelative(-1.32f, 1.32f, -3.08f, 2.05f, -4.95f, 2.05f)
                reflectiveCurveToRelative(-3.63f, -0.73f, -4.95f, -2.05f)
                curveToRelative(-2.73f, -2.73f, -2.73f, -7.17f, 0f, -9.9f)
                curveToRelative(1.7f, -1.7f, 3.72f, -1.91f, 6.19f, -1.91f)
                curveToRelative(0.4f, 0f, 0.81f, 0.01f, 1.23f, 0.01f)
                curveToRelative(2.02f, 0.03f, 4.23f, 0.06f, 6.5f, -0.58f)
                curveToRelative(-0.17f, 5.26f, -1.05f, 9.41f, -4.02f, 12.37f)
                close()
                moveTo(14.77f, 7.87f)
                curveToRelative(1.24f, 0f, 2.25f, 1.11f, 2.25f, 2.48f)
                curveToRelative(0f, 2.59f, -4.5f, 5.78f, -4.5f, 5.78f)
                curveToRelative(0f, 0f, -4.5f, -3.18f, -4.5f, -5.78f)
                curveToRelative(0f, -1.37f, 1.01f, -2.48f, 2.25f, -2.48f)
                reflectiveCurveToRelative(2.25f, 1.11f, 2.25f, 2.48f)
                curveToRelative(0f, -1.37f, 1.01f, -2.48f, 2.25f, -2.48f)
                close()
            }
        }.also { _LeafHeart = it}
