package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DraftingCompassPaper: ImageVector? = null

val Icons.Ss.DraftingCompassPaper: ImageVector
    get() = _DraftingCompassPaper ?: UXIcon(name = "DraftingCompassPaper") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 8f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.3f, -0.84f, -2.4f, -2f, -2.82f)
                verticalLineToRelative(-2.18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.18f)
                curveToRelative(-1.16f, 0.41f, -2f, 1.51f, -2f, 2.82f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                close()
                moveTo(12f, 4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(13.14f, 9.86f)
                lineTo(14.13f, 12f)
                horizontalLineToRelative(-4.26f)
                lineToRelative(0.99f, -2.14f)
                curveToRelative(0.37f, 0.09f, 0.75f, 0.14f, 1.14f, 0.14f)
                reflectiveCurveToRelative(0.77f, -0.06f, 1.14f, -0.14f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(17f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-16f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-17f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, 1.65f, 0.81f, 3.1f, 2.05f, 4.01f)
                lineToRelative(-1.38f, 2.98f)
                horizontalLineToRelative(-2.67f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.75f)
                lineToRelative(-1.65f, 3.58f)
                lineToRelative(1.82f, 0.84f)
                lineToRelative(2.04f, -4.42f)
                horizontalLineToRelative(6.1f)
                lineToRelative(2.04f, 4.42f)
                lineToRelative(1.82f, -0.84f)
                lineToRelative(-1.65f, -3.58f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.67f)
                lineToRelative(-1.38f, -2.98f)
                curveToRelative(1.24f, -0.91f, 2.05f, -2.36f, 2.05f, -4.01f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                close()
            }
        }.also { _DraftingCompassPaper = it}
