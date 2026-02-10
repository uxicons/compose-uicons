package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindowFrameOpen: ImageVector? = null

val Icons.Ts.WindowFrameOpen: ImageVector
    get() = _WindowFrameOpen ?: UXIcon(name = "WindowFrameOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 23f)
                verticalLineToRelative(1f)
                lineTo(0f, 24f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2f)
                close()
                moveTo(22f, 13f)
                lineTo(2f, 13f)
                lineTo(2f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(10.5f)
                close()
                moveTo(3f, 12f)
                horizontalLineToRelative(8.5f)
                lineTo(11.5f, 1f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(9.5f)
                close()
                moveTo(21f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(8.5f)
                lineTo(21f, 2.5f)
                close()
            }
        }.also { _WindowFrameOpen = it}
