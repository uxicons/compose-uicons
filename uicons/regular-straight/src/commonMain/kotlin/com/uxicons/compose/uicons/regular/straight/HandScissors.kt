package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandScissors: ImageVector? = null

val Icons.Rs.HandScissors: ImageVector
    get() = _HandScissors ?: UXIcon(name = "HandScissors") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.88f, 1.88f)
                curveToRelative(-1.13f, -1.13f, -3.1f, -1.14f, -4.25f, 0.01f)
                lineToRelative(-2.98f, 3.03f)
                lineToRelative(-7.97f, -1.84f)
                curveToRelative(-0.86f, -0.2f, -1.76f, -0.01f, -2.46f, 0.52f)
                curveTo(0.5f, 4.12f, 0.06f, 4.93f, 0.0f, 5.82f)
                curveToRelative(-0.09f, 1.44f, 0.95f, 2.79f, 2.42f, 3.13f)
                lineToRelative(2.39f, 0.55f)
                lineToRelative(-2.39f, 0.55f)
                curveTo(0.95f, 10.39f, -0.09f, 11.74f, 0.0f, 13.18f)
                curveToRelative(0.06f, 0.89f, 0.5f, 1.7f, 1.2f, 2.23f)
                curveToRelative(0.71f, 0.53f, 1.61f, 0.71f, 2.46f, 0.52f)
                lineToRelative(5.07f, -1.15f)
                lineToRelative(1.45f, 7.22f)
                horizontalLineToRelative(13.82f)
                lineTo(24.0f, 7f)
                lineToRelative(-5.12f, -5.12f)
                close()
                moveTo(22f, 20f)
                horizontalLineToRelative(-10.18f)
                lineToRelative(-1.53f, -7.63f)
                lineToRelative(-7.07f, 1.6f)
                curveToRelative(-0.28f, 0.07f, -0.58f, 0.0f, -0.82f, -0.17f)
                curveToRelative(-0.24f, -0.18f, -0.38f, -0.45f, -0.4f, -0.75f)
                curveToRelative(-0.03f, -0.47f, 0.35f, -0.93f, 0.88f, -1.05f)
                lineToRelative(10.8f, -2.5f)
                lineTo(2.88f, 7.0f)
                curveToRelative(-0.52f, -0.12f, -0.91f, -0.58f, -0.88f, -1.05f)
                curveToRelative(0.02f, -0.31f, 0.16f, -0.57f, 0.4f, -0.75f)
                curveToRelative(0.24f, -0.17f, 0.54f, -0.24f, 0.82f, -0.17f)
                lineToRelative(13.13f, 3.02f)
                lineToRelative(0.45f, -1.95f)
                lineToRelative(-2.87f, -0.66f)
                lineToRelative(2.12f, -2.15f)
                curveToRelative(0.38f, -0.38f, 1.04f, -0.38f, 1.41f, 0f)
                lineToRelative(4.54f, 4.54f)
                verticalLineToRelative(12.17f)
                close()
            }
        }.also { _HandScissors = it}
