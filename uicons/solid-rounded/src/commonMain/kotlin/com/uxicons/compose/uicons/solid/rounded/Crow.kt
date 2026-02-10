package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Crow: ImageVector? = null

val Icons.Sr.Crow: ImageVector
    get() = _Crow ?: UXIcon(name = "Crow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.66f, 15f)
                reflectiveCurveToRelative(7.11f, -8.87f, 7.34f, -9.31f)
                verticalLineToRelative(3.87f)
                curveToRelative(0f, 3.0f, -2.38f, 5.44f, -5.3f, 5.44f)
                horizontalLineToRelative(-2.04f)
                close()
                moveTo(22f, 3.52f)
                verticalLineToRelative(-0.02f)
                curveToRelative(0.02f, -1.34f, -0.72f, -2.63f, -1.95f, -3.17f)
                curveToRelative(-2.57f, -1.12f, -5.05f, 0.73f, -5.05f, 3.17f)
                verticalLineToRelative(6.06f)
                curveToRelative(0f, 4.1f, -3.27f, 7.44f, -7.3f, 7.44f)
                horizontalLineToRelative(-3.64f)
                lineTo(0.22f, 21.85f)
                curveToRelative(-0.34f, 0.43f, -0.27f, 1.06f, 0.16f, 1.41f)
                horizontalLineToRelative(0f)
                curveToRelative(0.43f, 0.34f, 1.06f, 0.27f, 1.41f, -0.16f)
                lineToRelative(1.64f, -2.1f)
                horizontalLineToRelative(5.44f)
                lineToRelative(1.22f, 2.45f)
                curveToRelative(0.17f, 0.34f, 0.52f, 0.55f, 0.9f, 0.55f)
                horizontalLineToRelative(0f)
                curveToRelative(0.74f, 0f, 1.23f, -0.78f, 0.9f, -1.45f)
                lineToRelative(-0.81f, -1.61f)
                curveToRelative(0.85f, -0.09f, 1.68f, -0.29f, 2.48f, -0.58f)
                lineToRelative(1.54f, 3.08f)
                curveToRelative(0.17f, 0.34f, 0.52f, 0.55f, 0.9f, 0.55f)
                horizontalLineToRelative(0f)
                curveToRelative(0.74f, 0f, 1.23f, -0.78f, 0.9f, -1.45f)
                lineToRelative(-1.52f, -3.04f)
                curveToRelative(3.34f, -1.95f, 5.64f, -5.6f, 5.64f, -9.69f)
                curveToRelative(0f, 0f, 0.0f, -2.79f, 0.01f, -2.83f)
                horizontalLineToRelative(2.3f)
                curveToRelative(0.42f, 0f, 0.76f, -0.38f, 0.69f, -0.8f)
                curveToRelative(-0.25f, -1.4f, -1.21f, -2.22f, -1.99f, -2.68f)
                close()
            }
        }.also { _Crow = it}
