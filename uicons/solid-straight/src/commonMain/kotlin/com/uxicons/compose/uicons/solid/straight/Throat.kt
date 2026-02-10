package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Throat: ImageVector? = null

val Icons.Ss.Throat: ImageVector
    get() = _Throat ?: UXIcon(name = "Throat") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.63f, 12f)
                horizontalLineToRelative(5.03f)
                lineToRelative(0.35f, 0.79f)
                verticalLineToRelative(1.21f)
                horizontalLineToRelative(-9f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -1.63f, 1.27f, -2.97f, 2.84f, -3.0f)
                curveToRelative(1.27f, -0.03f, 2.47f, 0.21f, 3.62f, 0.69f)
                close()
                moveTo(15f, 16f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.25f)
                curveToRelative(1.5f, 0f, 2.78f, -1.12f, 2.97f, -2.61f)
                lineToRelative(0.32f, -2.39f)
                close()
                moveTo(7f, 24f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -2.71f, 2.16f, -4.95f, 4.81f, -5.0f)
                curveToRelative(1.53f, -0.02f, 3.02f, 0.26f, 4.42f, 0.84f)
                lineToRelative(2.8f, 1.16f)
                horizontalLineToRelative(3.75f)
                curveToRelative(-1.0f, -2.27f, -1.96f, -4.33f, -2.98f, -5.58f)
                curveToRelative(-2.44f, -3.25f, -6.31f, -4.87f, -10.35f, -4.31f)
                curveToRelative(-5.0f, 0.69f, -8.95f, 4.84f, -9.41f, 9.88f)
                curveToRelative(-0.27f, 2.94f, 0.62f, 5.79f, 2.5f, 8.04f)
                curveToRelative(0.29f, 0.35f, 0.46f, 0.8f, 0.46f, 1.26f)
                verticalLineToRelative(4.71f)
                close()
            }
        }.also { _Throat = it}
