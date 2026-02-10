package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Square1: ImageVector? = null

val Icons.Rs.Square1: ImageVector
    get() = _Square1 ?: UXIcon(name = "Square1") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                horizontalLineTo(0f)
                verticalLineTo(3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineTo(21f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineTo(24f)
                close()
                moveTo(2f, 22f)
                horizontalLineTo(22f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineTo(3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineTo(22f)
                close()
                moveTo(13f, 6f)
                horizontalLineToRelative(-1.51f)
                lineToRelative(-3.51f, 3.6f)
                lineToRelative(1.43f, 1.4f)
                lineToRelative(1.58f, -1.63f)
                verticalLineToRelative(8.63f)
                horizontalLineToRelative(2f)
                verticalLineTo(6f)
                close()
            }
        }.also { _Square1 = it}
