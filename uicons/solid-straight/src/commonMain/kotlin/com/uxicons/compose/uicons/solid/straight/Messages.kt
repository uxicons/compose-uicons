package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Messages: ImageVector? = null

val Icons.Ss.Messages: ImageVector
    get() = _Messages ?: UXIcon(name = "Messages") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.34f, 19.64f)
                lineToRelative(3.96f, -2.64f)
                horizontalLineToRelative(10.7f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineTo(3f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(14.85f)
                curveToRelative(0f, 0.79f, 0.43f, 1.52f, 1.13f, 1.89f)
                curveToRelative(0.32f, 0.17f, 0.67f, 0.26f, 1.01f, 0.26f)
                curveToRelative(0.42f, 0f, 0.83f, -0.12f, 1.19f, -0.36f)
                close()
                moveTo(24f, 7f)
                verticalLineToRelative(14.85f)
                curveToRelative(0f, 0.79f, -0.43f, 1.52f, -1.13f, 1.89f)
                curveToRelative(-0.32f, 0.17f, -0.67f, 0.26f, -1.01f, 0.26f)
                curveToRelative(-0.42f, 0f, -0.83f, -0.12f, -1.19f, -0.36f)
                lineToRelative(-3.96f, -2.64f)
                horizontalLineTo(6f)
                verticalLineToRelative(-0.73f)
                lineToRelative(1.91f, -1.27f)
                horizontalLineToRelative(12.09f)
                verticalLineTo(4f)
                horizontalLineToRelative(1f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
            }
        }.also { _Messages = it}
