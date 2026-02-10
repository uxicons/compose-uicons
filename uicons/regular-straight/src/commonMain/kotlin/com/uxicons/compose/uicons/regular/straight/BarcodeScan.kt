package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BarcodeScan: ImageVector? = null

val Icons.Rs.BarcodeScan: ImageVector
    get() = _BarcodeScan ?: UXIcon(name = "BarcodeScan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(9f)
                lineTo(2f, 23f)
                lineTo(2f, 14f)
                close()
                moveTo(17f, 23f)
                horizontalLineToRelative(2f)
                lineTo(19f, 14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(9f)
                close()
                moveTo(9f, 23f)
                horizontalLineToRelative(2f)
                lineTo(11f, 14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(9f)
                close()
                moveTo(5f, 23f)
                horizontalLineToRelative(3f)
                lineTo(8f, 14f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(9f)
                close()
                moveTo(13f, 23f)
                horizontalLineToRelative(3f)
                lineTo(16f, 14f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(9f)
                close()
                moveTo(20f, 23f)
                horizontalLineToRelative(2f)
                lineTo(22f, 14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(9f)
                close()
                moveTo(22f, 10f)
                lineTo(22f, 1f)
                horizontalLineToRelative(-2f)
                lineTo(20f, 10f)
                horizontalLineToRelative(-1f)
                lineTo(19f, 1f)
                horizontalLineToRelative(-2f)
                lineTo(17f, 10f)
                horizontalLineToRelative(-1f)
                lineTo(16f, 1f)
                horizontalLineToRelative(-3f)
                lineTo(13f, 10f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 1f)
                horizontalLineToRelative(-2f)
                lineTo(9f, 10f)
                horizontalLineToRelative(-1f)
                lineTo(8f, 1f)
                horizontalLineToRelative(-3f)
                lineTo(5f, 10f)
                horizontalLineToRelative(-1f)
                lineTo(4f, 1f)
                lineTo(2f, 1f)
                lineTo(2f, 10f)
                lineTo(0f, 10f)
                verticalLineToRelative(2f)
                lineTo(24f, 12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _BarcodeScan = it}
