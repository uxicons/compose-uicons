package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DocumentFail: ImageVector? = null

val Icons.Sr.DocumentFail: ImageVector
    get() = _DocumentFail ?: UXIcon(name = "DocumentFail") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 19f)
                lineToRelative(-2f, 2f)
                lineToRelative(-2f, -2f)
                verticalLineToRelative(-14f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(12f, 2.59f)
                verticalLineToRelative(4.41f)
                horizontalLineToRelative(4.41f)
                close()
                moveTo(0f, 13.9f)
                verticalLineToRelative(-8.9f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(4.9f)
                lineToRelative(-1.91f, -1.89f)
                lineToRelative(-3.3f, 3.29f)
                lineToRelative(-3.3f, -3.3f)
                lineToRelative(-3.3f, 3.29f)
                lineToRelative(-3.29f, -3.29f)
                lineToRelative(-1.91f, 1.9f)
                close()
                moveTo(17f, 16.72f)
                verticalLineToRelative(5.28f)
                horizontalLineToRelative(-17f)
                verticalLineToRelative(-5.29f)
                lineToRelative(1.9f, -1.89f)
                lineToRelative(3.3f, 3.3f)
                lineToRelative(3.3f, -3.29f)
                lineToRelative(3.3f, 3.29f)
                lineToRelative(3.3f, -3.29f)
                close()
            }
        }.also { _DocumentFail = it}
