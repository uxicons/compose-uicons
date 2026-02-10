package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiamondTurnRight: ImageVector? = null

val Icons.Tr.DiamondTurnRight: ImageVector
    get() = _DiamondTurnRight ?: UXIcon(name = "DiamondTurnRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.69f, 8.83f)
                lineTo(15.17f, 1.31f)
                curveToRelative(-1.75f, -1.75f, -4.59f, -1.75f, -6.33f, 0f)
                lineTo(1.31f, 8.83f)
                curveToRelative(-1.75f, 1.75f, -1.75f, 4.59f, 0f, 6.33f)
                lineToRelative(7.52f, 7.52f)
                curveToRelative(0.87f, 0.87f, 2.02f, 1.31f, 3.17f, 1.31f)
                reflectiveCurveToRelative(2.29f, -0.44f, 3.17f, -1.31f)
                lineToRelative(7.52f, -7.52f)
                curveToRelative(1.75f, -1.75f, 1.75f, -4.59f, 0f, -6.33f)
                close()
                moveTo(21.98f, 14.46f)
                lineToRelative(-7.52f, 7.52f)
                curveToRelative(-1.35f, 1.35f, -3.56f, 1.35f, -4.92f, 0f)
                lineTo(2.02f, 14.46f)
                curveToRelative(-1.35f, -1.35f, -1.35f, -3.56f, 0f, -4.92f)
                lineTo(9.54f, 2.02f)
                curveToRelative(0.68f, -0.68f, 1.57f, -1.02f, 2.46f, -1.02f)
                reflectiveCurveToRelative(1.78f, 0.34f, 2.46f, 1.02f)
                lineToRelative(7.52f, 7.52f)
                curveToRelative(1.35f, 1.35f, 1.35f, 3.56f, 0f, 4.92f)
                close()
                moveTo(17.27f, 8.73f)
                curveToRelative(0.97f, 0.97f, 0.97f, 2.56f, 0f, 3.54f)
                lineToRelative(-2.42f, 2.42f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(2.42f, -2.42f)
                curveToRelative(0.16f, -0.16f, 0.28f, -0.36f, 0.35f, -0.56f)
                horizontalLineToRelative(-6.42f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(6.42f)
                curveToRelative(-0.07f, -0.2f, -0.19f, -0.4f, -0.35f, -0.56f)
                lineToRelative(-2.42f, -2.42f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(0.51f, -0.2f, 0.71f, 0f)
                lineToRelative(2.42f, 2.42f)
                close()
            }
        }.also { _DiamondTurnRight = it}
