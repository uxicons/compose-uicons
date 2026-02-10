package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PoliceBox: ImageVector? = null

val Icons.Ss.PoliceBox: ImageVector
    get() = _PoliceBox ?: UXIcon(name = "PoliceBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.11f, 5f)
                curveToRelative(0.31f, -1.16f, 1.28f, -2.06f, 2.52f, -2.21f)
                lineToRelative(5.37f, -0.67f)
                lineTo(11f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.12f)
                lineToRelative(5.37f, 0.67f)
                curveToRelative(1.24f, 0.15f, 2.21f, 1.05f, 2.52f, 2.21f)
                lineTo(3.11f, 5f)
                close()
                moveTo(23f, 22f)
                verticalLineToRelative(2f)
                lineTo(1f, 24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                lineTo(3f, 7f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(2f)
                close()
                moveTo(5f, 12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                close()
                moveTo(9f, 14f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                close()
                moveTo(11f, 9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                close()
                moveTo(15f, 9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                close()
                moveTo(19f, 9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _PoliceBox = it}
