package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseBlank: ImageVector? = null

val Icons.Rs.HouseBlank: ImageVector
    get() = _HouseBlank ?: UXIcon(name = "HouseBlank") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                horizontalLineTo(0f)
                verticalLineTo(10.04f)
                curveToRelative(0f, -0.93f, 0.42f, -1.79f, 1.15f, -2.36f)
                lineTo(10.15f, 0.64f)
                curveToRelative(1.09f, -0.85f, 2.61f, -0.85f, 3.7f, 0f)
                lineToRelative(9f, 7.04f)
                curveToRelative(0.73f, 0.57f, 1.15f, 1.43f, 1.15f, 2.36f)
                verticalLineToRelative(13.96f)
                close()
                moveTo(2f, 22f)
                horizontalLineTo(22f)
                verticalLineTo(10.04f)
                curveToRelative(0f, -0.31f, -0.14f, -0.6f, -0.38f, -0.79f)
                lineTo(12.62f, 2.21f)
                curveToRelative(-0.36f, -0.28f, -0.87f, -0.28f, -1.23f, 0f)
                lineTo(2.38f, 9.26f)
                curveToRelative(-0.24f, 0.19f, -0.38f, 0.48f, -0.38f, 0.79f)
                verticalLineToRelative(11.96f)
                close()
            }
        }.also { _HouseBlank = it}
