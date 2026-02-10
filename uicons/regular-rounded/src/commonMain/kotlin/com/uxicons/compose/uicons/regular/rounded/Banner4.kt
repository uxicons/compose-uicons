package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Banner4: ImageVector? = null

val Icons.Rr.Banner4: ImageVector
    get() = _Banner4 ?: UXIcon(name = "Banner4") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.89f, 10f)
                lineToRelative(2.92f, -2.54f)
                curveToRelative(0.46f, -0.59f, 0.04f, -1.46f, -0.71f, -1.46f)
                horizontalLineToRelative(-4.09f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(1f)
                lineTo(7f, 9f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                lineTo(0.91f, 6f)
                curveToRelative(-0.75f, 0f, -1.18f, 0.87f, -0.71f, 1.46f)
                lineToRelative(2.92f, 2.54f)
                lineTo(0.19f, 12.54f)
                curveToRelative(-0.46f, 0.59f, -0.04f, 1.46f, 0.71f, 1.46f)
                horizontalLineToRelative(3.09f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(9f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(3.09f)
                curveToRelative(0.75f, 0f, 1.18f, -0.87f, 0.71f, -1.46f)
                lineToRelative(-2.92f, -2.54f)
                close()
                moveTo(18f, 15.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(7.5f, 17f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(4.5f)
                close()
            }
        }.also { _Banner4 = it}
