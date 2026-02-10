package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneFlip: ImageVector? = null

val Icons.Rc.PhoneFlip: ImageVector
    get() = _PhoneFlip ?: UXIcon(name = "PhoneFlip") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.25f, 1f)
                curveToRelative(-2.62f, 0f, -4.75f, 2.13f, -4.75f, 4.75f)
                curveToRelative(0f, 1.32f, 0.55f, 2.59f, 1.52f, 3.48f)
                curveToRelative(0.07f, 0.07f, 0.15f, 0.14f, 0.24f, 0.21f)
                curveToRelative(-0.26f, 0.63f, -1.08f, 1.97f, -1.96f, 2.85f)
                curveToRelative(-0.88f, 0.88f, -2.21f, 1.71f, -2.85f, 1.96f)
                curveToRelative(-0.08f, -0.09f, -0.15f, -0.17f, -0.21f, -0.24f)
                curveToRelative(-0.9f, -0.97f, -2.17f, -1.52f, -3.48f, -1.52f)
                curveToRelative(-2.62f, 0f, -4.75f, 2.13f, -4.75f, 4.75f)
                curveToRelative(0f, 2.83f, 2.43f, 5.75f, 6.5f, 5.75f)
                curveToRelative(2.37f, 0f, 7.04f, -2.13f, 10.21f, -5.29f)
                reflectiveCurveToRelative(5.29f, -7.83f, 5.29f, -10.21f)
                curveToRelative(0f, -4.07f, -2.92f, -6.5f, -5.75f, -6.5f)
                close()
                moveTo(16.29f, 16.29f)
                curveToRelative(-2.92f, 2.92f, -7.09f, 4.71f, -8.79f, 4.71f)
                curveToRelative(-3.28f, 0f, -4.5f, -2.3f, -4.5f, -3.75f)
                curveToRelative(0f, -1.52f, 1.23f, -2.75f, 2.75f, -2.75f)
                curveToRelative(0.77f, 0f, 1.49f, 0.31f, 2.02f, 0.88f)
                curveToRelative(0.14f, 0.15f, 0.3f, 0.34f, 0.48f, 0.54f)
                curveToRelative(0.22f, 0.26f, 0.55f, 0.41f, 0.92f, 0.42f)
                curveToRelative(1.21f, 0.02f, 3.58f, -1.66f, 4.55f, -2.63f)
                curveToRelative(0.97f, -0.97f, 2.67f, -3.31f, 2.63f, -4.55f)
                curveToRelative(-0.01f, -0.37f, -0.16f, -0.69f, -0.42f, -0.92f)
                curveToRelative(-0.2f, -0.17f, -0.39f, -0.34f, -0.54f, -0.48f)
                curveToRelative(-0.57f, -0.53f, -0.88f, -1.24f, -0.88f, -2.02f)
                curveToRelative(0f, -1.52f, 1.23f, -2.75f, 2.75f, -2.75f)
                curveToRelative(1.45f, 0f, 3.75f, 1.22f, 3.75f, 4.5f)
                curveToRelative(0f, 1.71f, -1.79f, 5.88f, -4.71f, 8.79f)
                close()
            }
        }.also { _PhoneFlip = it}
