package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dropdown: ImageVector? = null

val Icons.Ts.Dropdown: ImageVector
    get() = _Dropdown ?: UXIcon(name = "Dropdown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 20f)
                lineTo(0f, 20f)
                lineTo(0f, 6.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                lineTo(21.5f, 4f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(13.5f)
                close()
                moveTo(1f, 19f)
                lineTo(23f, 19f)
                lineTo(23f, 6.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(12.5f)
                close()
                moveTo(16.5f, 14.97f)
                curveToRelative(-0.44f, 0f, -0.85f, -0.17f, -1.16f, -0.48f)
                lineToRelative(-4.06f, -3.99f)
                horizontalLineToRelative(10.44f)
                lineToRelative(-4.06f, 3.99f)
                curveToRelative(-0.31f, 0.31f, -0.72f, 0.48f, -1.16f, 0.48f)
                close()
                moveTo(13.72f, 11.5f)
                lineToRelative(2.32f, 2.28f)
                curveToRelative(0.25f, 0.25f, 0.67f, 0.25f, 0.92f, 0.0f)
                lineToRelative(0.0f, -0.0f)
                lineToRelative(2.32f, -2.28f)
                horizontalLineToRelative(-5.56f)
                close()
            }
        }.also { _Dropdown = it}
