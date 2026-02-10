package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DraftingCompassPaper: ImageVector? = null

val Icons.Sr.DraftingCompassPaper: ImageVector
    get() = _DraftingCompassPaper ?: UXIcon(name = "DraftingCompassPaper") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.73f, 7.97f)
                lineToRelative(-1.86f, 4.03f)
                horizontalLineToRelative(4.26f)
                lineToRelative(-1.86f, -4.03f)
                curveToRelative(1.53f, -0.14f, 2.73f, -1.41f, 2.73f, -2.97f)
                curveToRelative(0f, -1.3f, -0.84f, -2.4f, -2f, -2.82f)
                verticalLineToRelative(-1.18f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.18f)
                curveToRelative(-1.16f, 0.41f, -2f, 1.51f, -2f, 2.82f)
                curveToRelative(0f, 1.56f, 1.2f, 2.83f, 2.73f, 2.97f)
                close()
                moveTo(12f, 4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, 1.65f, -0.81f, 3.1f, -2.05f, 4.01f)
                lineToRelative(1.38f, 2.98f)
                horizontalLineToRelative(1.67f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-0.74f)
                lineToRelative(1.65f, 3.58f)
                curveToRelative(0.23f, 0.5f, 0.01f, 1.09f, -0.49f, 1.33f)
                curveToRelative(-0.49f, 0.23f, -1.09f, 0.02f, -1.33f, -0.49f)
                lineToRelative(-2.04f, -4.42f)
                horizontalLineToRelative(-6.1f)
                lineToRelative(-2.04f, 4.42f)
                curveToRelative(-0.23f, 0.51f, -0.84f, 0.72f, -1.33f, 0.49f)
                curveToRelative(-0.5f, -0.23f, -0.72f, -0.82f, -0.49f, -1.33f)
                lineToRelative(1.65f, -3.58f)
                horizontalLineToRelative(-0.74f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1.67f)
                lineToRelative(1.38f, -2.98f)
                curveToRelative(-1.24f, -0.91f, -2.05f, -2.36f, -2.05f, -4.01f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _DraftingCompassPaper = it}
