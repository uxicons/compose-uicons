package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MobileButton: ImageVector? = null

val Icons.Bs.MobileButton: ImageVector
    get() = _MobileButton ?: UXIcon(name = "MobileButton") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 0f)
                lineTo(4f, 20.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(9f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(20f, 0f)
                lineTo(4f, 0f)
                close()
                moveTo(17f, 20.5f)
                curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
                lineTo(7.5f, 21f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(7f, 3f)
                horizontalLineToRelative(10f)
                lineTo(17f, 20.5f)
                close()
                moveTo(14f, 19f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _MobileButton = it}
