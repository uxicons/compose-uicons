package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Square1: ImageVector? = null

val Icons.Ss.Square1: ImageVector
    get() = _Square1 ?: UXIcon(name = "Square1") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                horizontalLineTo(3f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(13f, 18f)
                horizontalLineToRelative(-2f)
                verticalLineTo(9.37f)
                lineToRelative(-1.58f, 1.63f)
                lineToRelative(-1.43f, -1.4f)
                lineToRelative(3.51f, -3.6f)
                horizontalLineToRelative(1.51f)
                verticalLineToRelative(12f)
                close()
            }
        }.also { _Square1 = it}
