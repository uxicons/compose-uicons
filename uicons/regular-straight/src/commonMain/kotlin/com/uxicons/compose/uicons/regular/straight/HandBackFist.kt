package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBackFist: ImageVector? = null

val Icons.Rs.HandBackFist: ImageVector
    get() = _HandBackFist ?: UXIcon(name = "HandBackFist") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.2f, 0.02f)
                lineToRelative(-0.2f, -0.02f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(1.58f)
                lineTo(0.88f, 8.64f)
                curveToRelative(-0.57f, 0.57f, -0.88f, 1.32f, -0.88f, 2.12f)
                reflectiveCurveToRelative(0.31f, 1.55f, 0.85f, 2.1f)
                lineToRelative(5.15f, 5.54f)
                verticalLineToRelative(5.61f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(-6.81f)
                lineToRelative(1.64f, -4.11f)
                curveToRelative(0.24f, -0.59f, 0.36f, -1.22f, 0.36f, -1.86f)
                lineTo(23f, 2.98f)
                lineTo(8.2f, 0.02f)
                close()
                moveTo(21f, 11.23f)
                curveToRelative(0f, 0.38f, -0.07f, 0.76f, -0.21f, 1.11f)
                lineToRelative(-1.78f, 4.46f)
                verticalLineToRelative(5.19f)
                lineTo(8f, 22f)
                verticalLineToRelative(-4.39f)
                lineTo(2.29f, 11.46f)
                curveToRelative(-0.19f, -0.19f, -0.29f, -0.44f, -0.29f, -0.71f)
                reflectiveCurveToRelative(0.1f, -0.52f, 0.29f, -0.7f)
                lineToRelative(2.71f, -2.67f)
                verticalLineToRelative(3.61f)
                horizontalLineToRelative(2f)
                lineTo(7f, 3f)
                curveToRelative(0f, -0.52f, 0.4f, -0.95f, 0.92f, -1.0f)
                lineToRelative(13.08f, 2.62f)
                verticalLineToRelative(6.61f)
                close()
            }
        }.also { _HandBackFist = it}
