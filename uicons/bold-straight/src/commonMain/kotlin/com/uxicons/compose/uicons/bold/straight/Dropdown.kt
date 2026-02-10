package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dropdown: ImageVector? = null

val Icons.Bs.Dropdown: ImageVector
    get() = _Dropdown ?: UXIcon(name = "Dropdown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 4f)
                lineTo(3.5f, 4f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(12.5f)
                lineTo(24f, 20f)
                lineTo(24f, 7.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 17f)
                lineTo(3f, 17f)
                lineTo(3f, 7.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 7f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(9.5f)
                close()
                moveTo(11.54f, 11f)
                horizontalLineToRelative(8f)
                lineToRelative(-3.19f, 3.14f)
                curveToRelative(-0.45f, 0.45f, -1.17f, 0.45f, -1.62f, 0f)
                lineToRelative(-3.19f, -3.14f)
                close()
            }
        }.also { _Dropdown = it}
