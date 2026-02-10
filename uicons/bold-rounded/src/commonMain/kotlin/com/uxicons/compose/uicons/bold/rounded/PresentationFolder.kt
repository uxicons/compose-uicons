package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PresentationFolder: ImageVector? = null

val Icons.Br.PresentationFolder: ImageVector
    get() = _PresentationFolder ?: UXIcon(name = "PresentationFolder") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-21f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            curveToRelative(0f, 0.65f, 0.42f, 1.2f, 1f, 1.41f)
            verticalLineToRelative(9.59f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(1.51f)
            curveToRelative(-0.6f, 0.46f, -1f, 1.17f, -1f, 1.99f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            curveToRelative(0f, -0.81f, -0.4f, -1.53f, -1f, -1.99f)
            verticalLineToRelative(-1.51f)
            horizontalLineToRelative(4f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-9.59f)
            curveToRelative(0.58f, -0.21f, 1f, -0.76f, 1f, -1.41f)
            close()
            moveTo(17.5f, 15f)
            horizontalLineToRelative(-11f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-9.5f)
            horizontalLineToRelative(16f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            close()
            moveTo(17f, 8f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            horizontalLineToRelative(-6f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            horizontalLineToRelative(1.42f)
            curveToRelative(0.44f, 0f, 0.86f, 0.14f, 1.22f, 0.39f)
            lineToRelative(0.32f, 0.23f)
            curveToRelative(0.35f, 0.25f, 0.78f, 0.39f, 1.22f, 0.39f)
            horizontalLineToRelative(1.83f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            close()
        }
    }.also { _PresentationFolder = it }
