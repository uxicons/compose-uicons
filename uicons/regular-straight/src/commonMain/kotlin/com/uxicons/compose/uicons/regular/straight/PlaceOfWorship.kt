package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaceOfWorship: ImageVector? = null

val Icons.Rs.PlaceOfWorship: ImageVector
    get() = _PlaceOfWorship ?: UXIcon(name = "PlaceOfWorship") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 8.54f)
                lineTo(17f, 3.76f)
                lineTo(12f, 0.01f)
                lineToRelative(-5f, 3.75f)
                verticalLineToRelative(4.74f)
                lineTo(0f, 13.8f)
                verticalLineToRelative(10.2f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-10.46f)
                lineToRelative(-7f, -5f)
                close()
                moveTo(9f, 9.49f)
                verticalLineToRelative(-4.73f)
                lineToRelative(3f, -2.25f)
                lineToRelative(3f, 2.25f)
                verticalLineToRelative(4.81f)
                lineToRelative(2f, 1.43f)
                verticalLineToRelative(11.01f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-10.99f)
                lineToRelative(2f, -1.51f)
                close()
                moveTo(13f, 22f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                close()
                moveTo(2f, 14.79f)
                lineToRelative(3f, -2.27f)
                verticalLineToRelative(9.48f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-7.21f)
                close()
                moveTo(22f, 22f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-9.58f)
                lineToRelative(3f, 2.14f)
                verticalLineToRelative(7.43f)
                close()
                moveTo(10.5f, 11.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
            }
        }.also { _PlaceOfWorship = it}
