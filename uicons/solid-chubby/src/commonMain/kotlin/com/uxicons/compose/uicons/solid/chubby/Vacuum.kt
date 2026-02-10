package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Vacuum: ImageVector? = null

val Icons.Sc.Vacuum: ImageVector
    get() = _Vacuum ?: UXIcon(name = "Vacuum") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 20.5f)
                curveToRelative(0f, 1.79f, -0.71f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -0.71f, -2.5f, -2.5f)
                reflectiveCurveToRelative(0.71f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 0.71f, 2.5f, 2.5f)
                close()
                moveTo(18.98f, 7.26f)
                curveToRelative(-0.08f, -4.2f, -2.19f, -6.26f, -6.48f, -6.26f)
                curveToRelative(-2.9f, 0f, -4.51f, 0.99f, -5.53f, 3.42f)
                curveToRelative(-0.56f, 1.31f, -0.9f, 4.09f, -1.42f, 8.53f)
                curveToRelative(-0.25f, 2.17f, -0.54f, 4.6f, -0.87f, 6.79f)
                curveToRelative(-0.67f, 0.13f, -1.51f, 0.26f, -2.18f, 0.26f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                curveToRelative(1.67f, 0f, 3.79f, -0.55f, 3.88f, -0.57f)
                curveToRelative(0.57f, -0.15f, 1.0f, -0.62f, 1.1f, -1.21f)
                curveToRelative(0.42f, -2.51f, 0.75f, -5.39f, 1.05f, -7.93f)
                curveToRelative(0.39f, -3.31f, 0.78f, -6.73f, 1.2f, -7.71f)
                curveToRelative(0.49f, -1.15f, 0.85f, -1.58f, 2.77f, -1.58f)
                curveToRelative(2.57f, 0f, 3.38f, 0.68f, 3.48f, 3.02f)
                curveToRelative(-0.98f, 0.05f, -2.08f, 0.22f, -2.13f, 0.23f)
                curveToRelative(-0.39f, 0.06f, -0.7f, 0.34f, -0.81f, 0.71f)
                curveToRelative(-1.03f, 3.59f, -1.04f, 12.66f, -1.04f, 13.04f)
                curveToRelative(0f, 0.43f, 0.28f, 0.81f, 0.68f, 0.95f)
                curveToRelative(0.09f, 0.03f, 1.62f, 0.53f, 3.78f, 0.83f)
                curveToRelative(-0.29f, -0.64f, -0.46f, -1.39f, -0.46f, -2.28f)
                curveToRelative(0f, -2.9f, 1.6f, -4.5f, 4.5f, -4.5f)
                curveToRelative(0.99f, 0f, 1.82f, 0.2f, 2.5f, 0.56f)
                verticalLineToRelative(-2.56f)
                curveToRelative(0f, -3.45f, -0.75f, -5.96f, -4.02f, -6.74f)
                close()
            }
        }.also { _Vacuum = it}
