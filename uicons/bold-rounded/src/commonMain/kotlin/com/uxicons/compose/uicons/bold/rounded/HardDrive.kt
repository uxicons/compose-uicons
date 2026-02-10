package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HardDrive: ImageVector? = null

val Icons.Br.HardDrive: ImageVector
    get() = _HardDrive ?: UXIcon(name = "HardDrive") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.23f, 5.17f)
            curveToRelative(-0.17f, -2.9f, -2.59f, -5.17f, -5.49f, -5.17f)
            horizontalLineToRelative(-9.47f)
            curveToRelative(-2.9f, 0f, -5.31f, 2.27f, -5.49f, 5.17f)
            lineToRelative(-0.78f, 12.83f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            horizontalLineToRelative(14f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            verticalLineToRelative(-1.5f)
            close()
            moveTo(4.06f, 17f)
            lineTo(4.77f, 5.35f)
            curveToRelative(0.08f, -1.32f, 1.18f, -2.35f, 2.5f, -2.35f)
            horizontalLineToRelative(9.47f)
            curveToRelative(1.32f, 0f, 2.42f, 1.03f, 2.5f, 2.35f)
            lineToRelative(0.71f, 11.65f)
            close()
            moveTo(14.5f, 22f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            close()
            moveTo(18.5f, 22f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            close()
        }
    }.also { _HardDrive = it }
