package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Barcode: ImageVector? = null

val Icons.Rs.Barcode: ImageVector
    get() = _Barcode ?: UXIcon(name = "Barcode") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 22f)
                lineTo(0f, 22f)
                lineTo(0f, 2f)
                lineTo(2f, 2f)
                lineTo(2f, 22f)
                close()
                moveTo(6f, 2f)
                horizontalLineToRelative(-2f)
                lineTo(4f, 22f)
                horizontalLineToRelative(2f)
                lineTo(6f, 2f)
                close()
                moveTo(21f, 2f)
                horizontalLineToRelative(-2f)
                lineTo(19f, 22f)
                horizontalLineToRelative(2f)
                lineTo(21f, 2f)
                close()
                moveTo(13f, 2f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 22f)
                horizontalLineToRelative(2f)
                lineTo(13f, 2f)
                close()
                moveTo(10f, 2f)
                horizontalLineToRelative(-3f)
                lineTo(7f, 22f)
                horizontalLineToRelative(3f)
                lineTo(10f, 2f)
                close()
                moveTo(18f, 2f)
                horizontalLineToRelative(-3f)
                lineTo(15f, 22f)
                horizontalLineToRelative(3f)
                lineTo(18f, 2f)
                close()
                moveTo(24f, 2f)
                horizontalLineToRelative(-2f)
                lineTo(22f, 22f)
                horizontalLineToRelative(2f)
                lineTo(24f, 2f)
                close()
            }
        }.also { _Barcode = it}
