package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquarePhoneHangup: ImageVector? = null

val Icons.Bs.SquarePhoneHangup: ImageVector
    get() = _SquarePhoneHangup ?: UXIcon(name = "SquarePhoneHangup") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.17f, 11.02f)
                curveToRelative(0.5f, 0.5f, 0.83f, 1.19f, 0.83f, 1.96f)
                verticalLineToRelative(2.02f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2.59f)
                curveToRelative(-1.07f, -0.46f, -2.05f, -0.68f, -3f, -0.69f)
                curveToRelative(-1.0f, -0.01f, -1.98f, 0.23f, -3f, 0.69f)
                verticalLineToRelative(2.59f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2.02f)
                curveToRelative(0f, -0.77f, 0.32f, -1.46f, 0.83f, -1.96f)
                curveToRelative(1.31f, -1.31f, 3.73f, -2.01f, 6.17f, -2.02f)
                curveToRelative(2.39f, -0.01f, 4.79f, 0.64f, 6.17f, 2.02f)
                close()
                moveTo(24f, 3.5f)
                verticalLineToRelative(20.5f)
                lineTo(0f, 24f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(17f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21f, 3.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(18f)
                lineTo(21f, 3.5f)
                close()
            }
        }.also { _SquarePhoneHangup = it}
