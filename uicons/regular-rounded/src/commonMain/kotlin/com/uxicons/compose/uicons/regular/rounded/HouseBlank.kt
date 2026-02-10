package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseBlank: ImageVector? = null

val Icons.Rr.HouseBlank: ImageVector
    get() = _HouseBlank ?: UXIcon(name = "HouseBlank") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 24f)
                horizontalLineTo(5f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineTo(9.72f)
                curveToRelative(0f, -1.67f, 0.82f, -3.21f, 2.2f, -4.14f)
                lineTo(9.2f, 0.85f)
                curveToRelative(1.7f, -1.15f, 3.9f, -1.15f, 5.59f, 0f)
                lineToRelative(7f, 4.72f)
                curveToRelative(1.38f, 0.93f, 2.2f, 2.48f, 2.2f, 4.14f)
                verticalLineToRelative(9.28f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                close()
                moveTo(12f, 2.0f)
                curveToRelative(-0.58f, 0f, -1.17f, 0.17f, -1.68f, 0.52f)
                lineTo(3.32f, 7.24f)
                curveToRelative(-0.83f, 0.56f, -1.32f, 1.49f, -1.32f, 2.49f)
                verticalLineToRelative(9.28f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineTo(9.72f)
                curveToRelative(0f, -1.0f, -0.49f, -1.93f, -1.32f, -2.49f)
                lineTo(13.68f, 2.51f)
                curveToRelative(-0.51f, -0.34f, -1.09f, -0.52f, -1.68f, -0.52f)
                close()
            }
        }.also { _HouseBlank = it}
