package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Elephant: ImageVector? = null

val Icons.Ss.Elephant: ImageVector
    get() = _Elephant ?: UXIcon(name = "Elephant") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.0f, 17f)
                verticalLineToRelative(2.9f)
                curveToRelative(0f, 0.54f, -0.36f, 1.01f, -0.83f, 1.09f)
                curveToRelative(-0.3f, 0.04f, -0.58f, -0.03f, -0.8f, -0.22f)
                curveToRelative(-0.22f, -0.19f, -0.35f, -0.47f, -0.35f, -0.77f)
                verticalLineToRelative(-10.55f)
                curveToRelative(0f, -1.79f, -0.91f, -3.48f, -2.4f, -4.49f)
                curveToRelative(-0.85f, -2.35f, -3.11f, -3.96f, -5.62f, -3.96f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                verticalLineToRelative(2f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                curveToRelative(0f, -1.07f, 0.25f, -2.08f, 0.68f, -2.98f)
                curveToRelative(-3.16f, 0.17f, -5.68f, 2.78f, -5.68f, 5.98f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(4.99f)
                lineToRelative(0.01f, -4f)
                horizontalLineToRelative(6.5f)
                lineToRelative(-0.01f, 4f)
                horizontalLineToRelative(4.53f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0f, 0.88f, 0.38f, 1.72f, 1.05f, 2.29f)
                curveToRelative(0.54f, 0.46f, 1.23f, 0.71f, 1.94f, 0.71f)
                curveToRelative(0.16f, 0f, 0.31f, -0.01f, 0.47f, -0.04f)
                curveToRelative(1.44f, -0.22f, 2.52f, -1.54f, 2.52f, -3.06f)
                verticalLineToRelative(-2.9f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _Elephant = it}
