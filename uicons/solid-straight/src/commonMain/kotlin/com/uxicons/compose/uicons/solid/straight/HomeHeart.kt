package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HomeHeart: ImageVector? = null

val Icons.Ss.HomeHeart: ImageVector
    get() = _HomeHeart ?: UXIcon(name = "HomeHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.48f, 12.43f)
                curveToRelative(0f, 1.24f, -1.89f, 3.19f, -3.5f, 4.43f)
                curveToRelative(-1.41f, -1.1f, -3.5f, -3.1f, -3.5f, -4.43f)
                curveToRelative(0f, -0.79f, 0.56f, -1.43f, 1.25f, -1.43f)
                curveToRelative(0.58f, 0f, 1.25f, 0.32f, 1.25f, 1.21f)
                horizontalLineToRelative(0.02f)
                verticalLineToRelative(0.79f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(0.1f, -0.69f, 0.67f, -1f, 1.24f, -1f)
                curveToRelative(0.69f, 0f, 1.25f, 0.64f, 1.25f, 1.43f)
                close()
                moveTo(24f, 10.07f)
                verticalLineToRelative(13.93f)
                lineTo(0f, 24f)
                verticalLineToRelative(-13.93f)
                curveToRelative(0f, -0.96f, 0.43f, -1.85f, 1.19f, -2.44f)
                lineTo(10.09f, 0.66f)
                curveToRelative(1.12f, -0.88f, 2.69f, -0.88f, 3.82f, 0f)
                lineToRelative(8.9f, 6.98f)
                curveToRelative(0.75f, 0.59f, 1.19f, 1.48f, 1.19f, 2.44f)
                close()
                moveTo(17.48f, 12.43f)
                curveToRelative(0f, -1.89f, -1.46f, -3.43f, -3.25f, -3.43f)
                curveToRelative(-0.89f, 0f, -1.68f, 0.32f, -2.25f, 0.85f)
                curveToRelative(-0.57f, -0.53f, -1.36f, -0.85f, -2.25f, -0.85f)
                curveToRelative(-1.79f, 0f, -3.25f, 1.54f, -3.25f, 3.43f)
                curveToRelative(0f, 2.98f, 4.42f, 6.14f, 4.93f, 6.49f)
                lineToRelative(0.57f, 0.4f)
                lineToRelative(0.57f, -0.4f)
                curveToRelative(0.51f, -0.35f, 4.93f, -3.51f, 4.93f, -6.49f)
                close()
            }
        }.also { _HomeHeart = it}
