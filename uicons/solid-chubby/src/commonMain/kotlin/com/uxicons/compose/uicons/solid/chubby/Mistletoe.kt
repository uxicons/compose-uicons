package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mistletoe: ImageVector? = null

val Icons.Sc.Mistletoe: ImageVector
    get() = _Mistletoe ?: UXIcon(name = "Mistletoe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 8.5f)
                curveToRelative(0f, -1.79f, 0.71f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 0.71f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-0.71f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -0.71f, -2.5f, -2.5f)
                close()
                moveTo(17.5f, 10f)
                curveToRelative(1.79f, 0f, 2.5f, -0.71f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-0.71f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 0.71f, -2.5f, 2.5f)
                reflectiveCurveToRelative(0.71f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(18.56f, 11.92f)
                curveToRelative(-0.33f, 0.05f, -0.68f, 0.08f, -1.06f, 0.08f)
                curveToRelative(-1.8f, 0f, -3.27f, -0.71f, -4f, -1.87f)
                verticalLineToRelative(-1.07f)
                curveToRelative(0f, -5.35f, -3.03f, -8.06f, -9f, -8.06f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                curveToRelative(5.0f, 0f, 6f, 1.94f, 6f, 5.06f)
                curveToRelative(0.02f, 0.5f, -0.01f, 1.91f, -0.19f, 2.14f)
                curveToRelative(-0.72f, 1.17f, -2.01f, 1.79f, -3.81f, 1.79f)
                curveToRelative(-0.91f, 0f, -1.67f, -0.17f, -2.31f, -0.48f)
                curveToRelative(-3.23f, 2.51f, -3.19f, 5.92f, -3.19f, 5.98f)
                curveToRelative(0f, 3.07f, 1.43f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -1.43f, 4.5f, -4.5f)
                curveToRelative(0f, -0.03f, 0f, -0.05f, -0.0f, -0.08f)
                curveToRelative(-0.12f, -1.55f, -0.17f, -5.23f, 1.77f, -6.38f)
                curveToRelative(1.98f, 1.16f, 2.35f, 4.83f, 2.23f, 6.38f)
                curveToRelative(-0.0f, 0.03f, -0.0f, 0.05f, -0.0f, 0.08f)
                curveToRelative(0f, 3.07f, 1.43f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -1.43f, 4.5f, -4.5f)
                curveToRelative(0f, -0.06f, -0.19f, -4.06f, -4.44f, -6.58f)
                close()
            }
        }.also { _Mistletoe = it}
