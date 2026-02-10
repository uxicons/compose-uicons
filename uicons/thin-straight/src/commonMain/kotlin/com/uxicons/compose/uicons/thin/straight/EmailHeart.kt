package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmailHeart: ImageVector? = null

val Icons.Ts.EmailHeart: ImageVector
    get() = _EmailHeart ?: UXIcon(name = "EmailHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 9.39f)
                curveToRelative(0.34f, -0.35f, 0.68f, -0.72f, 1f, -1.11f)
                verticalLineToRelative(15.72f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-17.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7.54f)
                curveToRelative(0.03f, 0.34f, 0.08f, 0.67f, 0.17f, 1f)
                horizontalLineToRelative(-7.71f)
                curveToRelative(-0.53f, 0f, -1f, 0.28f, -1.27f, 0.7f)
                lineToRelative(8.27f, 8.27f)
                curveToRelative(1.32f, 1.32f, 3.63f, 1.32f, 4.95f, 0f)
                reflectiveCurveToRelative(1.85f, -1.89f, 1.85f, -1.89f)
                curveToRelative(0.27f, 0.18f, 0.6f, 0.39f, 0.86f, 0.55f)
                lineToRelative(-2.0f, 2.05f)
                curveToRelative(-0.85f, 0.85f, -1.98f, 1.32f, -3.18f, 1.32f)
                reflectiveCurveToRelative(-2.33f, -0.47f, -3.18f, -1.32f)
                lineToRelative(-7.8f, -7.8f)
                verticalLineToRelative(16.12f)
                horizontalLineToRelative(22f)
                close()
                moveTo(12f, 3.55f)
                curveToRelative(0f, -1.96f, 1.46f, -3.55f, 3.25f, -3.55f)
                curveToRelative(1.21f, 0f, 2.19f, 0.66f, 2.75f, 1.75f)
                curveToRelative(0.56f, -1.08f, 1.54f, -1.75f, 2.75f, -1.75f)
                curveToRelative(1.79f, 0f, 3.25f, 1.59f, 3.25f, 3.55f)
                curveToRelative(-0.13f, 3.65f, -5.55f, 6.94f, -6f, 7.24f)
                curveToRelative(-0.45f, -0.3f, -5.87f, -3.59f, -6f, -7.24f)
                close()
                moveTo(13f, 3.55f)
                curveToRelative(0f, 2.26f, 3.39f, 4.98f, 5f, 6.06f)
                curveToRelative(1.61f, -1.07f, 5f, -3.8f, 5f, -6.06f)
                curveToRelative(0f, -1.41f, -1.01f, -2.55f, -2.25f, -2.55f)
                curveToRelative(-1.35f, 0f, -2.25f, 1.21f, -2.25f, 3f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -1.79f, -0.9f, -3f, -2.25f, -3f)
                curveToRelative(-1.24f, 0f, -2.25f, 1.14f, -2.25f, 2.55f)
                close()
            }
        }.also { _EmailHeart = it}
