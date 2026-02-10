package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Barcode: ImageVector? = null

val Icons.Bs.Barcode: ImageVector
    get() = _Barcode ?: UXIcon(name = "Barcode") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 22f)
                lineTo(0f, 22f)
                lineTo(0f, 2f)
                lineTo(3f, 2f)
                lineTo(3f, 22f)
                close()
                moveTo(13f, 2f)
                horizontalLineToRelative(-3f)
                lineTo(10f, 22f)
                horizontalLineToRelative(3f)
                lineTo(13f, 2f)
                close()
                moveTo(9f, 2f)
                lineTo(5f, 2f)
                lineTo(5f, 22f)
                horizontalLineToRelative(4f)
                lineTo(9f, 2f)
                close()
                moveTo(19f, 2f)
                horizontalLineToRelative(-4f)
                lineTo(15f, 22f)
                horizontalLineToRelative(4f)
                lineTo(19f, 2f)
                close()
                moveTo(24f, 2f)
                horizontalLineToRelative(-3f)
                lineTo(21f, 22f)
                horizontalLineToRelative(3f)
                lineTo(24f, 2f)
                close()
            }
        }.also { _Barcode = it}
