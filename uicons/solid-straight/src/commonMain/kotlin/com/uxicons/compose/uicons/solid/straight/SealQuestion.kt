package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SealQuestion: ImageVector? = null

val Icons.Ss.SealQuestion: ImageVector
    get() = _SealQuestion ?: UXIcon(name = "SealQuestion") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 8.48f)
                lineTo(20.5f, 3.5f)
                horizontalLineToRelative(-4.98f)
                lineTo(12f, -0.02f)
                lineToRelative(-3.52f, 3.52f)
                lineTo(3.5f, 3.5f)
                verticalLineToRelative(4.98f)
                lineTo(-0.02f, 12f)
                lineToRelative(3.52f, 3.52f)
                verticalLineToRelative(4.98f)
                horizontalLineToRelative(4.98f)
                lineToRelative(3.52f, 3.52f)
                lineToRelative(3.52f, -3.52f)
                horizontalLineToRelative(4.98f)
                verticalLineToRelative(-4.98f)
                lineToRelative(3.52f, -3.52f)
                lineToRelative(-3.52f, -3.52f)
                close()
                moveTo(13f, 18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(13.45f, 12.63f)
                curveToRelative(-0.19f, 0.1f, -0.45f, 0.56f, -0.45f, 0.88f)
                verticalLineToRelative(0.49f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-0.49f)
                curveToRelative(0f, -1.03f, 0.64f, -2.16f, 1.48f, -2.63f)
                curveToRelative(0.29f, -0.16f, 0.59f, -0.54f, 0.5f, -1.07f)
                curveToRelative(-0.07f, -0.39f, -0.4f, -0.72f, -0.79f, -0.79f)
                curveToRelative(-0.31f, -0.06f, -0.6f, 0.02f, -0.83f, 0.22f)
                curveToRelative(-0.23f, 0.19f, -0.36f, 0.47f, -0.36f, 0.77f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -0.89f, 0.39f, -1.73f, 1.07f, -2.3f)
                curveToRelative(0.68f, -0.57f, 1.58f, -0.81f, 2.46f, -0.65f)
                curveToRelative(1.21f, 0.21f, 2.2f, 1.21f, 2.42f, 2.42f)
                curveToRelative(0.22f, 1.27f, -0.38f, 2.54f, -1.51f, 3.16f)
                close()
            }
        }.also { _SealQuestion = it}
