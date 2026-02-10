package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HomeHeart: ImageVector? = null

val Icons.Ts.HomeHeart: ImageVector
    get() = _HomeHeart ?: UXIcon(name = "HomeHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.97f, 7.87f)
                lineTo(13.66f, 0.57f)
                curveToRelative(-0.98f, -0.77f, -2.34f, -0.77f, -3.32f, 0f)
                lineTo(1.03f, 7.87f)
                curveToRelative(-0.66f, 0.51f, -1.03f, 1.29f, -1.03f, 2.12f)
                verticalLineToRelative(14.01f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-14.01f)
                curveToRelative(0f, -0.83f, -0.38f, -1.61f, -1.03f, -2.12f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                verticalLineToRelative(-13.01f)
                curveToRelative(0f, -0.53f, 0.24f, -1.01f, 0.65f, -1.33f)
                lineTo(10.96f, 1.36f)
                curveToRelative(0.61f, -0.48f, 1.47f, -0.48f, 2.08f, 0f)
                lineToRelative(9.31f, 7.29f)
                curveToRelative(0.41f, 0.32f, 0.65f, 0.81f, 0.65f, 1.33f)
                verticalLineToRelative(13.01f)
                close()
                moveTo(14.48f, 9f)
                curveToRelative(-1.08f, 0f, -1.98f, 0.48f, -2.5f, 1.25f)
                curveToRelative(-0.52f, -0.77f, -1.42f, -1.25f, -2.5f, -1.25f)
                curveToRelative(-1.65f, 0f, -3f, 1.44f, -3f, 3.2f)
                curveToRelative(0f, 3.05f, 5.0f, 6.56f, 5.21f, 6.71f)
                lineToRelative(0.28f, 0.2f)
                lineToRelative(0.28f, -0.2f)
                curveToRelative(0.21f, -0.15f, 5.21f, -3.66f, 5.21f, -6.71f)
                curveToRelative(0f, -1.76f, -1.35f, -3.2f, -3f, -3.2f)
                close()
                moveTo(11.98f, 17.89f)
                curveToRelative(-1.48f, -1.09f, -4.5f, -3.72f, -4.5f, -5.68f)
                curveToRelative(0f, -1.21f, 0.9f, -2.2f, 2f, -2.2f)
                curveToRelative(1.18f, 0f, 2.02f, 0.88f, 2.02f, 2.03f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.3f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(0.1f, -1.02f, 0.89f, -1.72f, 1.99f, -1.72f)
                curveToRelative(1.1f, 0f, 2f, 0.99f, 2f, 2.2f)
                curveToRelative(0f, 1.97f, -3.02f, 4.59f, -4.5f, 5.68f)
                close()
            }
        }.also { _HomeHeart = it}
