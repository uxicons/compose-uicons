package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spy: ImageVector? = null

val Icons.Sr.Spy: ImageVector
    get() = _Spy ?: UXIcon(name = "Spy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1.41f)
                curveToRelative(0.57f, -1.82f, 1.71f, -4f, 3.1f, -4f)
                curveToRelative(0.98f, 0f, 1.86f, 0.58f, 2.5f, 1.13f)
                curveToRelative(0.64f, -0.55f, 1.52f, -1.13f, 2.5f, -1.13f)
                curveToRelative(1.39f, 0f, 2.52f, 2.18f, 3.1f, 4f)
                horizontalLineToRelative(1.41f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                lineTo(5f, 6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(13f, 20f)
                horizontalLineToRelative(-2f)
                lineToRelative(-6.03f, -7.35f)
                curveToRelative(-0.43f, -0.56f, -0.29f, -1.37f, 0.31f, -1.74f)
                curveToRelative(0.35f, -0.21f, 1.05f, -0.64f, 1.57f, -0.87f)
                curveToRelative(-0.37f, -0.62f, -0.63f, -1.31f, -0.75f, -2.05f)
                horizontalLineToRelative(11.82f)
                curveToRelative(-0.12f, 0.74f, -0.39f, 1.43f, -0.75f, 2.05f)
                curveToRelative(0.52f, 0.23f, 1.23f, 0.68f, 1.57f, 0.89f)
                curveToRelative(0.6f, 0.37f, 0.74f, 1.18f, 0.31f, 1.74f)
                lineToRelative(-6.04f, 7.32f)
                close()
                moveTo(13.33f, 15f)
                curveToRelative(0.42f, 0f, 0.79f, -0.26f, 0.94f, -0.65f)
                lineToRelative(0.81f, -2.2f)
                curveToRelative(-0.9f, 0.54f, -1.95f, 0.85f, -3.08f, 0.85f)
                reflectiveCurveToRelative(-2.18f, -0.31f, -3.08f, -0.85f)
                lineToRelative(0.81f, 2.2f)
                curveToRelative(0.14f, 0.39f, 0.52f, 0.65f, 0.94f, 0.65f)
                horizontalLineToRelative(2.66f)
                close()
                moveTo(3f, 22f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-0.85f)
                lineToRelative(-5.78f, -7.04f)
                curveToRelative(-1.4f, 1.61f, -2.22f, 3.69f, -2.22f, 5.89f)
                close()
                moveTo(18.79f, 16.12f)
                lineToRelative(-5.79f, 7.02f)
                verticalLineToRelative(0.86f)
                horizontalLineToRelative(7f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.19f, -0.81f, -4.27f, -2.21f, -5.88f)
                close()
            }
        }.also { _Spy = it}
