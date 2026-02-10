package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquarePhoneHangup: ImageVector? = null

val Icons.Br.SquarePhoneHangup: ImageVector
    get() = _SquarePhoneHangup ?: UXIcon(name = "SquarePhoneHangup") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.2f, 10.96f)
            curveToRelative(0.49f, 0.49f, 0.81f, 1.16f, 0.8f, 1.91f)
            lineToRelative(-0.05f, 1.04f)
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
            close()
            moveTo(24f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            lineTo(5.5f, 24f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(0f, 5.5f)
            curveTo(0f, 2.47f, 2.47f, 0f, 5.5f, 0f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
            moveTo(21f, 5.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            lineTo(5.5f, 3f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            lineTo(21f, 5.5f)
            close()
        }
    }.also { _SquarePhoneHangup = it }
