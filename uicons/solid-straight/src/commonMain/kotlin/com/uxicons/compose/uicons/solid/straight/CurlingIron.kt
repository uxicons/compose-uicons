package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CurlingIron: ImageVector? = null

val Icons.Ss.CurlingIron: ImageVector
    get() = _CurlingIron ?: UXIcon(name = "CurlingIron") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.11f, 5.21f)
                lineToRelative(-7.7f, 7.7f)
                lineToRelative(-4.32f, -4.32f)
                lineToRelative(7.7f, -7.7f)
                curveToRelative(1.19f, -1.19f, 3.12f, -1.19f, 4.32f, 0f)
                curveToRelative(1.19f, 1.19f, 1.19f, 3.12f, 0f, 4.32f)
                close()
                moveTo(10f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(8.88f)
                lineToRelative(-1.01f, -0.5f)
                curveToRelative(-1.31f, -0.66f, -2.89f, -0.4f, -3.92f, 0.64f)
                lineToRelative(-1.28f, 1.28f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.28f, -1.28f)
                curveToRelative(0.43f, -0.43f, 1.08f, -0.53f, 1.62f, -0.26f)
                lineToRelative(1.57f, 0.78f)
                lineToRelative(-6.55f, 6.55f)
                curveToRelative(-1.49f, 1.49f, -1.49f, 3.9f, 0f, 5.38f)
                curveToRelative(1.49f, 1.49f, 3.9f, 1.49f, 5.38f, 0f)
                lineToRelative(6.67f, -6.67f)
                lineToRelative(1.81f, 1.81f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-6.39f, -6.39f)
                close()
            }
        }.also { _CurlingIron = it}
