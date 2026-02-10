package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseBlank: ImageVector? = null

val Icons.Tr.HouseBlank: ImageVector
    get() = _HouseBlank ?: UXIcon(name = "HouseBlank") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 24f)
                horizontalLineTo(4.5f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineTo(9.56f)
                curveToRelative(0f, -1.5f, 0.74f, -2.89f, 1.98f, -3.73f)
                lineTo(9.48f, 0.77f)
                curveToRelative(1.53f, -1.03f, 3.5f, -1.03f, 5.03f, 0f)
                lineToRelative(7.5f, 5.06f)
                curveToRelative(1.24f, 0.84f, 1.98f, 2.23f, 1.98f, 3.73f)
                verticalLineToRelative(9.94f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(12f, 1.0f)
                curveToRelative(-0.68f, 0f, -1.36f, 0.2f, -1.96f, 0.6f)
                lineTo(2.54f, 6.66f)
                curveToRelative(-0.97f, 0.65f, -1.54f, 1.74f, -1.54f, 2.9f)
                verticalLineToRelative(9.94f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineTo(9.56f)
                curveToRelative(0f, -1.17f, -0.58f, -2.25f, -1.54f, -2.9f)
                lineTo(13.96f, 1.6f)
                curveToRelative(-0.59f, -0.4f, -1.28f, -0.6f, -1.96f, -0.6f)
                close()
            }
        }.also { _HouseBlank = it}
