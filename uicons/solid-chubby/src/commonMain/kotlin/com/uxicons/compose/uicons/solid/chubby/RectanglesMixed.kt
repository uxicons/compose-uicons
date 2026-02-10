package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectanglesMixed: ImageVector? = null

val Icons.Sc.RectanglesMixed: ImageVector
    get() = _RectanglesMixed ?: UXIcon(name = "RectanglesMixed") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 2f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-9.94f)
                curveToRelative(-0.56f, 0.01f, -1.04f, -0.5f, -1.0f, -1.06f)
                curveToRelative(0.22f, -3.75f, 0.93f, -7.02f, 0.96f, -7.16f)
                curveToRelative(0.08f, -0.38f, 0.38f, -0.68f, 0.76f, -0.76f)
                curveToRelative(0.19f, -0.04f, 4.71f, -1.02f, 9.21f, -1.02f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(21.94f, 3.94f)
                curveToRelative(-0.12f, -0.32f, -0.39f, -0.56f, -0.73f, -0.64f)
                curveToRelative(-0.09f, -0.02f, -2.27f, -0.49f, -5.11f, -0.79f)
                curveToRelative(-0.57f, -0.07f, -1.12f, 0.42f, -1.1f, 0.99f)
                verticalLineToRelative(15.77f)
                curveToRelative(-0.01f, 0.54f, 0.46f, 1.01f, 1f, 1f)
                curveToRelative(2.7f, -0.25f, 5.23f, -0.8f, 5.21f, -0.8f)
                curveToRelative(0.33f, -0.07f, 0.6f, -0.3f, 0.72f, -0.61f)
                curveToRelative(0.04f, -0.11f, 1.07f, -2.78f, 1.07f, -7.36f)
                reflectiveCurveToRelative(-1.02f, -7.44f, -1.06f, -7.56f)
                close()
                moveTo(12f, 13f)
                horizontalLineToRelative(-8.94f)
                curveToRelative(-0.56f, -0.01f, -1.04f, 0.5f, -1.0f, 1.06f)
                curveToRelative(0.22f, 3.75f, 0.93f, 7.02f, 0.96f, 7.16f)
                curveToRelative(0.08f, 0.38f, 0.38f, 0.68f, 0.76f, 0.76f)
                curveToRelative(0.16f, 0.04f, 4.04f, 0.88f, 8.18f, 1.0f)
                horizontalLineToRelative(0.03f)
                curveToRelative(0.54f, 0.01f, 1.01f, -0.46f, 1f, -1f)
                verticalLineToRelative(-7.98f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _RectanglesMixed = it}
