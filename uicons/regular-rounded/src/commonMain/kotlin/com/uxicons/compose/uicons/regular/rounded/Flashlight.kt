package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flashlight: ImageVector? = null

val Icons.Rr.Flashlight: ImageVector
    get() = _Flashlight ?: UXIcon(name = "Flashlight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.41f, 8.29f)
                lineTo(15.71f, 0.6f)
                curveTo(15.32f, 0.2f, 14.76f, -0.02f, 14.22f, 0.0f)
                curveToRelative(-0.55f, 0.02f, -1.07f, 0.26f, -1.44f, 0.67f)
                curveToRelative(-1.74f, 1.95f, -2.78f, 4.56f, -2.78f, 6.96f)
                verticalLineToRelative(0.87f)
                lineTo(1.14f, 17.37f)
                curveTo(0.4f, 18.1f, 0f, 19.08f, 0f, 20.11f)
                reflectiveCurveToRelative(0.4f, 2.01f, 1.14f, 2.75f)
                curveToRelative(0.76f, 0.76f, 1.75f, 1.14f, 2.75f, 1.14f)
                reflectiveCurveToRelative(1.99f, -0.38f, 2.75f, -1.14f)
                lineToRelative(8.86f, -8.86f)
                horizontalLineToRelative(0.87f)
                curveToRelative(2.41f, 0f, 5.01f, -1.04f, 6.97f, -2.78f)
                curveToRelative(0.41f, -0.36f, 0.65f, -0.89f, 0.67f, -1.44f)
                curveToRelative(0.02f, -0.56f, -0.2f, -1.1f, -0.59f, -1.49f)
                close()
                moveTo(5.22f, 21.45f)
                curveToRelative(-0.73f, 0.73f, -1.93f, 0.73f, -2.67f, 0f)
                curveToRelative(-0.36f, -0.36f, -0.55f, -0.83f, -0.55f, -1.33f)
                reflectiveCurveToRelative(0.2f, -0.98f, 0.55f, -1.33f)
                lineToRelative(8.44f, -8.44f)
                lineToRelative(2.67f, 2.67f)
                lineToRelative(-8.44f, 8.44f)
                close()
                moveTo(16.37f, 12.0f)
                horizontalLineToRelative(-0.88f)
                lineToRelative(-3.49f, -3.49f)
                verticalLineToRelative(-0.88f)
                curveToRelative(0f, -1.93f, 0.85f, -4.04f, 2.3f, -5.62f)
                lineToRelative(7.69f, 7.69f)
                lineToRelative(0.01f, 0.02f)
                curveToRelative(-1.6f, 1.42f, -3.71f, 2.27f, -5.63f, 2.27f)
                close()
                moveTo(10.71f, 14.71f)
                lineToRelative(-1f, 1f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(1f, -1f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                close()
            }
        }.also { _Flashlight = it}
