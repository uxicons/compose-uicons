package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookBookmark: ImageVector? = null

val Icons.Rr.BookBookmark: ImageVector
    get() = _BookBookmark ?: UXIcon(name = "BookBookmark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 0f)
                lineTo(7f, 0f)
                curveTo(4.24f, 0f, 2f, 2.24f, 2f, 5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(11f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(22f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(20f, 5f)
                verticalLineToRelative(11f)
                lineTo(8f, 16f)
                lineTo(8f, 2f)
                horizontalLineToRelative(4f)
                lineTo(12f, 10.35f)
                curveToRelative(0f, 0.62f, 0.79f, 0.89f, 1.17f, 0.4f)
                lineToRelative(1.33f, -1.74f)
                lineToRelative(1.33f, 1.74f)
                curveToRelative(0.38f, 0.49f, 1.17f, 0.23f, 1.17f, -0.4f)
                lineTo(17f, 2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(6f, 2.18f)
                verticalLineToRelative(13.82f)
                curveToRelative(-0.73f, 0f, -1.41f, 0.21f, -2f, 0.56f)
                lineTo(4f, 5f)
                curveToRelative(0f, -1.3f, 0.84f, -2.4f, 2f, -2.82f)
                close()
                moveTo(17f, 22f)
                lineTo(6f, 22f)
                curveToRelative(-2.63f, -0.05f, -2.63f, -3.95f, 0f, -4f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
            }
        }.also { _BookBookmark = it}
