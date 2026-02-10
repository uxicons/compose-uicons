package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Igloo: ImageVector? = null

val Icons.Sc.Igloo: ImageVector
    get() = _Igloo ?: UXIcon(name = "Igloo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 2f)
                curveToRelative(-4.67f, 0.24f, -7.68f, 2.24f, -9.08f, 6f)
                horizontalLineToRelative(9.08f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(9.08f)
                curveToRelative(-1.4f, -3.76f, -4.41f, -5.76f, -9.08f, -6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.64f, 10f)
                horizontalLineToRelative(-6.64f)
                verticalLineToRelative(4.49f)
                horizontalLineToRelative(6.99f)
                curveToRelative(0.0f, -0.14f, 0.01f, 0.14f, 0.01f, 0f)
                curveToRelative(0f, -1.47f, -0.12f, -3.29f, -0.36f, -4.49f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 16.5f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.27f, 0f, 0.52f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.95f, -0.95f, 1.75f, -2.96f, 2.1f, -5.21f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 10f)
                horizontalLineToRelative(-6.64f)
                curveToRelative(-0.24f, 1.2f, -0.36f, 2.53f, -0.36f, 4f)
                curveToRelative(0f, 0.17f, 0.0f, 0.33f, 0.01f, 0.5f)
                horizontalLineToRelative(6.99f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.29f, 21.71f)
                curveToRelative(0.19f, 0.19f, 0.44f, 0.29f, 0.71f, 0.29f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-7.79f)
                curveToRelative(0.36f, 2.22f, 1.15f, 4.27f, 2.08f, 5.21f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 14.5f)
                reflectiveCurveToRelative(1f, -0.5f, 2f, -0.5f)
                reflectiveCurveToRelative(2f, 0.5f, 2f, 0.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.also { _Igloo = it}
