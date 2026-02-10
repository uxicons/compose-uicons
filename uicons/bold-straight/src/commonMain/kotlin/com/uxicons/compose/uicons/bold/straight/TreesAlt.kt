package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TreesAlt: ImageVector? = null

val Icons.Bs.TreesAlt: ImageVector
    get() = _TreesAlt ?: UXIcon(name = "TreesAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.9f, 16f)
                horizontalLineToRelative(2.16f)
                lineToRelative(-3.5f, -6f)
                horizontalLineToRelative(1.86f)
                lineTo(16.85f, 1.25f)
                curveToRelative(-0.55f, -0.79f, -1.44f, -1.25f, -2.4f, -1.25f)
                curveToRelative(-0.71f, 0f, -1.39f, 0.26f, -1.91f, 0.71f)
                curveToRelative(-0.56f, -0.46f, -1.27f, -0.71f, -2.04f, -0.71f)
                curveToRelative(-1.0f, 0f, -1.91f, 0.43f, -2.5f, 1.18f)
                lineTo(2.79f, 10f)
                horizontalLineToRelative(2.1f)
                lineToRelative(-3.96f, 6f)
                horizontalLineToRelative(2.44f)
                lineTo(-0.1f, 22f)
                horizontalLineToRelative(9.1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7.98f)
                lineToRelative(-3.08f, -6f)
                close()
                moveTo(10.5f, 13.68f)
                lineToRelative(-1.5f, 2.59f)
                verticalLineToRelative(2.74f)
                horizontalLineToRelative(-3.9f)
                lineToRelative(3.48f, -6f)
                horizontalLineToRelative(-2.08f)
                lineToRelative(3.96f, -6f)
                horizontalLineToRelative(-2.42f)
                lineToRelative(2.34f, -3.98f)
                curveToRelative(0.05f, -0.02f, 0.19f, -0.02f, 0.24f, 0f)
                lineToRelative(2.34f, 3.98f)
                horizontalLineToRelative(-2.42f)
                lineToRelative(3.96f, 6f)
                horizontalLineToRelative(-2.08f)
                lineToRelative(3.48f, 6f)
                horizontalLineToRelative(-3.9f)
                verticalLineToRelative(-2.74f)
                lineToRelative(-1.5f, -2.59f)
                close()
            }
        }.also { _TreesAlt = it}
