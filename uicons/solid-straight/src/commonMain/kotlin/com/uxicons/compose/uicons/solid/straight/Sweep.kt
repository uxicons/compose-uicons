package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sweep: ImageVector? = null

val Icons.Ss.Sweep: ImageVector
    get() = _Sweep ?: UXIcon(name = "Sweep") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.5f, 5.5f)
                lineToRelative(-2f, 1f)
                lineToRelative(-1f, 2f)
                lineToRelative(-1f, -2f)
                lineToRelative(-2f, -1f)
                lineToRelative(2f, -1f)
                lineToRelative(1f, -2f)
                lineToRelative(1f, 2f)
                close()
                moveTo(4.5f, 7f)
                lineTo(5.67f, 4.67f)
                lineTo(8f, 3.5f)
                lineTo(5.67f, 2.33f)
                lineTo(4.5f, -0f)
                lineTo(3.33f, 2.33f)
                lineTo(1f, 3.5f)
                lineTo(3.33f, 4.67f)
                close()
                moveTo(21f, 14f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(1f)
                close()
                moveTo(17f, 16f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(16f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _Sweep = it}
