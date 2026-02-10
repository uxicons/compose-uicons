package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WrenchAlt: ImageVector? = null

val Icons.Ss.WrenchAlt: ImageVector
    get() = _WrenchAlt ?: UXIcon(name = "WrenchAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.01f, 3.78f)
                lineToRelative(-4.6f, 4.6f)
                curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0f, -2.83f)
                lineTo(20.17f, 0.96f)
                lineToRelative(-0.29f, -0.15f)
                curveToRelative(-1.06f, -0.54f, -2.2f, -0.81f, -3.38f, -0.81f)
                curveToRelative(-4.14f, 0f, -7.5f, 3.36f, -7.5f, 7.5f)
                curveToRelative(0f, 0.96f, 0.18f, 1.89f, 0.53f, 2.77f)
                lineTo(0.92f, 18.88f)
                curveToRelative(-1.17f, 1.17f, -1.17f, 3.07f, 0f, 4.24f)
                curveToRelative(0.58f, 0.58f, 1.35f, 0.88f, 2.12f, 0.88f)
                reflectiveCurveToRelative(1.54f, -0.29f, 2.12f, -0.88f)
                lineToRelative(8.63f, -8.63f)
                curveToRelative(0.86f, 0.34f, 1.77f, 0.51f, 2.71f, 0.51f)
                curveToRelative(4.14f, 0f, 7.5f, -3.36f, 7.5f, -7.5f)
                curveToRelative(0f, -1.21f, -0.28f, -2.37f, -0.84f, -3.44f)
                lineToRelative(-0.15f, -0.28f)
                close()
            }
        }.also { _WrenchAlt = it}
