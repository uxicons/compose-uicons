package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Harp: ImageVector? = null

val Icons.Br.Harp: ImageVector
    get() = _Harp ?: UXIcon(name = "Harp") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 6.5f)
            curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
            curveToRelative(-1.17f, 0f, -2.21f, 0.56f, -3.21f, 1.11f)
            curveToRelative(-0.8f, 0.44f, -1.62f, 0.89f, -2.29f, 0.89f)
            curveToRelative(-1.33f, 0f, -2.12f, -0.61f, -3.21f, -1.45f)
            curveToRelative(-1.48f, -1.14f, -3.31f, -2.55f, -6.79f, -2.55f)
            horizontalLineToRelative(-2.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(18f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(10f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            curveToRelative(0f, -0.64f, -0.4f, -1.18f, -0.96f, -1.4f)
            curveToRelative(7.79f, -6.69f, 11.96f, -12.36f, 11.96f, -14.6f)
            close()
            moveTo(19.5f, 5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.45f)
            curveToRelative(-0.09f, 0.61f, -1.28f, 2.66f, -4.0f, 5.7f)
            verticalLineToRelative(-6.01f)
            curveToRelative(0.74f, -0.36f, 1.89f, -1.11f, 2.5f, -1.13f)
            close()
            moveTo(11f, 6.29f)
            verticalLineToRelative(11.74f)
            curveToRelative(-0.64f, 0.56f, -1.29f, 1.13f, -2f, 1.72f)
            verticalLineToRelative(-14.79f)
            curveToRelative(0.6f, 0.46f, 1.24f, 0.95f, 2f, 1.33f)
            close()
            moveTo(5f, 3.06f)
            curveToRelative(0.79f, 0.09f, 1.44f, 0.29f, 2f, 0.57f)
            verticalLineToRelative(17.37f)
            horizontalLineToRelative(-2f)
            close()
            moveTo(13f, 16.21f)
            verticalLineToRelative(-9.29f)
            curveToRelative(0.63f, 0.1f, 1.37f, 0.12f, 2f, -0.03f)
            verticalLineToRelative(7.38f)
            curveToRelative(-0.61f, 0.62f, -1.28f, 1.27f, -2f, 1.95f)
            close()
        }
    }.also { _Harp = it }
