package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Vest: ImageVector? = null

val Icons.Ss.Vest: ImageVector
    get() = _Vest ?: UXIcon(name = "Vest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.59f, 0.21f)
                lineToRelative(4.41f, 11.97f)
                verticalLineToRelative(11.82f)
                lineTo(1f, 24f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2f)
                lineTo(1f, 15f)
                verticalLineToRelative(-3.37f)
                curveToRelative(0.68f, -0.8f, 2f, -2.7f, 2f, -3.63f)
                lineTo(3f, 3.39f)
                curveToRelative(0f, -1.36f, 0.91f, -2.55f, 2.2f, -2.9f)
                curveToRelative(0.47f, -0.13f, 0.94f, -0.22f, 1.39f, -0.29f)
                close()
                moveTo(15f, 0f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.02f, 0f, -0.15f, 0f, -0.35f, 0.01f)
                lineToRelative(3.35f, 9.1f)
                lineTo(15.35f, 0.01f)
                curveToRelative(-0.2f, -0.01f, -0.33f, -0.01f, -0.35f, -0.01f)
                close()
                moveTo(23f, 15f)
                verticalLineToRelative(-3.37f)
                curveToRelative(-0.57f, -0.67f, -2f, -2.66f, -2f, -3.63f)
                lineTo(21f, 3.39f)
                curveToRelative(0f, -1.36f, -0.91f, -2.55f, -2.2f, -2.9f)
                curveToRelative(-0.47f, -0.13f, -0.94f, -0.22f, -1.39f, -0.29f)
                lineToRelative(-4.41f, 11.97f)
                verticalLineToRelative(11.82f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7f)
                close()
            }
        }.also { _Vest = it}
