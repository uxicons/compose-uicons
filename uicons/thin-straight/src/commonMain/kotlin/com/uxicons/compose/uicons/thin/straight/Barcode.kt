package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Barcode: ImageVector? = null

val Icons.Ts.Barcode: ImageVector
    get() = _Barcode ?: UXIcon(name = "Barcode") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 22f)
                lineTo(0f, 22f)
                lineTo(0f, 2f)
                lineTo(1f, 2f)
                lineTo(1f, 22f)
                close()
                moveTo(21f, 2f)
                horizontalLineToRelative(-1f)
                lineTo(20f, 22f)
                horizontalLineToRelative(1f)
                lineTo(21f, 2f)
                close()
                moveTo(12f, 2f)
                horizontalLineToRelative(-1f)
                lineTo(11f, 22f)
                horizontalLineToRelative(1f)
                lineTo(12f, 2f)
                close()
                moveTo(6f, 2f)
                horizontalLineToRelative(-2f)
                lineTo(4f, 22f)
                horizontalLineToRelative(2f)
                lineTo(6f, 2f)
                close()
                moveTo(9f, 2f)
                horizontalLineToRelative(-2f)
                lineTo(7f, 22f)
                horizontalLineToRelative(2f)
                lineTo(9f, 2f)
                close()
                moveTo(18f, 2f)
                horizontalLineToRelative(-2f)
                lineTo(16f, 22f)
                horizontalLineToRelative(2f)
                lineTo(18f, 2f)
                close()
                moveTo(15f, 2f)
                horizontalLineToRelative(-1f)
                lineTo(14f, 22f)
                horizontalLineToRelative(1f)
                lineTo(15f, 2f)
                close()
                moveTo(24f, 2f)
                horizontalLineToRelative(-1f)
                lineTo(23f, 22f)
                horizontalLineToRelative(1f)
                lineTo(24f, 2f)
                close()
            }
        }.also { _Barcode = it}
