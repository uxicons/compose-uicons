package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BarcodeScan: ImageVector? = null

val Icons.Bs.BarcodeScan: ImageVector
    get() = _BarcodeScan ?: UXIcon(name = "BarcodeScan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 9f)
                verticalLineToRelative(3f)
                lineTo(0f, 12f)
                verticalLineToRelative(-3f)
                lineTo(2f, 9f)
                lineTo(2f, 1f)
                horizontalLineToRelative(3f)
                lineTo(5f, 9f)
                horizontalLineToRelative(2f)
                lineTo(7f, 1f)
                horizontalLineToRelative(4f)
                lineTo(11f, 9f)
                horizontalLineToRelative(1f)
                lineTo(12f, 1f)
                horizontalLineToRelative(3f)
                lineTo(15f, 9f)
                horizontalLineToRelative(3f)
                lineTo(18f, 1f)
                horizontalLineToRelative(4f)
                lineTo(22f, 9f)
                horizontalLineToRelative(2f)
                close()
                moveTo(2f, 23f)
                horizontalLineToRelative(3f)
                lineTo(5f, 14f)
                lineTo(2f, 14f)
                verticalLineToRelative(9f)
                close()
                moveTo(12f, 23f)
                horizontalLineToRelative(3f)
                lineTo(15f, 14f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(9f)
                close()
                moveTo(7f, 23f)
                horizontalLineToRelative(4f)
                lineTo(11f, 14f)
                lineTo(7f, 14f)
                verticalLineToRelative(9f)
                close()
                moveTo(18f, 23f)
                horizontalLineToRelative(4f)
                lineTo(22f, 14f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(9f)
                close()
            }
        }.also { _BarcodeScan = it}
