package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pig: ImageVector? = null

val Icons.Rs.Pig: ImageVector
    get() = _Pig ?: UXIcon(name = "Pig") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 10f)
                horizontalLineToRelative(-1.22f)
                curveToRelative(-0.3f, -1.37f, -0.93f, -2.62f, -1.82f, -3.62f)
                curveToRelative(-1.05f, -1.18f, -2.43f, -1.95f, -3.96f, -2.25f)
                lineTo(17.0f, 1f)
                curveToRelative(-1.87f, -0.11f, -3.43f, 1.25f, -3.88f, 3f)
                horizontalLineToRelative(-5.12f)
                curveToRelative(-2.17f, 0f, -4.15f, 0.87f, -5.59f, 2.29f)
                curveToRelative(-0.27f, -0.61f, -0.41f, -1.38f, -0.41f, -2.29f)
                lineTo(0f, 4f)
                curveToRelative(0f, 1.64f, 0.36f, 2.97f, 1.08f, 3.99f)
                curveToRelative(-0.69f, 1.18f, -1.08f, 2.55f, -1.08f, 4.01f)
                curveToRelative(0f, 2.85f, 1.55f, 5.5f, 4f, 6.92f)
                verticalLineToRelative(3.08f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2.59f)
                curveToRelative(2.02f, -0.82f, 3.6f, -2.44f, 4.41f, -4.41f)
                horizontalLineToRelative(1.59f)
                verticalLineToRelative(-5f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, 2.63f, -1.76f, 5.0f, -4.29f, 5.75f)
                lineToRelative(-0.71f, 0.21f)
                verticalLineToRelative(2.04f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.31f)
                lineToRelative(-0.57f, -0.27f)
                curveToRelative(-2.08f, -0.99f, -3.43f, -3.12f, -3.43f, -5.42f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                horizontalLineToRelative(7.54f)
                curveToRelative(1.57f, 0f, 2.93f, 0.59f, 3.94f, 1.72f)
                curveToRelative(0.98f, 1.1f, 1.53f, 2.62f, 1.53f, 4.28f)
                horizontalLineToRelative(0f)
                close()
                moveTo(18f, 10.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _Pig = it}
