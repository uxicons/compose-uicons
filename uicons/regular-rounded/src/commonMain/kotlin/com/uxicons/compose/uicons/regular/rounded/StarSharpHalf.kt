package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarSharpHalf: ImageVector? = null

val Icons.Rr.StarSharpHalf: ImageVector
    get() = _StarSharpHalf ?: UXIcon(name = "StarSharpHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.63f, 23.23f)
                curveToRelative(-0.75f, 0f, -1.43f, -0.27f, -1.92f, -0.62f)
                curveToRelative(-0.88f, -0.63f, -1.72f, -1.96f, -1.18f, -3.61f)
                lineToRelative(1.35f, -4.18f)
                lineToRelative(-3.56f, -2.6f)
                curveTo(-0.07f, 11.19f, -0.17f, 9.62f, 0.17f, 8.6f)
                curveToRelative(0.33f, -1.02f, 1.33f, -2.22f, 3.06f, -2.22f)
                horizontalLineToRelative(4.37f)
                lineToRelative(1.33f, -4.14f)
                curveToRelative(0.53f, -1.65f, 1.99f, -2.24f, 3.07f, -2.24f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(17.79f)
                curveToRelative(0f, 0.32f, -0.15f, 0.62f, -0.41f, 0.81f)
                lineToRelative(-4.08f, 3.0f)
                curveToRelative(-0.62f, 0.46f, -1.27f, 0.64f, -1.88f, 0.64f)
                close()
                moveTo(3.23f, 8.38f)
                curveToRelative(-0.81f, 0f, -1.08f, 0.59f, -1.16f, 0.84f)
                curveToRelative(-0.05f, 0.15f, -0.25f, 0.88f, 0.44f, 1.38f)
                lineToRelative(4.14f, 3.03f)
                curveToRelative(0.35f, 0.25f, 0.49f, 0.7f, 0.36f, 1.11f)
                lineToRelative(-1.57f, 4.87f)
                curveToRelative(-0.26f, 0.81f, 0.33f, 1.28f, 0.45f, 1.37f)
                curveToRelative(0.12f, 0.09f, 0.76f, 0.5f, 1.44f, -0.0f)
                lineToRelative(3.67f, -2.7f)
                lineTo(11f, 2.5f)
                curveToRelative(-0.07f, 0.1f, -0.12f, 0.21f, -0.17f, 0.35f)
                lineToRelative(-1.55f, 4.83f)
                curveToRelative(-0.13f, 0.41f, -0.52f, 0.69f, -0.95f, 0.69f)
                lineTo(3.23f, 8.38f)
                close()
            }
        }.also { _StarSharpHalf = it}
