package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Church: ImageVector? = null

val Icons.Rs.Church: ImageVector
    get() = _Church ?: UXIcon(name = "Church") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 5.99f)
                verticalLineToRelative(-1.99f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                lineTo(13f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1.99f)
                lineTo(0f, 13.99f)
                verticalLineToRelative(10.01f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-10.01f)
                lineToRelative(-11f, -8f)
                close()
                moveTo(2f, 15.01f)
                lineToRelative(3f, -2.18f)
                verticalLineToRelative(9.17f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6.99f)
                close()
                moveTo(11f, 22f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(12f, 15f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-10.63f)
                lineToRelative(5f, -3.64f)
                lineToRelative(5f, 3.64f)
                verticalLineToRelative(10.63f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 22f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-9.17f)
                lineToRelative(3f, 2.18f)
                verticalLineToRelative(6.99f)
                close()
            }
        }.also { _Church = it}
