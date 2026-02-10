package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DraftingCompassPaper: ImageVector? = null

val Icons.Br.DraftingCompassPaper: ImageVector
    get() = _DraftingCompassPaper ?: UXIcon(name = "DraftingCompassPaper") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(7.75f, 11f)
            horizontalLineToRelative(-1.25f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            curveToRelative(0f, 0.81f, 0.65f, 1.47f, 1.45f, 1.5f)
            lineToRelative(-0.83f, 1.91f)
            curveToRelative(-0.33f, 0.76f, 0.02f, 1.64f, 0.78f, 1.97f)
            curveToRelative(0.76f, 0.33f, 1.64f, -0.02f, 1.97f, -0.78f)
            lineToRelative(1.35f, -3.1f)
            horizontalLineToRelative(4.55f)
            lineToRelative(1.35f, 3.1f)
            curveToRelative(0.33f, 0.77f, 1.23f, 1.11f, 1.97f, 0.78f)
            curveToRelative(0.76f, -0.33f, 1.11f, -1.21f, 0.78f, -1.97f)
            lineToRelative(-0.83f, -1.91f)
            curveToRelative(0.81f, -0.03f, 1.45f, -0.68f, 1.45f, -1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-1.25f)
            lineToRelative(-1.98f, -4.55f)
            curveToRelative(0.45f, -0.53f, 0.73f, -1.2f, 0.73f, -1.95f)
            curveToRelative(0f, -1.11f, -0.61f, -2.06f, -1.5f, -2.58f)
            verticalLineToRelative(-0.42f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.42f)
            curveToRelative(-0.89f, 0.52f, -1.5f, 1.48f, -1.5f, 2.58f)
            curveToRelative(0f, 0.75f, 0.28f, 1.42f, 0.73f, 1.95f)
            lineToRelative(-1.98f, 4.55f)
            close()
            moveTo(11.03f, 11f)
            lineTo(12f, 8.76f)
            lineTo(12.97f, 11f)
            close()
            moveTo(24f, 4.5f)
            verticalLineToRelative(15f)
            curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-15f)
            curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
            verticalLineToRelative(-15f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(3.24f)
            lineToRelative(-1.32f, 3f)
            horizontalLineToRelative(-1.92f)
            curveToRelative(-0.53f, 0f, -1.03f, -0.09f, -1.5f, -0.26f)
            verticalLineToRelative(10.76f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(15f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-10.76f)
            curveToRelative(-0.47f, 0.17f, -0.97f, 0.26f, -1.5f, 0.26f)
            horizontalLineToRelative(-1.92f)
            lineToRelative(-1.32f, -3f)
            horizontalLineToRelative(3.24f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _DraftingCompassPaper = it }
