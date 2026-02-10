package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cat: ImageVector? = null

val Icons.Ts.Cat: ImageVector
    get() = _Cat ?: UXIcon(name = "Cat") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 7.5f)
                lineTo(24f, 0.04f)
                lineToRelative(-3.28f, 2.43f)
                curveToRelative(-1.39f, -0.61f, -3.06f, -0.61f, -4.45f, 0f)
                lineTo(13f, 0.04f)
                verticalLineToRelative(7.46f)
                curveToRelative(0f, 1.06f, 0.3f, 2.06f, 0.83f, 2.9f)
                curveToRelative(-9.21f, 2.77f, -8.83f, 11.99f, -8.82f, 12.06f)
                verticalLineToRelative(0.36f)
                curveToRelative(-1.99f, -0.46f, -4.0f, -1.76f, -4.0f, -3.82f)
                curveToRelative(0f, -1.71f, 0.79f, -2.98f, 1.55f, -4.21f)
                curveToRelative(0.71f, -1.15f, 1.45f, -2.33f, 1.45f, -3.79f)
                curveToRelative(0f, -2.77f, -1.23f, -4f, -4f, -4f)
                verticalLineToRelative(1f)
                curveToRelative(2.21f, 0f, 3f, 0.79f, 3f, 3f)
                curveToRelative(0f, 1.17f, -0.6f, 2.14f, -1.3f, 3.26f)
                curveToRelative(-0.8f, 1.29f, -1.7f, 2.75f, -1.7f, 4.74f)
                curveToRelative(0f, 3.41f, 3.91f, 5f, 6.56f, 5f)
                horizontalLineToRelative(17.44f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-11.26f)
                curveToRelative(1.22f, -1.01f, 2f, -2.54f, 2f, -4.24f)
                close()
                moveTo(14f, 2.02f)
                lineToRelative(2.17f, 1.61f)
                lineToRelative(0.28f, -0.14f)
                curveToRelative(1.28f, -0.66f, 2.83f, -0.66f, 4.1f, 0f)
                lineToRelative(0.28f, 0.14f)
                lineToRelative(2.17f, -1.61f)
                verticalLineToRelative(5.48f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                reflectiveCurveToRelative(-4.5f, -2.02f, -4.5f, -4.5f)
                lineTo(14.0f, 2.02f)
                close()
                moveTo(21f, 23f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                verticalLineToRelative(1f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(1f)
                lineTo(6.56f, 23f)
                curveToRelative(-0.18f, 0f, -0.36f, -0.01f, -0.55f, -0.03f)
                verticalLineToRelative(-0.54f)
                curveToRelative(-0.02f, -0.36f, -0.34f, -8.78f, 8.48f, -11.18f)
                curveToRelative(1.0f, 1.07f, 2.43f, 1.75f, 4.02f, 1.75f)
                curveToRelative(0.9f, 0f, 1.75f, -0.22f, 2.5f, -0.6f)
                verticalLineToRelative(10.6f)
                close()
                moveTo(19.5f, 7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(15.5f, 7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
            }
        }.also { _Cat = it}
