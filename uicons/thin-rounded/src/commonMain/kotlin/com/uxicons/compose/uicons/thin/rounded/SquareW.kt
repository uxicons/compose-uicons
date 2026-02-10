package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareW: ImageVector? = null

val Icons.Tr.SquareW: ImageVector
    get() = _SquareW ?: UXIcon(name = "SquareW") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 0f)
                lineTo(4.5f, 0f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(15f)
                close()
                moveTo(19.99f, 4.58f)
                lineToRelative(-2.19f, 14.19f)
                curveToRelative(-0.1f, 0.66f, -0.61f, 1.15f, -1.28f, 1.22f)
                curveToRelative(-0.66f, 0.07f, -1.27f, -0.29f, -1.51f, -0.92f)
                lineToRelative(-3.02f, -7.75f)
                lineToRelative(-3.02f, 7.75f)
                curveToRelative(-0.22f, 0.57f, -0.75f, 0.93f, -1.35f, 0.93f)
                curveToRelative(-0.64f, 0f, -1.34f, -0.57f, -1.44f, -1.23f)
                lineToRelative(-2.19f, -14.19f)
                curveToRelative(-0.04f, -0.27f, 0.15f, -0.53f, 0.42f, -0.57f)
                curveToRelative(0.27f, -0.04f, 0.53f, 0.15f, 0.57f, 0.42f)
                lineToRelative(2.19f, 14.19f)
                curveToRelative(0.05f, 0.32f, 0.32f, 0.37f, 0.4f, 0.38f)
                curveToRelative(0.08f, 0.0f, 0.35f, 0.01f, 0.47f, -0.29f)
                lineToRelative(3.48f, -8.95f)
                curveToRelative(0.15f, -0.38f, 0.78f, -0.38f, 0.93f, 0f)
                lineToRelative(3.48f, 8.95f)
                curveToRelative(0.12f, 0.3f, 0.39f, 0.29f, 0.47f, 0.29f)
                curveToRelative(0.08f, -0.01f, 0.35f, -0.06f, 0.4f, -0.38f)
                lineToRelative(2.19f, -14.19f)
                curveToRelative(0.04f, -0.27f, 0.3f, -0.46f, 0.57f, -0.42f)
                curveToRelative(0.27f, 0.04f, 0.46f, 0.3f, 0.42f, 0.57f)
                close()
            }
        }.also { _SquareW = it}
