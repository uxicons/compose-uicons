package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TabFolder: ImageVector? = null

val Icons.Rr.TabFolder: ImageVector
    get() = _TabFolder ?: UXIcon(name = "TabFolder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.95f, 3.1f)
                lineToRelative(-0.36f, -0.73f)
                curveToRelative(-0.27f, -0.82f, -1.04f, -1.37f, -1.9f, -1.37f)
                horizontalLineToRelative(-1.78f)
                curveToRelative(-0.5f, 0f, -0.83f, 0.53f, -0.6f, 0.97f)
                lineToRelative(0.51f, 1.02f)
                horizontalLineToRelative(-2.06f)
                lineToRelative(-0.31f, -0.63f)
                curveToRelative(-0.27f, -0.82f, -1.04f, -1.37f, -1.9f, -1.37f)
                horizontalLineToRelative(-1.77f)
                curveToRelative(-0.5f, 0f, -0.83f, 0.53f, -0.6f, 0.97f)
                lineToRelative(0.51f, 1.02f)
                horizontalLineToRelative(-2.05f)
                lineToRelative(-0.72f, -1.45f)
                curveToRelative(-0.17f, -0.34f, -0.52f, -0.55f, -0.9f, -0.55f)
                horizontalLineToRelative(-2f)
                curveTo(1.79f, 1f, 0f, 2.79f, 0f, 5f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -2.43f, -1.75f, -4.46f, -4.05f, -4.9f)
                close()
                moveTo(2f, 5f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(1.38f)
                lineToRelative(0.72f, 1.45f)
                curveToRelative(0.17f, 0.34f, 0.52f, 0.55f, 0.9f, 0.55f)
                horizontalLineToRelative(12f)
                curveToRelative(1.3f, 0f, 2.4f, 0.84f, 2.82f, 2f)
                lineTo(2f, 7f)
                verticalLineToRelative(-2f)
                close()
                moveTo(22f, 18f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(5f, 21f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(9f)
                close()
            }
        }.also { _TabFolder = it}
