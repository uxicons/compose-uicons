package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UsdCircle: ImageVector? = null

val Icons.Br.UsdCircle: ImageVector
    get() = _UsdCircle ?: UXIcon(name = "UsdCircle") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
            curveToRelative(0.6f, 15.9f, 23.4f, 15.89f, 24f, 0f)
            curveToRelative(0f, -6.62f, -5.38f, -12f, -12f, -12f)
            close()
            moveTo(12f, 21f)
            curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
            curveToRelative(0.45f, -11.92f, 17.55f, -11.92f, 18f, 0f)
            curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
            close()
            moveTo(16f, 14.41f)
            curveToRelative(0f, 1.6f, -1.05f, 2.96f, -2.5f, 3.42f)
            verticalLineToRelative(0.67f)
            curveToRelative(-0.03f, 1.97f, -2.97f, 1.97f, -3f, 0f)
            verticalLineToRelative(-0.58f)
            curveToRelative(-0.95f, -0.21f, -1.8f, -0.81f, -2.3f, -1.67f)
            curveToRelative(-0.41f, -0.72f, -0.17f, -1.64f, 0.55f, -2.05f)
            curveToRelative(0.72f, -0.41f, 1.63f, -0.17f, 2.05f, 0.55f)
            curveToRelative(0.09f, 0.16f, 0.25f, 0.25f, 0.43f, 0.25f)
            horizontalLineToRelative(1.18f)
            curveToRelative(0.63f, 0.02f, 0.81f, -0.92f, 0.22f, -1.13f)
            lineToRelative(-2.38f, -0.95f)
            curveToRelative(-3.11f, -1.16f, -2.88f, -5.84f, 0.24f, -6.75f)
            verticalLineToRelative(-0.67f)
            curveToRelative(0.03f, -1.97f, 2.97f, -1.97f, 3f, 0f)
            verticalLineToRelative(0.58f)
            curveToRelative(0.95f, 0.21f, 1.8f, 0.81f, 2.3f, 1.67f)
            curveToRelative(0.41f, 0.72f, 0.17f, 1.64f, -0.55f, 2.05f)
            curveToRelative(-0.72f, 0.41f, -1.64f, 0.17f, -2.05f, -0.55f)
            curveToRelative(-0.09f, -0.16f, -0.25f, -0.25f, -0.43f, -0.25f)
            horizontalLineToRelative(-1.18f)
            curveToRelative(-0.63f, -0.02f, -0.81f, 0.92f, -0.22f, 1.13f)
            lineToRelative(2.38f, 0.95f)
            curveToRelative(1.37f, 0.55f, 2.25f, 1.85f, 2.25f, 3.33f)
            close()
        }
    }.also { _UsdCircle = it }
