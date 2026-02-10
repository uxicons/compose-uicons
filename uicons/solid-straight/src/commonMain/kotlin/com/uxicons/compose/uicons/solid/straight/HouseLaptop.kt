package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseLaptop: ImageVector? = null

val Icons.Ss.HouseLaptop: ImageVector
    get() = _HouseLaptop ?: UXIcon(name = "HouseLaptop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.85f, 5.48f)
                lineToRelative(-0.85f, -0.66f)
                lineTo(16f, 1f)
                horizontalLineToRelative(-2f)
                lineTo(14f, 3.25f)
                lineTo(10.85f, 0.79f)
                curveToRelative(-1.09f, -0.85f, -2.61f, -0.85f, -3.7f, 0f)
                lineTo(1.15f, 5.48f)
                curveToRelative(-0.73f, 0.57f, -1.15f, 1.43f, -1.15f, 2.36f)
                verticalLineToRelative(10.16f)
                lineTo(5f, 18f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-0.16f)
                curveToRelative(0f, -0.93f, -0.42f, -1.79f, -1.15f, -2.36f)
                close()
                moveTo(23f, 18f)
                lineTo(7f, 18f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(5f)
                close()
                moveTo(21f, 24f)
                lineTo(9f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(6.41f)
                lineToRelative(1f, 1f)
                horizontalLineToRelative(3.17f)
                lineToRelative(1f, -1f)
                horizontalLineToRelative(6.41f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
            }
        }.also { _HouseLaptop = it}
