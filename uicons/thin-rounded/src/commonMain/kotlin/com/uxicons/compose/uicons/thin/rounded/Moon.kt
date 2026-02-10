package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Moon: ImageVector? = null

val Icons.Tr.Moon: ImageVector
    get() = _Moon ?: UXIcon(name = "Moon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.2f, 19.83f)
                curveToRelative(-2.74f, -1.97f, -5.2f, -4.04f, -5.2f, -7.83f)
                reflectiveCurveToRelative(2.46f, -5.87f, 5.2f, -7.83f)
                curveToRelative(0.59f, -0.42f, 0.88f, -1.1f, 0.78f, -1.83f)
                curveToRelative(-0.1f, -0.73f, -0.59f, -1.35f, -1.28f, -1.6f)
                curveToRelative(-1.37f, -0.51f, -3.4f, -0.74f, -4.7f, -0.74f)
                curveTo(8.27f, 0f, 3f, 5.27f, 3f, 12f)
                reflectiveCurveToRelative(5.27f, 12f, 12f, 12f)
                curveToRelative(1.31f, 0f, 3.33f, -0.23f, 4.7f, -0.74f)
                curveToRelative(0.69f, -0.26f, 1.18f, -0.87f, 1.28f, -1.6f)
                curveToRelative(0.1f, -0.72f, -0.2f, -1.41f, -0.78f, -1.83f)
                close()
                moveTo(19.99f, 21.53f)
                curveToRelative(-0.05f, 0.37f, -0.29f, 0.67f, -0.64f, 0.8f)
                curveToRelative(-1.25f, 0.46f, -3.13f, 0.68f, -4.35f, 0.68f)
                curveToRelative(-6.17f, 0f, -11f, -4.83f, -11f, -11f)
                reflectiveCurveTo(8.83f, 1f, 15f, 1f)
                curveToRelative(1.22f, 0f, 3.1f, 0.21f, 4.35f, 0.68f)
                curveToRelative(0.35f, 0.13f, 0.59f, 0.43f, 0.64f, 0.8f)
                curveToRelative(0.05f, 0.35f, -0.09f, 0.68f, -0.38f, 0.88f)
                curveToRelative(-2.84f, 2.04f, -5.62f, 4.39f, -5.62f, 8.64f)
                reflectiveCurveToRelative(2.77f, 6.6f, 5.62f, 8.64f)
                curveToRelative(0.28f, 0.2f, 0.42f, 0.53f, 0.38f, 0.88f)
                close()
            }
        }.also { _Moon = it}
