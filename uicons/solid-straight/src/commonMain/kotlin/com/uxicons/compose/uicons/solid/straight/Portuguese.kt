package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Portuguese: ImageVector? = null

val Icons.Ss.Portuguese: ImageVector
    get() = _Portuguese ?: UXIcon(name = "Portuguese") {
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
                moveTo(7.4f, 7.25f)
                curveToRelative(0f, 0.36f, -0.29f, 0.65f, -0.65f, 0.65f)
                horizontalLineToRelative(-0.65f)
                verticalLineToRelative(-1.3f)
                horizontalLineToRelative(0.65f)
                curveToRelative(0.36f, 0f, 0.65f, 0.29f, 0.65f, 0.65f)
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
                moveTo(6.75f, 9.5f)
                horizontalLineToRelative(-0.65f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-1.6f)
                lineTo(4.5f, 5f)
                horizontalLineToRelative(2.25f)
                curveToRelative(1.24f, 0f, 2.25f, 1.01f, 2.25f, 2.25f)
                reflectiveCurveToRelative(-1.01f, 2.25f, -2.25f, 2.25f)
                close()
                moveTo(15f, 6.6f)
                horizontalLineToRelative(-1.7f)
                verticalLineToRelative(5.4f)
                horizontalLineToRelative(-1.6f)
                lineTo(11.7f, 6.6f)
                horizontalLineToRelative(-1.7f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1.6f)
                close()
            }
        }.also { _Portuguese = it}
