package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Medal: ImageVector? = null

val Icons.Rs.Medal: ImageVector
    get() = _Medal ?: UXIcon(name = "Medal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.98f, 0f)
                horizontalLineToRelative(-9.09f)
                lineToRelative(-2.88f, 5.83f)
                lineTo(9.13f, 0f)
                lineTo(0.03f, 0f)
                lineToRelative(4.75f, 9.63f)
                curveToRelative(-1.12f, 1.5f, -1.78f, 3.36f, -1.78f, 5.37f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                curveToRelative(0f, -2.01f, -0.66f, -3.87f, -1.78f, -5.37f)
                lineTo(23.98f, 0f)
                close()
                moveTo(16.13f, 2f)
                horizontalLineToRelative(4.63f)
                lineToRelative(-3.01f, 6.08f)
                curveToRelative(-1.06f, -0.88f, -2.33f, -1.53f, -3.71f, -1.85f)
                lineToRelative(2.1f, -4.23f)
                close()
                moveTo(7.89f, 2f)
                lineToRelative(2.09f, 4.23f)
                curveToRelative(-1.39f, 0.32f, -2.66f, 0.97f, -3.73f, 1.85f)
                lineTo(3.25f, 2f)
                horizontalLineToRelative(4.64f)
                close()
                moveTo(12.0f, 22f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                close()
                moveTo(13.42f, 13.5f)
                horizontalLineToRelative(3.58f)
                verticalLineToRelative(0.74f)
                lineToRelative(-2.74f, 1.63f)
                lineToRelative(1.15f, 3.13f)
                lineToRelative(-0.64f, 0.44f)
                lineToRelative(-2.76f, -2.14f)
                lineToRelative(-2.77f, 2.15f)
                lineToRelative(-0.61f, -0.46f)
                lineToRelative(1.07f, -3.17f)
                lineToRelative(-2.7f, -1.58f)
                verticalLineToRelative(-0.75f)
                horizontalLineToRelative(3.6f)
                lineToRelative(1.0f, -3.53f)
                horizontalLineToRelative(0.82f)
                lineToRelative(1.0f, 3.53f)
                close()
            }
        }.also { _Medal = it}
