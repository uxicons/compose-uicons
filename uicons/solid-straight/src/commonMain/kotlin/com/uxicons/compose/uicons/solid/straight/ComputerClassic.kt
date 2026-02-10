package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ComputerClassic: ImageVector? = null

val Icons.Ss.ComputerClassic: ImageVector
    get() = _ComputerClassic ?: UXIcon(name = "ComputerClassic") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 24f)
                lineTo(3f, 24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(3f)
                close()
                moveTo(23f, 3f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(4f, 19f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(1f, 3f)
                curveTo(1f, 1.35f, 2.35f, 0f, 4f, 0f)
                horizontalLineToRelative(16f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(8f, 15f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(19f, 14f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-2f)
                close()
                moveTo(19f, 3f)
                lineTo(5f, 3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(14f)
                lineTo(19f, 3f)
                close()
                moveTo(17f, 5f)
                lineTo(7f, 5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-5f)
                close()
            }
        }.also { _ComputerClassic = it}
