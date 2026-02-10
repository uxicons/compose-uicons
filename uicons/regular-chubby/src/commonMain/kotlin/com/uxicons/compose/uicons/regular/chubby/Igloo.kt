package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Igloo: ImageVector? = null

val Icons.Rc.Igloo: ImageVector
    get() = _Igloo ?: UXIcon(name = "Igloo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 2f)
                curveToRelative(-7.4f, 0f, -11f, 3.92f, -11f, 12f)
                curveToRelative(0f, 3.04f, 1.01f, 6.42f, 2.29f, 7.71f)
                curveToRelative(0.19f, 0.19f, 0.44f, 0.29f, 0.71f, 0.29f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1.06f)
                curveToRelative(0f, -5.19f, 1.08f, -5.44f, 3f, -5.44f)
                reflectiveCurveToRelative(3f, 0.25f, 3f, 5.44f)
                verticalLineToRelative(1.06f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.27f, 0f, 0.52f, -0.1f, 0.71f, -0.29f)
                curveToRelative(1.29f, -1.29f, 2.29f, -4.67f, 2.29f, -7.71f)
                curveToRelative(0f, -8.07f, -3.6f, -12f, -11f, -12f)
                close()
                moveTo(17f, 10f)
                horizontalLineToRelative(3.61f)
                curveToRelative(0.26f, 1.15f, 0.39f, 2.48f, 0.39f, 4f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(19.94f, 8f)
                horizontalLineToRelative(-6.94f)
                verticalLineToRelative(-3.97f)
                curveToRelative(3.49f, 0.19f, 5.74f, 1.45f, 6.94f, 3.97f)
                close()
                moveTo(11f, 4.03f)
                verticalLineToRelative(3.97f)
                horizontalLineToRelative(-6.94f)
                curveToRelative(1.2f, -2.52f, 3.45f, -3.78f, 6.94f, -3.97f)
                close()
                moveTo(3.39f, 10f)
                horizontalLineToRelative(3.61f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                curveToRelative(0f, -1.52f, 0.13f, -2.85f, 0.39f, -4f)
                close()
                moveTo(7f, 20f)
                horizontalLineToRelative(-2.53f)
                curveToRelative(-0.49f, -0.72f, -1.06f, -2.21f, -1.32f, -4f)
                horizontalLineToRelative(4.2f)
                curveToRelative(-0.26f, 1.09f, -0.35f, 2.41f, -0.35f, 3.94f)
                close()
                moveTo(12f, 12.5f)
                curveToRelative(-1.3f, 0f, -2.27f, 0.26f, -3f, 0.77f)
                verticalLineToRelative(-3.27f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3.27f)
                curveToRelative(-0.73f, -0.51f, -1.7f, -0.77f, -3f, -0.77f)
                close()
                moveTo(19.53f, 20f)
                horizontalLineToRelative(-2.53f)
                verticalLineToRelative(-0.06f)
                curveToRelative(0f, -1.53f, -0.09f, -2.85f, -0.35f, -3.94f)
                horizontalLineToRelative(4.2f)
                curveToRelative(-0.26f, 1.79f, -0.83f, 3.28f, -1.32f, 4f)
                close()
            }
        }.also { _Igloo = it}
