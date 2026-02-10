package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Effect: ImageVector? = null

val Icons.Sr.Effect: ImageVector
    get() = _Effect ?: UXIcon(name = "Effect") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineTo(1f)
                curveTo(0.45f, 0f, 0f, 0.45f, 0f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(15.16f)
                curveToRelative(-1.65f, 0.49f, -2.79f, 2.15f, -2.43f, 4.03f)
                curveToRelative(0.25f, 1.31f, 1.29f, 2.41f, 2.6f, 2.71f)
                curveToRelative(2.29f, 0.54f, 4.34f, -1.2f, 4.34f, -3.4f)
                curveToRelative(0f, -1.58f, -1.06f, -2.9f, -2.5f, -3.34f)
                verticalLineTo(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(15.16f)
                curveToRelative(-1.65f, 0.49f, -2.79f, 2.15f, -2.43f, 4.03f)
                curveToRelative(0.25f, 1.31f, 1.29f, 2.41f, 2.6f, 2.71f)
                curveToRelative(2.29f, 0.54f, 4.34f, -1.2f, 4.34f, -3.4f)
                curveToRelative(0f, -1.58f, -1.06f, -2.9f, -2.5f, -3.34f)
                verticalLineTo(2f)
                horizontalLineToRelative(2.11f)
                lineToRelative(4.93f, 15.61f)
                curveToRelative(-1.12f, 0.76f, -1.77f, 2.15f, -1.46f, 3.65f)
                curveToRelative(0.27f, 1.29f, 1.31f, 2.35f, 2.59f, 2.65f)
                curveToRelative(2.29f, 0.53f, 4.33f, -1.21f, 4.33f, -3.4f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-0.02f, 0f, -0.04f, 0.01f, -0.06f, 0.01f)
                lineTo(15.71f, 2f)
                horizontalLineToRelative(7.29f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _Effect = it}
