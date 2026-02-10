package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rent: ImageVector? = null

val Icons.Bs.Rent: ImageVector
    get() = _Rent ?: UXIcon(name = "Rent") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.4f, 6.78f)
                curveToRelative(-0.59f, -3.83f, -3.9f, -6.78f, -7.9f, -6.78f)
                curveToRelative(-3.78f, 0f, -6.95f, 2.64f, -7.78f, 6.17f)
                curveToRelative(-2.14f, 0.57f, -3.72f, 2.5f, -3.72f, 4.81f)
                curveToRelative(0f, 2.05f, 1.23f, 3.81f, 3f, 4.58f)
                verticalLineToRelative(0.43f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(2.0f, 2f)
                lineToRelative(2.0f, -2f)
                verticalLineToRelative(-6.43f)
                curveToRelative(1.77f, -0.77f, 3f, -2.53f, 3f, -4.58f)
                curveToRelative(0f, -2.12f, -1.33f, -3.92f, -3.19f, -4.65f)
                curveToRelative(0.69f, -1.94f, 2.52f, -3.33f, 4.69f, -3.33f)
                curveToRelative(2.41f, 0f, 4.42f, 1.71f, 4.89f, 3.98f)
                lineToRelative(-4.39f, 4.39f)
                verticalLineToRelative(12.62f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-12.62f)
                lineToRelative(-4.6f, -4.6f)
                close()
                moveTo(5f, 10.99f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                curveToRelative(0f, -0.78f, 0.6f, -1.41f, 1.36f, -1.49f)
                horizontalLineToRelative(0.29f)
                curveToRelative(0.76f, 0.07f, 1.36f, 0.71f, 1.36f, 1.49f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-8.38f)
                lineToRelative(3f, -3f)
                lineToRelative(3f, 3f)
                verticalLineToRelative(8.38f)
                close()
            }
        }.also { _Rent = it}
