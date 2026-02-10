package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hairdryer: ImageVector? = null

val Icons.Bs.Hairdryer: ImageVector
    get() = _Hairdryer ?: UXIcon(name = "Hairdryer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 13.42f)
                verticalLineToRelative(-12.84f)
                lineToRelative(-7.56f, 1.89f)
                curveToRelative(-4.16f, -1.63f, -7.34f, -2.47f, -9.44f, -2.47f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7.0f)
                curveToRelative(0f, 2.18f, 1.01f, 4.14f, 2.58f, 5.42f)
                lineToRelative(3.73f, 9.11f)
                curveToRelative(0.79f, 2.0f, 3.26f, 3.02f, 5.23f, 2.15f)
                curveToRelative(2.04f, -0.85f, 3.0f, -3.19f, 2.15f, -5.23f)
                lineToRelative(-2.18f, -5.24f)
                curveToRelative(1.45f, -0.41f, 3.09f, -0.97f, 4.93f, -1.69f)
                close()
                moveTo(21f, 9.58f)
                lineTo(18f, 8.83f)
                verticalLineToRelative(-3.66f)
                lineToRelative(3f, -0.75f)
                close()
                moveTo(7f, 3f)
                curveToRelative(1.17f, 0f, 3.5f, 0.38f, 8f, 2.12f)
                verticalLineToRelative(3.76f)
                curveToRelative(-4.5f, 1.74f, -6.83f, 2.12f, -8f, 2.12f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                close()
                moveTo(10.92f, 19.61f)
                curveToRelative(0.21f, 0.51f, -0.03f, 1.1f, -0.54f, 1.31f)
                curveToRelative(-0.48f, 0.22f, -1.11f, -0.04f, -1.3f, -0.53f)
                lineToRelative(-2.62f, -6.42f)
                curveToRelative(0.18f, 0.01f, 0.36f, 0.03f, 0.54f, 0.03f)
                curveToRelative(0.46f, 0f, 0.97f, -0.05f, 1.53f, -0.13f)
                lineToRelative(2.39f, 5.74f)
                close()
            }
        }.also { _Hairdryer = it}
