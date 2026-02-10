package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Harp: ImageVector? = null

val Icons.Ss.Harp: ImageVector
    get() = _Harp ?: UXIcon(name = "Harp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                curveToRelative(-1.27f, 0f, -2.32f, 0.6f, -3.25f, 1.13f)
                curveToRelative(-0.78f, 0.45f, -1.52f, 0.87f, -2.25f, 0.87f)
                curveToRelative(-1.52f, 0f, -2.52f, -0.7f, -3.77f, -1.58f)
                curveToRelative(-1.53f, -1.08f, -3.44f, -2.42f, -6.73f, -2.42f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.43f)
                curveToRelative(8.37f, -7.08f, 13.43f, -13.92f, 13.43f, -16f)
                close()
                moveTo(22f, 5.99f)
                curveToRelative(-0.03f, 0.42f, -0.69f, 1.64f, -2f, 3.42f)
                verticalLineToRelative(-5.41f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 1.99f)
                close()
                moveTo(17.75f, 4.87f)
                curveToRelative(0.09f, -0.05f, 0.17f, -0.09f, 0.25f, -0.14f)
                verticalLineToRelative(7.18f)
                curveToRelative(-0.6f, 0.7f, -1.26f, 1.45f, -2f, 2.23f)
                verticalLineToRelative(-8.43f)
                curveToRelative(0.63f, -0.22f, 1.21f, -0.54f, 1.75f, -0.84f)
                close()
                moveTo(14f, 16.18f)
                curveToRelative(-0.63f, 0.62f, -1.29f, 1.25f, -2f, 1.9f)
                verticalLineToRelative(-12.59f)
                curveToRelative(0.6f, 0.25f, 1.25f, 0.42f, 2f, 0.48f)
                verticalLineToRelative(10.21f)
                close()
                moveTo(10f, 4.35f)
                verticalLineToRelative(15.5f)
                curveToRelative(-0.64f, 0.55f, -1.31f, 1.11f, -2f, 1.67f)
                verticalLineToRelative(-18.5f)
                curveToRelative(0.7f, 0.4f, 1.34f, 0.86f, 2f, 1.32f)
                close()
                moveTo(4f, 2f)
                curveToRelative(0.76f, 0f, 1.41f, 0.09f, 2f, 0.23f)
                verticalLineToRelative(19.77f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _Harp = it}
