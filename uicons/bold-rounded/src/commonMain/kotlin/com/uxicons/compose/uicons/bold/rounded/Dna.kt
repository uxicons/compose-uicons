package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dna: ImageVector? = null

val Icons.Br.Dna: ImageVector
    get() = _Dna ?: UXIcon(name = "Dna") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17.97f, 14.07f)
            curveToRelative(-0.63f, -0.53f, -1.58f, -0.45f, -2.11f, 0.18f)
            curveToRelative(-0.43f, 0.51f, -0.46f, 1.21f, -0.14f, 1.75f)
            horizontalLineToRelative(-7.3f)
            curveToRelative(1.25f, -0.97f, 2.74f, -1.81f, 4.32f, -2.69f)
            curveToRelative(4.34f, -2.44f, 9.27f, -5.2f, 9.27f, -11.81f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            lineTo(3.5f, 0f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            curveToRelative(0f, 3.38f, 1.32f, 6.14f, 4.03f, 8.43f)
            curveToRelative(0.28f, 0.24f, 0.62f, 0.35f, 0.97f, 0.35f)
            curveToRelative(0.43f, 0f, 0.85f, -0.18f, 1.15f, -0.53f)
            curveToRelative(0.43f, -0.51f, 0.46f, -1.21f, 0.14f, -1.75f)
            horizontalLineToRelative(7.3f)
            curveToRelative(-1.25f, 0.97f, -2.74f, 1.81f, -4.32f, 2.69f)
            curveToRelative(-4.34f, 2.44f, -9.27f, 5.2f, -9.27f, 11.81f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(17f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            curveToRelative(0f, -3.38f, -1.32f, -6.14f, -4.03f, -8.43f)
            close()
            moveTo(18.21f, 5f)
            lineTo(5.79f, 5f)
            curveToRelative(-0.32f, -0.62f, -0.54f, -1.29f, -0.66f, -2f)
            horizontalLineToRelative(13.75f)
            curveToRelative(-0.13f, 0.73f, -0.36f, 1.4f, -0.66f, 2f)
            close()
            moveTo(5.79f, 19f)
            horizontalLineToRelative(12.43f)
            curveToRelative(0.32f, 0.62f, 0.54f, 1.29f, 0.66f, 2f)
            lineTo(5.13f, 21f)
            curveToRelative(0.13f, -0.73f, 0.36f, -1.4f, 0.66f, -2f)
            close()
        }
    }.also { _Dna = it }
