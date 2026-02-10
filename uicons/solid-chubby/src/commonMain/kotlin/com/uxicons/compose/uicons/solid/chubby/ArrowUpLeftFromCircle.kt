package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpLeftFromCircle: ImageVector? = null

val Icons.Sc.ArrowUpLeftFromCircle: ImageVector
    get() = _ArrowUpLeftFromCircle ?: UXIcon(name = "ArrowUpLeftFromCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.81f, 4.63f)
                curveToRelative(-0.34f, 0f, -0.67f, 0.01f, -0.99f, 0.03f)
                curveToRelative(-0.36f, 0.7f, -0.94f, 1.26f, -1.64f, 1.58f)
                lineToRelative(5.1f, 5.1f)
                curveToRelative(0.68f, 0.67f, 1.05f, 1.61f, 1.03f, 2.56f)
                curveToRelative(-0.02f, 0.94f, -0.41f, 1.81f, -1.09f, 2.44f)
                curveToRelative(-0.69f, 0.64f, -1.52f, 0.97f, -2.4f, 0.97f)
                curveToRelative(-1.36f, 0f, -2.25f, -0.79f, -2.5f, -1.03f)
                lineToRelative(-5.11f, -5.11f)
                curveToRelative(-0.1f, 0.21f, -0.21f, 0.42f, -0.35f, 0.61f)
                curveToRelative(-0.32f, 0.44f, -0.73f, 0.79f, -1.21f, 1.04f)
                curveToRelative(-0.02f, 0.33f, -0.05f, 0.64f, -0.05f, 0.98f)
                curveToRelative(0f, 8.14f, 4.91f, 9.18f, 9.18f, 9.18f)
                curveToRelative(3.94f, 0f, 9.18f, -0.95f, 9.18f, -9.18f)
                curveToRelative(0f, -8.14f, -4.91f, -9.18f, -9.18f, -9.18f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.0f, 6.12f)
                lineTo(12.75f, 14.88f)
                curveToRelative(0.29f, 0.29f, 1.22f, 0.83f, 2.12f, 0f)
                curveToRelative(0.61f, -0.56f, 0.59f, -1.54f, 0f, -2.12f)
                lineTo(6.12f, 4.0f)
                curveToRelative(0.87f, -0.01f, 1.93f, 0.1f, 3.15f, 0.48f)
                curveToRelative(0.79f, 0.25f, 1.63f, -0.18f, 1.88f, -0.97f)
                curveToRelative(0.25f, -0.79f, -0.18f, -1.63f, -0.97f, -1.88f)
                curveToRelative(-4.47f, -1.42f, -7.62f, 0.03f, -7.75f, 0.09f)
                curveToRelative(-0.31f, 0.15f, -0.56f, 0.4f, -0.71f, 0.71f)
                curveToRelative(-0.06f, 0.13f, -1.52f, 3.28f, -0.09f, 7.75f)
                curveToRelative(0.2f, 0.64f, 0.79f, 1.06f, 1.43f, 1.04f)
                curveToRelative(1.22f, -0.02f, 1.68f, -1.17f, 1.43f, -1.96f)
                curveToRelative(-0.39f, -1.22f, -0.5f, -2.29f, -0.48f, -3.15f)
                close()
            }
        }.also { _ArrowUpLeftFromCircle = it}
