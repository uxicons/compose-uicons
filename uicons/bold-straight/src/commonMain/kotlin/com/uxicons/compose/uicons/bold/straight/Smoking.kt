package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Smoking: ImageVector? = null

val Icons.Bs.Smoking: ImageVector
    get() = _Smoking ?: UXIcon(name = "Smoking") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 24f)
                horizontalLineToRelative(19f)
                verticalLineToRelative(-8f)
                lineTo(0f, 16f)
                verticalLineToRelative(8f)
                close()
                moveTo(16f, 21f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                close()
                moveTo(3f, 19f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                lineTo(3f, 21f)
                verticalLineToRelative(-2f)
                close()
                moveTo(21f, 16f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-8f)
                close()
                moveTo(19f, 11.82f)
                verticalLineToRelative(2.18f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2.18f)
                curveToRelative(0f, -0.52f, -0.28f, -1.02f, -0.73f, -1.29f)
                lineToRelative(-1.6f, -0.96f)
                curveToRelative(-1.65f, -0.99f, -2.67f, -2.79f, -2.67f, -4.72f)
                verticalLineToRelative(-2.86f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2.86f)
                curveToRelative(0f, 0.87f, 0.47f, 1.69f, 1.21f, 2.14f)
                lineToRelative(1.6f, 0.96f)
                curveToRelative(1.35f, 0.81f, 2.19f, 2.29f, 2.19f, 3.86f)
                close()
                moveTo(24f, 10.26f)
                verticalLineToRelative(1.74f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.74f)
                curveToRelative(0f, -0.87f, -0.47f, -1.69f, -1.21f, -2.14f)
                lineToRelative(-2.09f, -1.25f)
                curveToRelative(-1.05f, -0.63f, -1.7f, -1.78f, -1.7f, -3.0f)
                lineTo(16f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3.87f)
                curveToRelative(0f, 0.18f, 0.09f, 0.34f, 0.24f, 0.43f)
                lineToRelative(2.08f, 1.25f)
                curveToRelative(1.65f, 0.99f, 2.67f, 2.79f, 2.67f, 4.72f)
                close()
            }
        }.also { _Smoking = it}
