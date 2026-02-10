package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DisplaySlash: ImageVector? = null

val Icons.Sc.DisplaySlash: ImageVector
    get() = _DisplaySlash ?: UXIcon(name = "DisplaySlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.0f, 21.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.02f)
                curveToRelative(-5.1f, -0.14f, -7.7f, -0.99f, -7.82f, -1.03f)
                curveToRelative(-0.28f, -0.09f, -0.5f, -0.3f, -0.61f, -0.58f)
                curveToRelative(-0.04f, -0.11f, -1.07f, -2.73f, -1.07f, -6.87f)
                curveToRelative(0f, -1.27f, 0.1f, -2.4f, 0.23f, -3.35f)
                lineToRelative(12.27f, 12.27f)
                verticalLineToRelative(1.59f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(19.5f, 17.38f)
                curveToRelative(1.15f, -0.22f, 1.76f, -0.41f, 1.82f, -0.43f)
                curveToRelative(0.28f, -0.09f, 0.5f, -0.3f, 0.61f, -0.58f)
                curveToRelative(0.04f, -0.11f, 1.07f, -2.73f, 1.07f, -6.87f)
                reflectiveCurveToRelative(-1.03f, -6.76f, -1.07f, -6.87f)
                curveToRelative(-0.11f, -0.27f, -0.33f, -0.48f, -0.61f, -0.58f)
                curveToRelative(-0.13f, -0.04f, -3.23f, -1.05f, -9.32f, -1.05f)
                curveToRelative(-4.01f, 0f, -6.71f, 0.44f, -8.13f, 0.75f)
                lineToRelative(-0.31f, -0.31f)
                curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
                curveToRelative(-0.59f, 0.58f, -0.59f, 1.54f, 0f, 2.12f)
                lineToRelative(19f, 19f)
                curveToRelative(0.59f, 0.59f, 1.53f, 0.59f, 2.12f, 0f)
                curveToRelative(0.59f, -0.58f, 0.59f, -1.54f, 0f, -2.12f)
                lineToRelative(-3.06f, -3.06f)
                close()
            }
        }.also { _DisplaySlash = it}
