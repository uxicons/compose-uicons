package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _E: ImageVector? = null

val Icons.Rs.E: ImageVector
    get() = _E ?: UXIcon(name = "E") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 2f)
                horizontalLineTo(22f)
                verticalLineTo(0f)
                horizontalLineTo(5f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineTo(21f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineTo(22f)
                verticalLineToRelative(-2f)
                horizontalLineTo(5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineTo(13f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-2f)
                horizontalLineTo(4f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
            }
        }.also { _E = it}
