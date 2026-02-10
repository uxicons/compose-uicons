package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquarePhone: ImageVector? = null

val Icons.Bs.SquarePhone: ImageVector
    get() = _SquarePhone ?: UXIcon(name = "SquarePhone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 0f)
                horizontalLineToRelative(-17f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-20.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(-17.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(15.47f, 13.08f)
                lineTo(18.5f, 16.11f)
                lineTo(16.97f, 17.64f)
                curveToRelative(-0.58f, 0.58f, -1.35f, 0.86f, -2.11f, 0.86f)
                curveToRelative(-2.09f, 0f, -4.4f, -1.33f, -6.21f, -3.15f)
                curveToRelative(-1.84f, -1.86f, -3.15f, -4.22f, -3.15f, -6.21f)
                curveToRelative(0f, -0.76f, 0.28f, -1.53f, 0.86f, -2.11f)
                lineToRelative(1.53f, -1.53f)
                lineToRelative(3.03f, 3.03f)
                lineToRelative(-1.97f, 1.97f)
                curveToRelative(0.43f, 1.12f, 0.99f, 2.04f, 1.75f, 2.79f)
                curveToRelative(0.73f, 0.72f, 1.64f, 1.29f, 2.79f, 1.75f)
                close()
            }
        }.also { _SquarePhone = it}
