package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindowFrameOpen: ImageVector? = null

val Icons.Bs.WindowFrameOpen: ImageVector
    get() = _WindowFrameOpen ?: UXIcon(name = "WindowFrameOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 21f)
                verticalLineToRelative(3f)
                lineTo(0f, 24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                close()
                moveTo(22f, 13f)
                lineTo(2f, 13f)
                lineTo(2f, 3.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(13f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(9.5f)
                close()
                moveTo(5f, 10f)
                horizontalLineToRelative(5.5f)
                lineTo(10.5f, 3f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(6.5f)
                close()
                moveTo(19f, 3.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(5.5f)
                lineTo(19f, 3.5f)
                close()
            }
        }.also { _WindowFrameOpen = it}
