package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquarePhoneHangup: ImageVector? = null

val Icons.Sr.SquarePhoneHangup: ImageVector
    get() = _SquarePhoneHangup ?: UXIcon(name = "SquarePhoneHangup") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(18.95f, 13.9f)
                curveToRelative(0f, 0.6f, -0.49f, 1.09f, -1.09f, 1.09f)
                lineToRelative(-1.56f, -0.2f)
                curveToRelative(-0.6f, 0f, -1.09f, -0.49f, -1.09f, -1.09f)
                lineToRelative(-0.15f, -1.58f)
                curveToRelative(-1.94f, -0.87f, -3.97f, -0.91f, -6.1f, 0f)
                lineToRelative(-0.15f, 1.58f)
                curveToRelative(0f, 0.6f, -0.49f, 1.09f, -1.09f, 1.09f)
                lineToRelative(-1.56f, 0.2f)
                curveToRelative(-0.6f, 0f, -1.09f, -0.49f, -1.09f, -1.09f)
                lineToRelative(-0.05f, -1.04f)
                curveToRelative(0f, -0.75f, 0.31f, -1.42f, 0.8f, -1.91f)
                curveToRelative(2.71f, -2.71f, 9.87f, -2.52f, 12.39f, 0f)
                curveToRelative(0.49f, 0.49f, 0.81f, 1.16f, 0.8f, 1.91f)
                lineToRelative(-0.05f, 1.04f)
                close()
            }
        }.also { _SquarePhoneHangup = it}
