package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Undo: ImageVector? = null

val Icons.Br.Undo: ImageVector
    get() = _Undo ?: UXIcon(name = "Undo", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(448f, 468.24f)
            curveToRelative(0f, -53.02f, -42.98f, -96f, -96f, -96f)
            horizontalLineTo(231.08f)
            verticalLineToRelative(35.84f)
            curveToRelative(-0.05f, 26.08f, -21.24f, 47.19f, -47.32f, 47.14f)
            curveToRelative(-13.05f, -0.03f, -25.52f, -5.45f, -34.43f, -14.99f)
            lineTo(16.6f, 297.41f)
            curveToRelative(-22.12f, -24.02f, -22.12f, -60.99f, 0f, -85.01f)
            lineTo(149.33f, 69.57f)
            curveToRelative(17.74f, -19.12f, 47.63f, -20.24f, 66.75f, -2.5f)
            curveToRelative(9.64f, 8.94f, 15.11f, 21.5f, 15.11f, 34.65f)
            verticalLineToRelative(35.86f)
            horizontalLineToRelative(78.14f)
            curveTo(421.21f, 137.71f, 511.87f, 228.37f, 512f, 340.24f)
            verticalLineToRelative(128f)
            curveToRelative(0f, 17.67f, -14.33f, 32f, -32f, 32f)
            reflectiveCurveTo(448f, 485.92f, 448f, 468.24f)
            close()
            moveTo(448f, 340.24f)
            lineTo(448f, 340.24f)
            curveToRelative(-0.09f, -76.54f, -62.12f, -138.57f, -138.67f, -138.67f)
            horizontalLineTo(199.08f)
            curveToRelative(-17.67f, 0f, -32f, -14.33f, -32f, -32f)
            verticalLineToRelative(-25.6f)
            lineTo(63.51f, 253.87f)
            lineToRelative(103.57f, 111.53f)
            verticalLineToRelative(-25.15f)
            curveToRelative(0f, -17.67f, 14.33f, -32f, 32f, -32f)
            horizontalLineTo(352f)
            curveToRelative(34.64f, -0.04f, 68.34f, 11.21f, 96f, 32.06f)
            verticalLineTo(340.24f)
            close()
        }
    }.also { _Undo = it }
