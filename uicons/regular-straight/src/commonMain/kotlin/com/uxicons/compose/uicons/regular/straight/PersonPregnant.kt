package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonPregnant: ImageVector? = null

val Icons.Rs.PersonPregnant: ImageVector
    get() = _PersonPregnant ?: UXIcon(name = "PersonPregnant") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(18f, 14.5f)
                curveToRelative(0f, 1.71f, -0.95f, 4.51f, -1.05f, 4.83f)
                lineToRelative(-0.23f, 0.67f)
                horizontalLineToRelative(-2.71f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2.13f)
                lineToRelative(1.42f, -11.37f)
                curveToRelative(0.19f, -1.5f, 1.47f, -2.63f, 2.98f, -2.63f)
                horizontalLineToRelative(1.47f)
                curveToRelative(1.51f, 0f, 2.79f, 1.13f, 2.98f, 2.63f)
                lineToRelative(0.11f, 0.91f)
                curveToRelative(1.92f, 0.9f, 3.17f, 2.82f, 3.17f, 4.96f)
                close()
                moveTo(16f, 14.5f)
                curveToRelative(0f, -1.5f, -0.97f, -2.83f, -2.41f, -3.31f)
                lineToRelative(-0.6f, -0.2f)
                lineToRelative(-0.27f, -2.12f)
                curveToRelative(-0.06f, -0.5f, -0.49f, -0.88f, -0.99f, -0.88f)
                horizontalLineToRelative(-1.47f)
                curveToRelative(-0.5f, 0f, -0.93f, 0.38f, -0.99f, 0.88f)
                lineToRelative(-0.31f, 2.49f)
                lineToRelative(3.48f, 1.74f)
                lineToRelative(-0.9f, 1.79f)
                lineToRelative(-2.85f, -1.43f)
                lineToRelative(-0.57f, 4.53f)
                horizontalLineToRelative(7.14f)
                curveToRelative(0.31f, -1.01f, 0.73f, -2.58f, 0.73f, -3.5f)
                close()
            }
        }.also { _PersonPregnant = it}
