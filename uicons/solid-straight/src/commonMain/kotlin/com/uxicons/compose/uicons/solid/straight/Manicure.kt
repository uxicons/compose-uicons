package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Manicure: ImageVector? = null

val Icons.Ss.Manicure: ImageVector
    get() = _Manicure ?: UXIcon(name = "Manicure") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.01f, 15.1f)
                lineToRelative(3.1f, -3.1f)
                lineToRelative(-4.08f, -2.4f)
                lineToRelative(-2.36f, -2.35f)
                lineToRelative(1.77f, -1.77f)
                lineToRelative(-4.75f, -4.75f)
                curveToRelative(-0.98f, -0.97f, -2.56f, -0.97f, -3.54f, 0f)
                lineToRelative(-1.41f, 1.41f)
                curveToRelative(-0.97f, 0.97f, -0.97f, 2.56f, 0f, 3.54f)
                lineToRelative(4.75f, 4.75f)
                lineToRelative(1.77f, -1.77f)
                lineToRelative(2.33f, 2.33f)
                lineToRelative(2.42f, 4.11f)
                close()
                moveTo(9.63f, 1.86f)
                curveToRelative(0.71f, -1.11f, 1.95f, -1.86f, 3.37f, -1.86f)
                horizontalLineToRelative(2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                curveToRelative(-0.33f, 0f, -0.65f, -0.04f, -0.97f, -0.1f)
                lineToRelative(5.32f, -5.32f)
                lineToRelative(-6.09f, -3.58f)
                lineToRelative(-0.76f, -0.76f)
                lineToRelative(1.76f, -1.76f)
                lineToRelative(-3.62f, -3.63f)
                close()
                moveTo(24.0f, 12.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-11.5f)
                curveToRelative(0f, -0.23f, 0.02f, -0.46f, 0.04f, -0.69f)
                lineToRelative(1.45f, 1.45f)
                lineToRelative(1.52f, -1.52f)
                verticalLineToRelative(0.26f)
                curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                verticalLineToRelative(-6.41f)
                curveToRelative(1.9f, 1.78f, 3f, 4.24f, 3f, 6.91f)
                close()
            }
        }.also { _Manicure = it}
