package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Home: ImageVector? = null

val Icons.Br.Home: ImageVector
    get() = _Home ?: UXIcon(name = "Home", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(490.13f, 185.47f)
            lineTo(338.97f, 34.3f)
            curveToRelative(-45.85f, -45.74f, -120.08f, -45.74f, -165.93f, 0f)
            lineTo(21.87f, 185.47f)
            curveTo(7.82f, 199.45f, -0.05f, 218.46f, 0f, 238.27f)
            verticalLineToRelative(221.4f)
            curveTo(0.05f, 488.57f, 23.48f, 511.98f, 52.37f, 512f)
            horizontalLineToRelative(407.25f)
            curveToRelative(28.9f, -0.02f, 52.33f, -23.43f, 52.37f, -52.33f)
            verticalLineTo(238.27f)
            curveTo(512.06f, 218.46f, 504.18f, 199.45f, 490.13f, 185.47f)
            close()
            moveTo(448f, 448f)
            horizontalLineTo(341.33f)
            verticalLineToRelative(-67.88f)
            curveToRelative(0f, -44.98f, -36.47f, -81.45f, -81.45f, -81.45f)
            curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
            horizontalLineToRelative(-7.76f)
            curveToRelative(-44.98f, 0f, -81.45f, 36.47f, -81.45f, 81.45f)
            lineToRelative(0f, 0f)
            verticalLineTo(448f)
            horizontalLineTo(64f)
            verticalLineTo(238.27f)
            curveToRelative(0.01f, -2.83f, 1.13f, -5.54f, 3.12f, -7.55f)
            lineTo(218.28f, 79.55f)
            curveToRelative(20.83f, -20.83f, 54.59f, -20.83f, 75.43f, -0.01f)
            curveToRelative(0f, 0f, 0.01f, 0.01f, 0.01f, 0.01f)
            lineTo(444.89f, 230.72f)
            curveToRelative(1.99f, 2.01f, 3.11f, 4.72f, 3.12f, 7.55f)
            verticalLineTo(448f)
            close()
        }
    }.also { _Home = it }
