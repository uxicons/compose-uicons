package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBackFist: ImageVector? = null

val Icons.Rr.HandBackFist: ImageVector
    get() = _HandBackFist ?: UXIcon(name = "HandBackFist") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.01f, 1.95f)
                lineTo(9.9f, 0.08f)
                curveToRelative(-1.21f, -0.25f, -2.44f, 0.06f, -3.4f, 0.83f)
                curveToRelative(-0.95f, 0.78f, -1.5f, 1.93f, -1.5f, 3.16f)
                verticalLineToRelative(0.18f)
                lineToRelative(-3.81f, 3.78f)
                curveToRelative(-1.54f, 1.53f, -1.57f, 4.05f, -0.07f, 5.62f)
                lineToRelative(4.88f, 5.07f)
                verticalLineToRelative(1.28f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(7f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-2.81f)
                lineToRelative(1.43f, -3.57f)
                curveToRelative(0.38f, -0.95f, 0.57f, -1.95f, 0.57f, -2.97f)
                verticalLineToRelative(-3.8f)
                curveToRelative(0f, -2.36f, -1.68f, -4.42f, -3.99f, -4.9f)
                close()
                moveTo(21f, 10.65f)
                curveToRelative(0f, 0.77f, -0.14f, 1.52f, -0.43f, 2.23f)
                lineToRelative(-1.5f, 3.75f)
                curveToRelative(-0.05f, 0.12f, -0.07f, 0.24f, -0.07f, 0.37f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-1.68f)
                curveToRelative(0f, -0.26f, -0.1f, -0.51f, -0.28f, -0.69f)
                lineTo(2.56f, 12.27f)
                curveToRelative(-0.75f, -0.78f, -0.74f, -2.04f, 0.04f, -2.81f)
                lineToRelative(2.41f, -2.39f)
                verticalLineToRelative(3.92f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                lineTo(7f, 4.08f)
                curveToRelative(0f, -0.63f, 0.28f, -1.21f, 0.77f, -1.61f)
                curveToRelative(0.49f, -0.4f, 1.12f, -0.55f, 1.73f, -0.42f)
                lineToRelative(9.11f, 1.87f)
                curveToRelative(1.39f, 0.28f, 2.4f, 1.52f, 2.4f, 2.94f)
                verticalLineToRelative(3.8f)
                close()
            }
        }.also { _HandBackFist = it}
