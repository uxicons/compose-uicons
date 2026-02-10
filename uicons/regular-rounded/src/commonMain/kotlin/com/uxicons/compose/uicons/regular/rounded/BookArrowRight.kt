package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookArrowRight: ImageVector? = null

val Icons.Rr.BookArrowRight: ImageVector
    get() = _BookArrowRight ?: UXIcon(name = "BookArrowRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.13f, 12.09f)
                lineToRelative(-1.61f, 1.61f)
                curveToRelative(-0.93f, 0.92f, -2.33f, -0.49f, -1.41f, -1.41f)
                lineToRelative(1.29f, -1.29f)
                lineTo(13f, 11f)
                curveToRelative(-1.31f, -0.01f, -1.31f, -2.0f, 0f, -2f)
                horizontalLineToRelative(8.4f)
                lineToRelative(-1.29f, -1.29f)
                curveToRelative(-0.92f, -0.93f, 0.49f, -2.33f, 1.41f, -1.41f)
                lineToRelative(1.61f, 1.61f)
                curveToRelative(1.15f, 1.15f, 1.15f, 3.03f, 0f, 4.19f)
                close()
                moveTo(20f, 16f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(4f, 24f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                lineTo(0f, 5f)
                curveTo(0f, 2.24f, 2.24f, 0f, 5f, 0f)
                lineTo(15f, 0f)
                curveToRelative(2.28f, 0f, 4.27f, 1.54f, 4.84f, 3.75f)
                curveToRelative(0.14f, 0.54f, -0.18f, 1.08f, -0.72f, 1.22f)
                curveToRelative(-0.53f, 0.14f, -1.08f, -0.18f, -1.22f, -0.72f)
                curveToRelative(-0.34f, -1.32f, -1.53f, -2.25f, -2.9f, -2.25f)
                lineTo(6f, 2.0f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(12f)
                curveToRelative(0.01f, -1.31f, 2.0f, -1.31f, 2f, 0f)
                close()
                moveTo(2f, 5f)
                verticalLineToRelative(11.56f)
                curveToRelative(0.59f, -0.34f, 1.27f, -0.56f, 2f, -0.56f)
                lineTo(4f, 2.18f)
                curveToRelative(-1.16f, 0.41f, -2f, 1.51f, -2f, 2.82f)
                close()
                moveTo(18f, 19f)
                verticalLineToRelative(-1f)
                lineTo(4f, 18f)
                curveToRelative(-2.63f, 0.05f, -2.63f, 3.95f, 0f, 4f)
                lineTo(15f, 22f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                close()
            }
        }.also { _BookArrowRight = it}
