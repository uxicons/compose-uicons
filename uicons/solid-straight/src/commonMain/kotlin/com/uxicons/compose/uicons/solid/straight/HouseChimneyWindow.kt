package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseChimneyWindow: ImageVector? = null

val Icons.Ss.HouseChimneyWindow: ImageVector
    get() = _HouseChimneyWindow ?: UXIcon(name = "HouseChimneyWindow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 16f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
                moveTo(24f, 10.04f)
                verticalLineToRelative(13.96f)
                lineTo(0f, 24f)
                lineTo(0f, 10.04f)
                curveToRelative(0f, -0.93f, 0.42f, -1.79f, 1.15f, -2.36f)
                lineTo(10.15f, 0.64f)
                curveToRelative(1.09f, -0.85f, 2.61f, -0.85f, 3.7f, 0f)
                lineToRelative(6.15f, 4.81f)
                lineTo(20.0f, 2f)
                horizontalLineToRelative(2f)
                lineTo(22.0f, 7f)
                horizontalLineToRelative(-0.02f)
                lineToRelative(0.87f, 0.68f)
                curveToRelative(0.73f, 0.57f, 1.15f, 1.43f, 1.15f, 2.36f)
                close()
                moveTo(16f, 10f)
                lineTo(8f, 10f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(8f)
                lineTo(16f, 10f)
                close()
            }
        }.also { _HouseChimneyWindow = it}
