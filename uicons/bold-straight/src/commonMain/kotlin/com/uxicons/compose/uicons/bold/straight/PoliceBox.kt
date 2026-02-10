package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PoliceBox: ImageVector? = null

val Icons.Bs.PoliceBox: ImageVector
    get() = _PoliceBox ?: UXIcon(name = "PoliceBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 21f)
                lineTo(22f, 5.5f)
                curveToRelative(0f, -1.52f, -1.14f, -2.8f, -2.65f, -2.98f)
                lineToRelative(-5.85f, -0.69f)
                lineTo(13.5f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1.83f)
                lineToRelative(-5.85f, 0.69f)
                curveToRelative(-1.51f, 0.18f, -2.65f, 1.46f, -2.65f, 2.98f)
                verticalLineToRelative(15.5f)
                lineTo(0f, 21.0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(5.0f, 6f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(15f)
                lineTo(5f, 21f)
                lineTo(5f, 6f)
                close()
                moveTo(7.0f, 13f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                close()
                moveTo(9.0f, 11f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                close()
                moveTo(11.0f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                close()
                moveTo(17.0f, 8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _PoliceBox = it}
