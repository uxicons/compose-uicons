package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DraftingCompassPaper: ImageVector? = null

val Icons.Bs.DraftingCompassPaper: ImageVector
    get() = _DraftingCompassPaper ?: UXIcon(name = "DraftingCompassPaper") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3f)
                verticalLineToRelative(16.5f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-15f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineToRelative(-16.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(2.74f)
                lineToRelative(-1.32f, 3f)
                horizontalLineToRelative(-1.42f)
                curveToRelative(-0.71f, 0f, -1.39f, -0.15f, -2f, -0.42f)
                verticalLineToRelative(10.92f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(15f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-10.92f)
                curveToRelative(-0.61f, 0.27f, -1.29f, 0.42f, -2f, 0.42f)
                horizontalLineToRelative(-1.42f)
                lineToRelative(-1.32f, -3f)
                horizontalLineToRelative(2.74f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-1f)
                close()
                moveTo(9.73f, 6.44f)
                curveToRelative(-0.45f, -0.52f, -0.73f, -1.2f, -0.73f, -1.94f)
                curveToRelative(0f, -1.11f, 0.61f, -2.06f, 1.5f, -2.58f)
                verticalLineToRelative(-1.92f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1.92f)
                curveToRelative(0.89f, 0.52f, 1.5f, 1.48f, 1.5f, 2.58f)
                curveToRelative(0f, 0.74f, -0.28f, 1.42f, -0.73f, 1.94f)
                lineToRelative(2.01f, 4.56f)
                horizontalLineToRelative(2.72f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1.4f)
                lineToRelative(1.27f, 2.9f)
                lineToRelative(-2.75f, 1.21f)
                lineToRelative(-1.81f, -4.1f)
                horizontalLineToRelative(-4.64f)
                lineToRelative(-1.81f, 4.1f)
                lineToRelative(-2.75f, -1.21f)
                lineToRelative(1.27f, -2.9f)
                horizontalLineToRelative(-1.4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.72f)
                close()
                moveTo(13.0f, 11f)
                lineTo(12f, 8.72f)
                lineTo(11.0f, 11f)
                close()
            }
        }.also { _DraftingCompassPaper = it}
