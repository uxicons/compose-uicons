package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageHeart: ImageVector? = null

val Icons.Tr.MessageHeart: ImageVector
    get() = _MessageHeart ?: UXIcon(name = "MessageHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(3.6f)
                lineToRelative(3.9f, 3.28f)
                curveToRelative(0.28f, 0.25f, 0.65f, 0.38f, 1.0f, 0.38f)
                curveToRelative(0.35f, 0f, 0.7f, -0.12f, 0.98f, -0.37f)
                lineToRelative(3.98f, -3.29f)
                horizontalLineToRelative(3.53f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(24.0f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(23f, 16.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-3.71f)
                curveToRelative(-0.12f, 0f, -0.23f, 0.04f, -0.32f, 0.11f)
                lineToRelative(-4.14f, 3.42f)
                curveToRelative(-0.19f, 0.17f, -0.47f, 0.17f, -0.67f, -0.01f)
                lineToRelative(-4.05f, -3.41f)
                curveToRelative(-0.09f, -0.07f, -0.2f, -0.12f, -0.32f, -0.12f)
                horizontalLineToRelative(-3.79f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(1f, 3.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(17f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(13f)
                close()
                moveTo(14.75f, 5f)
                curveToRelative(-1.2f, 0f, -2.19f, 0.55f, -2.75f, 1.43f)
                curveToRelative(-0.56f, -0.88f, -1.55f, -1.43f, -2.75f, -1.43f)
                curveToRelative(-1.79f, 0f, -3.25f, 1.57f, -3.25f, 3.5f)
                curveToRelative(0f, 3.36f, 5.48f, 7.25f, 5.71f, 7.41f)
                curveToRelative(0.09f, 0.06f, 0.19f, 0.09f, 0.29f, 0.09f)
                reflectiveCurveToRelative(0.2f, -0.03f, 0.29f, -0.09f)
                curveToRelative(0.23f, -0.16f, 5.71f, -4.05f, 5.71f, -7.41f)
                curveToRelative(0f, -1.93f, -1.46f, -3.5f, -3.25f, -3.5f)
                close()
                moveTo(12f, 14.88f)
                curveToRelative(-1.63f, -1.2f, -5f, -4.16f, -5f, -6.38f)
                curveToRelative(0f, -1.38f, 1.01f, -2.5f, 2.25f, -2.5f)
                curveToRelative(1.32f, 0f, 2.25f, 0.92f, 2.25f, 2.23f)
                verticalLineToRelative(0.27f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-0.27f)
                curveToRelative(0f, -1.31f, 0.93f, -2.23f, 2.25f, -2.23f)
                curveToRelative(1.24f, 0f, 2.25f, 1.12f, 2.25f, 2.5f)
                curveToRelative(0f, 2.22f, -3.37f, 5.18f, -5f, 6.38f)
                close()
            }
        }.also { _MessageHeart = it}
