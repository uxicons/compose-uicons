package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiamondTurnRight: ImageVector? = null

val Icons.Rr.DiamondTurnRight: ImageVector
    get() = _DiamondTurnRight ?: UXIcon(name = "DiamondTurnRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.54f, 8.48f)
                lineTo(15.52f, 1.46f)
                curveToRelative(-1.94f, -1.94f, -5.1f, -1.94f, -7.04f, 0f)
                lineTo(1.46f, 8.48f)
                curveToRelative(-1.94f, 1.94f, -1.94f, 5.1f, 0f, 7.04f)
                lineToRelative(7.02f, 7.02f)
                curveToRelative(0.97f, 0.97f, 2.24f, 1.45f, 3.52f, 1.45f)
                reflectiveCurveToRelative(2.55f, -0.48f, 3.52f, -1.45f)
                lineToRelative(7.02f, -7.02f)
                curveToRelative(1.94f, -1.94f, 1.94f, -5.1f, 0f, -7.04f)
                close()
                moveTo(21.13f, 14.1f)
                lineToRelative(-7.02f, 7.02f)
                curveToRelative(-1.16f, 1.16f, -3.05f, 1.16f, -4.21f, 0f)
                lineTo(2.87f, 14.1f)
                curveToRelative(-1.16f, -1.16f, -1.16f, -3.05f, 0f, -4.21f)
                lineTo(9.9f, 2.87f)
                curveToRelative(1.16f, -1.16f, 3.05f, -1.16f, 4.21f, 0f)
                lineToRelative(7.02f, 7.02f)
                curveToRelative(1.16f, 1.16f, 1.16f, 3.05f, 0f, 4.21f)
                close()
                moveTo(17.13f, 8.88f)
                curveToRelative(1.17f, 1.17f, 1.17f, 3.07f, 0f, 4.24f)
                lineToRelative(-2.42f, 2.42f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(2.13f, -2.13f)
                horizontalLineToRelative(-4.42f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4.42f)
                lineToRelative(-2.13f, -2.13f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(2.42f, 2.42f)
                close()
            }
        }.also { _DiamondTurnRight = it}
