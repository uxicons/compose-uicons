package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bonus: ImageVector? = null

val Icons.Sr.Bonus: ImageVector
    get() = _Bonus ?: UXIcon(name = "Bonus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(13f, 8f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(23.93f, 20.13f)
                curveToRelative(-0.22f, 0.54f, -0.73f, 0.88f, -1.32f, 0.88f)
                horizontalLineToRelative(-1.56f)
                verticalLineToRelative(1.56f)
                curveToRelative(0f, 0.89f, -0.73f, 1.43f, -1.43f, 1.43f)
                curveToRelative(-0.38f, 0f, -0.72f, -0.14f, -0.99f, -0.42f)
                lineToRelative(-3.95f, -3.95f)
                curveToRelative(-0.85f, 0.23f, -1.74f, 0.37f, -2.66f, 0.37f)
                curveToRelative(-0.91f, 0f, -1.79f, -0.13f, -2.64f, -0.36f)
                lineToRelative(-3.94f, 3.94f)
                curveToRelative(-0.28f, 0.28f, -0.62f, 0.42f, -1.0f, 0.42f)
                curveToRelative(-0.7f, 0f, -1.43f, -0.53f, -1.43f, -1.43f)
                verticalLineToRelative(-1.56f)
                horizontalLineToRelative(-1.56f)
                curveToRelative(-0.59f, 0f, -1.09f, -0.34f, -1.32f, -0.88f)
                curveToRelative(-0.22f, -0.54f, -0.1f, -1.13f, 0.31f, -1.55f)
                lineToRelative(3.18f, -3.18f)
                curveToRelative(-1.01f, -1.56f, -1.6f, -3.41f, -1.6f, -5.4f)
                curveTo(2f, 4.49f, 6.49f, 0f, 12f, 0f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                curveToRelative(0f, 1.98f, -0.59f, 3.83f, -1.58f, 5.38f)
                lineToRelative(3.2f, 3.2f)
                curveToRelative(0.41f, 0.41f, 0.53f, 1.01f, 0.31f, 1.55f)
                close()
                moveTo(15.99f, 12.26f)
                curveToRelative(0.1f, -1.17f, -0.47f, -2.21f, -1.38f, -2.79f)
                curveToRelative(0.29f, -0.51f, 0.43f, -1.1f, 0.38f, -1.74f)
                curveToRelative(-0.14f, -1.58f, -1.56f, -2.74f, -3.14f, -2.74f)
                horizontalLineToRelative(-1.35f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(2.34f)
                curveToRelative(1.58f, 0f, 3.01f, -1.16f, 3.15f, -2.74f)
                close()
            }
        }.also { _Bonus = it}
