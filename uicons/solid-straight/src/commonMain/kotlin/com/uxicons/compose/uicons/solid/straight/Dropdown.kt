package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dropdown: ImageVector? = null

val Icons.Ss.Dropdown: ImageVector
    get() = _Dropdown ?: UXIcon(name = "Dropdown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 4f)
                lineTo(3f, 4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(13f)
                lineTo(24f, 20f)
                lineTo(24f, 7f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(17.36f, 14.14f)
                curveToRelative(-0.45f, 0.45f, -1.17f, 0.45f, -1.62f, 0f)
                lineToRelative(-3.19f, -3.14f)
                horizontalLineToRelative(8f)
                lineToRelative(-3.19f, 3.14f)
                close()
            }
        }.also { _Dropdown = it}
