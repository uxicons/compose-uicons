package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Newspaper: ImageVector? = null

val Icons.Ss.Newspaper: ImageVector
    get() = _Newspaper ?: UXIcon(name = "Newspaper") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 22f)
                lineTo(0f, 6f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(0f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(17.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(5.44f, 24f)
                curveToRelative(0.34f, -0.59f, 0.56f, -1.27f, 0.56f, -2f)
                lineTo(6f, 3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(12f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(9f, 8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                close()
                moveTo(21f, 18f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                close()
                moveTo(21f, 14f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                close()
                moveTo(21f, 10f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                close()
                moveTo(21f, 6f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _Newspaper = it}
