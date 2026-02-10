package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RemoveFolder: ImageVector? = null

val Icons.Sr.RemoveFolder: ImageVector
    get() = _RemoveFolder ?: UXIcon(name = "RemoveFolder") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.71f, 17.71f)
                lineToRelative(-1.29f, 1.3f)
                lineToRelative(1.29f, 1.28f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-1.29f, -1.28f)
                lineToRelative(-1.27f, 1.28f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(1.27f, -1.28f)
                lineToRelative(-1.29f, -1.28f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(1.29f, 1.28f)
                lineToRelative(1.29f, -1.3f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(19f, 3f)
                horizontalLineToRelative(-6.53f)
                curveToRelative(-0.15f, 0f, -0.31f, -0.04f, -0.45f, -0.11f)
                lineToRelative(-3.16f, -1.58f)
                curveToRelative(-0.41f, -0.21f, -0.88f, -0.32f, -1.34f, -0.32f)
                horizontalLineToRelative(-2.53f)
                curveTo(2.24f, 1f, 0f, 3.24f, 0f, 6f)
                verticalLineToRelative(1f)
                lineTo(23.9f, 7f)
                curveToRelative(-0.46f, -2.28f, -2.48f, -4f, -4.9f, -4f)
                close()
                moveTo(13f, 19f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                curveToRelative(2.09f, 0f, 3.93f, 1.07f, 5f, 2.68f)
                verticalLineToRelative(-6.68f)
                lineTo(0f, 9f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                lineTo(14.53f, 23f)
                curveToRelative(-0.95f, -1.06f, -1.53f, -2.46f, -1.53f, -4f)
                close()
            }
        }.also { _RemoveFolder = it}
