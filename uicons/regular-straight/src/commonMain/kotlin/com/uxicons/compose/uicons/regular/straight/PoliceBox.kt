package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PoliceBox: ImageVector? = null

val Icons.Rs.PoliceBox: ImageVector
    get() = _PoliceBox ?: UXIcon(name = "PoliceBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 22f)
                lineTo(21f, 5.77f)
                curveToRelative(0f, -1.51f, -1.13f, -2.79f, -2.63f, -2.98f)
                lineToRelative(-5.37f, -0.67f)
                lineTo(13f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.12f)
                lineToRelative(-5.37f, 0.67f)
                curveToRelative(-1.5f, 0.19f, -2.63f, 1.47f, -2.63f, 2.98f)
                verticalLineToRelative(16.23f)
                lineTo(1f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(5f, 6f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(16f)
                lineTo(5f, 22f)
                lineTo(5f, 6f)
                close()
                moveTo(9f, 11f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                close()
                moveTo(11f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                close()
                moveTo(17f, 8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                close()
                moveTo(7f, 13f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _PoliceBox = it}
