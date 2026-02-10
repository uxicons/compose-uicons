package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Joint: ImageVector? = null

val Icons.Ts.Joint: ImageVector
    get() = _Joint ?: UXIcon(name = "Joint") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.23f, 19.55f)
                lineToRelative(-0.23f, 0.22f)
                verticalLineToRelative(0.54f)
                lineToRelative(0.23f, 0.15f)
                curveToRelative(0.16f, 0.1f, 3.95f, 2.54f, 7.74f, 2.54f)
                horizontalLineToRelative(16.04f)
                verticalLineToRelative(-6f)
                lineTo(7.96f, 17f)
                curveToRelative(-3.81f, 0f, -7.58f, 2.44f, -7.74f, 2.54f)
                close()
                moveTo(1.42f, 20.0f)
                curveToRelative(1.18f, -0.66f, 3.8f, -1.94f, 6.37f, -2.0f)
                lineToRelative(4.0f, 4.0f)
                horizontalLineToRelative(-3.83f)
                curveToRelative(-2.61f, 0f, -5.33f, -1.33f, -6.54f, -2.0f)
                close()
                moveTo(9.21f, 18f)
                horizontalLineToRelative(5.09f)
                lineToRelative(4f, 4f)
                horizontalLineToRelative(-5.09f)
                lineToRelative(-4f, -4f)
                close()
                moveTo(23f, 22f)
                horizontalLineToRelative(-3.29f)
                lineToRelative(-4f, -4f)
                horizontalLineToRelative(7.29f)
                verticalLineToRelative(4f)
                close()
                moveTo(14f, 5.86f)
                verticalLineToRelative(-2.86f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2.86f)
                curveToRelative(0f, 1.22f, 0.65f, 2.37f, 1.7f, 3.0f)
                lineToRelative(1.6f, 0.96f)
                curveToRelative(1.05f, 0.63f, 1.7f, 1.78f, 1.7f, 3.0f)
                verticalLineToRelative(2.18f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2.18f)
                curveToRelative(0f, -0.87f, -0.47f, -1.69f, -1.21f, -2.14f)
                lineToRelative(-1.6f, -0.96f)
                curveToRelative(-1.35f, -0.81f, -2.19f, -2.29f, -2.19f, -3.86f)
                close()
                moveTo(24f, 11.26f)
                verticalLineToRelative(1.74f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1.74f)
                curveToRelative(0f, -1.22f, -0.65f, -2.37f, -1.7f, -3.0f)
                lineToRelative(-2.09f, -1.25f)
                curveToRelative(-0.75f, -0.45f, -1.21f, -1.27f, -1.21f, -2.14f)
                lineTo(18f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3.87f)
                curveToRelative(0f, 0.52f, 0.28f, 1.02f, 0.73f, 1.29f)
                lineToRelative(2.09f, 1.25f)
                curveToRelative(1.35f, 0.81f, 2.19f, 2.29f, 2.19f, 3.86f)
                close()
            }
        }.also { _Joint = it}
