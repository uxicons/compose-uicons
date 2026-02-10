package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneRotary: ImageVector? = null

val Icons.Rs.PhoneRotary: ImageVector
    get() = _PhoneRotary ?: UXIcon(name = "PhoneRotary") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 7.25f)
                curveToRelative(0f, -1.42f, -0.56f, -2.76f, -1.59f, -3.79f)
                curveTo(17.84f, -1.11f, 6.16f, -1.11f, 1.59f, 3.46f)
                curveTo(0.56f, 4.49f, 0f, 5.84f, 0f, 7.25f)
                verticalLineToRelative(3.75f)
                horizontalLineToRelative(3.33f)
                lineToRelative(-1.8f, 3.38f)
                curveToRelative(-1.0f, 1.88f, -1.53f, 3.99f, -1.53f, 6.12f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -2.13f, -0.53f, -4.24f, -1.53f, -6.12f)
                lineToRelative(-1.8f, -3.38f)
                horizontalLineToRelative(3.33f)
                verticalLineToRelative(-3.75f)
                close()
                moveTo(22f, 20.5f)
                verticalLineToRelative(1.5f)
                lineTo(2f, 22f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.8f, 0.45f, -3.59f, 1.29f, -5.18f)
                lineToRelative(2.58f, -4.84f)
                lineToRelative(1.35f, -2.25f)
                curveToRelative(0.58f, -0.32f, 2.46f, -1.24f, 4.78f, -1.24f)
                reflectiveCurveToRelative(4.19f, 0.92f, 4.78f, 1.24f)
                lineToRelative(1.35f, 2.25f)
                lineToRelative(2.58f, 4.84f)
                curveToRelative(0.85f, 1.59f, 1.29f, 3.38f, 1.29f, 5.18f)
                close()
                moveTo(22f, 9f)
                horizontalLineToRelative(-2.43f)
                lineToRelative(-1.33f, -2.22f)
                reflectiveCurveToRelative(-2.84f, -1.78f, -6.24f, -1.78f)
                reflectiveCurveToRelative(-6.24f, 1.78f, -6.24f, 1.78f)
                lineToRelative(-1.33f, 2.22f)
                horizontalLineToRelative(-2.43f)
                verticalLineToRelative(-1.75f)
                curveToRelative(0f, -0.88f, 0.36f, -1.72f, 1.01f, -2.37f)
                curveToRelative(3.87f, -3.87f, 14.12f, -3.87f, 17.99f, 0f)
                curveToRelative(0.65f, 0.65f, 1.01f, 1.49f, 1.01f, 2.37f)
                verticalLineToRelative(1.75f)
                close()
                moveTo(12f, 10f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
            }
        }.also { _PhoneRotary = it}
