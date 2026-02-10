package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Choose: ImageVector? = null

val Icons.Bs.Choose: ImageVector
    get() = _Choose ?: UXIcon(name = "Choose") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 18.25f)
                verticalLineToRelative(5.75f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3.48f)
                lineToRelative(-6f, -1.71f)
                verticalLineToRelative(5.2f)
                horizontalLineToRelative(-3f)
                lineToRelative(-3.77f, -2.89f)
                curveToRelative(-0.87f, -0.72f, -0.98f, -2.01f, -0.26f, -2.87f)
                curveToRelative(0.72f, -0.87f, 2.01f, -0.98f, 2.87f, -0.26f)
                lineToRelative(1.15f, 0.83f)
                lineToRelative(-0.01f, -7.39f)
                curveToRelative(0f, -0.91f, 0.8f, -1.63f, 1.74f, -1.48f)
                curveToRelative(0.74f, 0.12f, 1.27f, 0.81f, 1.27f, 1.56f)
                verticalLineToRelative(4.18f)
                lineToRelative(9f, 2.57f)
                close()
                moveTo(8f, 8f)
                lineTo(0f, 8f)
                lineTo(0f, 0f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(8f)
                close()
                moveTo(5f, 3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(8f, 18f)
                lineTo(0f, 18f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(8f)
                close()
                moveTo(5f, 13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(18f, 0f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(8f)
                lineTo(18f, 0f)
                close()
            }
        }.also { _Choose = it}
