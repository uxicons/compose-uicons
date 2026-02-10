package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Kerning: ImageVector? = null

val Icons.Tr.Kerning: ImageVector
    get() = _Kerning ?: UXIcon(name = "Kerning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.97f, 0.68f)
                lineTo(7.97f, 23.68f)
                curveToRelative(-0.08f, 0.2f, -0.27f, 0.32f, -0.47f, 0.32f)
                curveToRelative(-0.06f, 0f, -0.12f, -0.01f, -0.18f, -0.03f)
                curveToRelative(-0.26f, -0.1f, -0.38f, -0.39f, -0.28f, -0.65f)
                lineTo(16.03f, 0.32f)
                curveToRelative(0.1f, -0.26f, 0.39f, -0.39f, 0.65f, -0.28f)
                curveToRelative(0.26f, 0.1f, 0.38f, 0.39f, 0.28f, 0.65f)
                close()
                moveTo(23.67f, 18.97f)
                curveToRelative(-0.06f, 0.02f, -0.11f, 0.03f, -0.17f, 0.03f)
                curveToRelative(-0.2f, 0f, -0.4f, -0.13f, -0.47f, -0.33f)
                lineToRelative(-1.33f, -3.67f)
                horizontalLineToRelative(-6.2f)
                curveToRelative(-0.02f, 0f, -0.04f, -0.0f, -0.06f, -0.01f)
                lineToRelative(-1.33f, 3.68f)
                curveToRelative(-0.09f, 0.26f, -0.38f, 0.39f, -0.64f, 0.3f)
                curveToRelative(-0.26f, -0.09f, -0.39f, -0.38f, -0.3f, -0.64f)
                lineToRelative(4.16f, -11.46f)
                curveToRelative(0.19f, -0.53f, 0.68f, -0.87f, 1.25f, -0.87f)
                reflectiveCurveToRelative(1.05f, 0.34f, 1.25f, 0.87f)
                lineToRelative(4.16f, 11.46f)
                curveToRelative(0.09f, 0.26f, -0.04f, 0.55f, -0.3f, 0.64f)
                close()
                moveTo(21.34f, 14f)
                lineToRelative(-2.46f, -6.79f)
                curveToRelative(-0.07f, -0.19f, -0.24f, -0.21f, -0.3f, -0.21f)
                curveToRelative(-0.07f, 0f, -0.24f, 0.02f, -0.3f, 0.21f)
                lineToRelative(-2.46f, 6.79f)
                horizontalLineToRelative(5.53f)
                close()
                moveTo(10.53f, 6.03f)
                curveToRelative(-0.26f, -0.09f, -0.55f, 0.04f, -0.64f, 0.3f)
                lineToRelative(-4.16f, 11.46f)
                curveToRelative(-0.07f, 0.19f, -0.24f, 0.21f, -0.3f, 0.21f)
                curveToRelative(-0.07f, 0f, -0.24f, -0.02f, -0.3f, -0.21f)
                lineTo(0.97f, 6.33f)
                curveToRelative(-0.09f, -0.26f, -0.38f, -0.39f, -0.64f, -0.3f)
                curveToRelative(-0.26f, 0.09f, -0.39f, 0.38f, -0.3f, 0.64f)
                lineToRelative(4.16f, 11.46f)
                curveToRelative(0.19f, 0.53f, 0.68f, 0.87f, 1.25f, 0.87f)
                reflectiveCurveToRelative(1.05f, -0.34f, 1.25f, -0.87f)
                lineTo(10.83f, 6.67f)
                curveToRelative(0.09f, -0.26f, -0.04f, -0.55f, -0.3f, -0.64f)
                close()
            }
        }.also { _Kerning = it}
