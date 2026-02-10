package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Crown: ImageVector? = null

val Icons.Sc.Crown: ImageVector
    get() = _Crown ?: UXIcon(name = "Crown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.31f, 5.06f)
                curveToRelative(-0.27f, -0.18f, -0.6f, -0.23f, -0.9f, -0.12f)
                curveToRelative(-0.1f, 0.04f, -1.89f, 0.68f, -3.15f, 2.29f)
                curveToRelative(-1.03f, -1.83f, -2.28f, -3.34f, -4.77f, -4.71f)
                curveToRelative(-0.3f, -0.17f, -0.67f, -0.17f, -0.96f, 0f)
                curveToRelative(-2.48f, 1.36f, -3.71f, 2.83f, -4.77f, 4.71f)
                curveToRelative(-1.26f, -1.62f, -3.06f, -2.25f, -3.16f, -2.29f)
                curveToRelative(-0.3f, -0.1f, -0.63f, -0.06f, -0.9f, 0.12f)
                curveToRelative(-1.59f, 1.11f, -1.69f, 7.28f, -1.69f, 7.34f)
                curveToRelative(0f, 5.25f, 1.2f, 7.1f, 1.33f, 7.29f)
                curveToRelative(0.12f, 0.17f, 0.28f, 0.29f, 0.47f, 0.36f)
                curveToRelative(0.17f, 0.06f, 4.31f, 1.56f, 9.19f, 1.56f)
                reflectiveCurveToRelative(9.02f, -1.5f, 9.19f, -1.56f)
                curveToRelative(0.2f, -0.07f, 0.36f, -0.2f, 0.48f, -0.37f)
                curveToRelative(0.14f, -0.2f, 1.33f, -2.08f, 1.33f, -7.28f)
                curveToRelative(0f, -0.06f, -0.1f, -6.23f, -1.69f, -7.34f)
                close()
            }
        }.also { _Crown = it}
