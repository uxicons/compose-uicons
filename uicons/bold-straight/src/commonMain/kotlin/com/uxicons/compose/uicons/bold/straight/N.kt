package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _N: ImageVector? = null

val Icons.Bs.N: ImageVector
    get() = _N ?: UXIcon(name = "N") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.31f, 24f)
                curveToRelative(-0.89f, 0f, -1.74f, -0.45f, -2.24f, -1.23f)
                lineTo(5f, 3.79f)
                verticalLineTo(24f)
                horizontalLineTo(2f)
                verticalLineTo(2.68f)
                curveTo(2f, 1.48f, 2.77f, 0.45f, 3.92f, 0.11f)
                curveToRelative(1.15f, -0.34f, 2.36f, 0.11f, 3.01f, 1.12f)
                lineToRelative(12.07f, 18.98f)
                verticalLineTo(0f)
                horizontalLineToRelative(3f)
                verticalLineTo(21.32f)
                curveToRelative(0f, 1.2f, -0.77f, 2.23f, -1.92f, 2.57f)
                curveToRelative(-0.25f, 0.07f, -0.51f, 0.11f, -0.77f, 0.11f)
                close()
            }
        }.also { _N = it}
