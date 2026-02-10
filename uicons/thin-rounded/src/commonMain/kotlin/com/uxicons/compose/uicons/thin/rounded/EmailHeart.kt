package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmailHeart: ImageVector? = null

val Icons.Tr.EmailHeart: ImageVector
    get() = _EmailHeart ?: UXIcon(name = "EmailHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 9.5f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-15f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.61f, 0f, -2.96f, 1.1f, -3.36f, 2.59f)
                lineToRelative(8.39f, 8.39f)
                curveToRelative(1.36f, 1.37f, 3.58f, 1.36f, 4.95f, 0f)
                lineToRelative(2.38f, -2.35f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.19f, 0.71f, 0.0f)
                curveToRelative(0.19f, 0.2f, 0.19f, 0.51f, -0.0f, 0.71f)
                lineToRelative(-2.38f, 2.35f)
                curveToRelative(-0.88f, 0.88f, -2.03f, 1.31f, -3.18f, 1.31f)
                reflectiveCurveToRelative(-2.31f, -0.44f, -3.18f, -1.32f)
                lineToRelative(-7.82f, -7.82f)
                verticalLineToRelative(11.64f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(12f, 3.47f)
                curveToRelative(0f, -1.91f, 1.46f, -3.47f, 3.25f, -3.47f)
                curveToRelative(1.15f, 0f, 2.16f, 0.52f, 2.76f, 1.33f)
                curveToRelative(0.59f, -0.83f, 1.59f, -1.33f, 2.74f, -1.33f)
                curveToRelative(1.79f, 0f, 3.25f, 1.56f, 3.25f, 3.47f)
                curveToRelative(0f, 2.56f, -3.15f, 5.38f, -5.03f, 6.83f)
                curveToRelative(-0.29f, 0.22f, -0.63f, 0.33f, -0.97f, 0.33f)
                reflectiveCurveToRelative(-0.69f, -0.11f, -0.97f, -0.33f)
                curveToRelative(-1.88f, -1.45f, -5.03f, -4.27f, -5.03f, -6.83f)
                close()
                moveTo(13f, 3.47f)
                curveToRelative(0f, 2.27f, 3.55f, 5.2f, 4.64f, 6.04f)
                curveToRelative(0.21f, 0.16f, 0.51f, 0.17f, 0.73f, 0f)
                curveToRelative(1.09f, -0.84f, 4.64f, -3.76f, 4.64f, -6.04f)
                curveToRelative(0f, -1.36f, -1.01f, -2.47f, -2.25f, -2.47f)
                curveToRelative(-1.12f, 0f, -2.02f, 0.66f, -2.25f, 1.63f)
                curveToRelative(-0.1f, 0.45f, -0.87f, 0.45f, -0.97f, 0f)
                curveToRelative(-0.22f, -0.96f, -1.16f, -1.63f, -2.28f, -1.63f)
                curveToRelative(-1.24f, 0f, -2.25f, 1.11f, -2.25f, 2.47f)
                close()
            }
        }.also { _EmailHeart = it}
