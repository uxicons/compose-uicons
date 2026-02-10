package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Subfolder: ImageVector? = null

val Icons.Sr.Subfolder: ImageVector
    get() = _Subfolder ?: UXIcon(name = "Subfolder") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 11f)
                horizontalLineToRelative(-2.53f)
                curveToRelative(-0.15f, 0f, -0.31f, -0.04f, -0.45f, -0.11f)
                lineToRelative(-3.15f, -1.58f)
                curveToRelative(-0.42f, -0.21f, -0.88f, -0.32f, -1.34f, -0.32f)
                horizontalLineToRelative(-2.03f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(9f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(6.54f, 23f)
                horizontalLineToRelative(-1.54f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineTo(6f)
                curveTo(0f, 3.24f, 2.24f, 1f, 5f, 1f)
                horizontalLineToRelative(2.53f)
                curveToRelative(0.47f, 0f, 0.93f, 0.11f, 1.34f, 0.32f)
                lineToRelative(3.16f, 1.58f)
                curveToRelative(0.14f, 0.07f, 0.29f, 0.1f, 0.45f, 0.1f)
                horizontalLineToRelative(6.53f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(2.54f)
                curveToRelative(-1.06f, -0.95f, -2.46f, -1.54f, -4f, -1.54f)
                horizontalLineToRelative(-2.29f)
                lineToRelative(-2.94f, -1.47f)
                curveToRelative(-0.69f, -0.35f, -1.46f, -0.53f, -2.23f, -0.53f)
                horizontalLineToRelative(-2.03f)
                curveToRelative(-3.04f, 0f, -5.5f, 2.46f, -5.5f, 5.5f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 1.54f, 0.59f, 2.94f, 1.54f, 4f)
                close()
            }
        }.also { _Subfolder = it}
