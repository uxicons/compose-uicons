package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseChimneyBlank: ImageVector? = null

val Icons.Ss.HouseChimneyBlank: ImageVector
    get() = _HouseChimneyBlank ?: UXIcon(name = "HouseChimneyBlank") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.85f, 7.68f)
                lineToRelative(-0.89f, -0.69f)
                horizontalLineToRelative(0.04f)
                verticalLineTo(1.99f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.46f)
                lineTo(13.85f, 0.64f)
                curveToRelative(-1.09f, -0.85f, -2.61f, -0.85f, -3.7f, 0f)
                lineTo(1.15f, 7.68f)
                curveToRelative(-0.73f, 0.57f, -1.15f, 1.44f, -1.15f, 2.36f)
                verticalLineToRelative(13.96f)
                horizontalLineTo(24f)
                verticalLineTo(10.04f)
                curveToRelative(0f, -0.93f, -0.42f, -1.79f, -1.15f, -2.36f)
                close()
            }
        }.also { _HouseChimneyBlank = it}
