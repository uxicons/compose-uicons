package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Legal: ImageVector? = null

val Icons.Ss.Legal: ImageVector
    get() = _Legal ?: UXIcon(name = "Legal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 22f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-0.87f)
                curveToRelative(0.66f, -1.25f, 1.37f, -3.76f, 1.37f, -4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.45f, -2.5f, -2.45f)
                reflectiveCurveToRelative(-2.5f, 1.07f, -2.5f, 2.45f)
                curveToRelative(0f, 0.74f, 0.71f, 3.25f, 1.37f, 4.5f)
                horizontalLineToRelative(-0.87f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                lineTo(0f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(19f, 17.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(21f, 0f)
                horizontalLineToRelative(-12f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(7.05f)
                lineToRelative(0.01f, 0.05f)
                curveToRelative(2.24f, 0.25f, 4.0f, 2.12f, 4.0f, 4.4f)
                curveToRelative(0f, 0.63f, -0.25f, 1.77f, -0.61f, 2.92f)
                curveToRelative(1.09f, 0.51f, 1.95f, 1.44f, 2.35f, 2.58f)
                horizontalLineToRelative(1.26f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(11f)
                lineTo(24.0f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(10f, 5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-2f)
                close()
                moveTo(10f, 11f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(17.5f, 21f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                close()
            }
        }.also { _Legal = it}
