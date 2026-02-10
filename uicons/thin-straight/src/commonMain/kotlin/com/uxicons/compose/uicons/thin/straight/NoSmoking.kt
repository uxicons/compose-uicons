package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoSmoking: ImageVector? = null

val Icons.Ts.NoSmoking: ImageVector
    get() = _NoSmoking ?: UXIcon(name = "NoSmoking") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 3.86f)
                verticalLineToRelative(-1.86f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1.86f)
                curveToRelative(0f, 1.22f, 0.65f, 2.37f, 1.7f, 3.0f)
                lineToRelative(1.6f, 0.96f)
                curveToRelative(1.05f, 0.63f, 1.7f, 1.78f, 1.7f, 3.0f)
                verticalLineToRelative(1.18f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1.18f)
                curveToRelative(0f, -0.87f, -0.47f, -1.69f, -1.21f, -2.14f)
                lineToRelative(-1.6f, -0.96f)
                curveToRelative(-1.35f, -0.81f, -2.19f, -2.29f, -2.19f, -3.86f)
                close()
                moveTo(19.21f, 5.01f)
                lineToRelative(2.09f, 1.25f)
                curveToRelative(1.05f, 0.63f, 1.7f, 1.78f, 1.7f, 3.0f)
                verticalLineToRelative(0.73f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.73f)
                curveToRelative(0f, -1.57f, -0.84f, -3.05f, -2.19f, -3.86f)
                lineToRelative(-2.09f, -1.25f)
                curveToRelative(-0.45f, -0.27f, -0.73f, -0.76f, -0.73f, -1.29f)
                lineTo(19.0f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(18.0f, 2.87f)
                curveToRelative(0f, 0.87f, 0.47f, 1.7f, 1.21f, 2.14f)
                close()
                moveTo(23f, 20f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6f)
                close()
                moveTo(24.0f, 23.3f)
                lineToRelative(-0.71f, 0.71f)
                lineTo(-0.0f, 0.7f)
                lineTo(0.7f, -0.0f)
                lineTo(14.71f, 14f)
                horizontalLineToRelative(6.29f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-0.29f)
                lineToRelative(3.3f, 3.3f)
                close()
                moveTo(20f, 15f)
                horizontalLineToRelative(-4.29f)
                lineToRelative(4f, 4f)
                horizontalLineToRelative(0.29f)
                verticalLineToRelative(-4f)
                close()
                moveTo(15.46f, 19f)
                lineToRelative(1f, 1f)
                lineTo(0f, 20f)
                verticalLineToRelative(-6f)
                lineTo(10.46f, 14f)
                lineToRelative(1f, 1f)
                horizontalLineToRelative(-2.46f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(6.46f)
                close()
                moveTo(8f, 15f)
                lineTo(1f, 15f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _NoSmoking = it}
