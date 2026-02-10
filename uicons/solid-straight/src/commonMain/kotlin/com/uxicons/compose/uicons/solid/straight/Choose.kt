package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Choose: ImageVector? = null

val Icons.Ss.Choose: ImageVector
    get() = _Choose ?: UXIcon(name = "Choose") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 8f)
                lineTo(0f, 8f)
                lineTo(0f, 0f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(8f)
                close()
                moveTo(18f, 8f)
                horizontalLineToRelative(-8f)
                lineTo(10f, 0f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(8f)
                close()
                moveTo(13f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveTo(15f, 16.46f)
                lineToRelative(9f, 3.54f)
                verticalLineToRelative(4f)
                lineTo(7.54f, 24f)
                lineToRelative(-1.82f, -1.63f)
                curveToRelative(-0.92f, -0.86f, -0.96f, -2.31f, -0.1f, -3.23f)
                curveToRelative(0.86f, -0.92f, 2.31f, -0.97f, 3.23f, -0.11f)
                curveToRelative(0.03f, 0.03f, 1.07f, 0.9f, 2.15f, 1.78f)
                verticalLineToRelative(-8.82f)
                curveToRelative(0f, -1.22f, 1.08f, -2.18f, 2.34f, -1.97f)
                curveToRelative(0.98f, 0.16f, 1.66f, 1.08f, 1.66f, 2.08f)
                verticalLineToRelative(4.36f)
                close()
                moveTo(4.16f, 17.78f)
                curveToRelative(1.02f, -1.09f, 2.47f, -1.53f, 3.84f, -1.3f)
                verticalLineToRelative(-6.48f)
                lineTo(0f, 10.0f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(3.96f)
                curveToRelative(0.06f, -0.08f, 0.13f, -0.15f, 0.2f, -0.22f)
                close()
            }
        }.also { _Choose = it}
