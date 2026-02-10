package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PickingBox: ImageVector? = null

val Icons.Br.PickingBox: ImageVector
    get() = _PickingBox ?: UXIcon(name = "PickingBox") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 7.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-2.01f)
            curveToRelative(-0.6f, 0f, -1.18f, 0.22f, -1.64f, 0.61f)
            lineToRelative(-2.92f, 2.54f)
            curveToRelative(-1.19f, 1.44f, -2.67f, 2.42f, -2.91f, 2.57f)
            curveToRelative(-0.32f, 0.19f, -0.68f, 0.28f, -1.02f, 0.28f)
            curveToRelative(-0.73f, 0f, -1.44f, -0.4f, -1.8f, -1.12f)
            curveToRelative(-0.47f, -0.95f, -0.04f, -2.11f, 0.87f, -2.66f)
            curveToRelative(0.8f, -0.48f, 1.45f, -0.85f, 1.93f, -1.72f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-5.38f)
            lineToRelative(-2.44f, 2.44f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            curveToRelative(-0.42f, 0f, -0.84f, -0.18f, -1.15f, -0.53f)
            curveToRelative(-0.52f, -0.61f, -0.4f, -1.54f, 0.16f, -2.1f)
            lineToRelative(4.09f, -4.09f)
            lineToRelative(-2.75f, 0.69f)
            verticalLineToRelative(-0.0f)
            curveToRelative(-0.12f, 0.03f, -0.24f, 0.05f, -0.36f, 0.05f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            curveToRelative(0f, -0.67f, 0.44f, -1.23f, 1.04f, -1.42f)
            curveToRelative(0.03f, -0.01f, 7.18f, -1.77f, 7.18f, -1.77f)
            curveToRelative(0.85f, -0.21f, 1.73f, -0.31f, 2.61f, -0.31f)
            horizontalLineToRelative(9.68f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-10f)
            curveToRelative(-1.3f, 0f, -2.36f, 1f, -2.48f, 2.27f)
            curveToRelative(0.37f, -0.13f, 0.77f, -0.21f, 1.17f, -0.24f)
            curveToRelative(0.1f, -0.02f, 0.2f, -0.03f, 0.3f, -0.03f)
            reflectiveCurveToRelative(0.2f, 0.01f, 0.3f, 0.03f)
            curveToRelative(1.92f, 0.13f, 3.5f, 1.46f, 4.01f, 3.25f)
            lineToRelative(1.08f, -0.94f)
            curveToRelative(1f, -0.87f, 2.28f, -1.35f, 3.6f, -1.35f)
            horizontalLineToRelative(2.01f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(15f, 18f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            horizontalLineToRelative(-5f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            horizontalLineToRelative(5f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            close()
            moveTo(12f, 19f)
            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
            reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
            horizontalLineToRelative(1f)
            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
            close()
        }
    }.also { _PickingBox = it }
