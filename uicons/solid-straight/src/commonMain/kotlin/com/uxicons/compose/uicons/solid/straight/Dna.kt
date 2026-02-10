package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dna: ImageVector? = null

val Icons.Ss.Dna: ImageVector
    get() = _Dna ?: UXIcon(name = "Dna") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.54f, 13.23f)
                curveToRelative(-0.59f, 0.41f, -1.18f, 0.8f, -1.76f, 1.19f)
                curveToRelative(0.72f, 0.51f, 1.41f, 1.03f, 2.05f, 1.58f)
                horizontalLineToRelative(-7.66f)
                curveToRelative(1.32f, -1.12f, 2.83f, -2.13f, 4.38f, -3.17f)
                curveToRelative(4.64f, -3.1f, 9.45f, -6.3f, 9.45f, -12.83f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 0.71f, -0.07f, 1.37f, -0.2f, 2f)
                lineTo(4.21f, 2f)
                curveToRelative(-0.13f, -0.63f, -0.21f, -1.29f, -0.21f, -2f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 5.12f, 2.95f, 8.19f, 6.46f, 10.77f)
                curveToRelative(0.59f, -0.41f, 1.18f, -0.8f, 1.76f, -1.19f)
                curveToRelative(-0.72f, -0.51f, -1.41f, -1.03f, -2.05f, -1.58f)
                horizontalLineToRelative(7.66f)
                curveToRelative(-1.32f, 1.12f, -2.83f, 2.13f, -4.38f, 3.17f)
                curveToRelative(-4.64f, 3.1f, -9.45f, 6.3f, -9.45f, 12.83f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -0.71f, 0.07f, -1.37f, 0.2f, -2f)
                horizontalLineToRelative(15.58f)
                curveToRelative(0.13f, 0.63f, 0.21f, 1.29f, 0.21f, 2f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -5.12f, -2.95f, -8.19f, -6.46f, -10.77f)
                close()
                moveTo(4.89f, 4f)
                horizontalLineToRelative(14.22f)
                curveToRelative(-0.34f, 0.72f, -0.78f, 1.38f, -1.28f, 2f)
                lineTo(6.17f, 6f)
                curveToRelative(-0.51f, -0.62f, -0.94f, -1.28f, -1.28f, -2f)
                close()
                moveTo(4.89f, 20f)
                curveToRelative(0.34f, -0.72f, 0.78f, -1.38f, 1.28f, -2f)
                horizontalLineToRelative(11.65f)
                curveToRelative(0.51f, 0.62f, 0.94f, 1.28f, 1.28f, 2f)
                lineTo(4.89f, 20f)
                close()
            }
        }.also { _Dna = it}
