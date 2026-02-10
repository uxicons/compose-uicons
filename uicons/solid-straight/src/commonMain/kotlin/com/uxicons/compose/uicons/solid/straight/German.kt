package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _German: ImageVector? = null

val Icons.Ss.German: ImageVector
    get() = _German ?: UXIcon(name = "German") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 4f)
                verticalLineToRelative(15f)
                lineTo(7.91f, 19f)
                lineToRelative(-1.91f, 1.27f)
                verticalLineToRelative(0.73f)
                horizontalLineToRelative(10.7f)
                lineToRelative(3.96f, 2.64f)
                curveToRelative(1.35f, 0.97f, 3.39f, -0.13f, 3.34f, -1.79f)
                lineTo(24f, 7f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(7.9f, 7f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.22f, -0.18f, 0.4f, -0.4f, 0.4f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(-3.8f)
                horizontalLineToRelative(0.9f)
                curveToRelative(0.22f, 0f, 0.4f, 0.18f, 0.4f, 0.4f)
                close()
                moveTo(16f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(14.85f)
                curveToRelative(-0.05f, 1.66f, 1.98f, 2.75f, 3.34f, 1.79f)
                lineToRelative(3.96f, -2.64f)
                horizontalLineToRelative(11.7f)
                lineTo(19.0f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(9.5f, 10f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-2.5f)
                lineTo(5f, 5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(3f)
                close()
                moveTo(14f, 6.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(1.1f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(1.1f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-3.5f)
                lineTo(10.5f, 5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1.6f)
                close()
            }
        }.also { _German = it}
