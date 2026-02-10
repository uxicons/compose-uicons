package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RupeeSign: ImageVector? = null

val Icons.Sr.RupeeSign: ImageVector
    get() = _RupeeSign ?: UXIcon(name = "RupeeSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 7.5f)
                curveTo(15f, 3.36f, 11.64f, 0f, 7.5f, 0f)
                horizontalLineToRelative(-2.5f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                lineTo(0f, 23f)
                curveToRelative(0.01f, 1.31f, 2.0f, 1.31f, 2f, 0f)
                lineTo(2f, 15f)
                lineTo(7.41f, 15f)
                lineToRelative(4.71f, 8.48f)
                curveToRelative(0.27f, 0.49f, 0.89f, 0.66f, 1.36f, 0.39f)
                curveToRelative(0.48f, -0.27f, 0.66f, -0.88f, 0.39f, -1.36f)
                lineToRelative(-4.33f, -7.8f)
                curveToRelative(3.15f, -0.89f, 5.46f, -3.78f, 5.46f, -7.21f)
                close()
                moveTo(7.5f, 13f)
                lineTo(2f, 13f)
                lineTo(2f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(2.5f)
                curveToRelative(7.27f, 0.23f, 7.26f, 10.77f, 0f, 11f)
                close()
                moveTo(24f, 21f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-2.27f)
                curveToRelative(-1.07f, 0f, -2.06f, -0.57f, -2.6f, -1.5f)
                curveToRelative(-0.28f, -0.48f, -0.11f, -1.09f, 0.36f, -1.37f)
                curveToRelative(0.48f, -0.28f, 1.09f, -0.11f, 1.37f, 0.36f)
                curveToRelative(0.18f, 0.31f, 0.51f, 0.5f, 0.87f, 0.5f)
                horizontalLineToRelative(2.27f)
                curveToRelative(1.0f, 0.07f, 1.44f, -1.55f, 0.36f, -1.76f)
                lineToRelative(-3.04f, -0.51f)
                curveToRelative(-3.5f, -0.65f, -2.75f, -5.75f, 0.69f, -5.73f)
                horizontalLineToRelative(2.27f)
                curveToRelative(1.07f, 0f, 2.06f, 0.57f, 2.6f, 1.5f)
                curveToRelative(0.28f, 0.48f, 0.11f, 1.09f, -0.36f, 1.37f)
                curveToRelative(-0.48f, 0.28f, -1.09f, 0.11f, -1.37f, -0.36f)
                curveToRelative(-0.18f, -0.31f, -0.51f, -0.5f, -0.87f, -0.5f)
                horizontalLineToRelative(-2.27f)
                curveToRelative(-1.0f, -0.07f, -1.44f, 1.55f, -0.35f, 1.76f)
                lineToRelative(3.04f, 0.51f)
                curveToRelative(1.34f, 0.22f, 2.31f, 1.37f, 2.31f, 2.73f)
                close()
            }
        }.also { _RupeeSign = it}
