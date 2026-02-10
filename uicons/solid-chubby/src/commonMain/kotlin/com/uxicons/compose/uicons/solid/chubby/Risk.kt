package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Risk: ImageVector? = null

val Icons.Sc.Risk: ImageVector
    get() = _Risk ?: UXIcon(name = "Risk") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 13.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(12f, 8f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(20.39f, 15.06f)
                curveToRelative(-0.11f, 0.21f, -0.23f, 0.41f, -0.36f, 0.62f)
                curveToRelative(1.05f, 1.47f, 0.96f, 2.84f, -0.27f, 4.07f)
                curveToRelative(-1.24f, 1.24f, -2.61f, 1.33f, -4.08f, 0.27f)
                curveToRelative(-0.2f, 0.13f, -0.41f, 0.25f, -0.62f, 0.36f)
                curveToRelative(-0.31f, 1.71f, -1.37f, 2.61f, -3.07f, 2.61f)
                reflectiveCurveToRelative(-2.76f, -0.9f, -3.07f, -2.62f)
                curveToRelative(-0.21f, -0.11f, -0.41f, -0.23f, -0.62f, -0.36f)
                curveToRelative(-1.46f, 1.06f, -2.83f, 0.97f, -4.07f, -0.27f)
                curveToRelative(-1.24f, -1.24f, -1.33f, -2.61f, -0.27f, -4.08f)
                curveToRelative(-0.13f, -0.21f, -0.25f, -0.41f, -0.36f, -0.62f)
                curveToRelative(-1.72f, -0.32f, -2.59f, -1.34f, -2.6f, -3.05f)
                verticalLineToRelative(-0.01f)
                curveToRelative(0.01f, -1.71f, 0.89f, -2.74f, 2.6f, -3.05f)
                curveToRelative(0.11f, -0.21f, 0.23f, -0.42f, 0.36f, -0.63f)
                curveToRelative(-1.06f, -1.46f, -0.96f, -2.83f, 0.27f, -4.07f)
                curveToRelative(1.24f, -1.24f, 2.61f, -1.33f, 4.08f, -0.27f)
                curveToRelative(0.2f, -0.13f, 0.41f, -0.25f, 0.61f, -0.36f)
                curveToRelative(0.31f, -1.71f, 1.38f, -2.61f, 3.07f, -2.61f)
                reflectiveCurveToRelative(2.76f, 0.9f, 3.07f, 2.62f)
                curveToRelative(0.21f, 0.1f, 0.41f, 0.23f, 0.62f, 0.36f)
                curveToRelative(1.46f, -1.06f, 2.83f, -0.97f, 4.07f, 0.27f)
                curveToRelative(1.24f, 1.24f, 1.33f, 2.61f, 0.27f, 4.08f)
                curveToRelative(0.13f, 0.21f, 0.26f, 0.42f, 0.36f, 0.62f)
                curveToRelative(1.72f, 0.31f, 2.59f, 1.34f, 2.6f, 3.05f)
                curveToRelative(-0.01f, 1.72f, -0.89f, 2.75f, -2.6f, 3.06f)
                close()
                moveTo(17.43f, 13.16f)
                curveToRelative(-0.16f, -0.64f, -0.6f, -1.95f, -1.7f, -3.65f)
                curveToRelative(-1.26f, -1.95f, -2.29f, -2.86f, -2.57f, -3.1f)
                curveToRelative(-0.66f, -0.53f, -1.64f, -0.54f, -2.32f, 0.01f)
                curveToRelative(-0.28f, 0.23f, -1.31f, 1.15f, -2.57f, 3.09f)
                curveToRelative(-1.1f, 1.7f, -1.53f, 3.02f, -1.7f, 3.64f)
                curveToRelative(-0.14f, 0.53f, -0.07f, 1.11f, 0.2f, 1.58f)
                curveToRelative(0.29f, 0.51f, 0.78f, 0.85f, 1.33f, 0.94f)
                curveToRelative(0.48f, 0.08f, 2.18f, 0.34f, 3.89f, 0.34f)
                curveToRelative(1.73f, 0f, 3.41f, -0.26f, 3.88f, -0.33f)
                curveToRelative(0.56f, -0.09f, 1.05f, -0.43f, 1.34f, -0.94f)
                curveToRelative(0.27f, -0.47f, 0.35f, -1.05f, 0.21f, -1.57f)
                close()
            }
        }.also { _Risk = it}
