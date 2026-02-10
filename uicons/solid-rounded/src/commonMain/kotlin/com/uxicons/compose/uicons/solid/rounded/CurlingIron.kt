package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CurlingIron: ImageVector? = null

val Icons.Sr.CurlingIron: ImageVector
    get() = _CurlingIron ?: UXIcon(name = "CurlingIron") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.62f, 15.86f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                reflectiveCurveToRelative(-1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-1.04f, -1.04f)
                lineToRelative(-6.65f, 6.65f)
                curveToRelative(-1.49f, 1.49f, -3.9f, 1.49f, -5.38f, 0f)
                curveToRelative(-1.49f, -1.49f, -1.49f, -3.9f, 0f, -5.38f)
                lineToRelative(6.3f, -6.3f)
                curveToRelative(-1.44f, -0.46f, -3.06f, -0.09f, -4.14f, 1.0f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(1.6f, -1.6f, 3.97f, -2.16f, 6.11f, -1.51f)
                verticalLineToRelative(-8.29f)
                curveToRelative(-0.0f, -0.55f, 0.45f, -1f, 1.0f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(9.15f)
                close()
                moveTo(23.09f, 0.89f)
                curveToRelative(-1.19f, -1.19f, -3.12f, -1.19f, -4.32f, 0f)
                lineToRelative(-7.7f, 7.7f)
                lineToRelative(4.32f, 4.32f)
                lineToRelative(7.7f, -7.7f)
                curveToRelative(1.19f, -1.19f, 1.19f, -3.12f, 0f, -4.32f)
                close()
            }
        }.also { _CurlingIron = it}
