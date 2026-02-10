package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _F: ImageVector? = null

val Icons.Rs.F: ImageVector
    get() = _F ?: UXIcon(name = "F") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 2f)
                horizontalLineTo(22f)
                verticalLineTo(0f)
                horizontalLineTo(5f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineTo(24f)
                horizontalLineToRelative(2f)
                verticalLineTo(13f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-2f)
                horizontalLineTo(4f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
            }
        }.also { _F = it}
