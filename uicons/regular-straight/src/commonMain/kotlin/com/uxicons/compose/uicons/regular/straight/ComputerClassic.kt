package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ComputerClassic: ImageVector? = null

val Icons.Rs.ComputerClassic: ImageVector
    get() = _ComputerClassic ?: UXIcon(name = "ComputerClassic") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 0f)
                lineTo(4f, 0f)
                curveTo(2.35f, 0f, 1f, 1.35f, 1f, 3f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.3f, 0.84f, 2.42f, 2f, 2.83f)
                verticalLineToRelative(4.17f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-4.17f)
                curveToRelative(1.16f, -0.41f, 2f, -1.52f, 2f, -2.83f)
                lineTo(23f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(5f, 22f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                lineTo(5f, 22f)
                close()
                moveTo(21f, 17f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(4f, 18f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(3f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(16f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(14f)
                close()
                moveTo(5f, 12f)
                horizontalLineToRelative(14f)
                lineTo(19f, 4f)
                lineTo(5f, 4f)
                verticalLineToRelative(8f)
                close()
                moveTo(7f, 6f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(4f)
                lineTo(7f, 10f)
                verticalLineToRelative(-4f)
                close()
                moveTo(8f, 15f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(10f, 14f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _ComputerClassic = it}
