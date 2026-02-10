package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GiftCard: ImageVector? = null

val Icons.Ss.GiftCard: ImageVector
    get() = _GiftCard ?: UXIcon(name = "GiftCard") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 19f)
                verticalLineToRelative(5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                lineTo(24f, 19f)
                close()
                moveTo(24f, 10f)
                verticalLineToRelative(7f)
                lineTo(0f, 17f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(7.62f, 7f)
                curveToRelative(-0.43f, -0.25f, -0.87f, -0.55f, -1.3f, -0.93f)
                curveToRelative(-1.48f, -1.41f, -1.71f, -3.25f, -0.62f, -4.71f)
                curveTo(6.25f, 0.63f, 7.05f, 0.16f, 7.95f, 0.03f)
                curveToRelative(0.9f, -0.13f, 1.79f, 0.1f, 2.52f, 0.65f)
                curveToRelative(0.68f, 0.51f, 1.18f, 1.16f, 1.55f, 1.82f)
                curveToRelative(0.37f, -0.66f, 0.87f, -1.31f, 1.55f, -1.82f)
                curveToRelative(0.73f, -0.55f, 1.62f, -0.78f, 2.52f, -0.65f)
                curveToRelative(0.9f, 0.13f, 1.69f, 0.6f, 2.24f, 1.33f)
                curveToRelative(1.09f, 1.46f, 0.86f, 3.3f, -0.59f, 4.68f)
                curveToRelative(-0.45f, 0.4f, -0.9f, 0.7f, -1.34f, 0.96f)
                horizontalLineToRelative(4.61f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(13f, 6f)
                curveToRelative(0.09f, 0f, 1.79f, -0.02f, 3.38f, -1.43f)
                curveToRelative(0.39f, -0.37f, 0.98f, -1.16f, 0.34f, -2.01f)
                curveToRelative(-0.22f, -0.3f, -0.55f, -0.49f, -0.92f, -0.55f)
                curveToRelative(-0.37f, -0.05f, -0.74f, 0.04f, -1.04f, 0.27f)
                curveToRelative(-1.29f, 0.97f, -1.66f, 2.85f, -1.74f, 3.42f)
                verticalLineToRelative(0.01f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.01f, 0.07f, -0.02f, 0.28f, -0.02f, 0.28f)
                close()
                moveTo(7.68f, 4.6f)
                curveToRelative(1.56f, 1.38f, 3.26f, 1.4f, 3.31f, 1.4f)
                horizontalLineToRelative(0.02f)
                verticalLineToRelative(-0.33f)
                curveToRelative(-0.09f, -0.6f, -0.46f, -2.44f, -1.73f, -3.39f)
                curveToRelative(-0.3f, -0.22f, -0.67f, -0.31f, -1.04f, -0.27f)
                curveToRelative(-0.37f, 0.05f, -0.7f, 0.25f, -0.92f, 0.55f)
                curveToRelative(-0.64f, 0.85f, -0.04f, 1.64f, 0.37f, 2.04f)
                close()
                moveTo(18.0f, 11f)
                curveToRelative(-0.05f, 0f, -5.0f, -0.05f, -5.0f, -3f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 2.95f, -4.95f, 3f, -5.0f, 3f)
                verticalLineToRelative(2f)
                curveToRelative(1.72f, 0f, 4.52f, -0.53f, 6.0f, -2.25f)
                curveToRelative(1.48f, 1.72f, 4.28f, 2.25f, 6f, 2.25f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _GiftCard = it}
