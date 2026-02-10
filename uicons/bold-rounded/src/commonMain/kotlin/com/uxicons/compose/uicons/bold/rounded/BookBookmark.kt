package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookBookmark: ImageVector? = null

val Icons.Br.BookBookmark: ImageVector
    get() = _BookBookmark ?: UXIcon(name = "BookBookmark") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.5f, 0f)
            lineTo(6.5f, 0f)
            curveTo(3.46f, 0f, 1f, 2.46f, 1f, 5.5f)
            verticalLineToRelative(14.3f)
            curveToRelative(0.16f, 2.34f, 2.12f, 4.2f, 4.5f, 4.2f)
            horizontalLineToRelative(12f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(23f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(4f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(0.5f)
            lineTo(7f, 15f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.53f, 0f, -1.03f, 0.11f, -1.5f, 0.28f)
            lineTo(4f, 5.5f)
            close()
            moveTo(20f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.97f, -0.04f, -1.97f, -2.96f, 0f, -3f)
            horizontalLineToRelative(14.5f)
            verticalLineToRelative(0.5f)
            close()
            moveTo(20f, 15f)
            lineTo(10f, 15f)
            lineTo(10f, 3f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(7.35f)
            curveToRelative(0f, 0.62f, 0.79f, 0.89f, 1.17f, 0.4f)
            lineToRelative(1.33f, -1.74f)
            lineToRelative(1.33f, 1.74f)
            curveToRelative(0.38f, 0.49f, 1.17f, 0.23f, 1.17f, -0.4f)
            lineTo(18f, 3.05f)
            curveToRelative(1.14f, 0.23f, 2f, 1.24f, 2f, 2.45f)
            lineTo(20f, 15f)
            close()
        }
    }.also { _BookBookmark = it }
