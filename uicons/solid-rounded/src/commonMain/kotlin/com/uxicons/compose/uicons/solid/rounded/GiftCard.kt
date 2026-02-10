package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GiftCard: ImageVector? = null

val Icons.Sr.GiftCard: ImageVector
    get() = _GiftCard ?: UXIcon(name = "GiftCard") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 19f)
                lineTo(24f, 19f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                close()
                moveTo(24f, 11f)
                verticalLineToRelative(6f)
                lineTo(0f, 17f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(1.25f)
                curveToRelative(-1.42f, -1.4f, -1.62f, -3.2f, -0.55f, -4.64f)
                curveTo(6.25f, 0.63f, 7.05f, 0.16f, 7.95f, 0.03f)
                curveToRelative(0.9f, -0.13f, 1.79f, 0.1f, 2.52f, 0.65f)
                curveToRelative(0.68f, 0.51f, 1.18f, 1.15f, 1.55f, 1.81f)
                curveToRelative(0.37f, -0.66f, 0.87f, -1.3f, 1.55f, -1.81f)
                curveToRelative(0.73f, -0.55f, 1.62f, -0.78f, 2.52f, -0.65f)
                curveToRelative(0.9f, 0.13f, 1.69f, 0.6f, 2.24f, 1.33f)
                curveToRelative(1.08f, 1.45f, 0.87f, 3.26f, -0.55f, 4.64f)
                horizontalLineToRelative(1.23f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(13.01f, 6f)
                curveToRelative(0.14f, 0f, 1.8f, -0.04f, 3.37f, -1.43f)
                curveToRelative(0.39f, -0.37f, 0.98f, -1.16f, 0.34f, -2.01f)
                curveToRelative(-0.22f, -0.3f, -0.55f, -0.49f, -0.92f, -0.55f)
                curveToRelative(-0.37f, -0.05f, -0.74f, 0.04f, -1.04f, 0.27f)
                curveToRelative(-1.28f, 0.96f, -1.65f, 2.82f, -1.74f, 3.42f)
                lineToRelative(0.0f, 0.02f)
                lineToRelative(-0.02f, 0.28f)
                close()
                moveTo(11.01f, 6f)
                horizontalLineToRelative(0.01f)
                reflectiveCurveToRelative(-0.02f, -0.29f, -0.01f, -0.3f)
                curveToRelative(-0.09f, -0.59f, -0.46f, -2.46f, -1.74f, -3.42f)
                curveToRelative(-0.24f, -0.18f, -0.54f, -0.28f, -0.84f, -0.28f)
                curveToRelative(-0.47f, 0f, -0.9f, 0.26f, -1.12f, 0.56f)
                curveToRelative(-0.64f, 0.85f, -0.04f, 1.64f, 0.37f, 2.04f)
                curveToRelative(1.53f, 1.36f, 3.19f, 1.4f, 3.33f, 1.4f)
                close()
                moveTo(18f, 12f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                curveToRelative(-0.16f, 0f, -4f, -0.03f, -4f, -3f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 2.94f, -3.82f, 3.0f, -4.0f, 3f)
                curveToRelative(-0.55f, 0f, -1.0f, 0.45f, -1.0f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                curveToRelative(1.42f, 0f, 3.7f, -0.49f, 5f, -2.06f)
                curveToRelative(1.3f, 1.57f, 3.58f, 2.06f, 5f, 2.06f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _GiftCard = it}
