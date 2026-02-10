package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarRatingCall: ImageVector? = null

val Icons.Sr.StarRatingCall: ImageVector
    get() = _StarRatingCall ?: UXIcon(name = "StarRatingCall") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.29f, 9.7f)
                curveToRelative(-0.18f, 0f, -0.35f, -0.06f, -0.5f, -0.17f)
                curveToRelative(-0.28f, -0.21f, -0.4f, -0.58f, -0.29f, -0.92f)
                lineToRelative(0.78f, -2.51f)
                lineToRelative(-1.98f, -1.61f)
                curveToRelative(-0.27f, -0.23f, -0.36f, -0.59f, -0.24f, -0.92f)
                curveToRelative(0.12f, -0.33f, 0.43f, -0.55f, 0.78f, -0.55f)
                horizontalLineToRelative(2.5f)
                lineToRelative(0.89f, -2.48f)
                curveToRelative(0.12f, -0.33f, 0.43f, -0.54f, 0.78f, -0.54f)
                reflectiveCurveToRelative(0.66f, 0.22f, 0.78f, 0.54f)
                lineToRelative(0.89f, 2.48f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.35f, 0f, 0.66f, 0.22f, 0.78f, 0.55f)
                reflectiveCurveToRelative(0.02f, 0.7f, -0.25f, 0.92f)
                lineToRelative(-1.97f, 1.61f)
                lineToRelative(0.81f, 2.48f)
                curveToRelative(0.11f, 0.34f, -0.0f, 0.71f, -0.28f, 0.92f)
                curveToRelative(-0.28f, 0.22f, -0.67f, 0.23f, -0.96f, 0.04f)
                lineToRelative(-2.29f, -1.5f)
                lineToRelative(-2.26f, 1.51f)
                curveToRelative(-0.14f, 0.09f, -0.3f, 0.14f, -0.46f, 0.14f)
                close()
                moveTo(20.66f, 14.86f)
                curveToRelative(-1.19f, -1.14f, -3.09f, -1.14f, -4.28f, 0.01f)
                lineToRelative(-1.91f, 1.61f)
                curveToRelative(-3.2f, -1.36f, -5.47f, -3.64f, -6.93f, -6.95f)
                lineToRelative(1.6f, -1.9f)
                curveToRelative(0.56f, -0.58f, 0.86f, -1.34f, 0.86f, -2.15f)
                reflectiveCurveToRelative(-0.3f, -1.56f, -0.86f, -2.14f)
                curveToRelative(0f, 0f, -1.85f, -2.41f, -1.88f, -2.44f)
                curveToRelative(-1.21f, -1.21f, -3.17f, -1.21f, -4.33f, -0.05f)
                lineToRelative(-1.15f, 1.0f)
                curveTo(0.64f, 3.01f, 0.0f, 4.57f, 0.0f, 6.24f)
                curveTo(0.0f, 13.87f, 10.13f, 24f, 17.76f, 24f)
                curveToRelative(1.67f, 0f, 3.23f, -0.63f, 4.42f, -1.83f)
                lineToRelative(0.91f, -1.05f)
                curveToRelative(1.21f, -1.21f, 1.21f, -3.17f, 0f, -4.38f)
                curveToRelative(-0.03f, -0.03f, -2.44f, -1.88f, -2.44f, -1.88f)
                close()
            }
        }.also { _StarRatingCall = it}
