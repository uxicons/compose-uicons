package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Trees: ImageVector? = null

val Icons.Ts.Trees: ImageVector
    get() = _Trees ?: UXIcon(name = "Trees") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.86f, 21f)
                lineToRelative(-4f, -7f)
                horizontalLineToRelative(2.33f)
                lineToRelative(-3.94f, -6f)
                horizontalLineToRelative(2.24f)
                lineTo(15.98f, 0.8f)
                curveToRelative(-0.8f, -1.02f, -2.6f, -1.06f, -3.46f, 0.04f)
                lineToRelative(-0.52f, 0.83f)
                lineToRelative(-0.52f, -0.87f)
                curveToRelative(-0.8f, -1.02f, -2.6f, -1.05f, -3.45f, 0.03f)
                lineToRelative(-4.79f, 7.17f)
                horizontalLineToRelative(2.3f)
                lineToRelative(-3.7f, 6f)
                horizontalLineToRelative(2.3f)
                lineTo(0.14f, 21f)
                horizontalLineToRelative(8.86f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8.86f)
                close()
                moveTo(1.86f, 20f)
                lineToRelative(4f, -7f)
                horizontalLineToRelative(-2.23f)
                lineToRelative(3.7f, -6f)
                horizontalLineToRelative(-2.22f)
                lineToRelative(3.72f, -5.58f)
                curveToRelative(0.41f, -0.53f, 1.48f, -0.47f, 1.82f, -0.06f)
                lineToRelative(0.74f, 1.26f)
                lineToRelative(-3.4f, 5.38f)
                horizontalLineToRelative(2.27f)
                lineToRelative(-3.7f, 6f)
                horizontalLineToRelative(2.3f)
                lineToRelative(-3.43f, 6f)
                lineTo(1.86f, 20.0f)
                close()
                moveTo(10.59f, 13f)
                horizontalLineToRelative(-2.23f)
                lineToRelative(3.7f, -6f)
                horizontalLineToRelative(-2.25f)
                lineToRelative(3.52f, -5.58f)
                curveToRelative(0.42f, -0.53f, 1.47f, -0.49f, 1.83f, -0.04f)
                lineToRelative(3.52f, 5.62f)
                horizontalLineToRelative(-2.28f)
                lineToRelative(3.94f, 6f)
                horizontalLineToRelative(-2.2f)
                lineToRelative(4f, 7f)
                lineTo(6.59f, 20f)
                lineToRelative(4f, -7f)
                close()
            }
        }.also { _Trees = it}
