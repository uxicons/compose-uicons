package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DraftingCompassPaper: ImageVector? = null

val Icons.Rs.DraftingCompassPaper: ImageVector
    get() = _DraftingCompassPaper ?: UXIcon(name = "DraftingCompassPaper") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3f)
                verticalLineToRelative(17f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-16f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-17f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, 0.71f, 0.15f, 1.39f, 0.42f, 2f)
                horizontalLineToRelative(-3.42f)
                curveToRelative(-0.73f, 0f, -1.41f, -0.21f, -2f, -0.56f)
                verticalLineToRelative(13.56f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-13.56f)
                curveToRelative(-0.59f, 0.34f, -1.27f, 0.56f, -2f, 0.56f)
                horizontalLineToRelative(-3.42f)
                curveToRelative(0.27f, -0.61f, 0.42f, -1.29f, 0.42f, -2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                close()
                moveTo(9f, 5f)
                curveToRelative(0f, -1.3f, 0.84f, -2.4f, 2f, -2.82f)
                verticalLineToRelative(-2.18f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.18f)
                curveToRelative(1.16f, 0.41f, 2f, 1.51f, 2f, 2.82f)
                curveToRelative(0f, 0.84f, -0.35f, 1.6f, -0.91f, 2.15f)
                lineToRelative(2.24f, 4.86f)
                horizontalLineToRelative(2.67f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1.75f)
                lineToRelative(1.65f, 3.58f)
                lineToRelative(-1.82f, 0.84f)
                lineToRelative(-2.04f, -4.42f)
                horizontalLineToRelative(-6.1f)
                lineToRelative(-2.04f, 4.42f)
                lineToRelative(-1.82f, -0.84f)
                lineToRelative(1.65f, -3.58f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.67f)
                lineToRelative(2.24f, -4.86f)
                curveToRelative(-0.56f, -0.55f, -0.91f, -1.3f, -0.91f, -2.15f)
                close()
                moveTo(12.27f, 7.97f)
                curveToRelative(-0.18f, 0.03f, -0.36f, 0.03f, -0.54f, 0f)
                lineToRelative(-1.86f, 4.03f)
                horizontalLineToRelative(4.26f)
                close()
                moveTo(11f, 5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                close()
            }
        }.also { _DraftingCompassPaper = it}
