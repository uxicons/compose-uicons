package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShopSlash: ImageVector? = null

val Icons.Ss.ShopSlash: ImageVector
    get() = _ShopSlash ?: UXIcon(name = "ShopSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.76f, 16f)
                lineToRelative(3.24f, 3.24f)
                verticalLineToRelative(0.76f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(5f, 23f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(2f, 11.62f)
                curveToRelative(-0.61f, -0.7f, -1f, -1.61f, -1f, -2.62f)
                verticalLineToRelative(-1.16f)
                lineToRelative(0.65f, -1.95f)
                lineToRelative(6.48f, 6.48f)
                curveToRelative(-0.62f, 0.39f, -1.35f, 0.63f, -2.13f, 0.63f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.35f, 0f, -0.68f, -0.06f, -1f, -0.14f)
                verticalLineToRelative(3.14f)
                horizontalLineToRelative(7.76f)
                close()
                moveTo(23.96f, 22.54f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                lineToRelative(1.6f, 1.6f)
                lineToRelative(0.18f, -0.65f)
                horizontalLineToRelative(3.75f)
                lineTo(6.99f, 5f)
                horizontalLineToRelative(2f)
                lineTo(8.99f, 1f)
                horizontalLineToRelative(6f)
                lineTo(14.99f, 5f)
                horizontalLineToRelative(2f)
                lineTo(16.99f, 1f)
                horizontalLineToRelative(3.72f)
                lineToRelative(2.28f, 6.84f)
                verticalLineToRelative(1.16f)
                curveToRelative(0f, 1.01f, -0.39f, 1.91f, -1f, 2.62f)
                verticalLineToRelative(8.97f)
                lineToRelative(1.96f, 1.96f)
                close()
                moveTo(20f, 12.86f)
                curveToRelative(-0.32f, 0.08f, -0.65f, 0.14f, -1f, 0.14f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.2f, 0f, -2.27f, -0.54f, -3f, -1.38f)
                curveToRelative(-0.31f, 0.35f, -0.68f, 0.65f, -1.09f, 0.88f)
                lineToRelative(6.09f, 6.09f)
                verticalLineToRelative(-5.73f)
                close()
            }
        }.also { _ShopSlash = it}
