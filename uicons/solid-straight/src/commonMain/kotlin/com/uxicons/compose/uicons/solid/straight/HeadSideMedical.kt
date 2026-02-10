package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeadSideMedical: ImageVector? = null

val Icons.Ss.HeadSideMedical: ImageVector
    get() = _HeadSideMedical ?: UXIcon(name = "HeadSideMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.91f, 12.59f)
                curveToRelative(-0.21f, -0.48f, -0.43f, -0.97f, -0.64f, -1.46f)
                curveToRelative(-1.18f, -2.7f, -2.29f, -5.25f, -3.47f, -6.71f)
                curveTo(17.36f, 1.16f, 13.5f, -0.45f, 9.45f, 0.11f)
                curveTo(4.46f, 0.79f, 0.5f, 4.95f, 0.05f, 9.98f)
                curveToRelative(-0.27f, 2.93f, 0.62f, 5.79f, 2.5f, 8.05f)
                curveToRelative(0.29f, 0.35f, 0.46f, 0.8f, 0.46f, 1.26f)
                verticalLineToRelative(4.71f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.25f)
                curveToRelative(1.5f, 0f, 2.78f, -1.12f, 2.97f, -2.61f)
                lineToRelative(0.45f, -3.39f)
                horizontalLineToRelative(2.33f)
                verticalLineToRelative(-2.21f)
                lineToRelative(-0.09f, -0.19f)
                close()
                moveTo(15f, 11f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _HeadSideMedical = it}
