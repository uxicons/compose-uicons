package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Camcorder: ImageVector? = null

val Icons.Ss.Camcorder: ImageVector
    get() = _Camcorder ?: UXIcon(name = "Camcorder") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 19f)
                lineTo(5f, 19f)
                lineTo(5f, 11f)
                lineTo(14f, 11f)
                verticalLineToRelative(8f)
                close()
                moveTo(21f, 10.24f)
                verticalLineToRelative(9.51f)
                lineToRelative(3f, 2.24f)
                lineTo(24f, 8.01f)
                lineToRelative(-3f, 2.24f)
                close()
                moveTo(19f, 9f)
                verticalLineToRelative(15f)
                lineTo(0f, 24f)
                lineTo(0f, 9f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(12.09f, 6f)
                lineToRelative(-3f, -3f)
                lineTo(0f, 3f)
                lineTo(0f, 1f)
                lineTo(9.91f, 1f)
                lineToRelative(5f, 5f)
                horizontalLineToRelative(1.09f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(16f, 9f)
                lineTo(3f, 9f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(13f)
                lineTo(16f, 9f)
                close()
            }
        }.also { _Camcorder = it}
