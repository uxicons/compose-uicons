package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StoreAlt: ImageVector? = null

val Icons.Sr.StoreAlt: ImageVector
    get() = _StoreAlt ?: UXIcon(name = "StoreAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.96f, 7.72f)
                lineToRelative(-1.17f, -4.1f)
                curveToRelative(-0.61f, -2.13f, -2.59f, -3.63f, -4.81f, -3.63f)
                horizontalLineToRelative(-0.98f)
                lineTo(17f, 4f)
                curveToRelative(-0.01f, 1.31f, -2.0f, 1.31f, -2f, 0f)
                lineTo(15f, 0f)
                horizontalLineToRelative(-6f)
                lineTo(9f, 4f)
                curveToRelative(-0.01f, 1.31f, -1.99f, 1.31f, -2f, 0f)
                lineTo(7f, 0f)
                horizontalLineToRelative(-0.98f)
                curveTo(3.8f, 0f, 1.82f, 1.49f, 1.21f, 3.63f)
                lineTo(0.04f, 7.72f)
                curveToRelative(-0.16f, 1.07f, 0.31f, 2.14f, 0.96f, 2.89f)
                verticalLineToRelative(9.38f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(6f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                lineTo(15f, 11.44f)
                curveToRelative(0.38f, -0.22f, 0.71f, -0.5f, 1f, -0.83f)
                curveToRelative(0.73f, 0.84f, 1.8f, 1.38f, 3f, 1.38f)
                horizontalLineToRelative(1f)
                curveToRelative(0.35f, 0f, 0.68f, -0.06f, 1f, -0.14f)
                verticalLineToRelative(11.14f)
                curveToRelative(0.01f, 1.31f, 2.0f, 1.31f, 2f, 0f)
                lineTo(23f, 10.62f)
                curveToRelative(0.65f, -0.75f, 1.12f, -1.83f, 0.96f, -2.89f)
                close()
                moveTo(13f, 17f)
                lineTo(3f, 17f)
                verticalLineToRelative(-5.14f)
                curveToRelative(0.32f, 0.08f, 0.65f, 0.14f, 1f, 0.14f)
                horizontalLineToRelative(1f)
                curveToRelative(1.2f, 0f, 2.27f, -0.54f, 3f, -1.38f)
                curveToRelative(0.73f, 0.84f, 1.8f, 1.38f, 3f, 1.38f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                close()
            }
        }.also { _StoreAlt = it}
