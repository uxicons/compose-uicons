package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Trees: ImageVector? = null

val Icons.Bs.Trees: ImageVector
    get() = _Trees ?: UXIcon(name = "Trees") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.1f, 22f)
                lineToRelative(-3.48f, -6f)
                horizontalLineToRelative(2.44f)
                lineToRelative(-3.96f, -6f)
                horizontalLineToRelative(2.1f)
                lineTo(16.0f, 1.18f)
                curveToRelative(-0.59f, -0.75f, -1.5f, -1.18f, -2.5f, -1.18f)
                curveToRelative(-0.77f, 0f, -1.48f, 0.25f, -2.04f, 0.71f)
                curveToRelative(-0.53f, -0.45f, -1.2f, -0.71f, -1.91f, -0.71f)
                curveToRelative(-0.96f, 0f, -1.85f, 0.47f, -2.4f, 1.25f)
                lineTo(2.58f, 10f)
                horizontalLineToRelative(1.86f)
                lineToRelative(-3.5f, 6f)
                horizontalLineToRelative(2.16f)
                lineTo(0.02f, 22f)
                horizontalLineToRelative(7.98f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(9.1f)
                close()
                moveTo(13.62f, 3.02f)
                lineToRelative(2.34f, 3.98f)
                horizontalLineToRelative(-2.42f)
                lineToRelative(3.96f, 6f)
                horizontalLineToRelative(-2.08f)
                lineToRelative(3.48f, 6f)
                horizontalLineToRelative(-10.79f)
                lineToRelative(3.48f, -6f)
                horizontalLineToRelative(-2.08f)
                lineToRelative(3.96f, -6f)
                horizontalLineToRelative(-2.42f)
                lineToRelative(2.34f, -3.98f)
                curveToRelative(0.05f, -0.02f, 0.19f, -0.02f, 0.24f, 0f)
                close()
            }
        }.also { _Trees = it}
