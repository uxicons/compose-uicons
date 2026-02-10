package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseChimneyCrack: ImageVector? = null

val Icons.Bs.HouseChimneyCrack: ImageVector
    get() = _HouseChimneyCrack ?: UXIcon(name = "HouseChimneyCrack") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.66f, 7.4f)
                lineToRelative(-0.66f, -0.51f)
                lineTo(22f, 1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3.53f)
                lineTo(14.16f, 0.74f)
                curveToRelative(-1.27f, -0.99f, -3.04f, -0.99f, -4.31f, 0f)
                lineTo(1.34f, 7.39f)
                curveToRelative(-0.85f, 0.67f, -1.34f, 1.67f, -1.34f, 2.76f)
                verticalLineToRelative(13.85f)
                lineTo(24f, 24f)
                lineTo(24f, 10.15f)
                curveToRelative(0f, -1.08f, -0.49f, -2.09f, -1.34f, -2.76f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-6.05f)
                lineToRelative(2.01f, -5.81f)
                curveToRelative(0.18f, -0.59f, -0.26f, -1.19f, -0.88f, -1.19f)
                horizontalLineToRelative(-3.9f)
                lineToRelative(1.83f, -5f)
                horizontalLineToRelative(-2f)
                lineToRelative(-4.85f, 7.59f)
                curveToRelative(-0.4f, 0.6f, 0.03f, 1.41f, 0.75f, 1.41f)
                horizontalLineToRelative(3.23f)
                lineToRelative(-1.15f, 3f)
                lineTo(3f, 21f)
                lineTo(3f, 10.15f)
                curveToRelative(0f, -0.15f, 0.07f, -0.3f, 0.19f, -0.39f)
                lineTo(11.69f, 3.11f)
                curveToRelative(0.18f, -0.14f, 0.43f, -0.14f, 0.61f, 0f)
                lineToRelative(8.5f, 6.65f)
                curveToRelative(0.12f, 0.09f, 0.19f, 0.24f, 0.19f, 0.39f)
                verticalLineToRelative(10.85f)
                close()
            }
        }.also { _HouseChimneyCrack = it}
