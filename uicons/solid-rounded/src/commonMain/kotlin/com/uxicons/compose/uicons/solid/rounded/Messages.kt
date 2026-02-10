package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Messages: ImageVector? = null

val Icons.Sr.Messages: ImageVector
    get() = _Messages ?: UXIcon(name = "Messages") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, -0.0f)
                lineTo(5f, -0.0f)
                curveTo(2.24f, -0.0f, 0f, 2.24f, 0f, 5.0f)
                verticalLineToRelative(12.85f)
                curveToRelative(0f, 0.79f, 0.43f, 1.52f, 1.13f, 1.89f)
                curveToRelative(0.32f, 0.17f, 0.67f, 0.26f, 1.01f, 0.26f)
                curveToRelative(0.42f, 0f, 0.83f, -0.12f, 1.19f, -0.36f)
                lineToRelative(3.96f, -2.64f)
                horizontalLineToRelative(5.7f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-7f)
                curveTo(18f, 2.24f, 15.76f, -0.0f, 13f, -0.0f)
                close()
                moveTo(24f, 9.0f)
                verticalLineToRelative(12.85f)
                curveToRelative(0f, 0.79f, -0.43f, 1.52f, -1.13f, 1.89f)
                curveToRelative(-0.32f, 0.17f, -0.67f, 0.26f, -1.01f, 0.26f)
                curveToRelative(-0.42f, 0f, -0.83f, -0.12f, -1.19f, -0.36f)
                lineToRelative(-3.96f, -2.64f)
                horizontalLineToRelative(-5.7f)
                curveToRelative(-1.45f, 0f, -2.75f, -0.63f, -3.66f, -1.62f)
                lineToRelative(0.57f, -0.38f)
                horizontalLineToRelative(5.09f)
                curveToRelative(3.86f, 0f, 7f, -3.14f, 7f, -7f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.31f, -0.03f, -0.61f, -0.07f, -0.91f)
                curveToRelative(2.31f, 0.44f, 4.07f, 2.47f, 4.07f, 4.91f)
                close()
            }
        }.also { _Messages = it}
