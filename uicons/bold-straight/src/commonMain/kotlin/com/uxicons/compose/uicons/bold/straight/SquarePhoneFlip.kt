package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquarePhoneFlip: ImageVector? = null

val Icons.Bs.SquarePhoneFlip: ImageVector
    get() = _SquarePhoneFlip ?: UXIcon(name = "SquarePhoneFlip") {
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
                moveTo(17.64f, 7.03f)
                curveToRelative(0.58f, 0.58f, 0.86f, 1.35f, 0.86f, 2.11f)
                curveToRelative(0f, 1.98f, -1.31f, 4.35f, -3.15f, 6.21f)
                curveToRelative(-1.8f, 1.82f, -4.12f, 3.15f, -6.21f, 3.15f)
                curveToRelative(-0.76f, 0f, -1.53f, -0.28f, -2.11f, -0.86f)
                lineToRelative(-1.53f, -1.53f)
                lineToRelative(3.03f, -3.03f)
                lineToRelative(1.97f, 1.97f)
                curveToRelative(1.16f, -0.46f, 2.07f, -1.04f, 2.79f, -1.75f)
                curveToRelative(0.77f, -0.76f, 1.33f, -1.67f, 1.75f, -2.79f)
                lineToRelative(-1.97f, -1.97f)
                lineToRelative(3.03f, -3.03f)
                lineToRelative(1.53f, 1.53f)
                close()
            }
        }.also { _SquarePhoneFlip = it}
