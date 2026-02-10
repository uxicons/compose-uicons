package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _N: ImageVector? = null

val Icons.Tr.N: ImageVector
    get() = _N ?: UXIcon(name = "N") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.5f, 24f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineTo(3.23f)
                curveTo(2f, 1.41f, 3.29f, 0.33f, 4.58f, 0.07f)
                curveToRelative(1.28f, -0.27f, 2.9f, 0.22f, 3.61f, 1.89f)
                lineToRelative(8.53f, 19.69f)
                curveToRelative(0.53f, 1.24f, 1.68f, 1.47f, 2.5f, 1.31f)
                curveToRelative(0.82f, -0.17f, 1.78f, -0.84f, 1.78f, -2.18f)
                verticalLineTo(0.5f)
                curveToRelative(-0.01f, -0.65f, 1.01f, -0.65f, 1f, 0f)
                verticalLineTo(20.77f)
                curveToRelative(0f, 1.82f, -1.29f, 2.9f, -2.58f, 3.16f)
                curveToRelative(-1.28f, 0.26f, -2.9f, -0.22f, -3.62f, -1.89f)
                lineTo(7.27f, 2.35f)
                curveToRelative(-0.53f, -1.23f, -1.68f, -1.48f, -2.49f, -1.31f)
                curveToRelative(-0.82f, 0.17f, -1.78f, 0.84f, -1.78f, 2.18f)
                verticalLineTo(23.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                close()
            }
        }.also { _N = it}
