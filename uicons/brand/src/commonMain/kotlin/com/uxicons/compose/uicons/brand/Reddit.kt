package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Reddit: ImageVector? = null

val Icons.Brand.Reddit: ImageVector
    get() = _Reddit ?: UXIcon(name = "Reddit") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.25f, 14.5f)
            curveTo(8.56f, 14.5f, 8f, 13.94f, 8f, 13.25f)
            curveTo(8f, 12.56f, 8.56f, 12f, 9.25f, 12f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            curveTo(10.5f, 13.94f, 9.94f, 14.5f, 9.25f, 14.5f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.97f, 16.09f)
            curveToRelative(0.13f, 0.13f, 0.13f, 0.33f, 0f, 0.46f)
            curveToRelative(-0.85f, 0.85f, -2.49f, 0.92f, -2.97f, 0.92f)
            curveToRelative(-0.48f, 0f, -2.12f, -0.07f, -2.97f, -0.92f)
            curveToRelative(-0.13f, -0.13f, -0.13f, -0.33f, 0f, -0.46f)
            curveToRelative(0.13f, -0.13f, 0.33f, -0.13f, 0.46f, 0f)
            curveToRelative(0.54f, 0.54f, 1.69f, 0.73f, 2.51f, 0.73f)
            curveToRelative(0.82f, 0f, 1.97f, -0.19f, 2.51f, -0.73f)
            curveTo(14.64f, 15.97f, 14.84f, 15.97f, 14.97f, 16.09f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 13.25f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            curveTo(15.44f, 12f, 16f, 12.56f, 16f, 13.25f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            curveTo(5.37f, 0f, 0f, 5.37f, 0f, 12f)
            reflectiveCurveToRelative(5.37f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.37f, 12f, -12f)
            reflectiveCurveTo(18.63f, 0f, 12f, 0f)
            close()
            moveTo(18.96f, 13.6f)
            curveToRelative(0.03f, 0.17f, 0.04f, 0.35f, 0.04f, 0.53f)
            curveToRelative(0f, 2.69f, -3.13f, 4.88f, -7f, 4.88f)
            curveToRelative(-3.87f, 0f, -7f, -2.18f, -7f, -4.88f)
            curveToRelative(0f, -0.18f, 0.01f, -0.35f, 0.04f, -0.53f)
            curveTo(4.43f, 13.32f, 4.01f, 12.71f, 4.01f, 12f)
            curveToRelative(0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
            curveToRelative(0.47f, 0f, 0.9f, 0.19f, 1.21f, 0.49f)
            curveToRelative(1.21f, -0.87f, 2.89f, -1.43f, 4.75f, -1.48f)
            lineToRelative(0.89f, -4.18f)
            curveToRelative(0.02f, -0.08f, 0.07f, -0.15f, 0.14f, -0.2f)
            curveToRelative(0.07f, -0.04f, 0.15f, -0.06f, 0.23f, -0.04f)
            lineToRelative(2.91f, 0.62f)
            curveTo(16.09f, 5.04f, 16.51f, 4.75f, 17f, 4.75f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveTo(17.69f, 7.25f, 17f, 7.25f)
            curveToRelative(-0.67f, 0f, -1.21f, -0.53f, -1.24f, -1.19f)
            lineToRelative(-2.6f, -0.55f)
            lineToRelative(-0.8f, 3.75f)
            curveToRelative(1.84f, 0.06f, 3.48f, 0.62f, 4.68f, 1.49f)
            curveToRelative(0.32f, -0.3f, 0.74f, -0.49f, 1.21f, -0.49f)
            curveToRelative(0.97f, 0f, 1.75f, 0.78f, 1.75f, 1.75f)
            curveTo(20.0f, 12.71f, 19.57f, 13.33f, 18.96f, 13.6f)
            close()
        }
    }.also { _Reddit = it }
