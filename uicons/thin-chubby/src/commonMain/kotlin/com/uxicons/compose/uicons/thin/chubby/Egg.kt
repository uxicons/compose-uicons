package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Egg: ImageVector? = null

val Icons.Tc.Egg: ImageVector
    get() = _Egg ?: UXIcon(name = "Egg") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.21f, 4.8f)
                curveToRelative(-1.9f, -2.37f, -4.26f, -3.79f, -6.21f, -3.8f)
                curveToRelative(-3.72f, 0.06f, -9.5f, 5.94f, -9.59f, 13.1f)
                curveToRelative(0.13f, 5.41f, 3.9f, 8.9f, 9.6f, 8.9f)
                curveToRelative(5.77f, 0f, 9.44f, -3.41f, 9.57f, -8.9f)
                verticalLineToRelative(-0.02f)
                curveToRelative(-0.05f, -3.33f, -1.25f, -6.63f, -3.37f, -9.28f)
                close()
                moveTo(12.02f, 22f)
                curveToRelative(-5.19f, 0f, -8.48f, -3.04f, -8.6f, -7.91f)
                curveToRelative(0.09f, -6.49f, 5.35f, -12.05f, 8.61f, -12.09f)
                curveToRelative(0.01f, 0f, 0.03f, 0f, 0.04f, 0f)
                curveToRelative(1.59f, 0f, 3.7f, 1.34f, 5.37f, 3.42f)
                curveToRelative(1.15f, 1.43f, 3.09f, 4.46f, 3.15f, 8.66f)
                curveToRelative(-0.12f, 4.96f, -3.33f, 7.92f, -8.57f, 7.92f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.29f, 7.86f)
                moveToRelative(-0.75f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.93f, 10.83f)
                moveToRelative(-0.75f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
            }
        }.also { _Egg = it}
