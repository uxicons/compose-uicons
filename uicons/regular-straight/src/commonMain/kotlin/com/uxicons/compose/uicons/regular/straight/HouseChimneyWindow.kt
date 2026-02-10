package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseChimneyWindow: ImageVector? = null

val Icons.Rs.HouseChimneyWindow: ImageVector
    get() = _HouseChimneyWindow ?: UXIcon(name = "HouseChimneyWindow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.85f, 7.68f)
                lineToRelative(-0.85f, -0.66f)
                lineTo(22f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.45f)
                lineTo(13.85f, 0.64f)
                curveToRelative(-1.09f, -0.85f, -2.61f, -0.85f, -3.7f, 0f)
                lineTo(1.15f, 7.68f)
                curveToRelative(-0.73f, 0.57f, -1.15f, 1.44f, -1.15f, 2.36f)
                verticalLineToRelative(13.96f)
                lineTo(24f, 24f)
                lineTo(24f, 10.04f)
                curveToRelative(0f, -0.93f, -0.42f, -1.79f, -1.15f, -2.36f)
                close()
                moveTo(22f, 22f)
                lineTo(2f, 22f)
                lineTo(2f, 10.04f)
                curveToRelative(0f, -0.31f, 0.14f, -0.6f, 0.38f, -0.79f)
                lineTo(11.38f, 2.21f)
                curveToRelative(0.36f, -0.28f, 0.87f, -0.28f, 1.23f, 0f)
                lineToRelative(9f, 7.04f)
                curveToRelative(0.24f, 0.19f, 0.38f, 0.48f, 0.38f, 0.79f)
                verticalLineToRelative(11.96f)
                close()
                moveTo(8f, 18f)
                horizontalLineToRelative(8f)
                lineTo(16f, 10f)
                lineTo(8f, 10f)
                verticalLineToRelative(8f)
                close()
                moveTo(10f, 12f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _HouseChimneyWindow = it}
