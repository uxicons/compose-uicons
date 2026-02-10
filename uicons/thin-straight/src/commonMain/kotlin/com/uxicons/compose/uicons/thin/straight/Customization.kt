package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Customization: ImageVector? = null

val Icons.Ts.Customization: ImageVector
    get() = _Customization ?: UXIcon(name = "Customization") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 6f)
                horizontalLineToRelative(-1f)
                lineTo(5f, 2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                close()
                moveTo(22f, 0f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                lineTo(24f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(18.84f, 13.3f)
                lineToRelative(-3.55f, -0.94f)
                lineToRelative(-1.83f, 3.63f)
                lineToRelative(-0.87f, -0.15f)
                lineToRelative(-0.42f, -3.32f)
                lineTo(0.73f, 23.98f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(11.43f, -11.43f)
                lineToRelative(-3.3f, -0.42f)
                lineToRelative(-0.12f, -0.86f)
                lineToRelative(3.65f, -1.88f)
                lineToRelative(-1.0f, -3.51f)
                lineToRelative(0.63f, -0.63f)
                lineToRelative(2.95f, 2.95f)
                lineToRelative(3.85f, -2.25f)
                lineToRelative(0.66f, 0.66f)
                lineToRelative(-2.26f, 3.85f)
                lineToRelative(2.94f, 2.94f)
                lineToRelative(-0.61f, 0.61f)
                close()
                moveTo(17.19f, 11.84f)
                lineToRelative(-1.92f, -1.92f)
                lineToRelative(1.65f, -2.81f)
                lineToRelative(-2.81f, 1.65f)
                lineToRelative(-1.9f, -1.9f)
                lineToRelative(0.67f, 2.34f)
                lineToRelative(-2.83f, 1.46f)
                lineToRelative(2.95f, 0.38f)
                lineToRelative(0.38f, 2.94f)
                lineToRelative(1.4f, -2.78f)
                lineToRelative(2.42f, 0.65f)
                close()
                moveTo(23f, 17f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _Customization = it}
