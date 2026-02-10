package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Camcorder: ImageVector? = null

val Icons.Bs.Camcorder: ImageVector
    get() = _Camcorder ?: UXIcon(name = "Camcorder") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 21.25f)
                lineToRelative(-3f, -2.25f)
                verticalLineToRelative(5f)
                lineTo(0f, 24f)
                lineTo(0f, 9.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                lineTo(11.56f, 6f)
                lineToRelative(-2.73f, -3f)
                lineTo(0f, 3f)
                lineTo(0f, 0f)
                lineTo(10.16f, 0f)
                lineToRelative(5.45f, 5.99f)
                lineToRelative(-0.01f, 0.01f)
                horizontalLineToRelative(1.9f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(1.5f)
                lineToRelative(3f, -2.25f)
                verticalLineToRelative(12.5f)
                close()
                moveTo(18f, 9.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 9f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(15f)
                lineTo(18f, 9.5f)
                close()
                moveTo(16f, 19f)
                lineTo(5f, 19f)
                lineTo(5f, 11f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(8f)
                close()
                moveTo(8f, 16f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _Camcorder = it}
