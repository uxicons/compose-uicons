package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiamondExclamation: ImageVector? = null

val Icons.Bs.DiamondExclamation: ImageVector
    get() = _DiamondExclamation ?: UXIcon(name = "DiamondExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7.09f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-7.09f)
                close()
                moveTo(10.5f, 18f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
                moveTo(22.97f, 14.47f)
                lineToRelative(-8.49f, 8.49f)
                curveToRelative(-0.66f, 0.66f, -1.54f, 1.02f, -2.48f, 1.02f)
                reflectiveCurveToRelative(-1.81f, -0.36f, -2.48f, -1.02f)
                lineTo(1.03f, 14.47f)
                curveToRelative(-1.36f, -1.36f, -1.36f, -3.59f, 0f, -4.95f)
                lineTo(9.53f, 1.02f)
                curveToRelative(1.32f, -1.32f, 3.63f, -1.32f, 4.95f, 0f)
                lineToRelative(8.49f, 8.49f)
                curveToRelative(1.36f, 1.36f, 1.36f, 3.59f, 0f, 4.95f)
                close()
                moveTo(20.85f, 11.64f)
                lineTo(12.35f, 3.15f)
                curveToRelative(-0.13f, -0.13f, -0.28f, -0.15f, -0.35f, -0.15f)
                reflectiveCurveToRelative(-0.23f, 0.02f, -0.35f, 0.15f)
                lineTo(3.15f, 11.64f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(8.49f, 8.49f)
                curveToRelative(0.13f, 0.13f, 0.28f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.23f, -0.02f, 0.35f, -0.15f)
                lineToRelative(8.49f, -8.49f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                close()
            }
        }.also { _DiamondExclamation = it}
