package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _J: ImageVector? = null

val Icons.Ss.J: ImageVector
    get() = _J ?: UXIcon(name = "J") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 24f)
                horizontalLineTo(5f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-4.11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4.11f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(14f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(0f)
                horizontalLineToRelative(2f)
                verticalLineTo(21f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
            }
        }.also { _J = it}
