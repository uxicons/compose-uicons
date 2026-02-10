package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileInvoice: ImageVector? = null

val Icons.Ss.FileInvoice: ImageVector
    get() = _FileInvoice ?: UXIcon(name = "FileInvoice") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 18f)
                lineTo(8f, 18f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                close()
                moveTo(22f, 7f)
                lineTo(22f, 24f)
                lineTo(2f, 24f)
                lineTo(2f, 3f)
                curveTo(2f, 1.34f, 3.34f, 0f, 5f, 0f)
                lineTo(15f, 0f)
                lineTo(15f, 7f)
                horizontalLineToRelative(7f)
                close()
                moveTo(6f, 7f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                lineTo(6f, 5f)
                verticalLineToRelative(2f)
                close()
                moveTo(6f, 11f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                lineTo(6f, 9f)
                verticalLineToRelative(2f)
                close()
                moveTo(18f, 13f)
                lineTo(6f, 13f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-7f)
                close()
                moveTo(17f, 0.59f)
                lineTo(17f, 5f)
                horizontalLineToRelative(4.41f)
                lineTo(17f, 0.59f)
                close()
            }
        }.also { _FileInvoice = it}
