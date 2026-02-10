package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Home: ImageVector? = null

val Icons.Sc.Home: ImageVector
    get() = _Home ?: UXIcon(name = "Home") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 14.69f)
                curveToRelative(-1.15f, 0f, -2.08f, 0.98f, -2.08f, 2.2f)
                verticalLineToRelative(6.08f)
                curveToRelative(0.65f, 0.03f, 1.35f, 0.04f, 2.08f, 0.04f)
                reflectiveCurveToRelative(1.43f, -0.02f, 2.08f, -0.04f)
                verticalLineToRelative(-6.08f)
                curveToRelative(0f, -1.21f, -0.94f, -2.2f, -2.08f, -2.2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.09f, 6.76f)
                curveToRelative(-0.07f, -0.15f, -0.18f, -0.28f, -0.31f, -0.38f)
                curveToRelative(-0.18f, -0.14f, -0.37f, -0.28f, -0.56f, -0.42f)
                verticalLineTo(3.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.32f)
                curveToRelative(-2.27f, -1.56f, -4.37f, -2.82f, -5.21f, -2.82f)
                curveToRelative(-1.3f, 0f, -5.49f, 2.93f, -8.78f, 5.38f)
                curveToRelative(-0.13f, 0.1f, -0.24f, 0.23f, -0.31f, 0.38f)
                curveToRelative(-0.05f, 0.1f, -1.15f, 2.56f, -1.15f, 7.58f)
                curveToRelative(0f, 2.17f, 0.2f, 5.37f, 0.43f, 6.86f)
                curveToRelative(0.06f, 0.38f, 0.33f, 0.69f, 0.7f, 0.8f)
                curveToRelative(0.1f, 0.03f, 1.84f, 0.55f, 5.03f, 0.82f)
                verticalLineToRelative(-5.95f)
                curveToRelative(0f, -2.31f, 1.83f, -4.2f, 4.08f, -4.2f)
                reflectiveCurveToRelative(4.08f, 1.88f, 4.08f, 4.2f)
                verticalLineToRelative(5.95f)
                curveToRelative(3.19f, -0.28f, 4.93f, -0.8f, 5.03f, -0.82f)
                curveToRelative(0.37f, -0.11f, 0.64f, -0.42f, 0.7f, -0.8f)
                curveToRelative(0.23f, -1.5f, 0.43f, -4.7f, 0.43f, -6.86f)
                curveToRelative(0f, -5.06f, -1.11f, -7.48f, -1.16f, -7.58f)
                close()
            }
        }.also { _Home = it}
