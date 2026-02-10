package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Smoking: ImageVector? = null

val Icons.Ts.Smoking: ImageVector
    get() = _Smoking ?: UXIcon(name = "Smoking") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 22f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(-6f)
                lineTo(0f, 16f)
                verticalLineToRelative(6f)
                close()
                moveTo(20f, 21f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(4f)
                close()
                moveTo(1f, 17f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(4f)
                lineTo(1f, 21f)
                verticalLineToRelative(-4f)
                close()
                moveTo(23f, 16f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-6f)
                close()
                moveTo(14f, 4.86f)
                verticalLineToRelative(-2.86f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2.86f)
                curveToRelative(0f, 1.22f, 0.65f, 2.37f, 1.7f, 3.0f)
                lineToRelative(1.6f, 0.96f)
                curveToRelative(1.05f, 0.63f, 1.7f, 1.78f, 1.7f, 3.0f)
                verticalLineToRelative(2.18f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2.18f)
                curveToRelative(0f, -0.87f, -0.47f, -1.69f, -1.21f, -2.15f)
                lineToRelative(-1.6f, -0.96f)
                curveToRelative(-1.35f, -0.81f, -2.19f, -2.29f, -2.19f, -3.86f)
                close()
                moveTo(24f, 10.26f)
                verticalLineToRelative(1.74f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1.74f)
                curveToRelative(0f, -1.22f, -0.65f, -2.37f, -1.7f, -3.0f)
                lineToRelative(-2.09f, -1.25f)
                curveToRelative(-0.75f, -0.45f, -1.21f, -1.27f, -1.21f, -2.15f)
                lineTo(18f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3.87f)
                curveToRelative(0f, 0.52f, 0.28f, 1.02f, 0.73f, 1.29f)
                lineToRelative(2.09f, 1.25f)
                curveToRelative(1.35f, 0.81f, 2.19f, 2.29f, 2.19f, 3.86f)
                close()
            }
        }.also { _Smoking = it}
