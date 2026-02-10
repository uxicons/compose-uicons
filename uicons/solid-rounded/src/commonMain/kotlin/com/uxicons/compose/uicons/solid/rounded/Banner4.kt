package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Banner4: ImageVector? = null

val Icons.Sr.Banner4: ImageVector
    get() = _Banner4 ?: UXIcon(name = "Banner4") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.5f, 10f)
                horizontalLineToRelative(9f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(20.89f, 10f)
                lineToRelative(2.92f, -2.54f)
                curveToRelative(0.46f, -0.59f, 0.04f, -1.46f, -0.71f, -1.46f)
                horizontalLineToRelative(-4.09f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(0.05f)
                curveToRelative(1.69f, 0.24f, 3f, 1.69f, 3f, 3.45f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(3.09f)
                curveToRelative(0.75f, 0f, 1.18f, -0.87f, 0.71f, -1.46f)
                lineToRelative(-2.92f, -2.54f)
                close()
                moveTo(4f, 11.5f)
                curveToRelative(0f, -1.76f, 1.31f, -3.2f, 3f, -3.45f)
                verticalLineToRelative(-0.05f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                lineTo(0.91f, 6f)
                curveToRelative(-0.75f, 0f, -1.18f, 0.87f, -0.71f, 1.46f)
                lineToRelative(2.92f, 2.54f)
                lineTo(0.19f, 12.54f)
                curveToRelative(-0.46f, 0.59f, -0.04f, 1.46f, 0.71f, 1.46f)
                horizontalLineToRelative(3.09f)
                verticalLineToRelative(-2.5f)
                close()
            }
        }.also { _Banner4 = it}
