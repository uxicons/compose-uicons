package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ComputerClassic: ImageVector? = null

val Icons.Bs.ComputerClassic: ImageVector
    get() = _ComputerClassic ?: UXIcon(name = "ComputerClassic") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 0f)
                lineTo(4.5f, 0f)
                curveTo(2.57f, 0f, 1f, 1.57f, 1f, 3.5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.76f, 1.31f, 3.22f, 3f, 3.46f)
                verticalLineToRelative(3.04f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-3.04f)
                curveToRelative(1.69f, -0.24f, 3f, -1.7f, 3f, -3.46f)
                lineTo(23f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(20f, 17.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(4.5f, 18f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                lineTo(4f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(15f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(14f)
                close()
                moveTo(6f, 5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(6f)
                lineTo(6f, 11f)
                verticalLineToRelative(-6f)
                close()
                moveTo(9f, 14.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(11f, 13f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _ComputerClassic = it}
