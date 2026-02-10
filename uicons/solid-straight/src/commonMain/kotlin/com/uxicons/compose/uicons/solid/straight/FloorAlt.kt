package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FloorAlt: ImageVector? = null

val Icons.Ss.FloorAlt: ImageVector
    get() = _FloorAlt ?: UXIcon(name = "FloorAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 10.75f)
                verticalLineToRelative(13.25f)
                lineTo(8f, 24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-13.88f)
                curveToRelative(1.15f, 0.33f, 2f, 1.38f, 2f, 2.63f)
                close()
                moveTo(18f, 4.12f)
                verticalLineToRelative(13.88f)
                lineTo(4f, 18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(16f)
                lineTo(20f, 6.75f)
                curveToRelative(0f, -1.25f, -0.85f, -2.3f, -2f, -2.63f)
                close()
                moveTo(8.38f, 13.41f)
                lineToRelative(-2.19f, -2.19f)
                lineToRelative(-4.78f, 4.78f)
                horizontalLineToRelative(4.39f)
                lineToRelative(2.59f, -2.59f)
                close()
                moveTo(5.96f, 4.29f)
                lineTo(0f, 10.33f)
                verticalLineToRelative(4.25f)
                lineTo(8.13f, 6.45f)
                lineToRelative(-2.16f, -2.16f)
                close()
                moveTo(16.0f, 3f)
                curveToRelative(0f, -0.46f, -0.11f, -0.9f, -0.3f, -1.29f)
                lineTo(7.6f, 9.8f)
                lineToRelative(2.19f, 2.19f)
                lineToRelative(6.2f, -6.2f)
                verticalLineToRelative(-2.8f)
                close()
                moveTo(7.39f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(4.48f)
                lineTo(7.39f, 0f)
                close()
                moveTo(8.63f, 16f)
                horizontalLineToRelative(7.37f)
                verticalLineToRelative(-7.37f)
                lineToRelative(-7.37f, 7.37f)
                close()
                moveTo(7.37f, 2.87f)
                lineToRelative(2.17f, 2.17f)
                lineTo(14.28f, 0.3f)
                curveToRelative(-0.39f, -0.19f, -0.82f, -0.3f, -1.28f, -0.3f)
                horizontalLineToRelative(-2.8f)
                lineToRelative(-2.83f, 2.87f)
                close()
            }
        }.also { _FloorAlt = it}
