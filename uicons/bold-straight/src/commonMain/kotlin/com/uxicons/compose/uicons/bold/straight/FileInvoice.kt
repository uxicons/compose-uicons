package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileInvoice: ImageVector? = null

val Icons.Bs.FileInvoice: ImageVector
    get() = _FileInvoice ?: UXIcon(name = "FileInvoice") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.38f, 0f)
                lineTo(5f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                lineTo(2f, 24f)
                lineTo(22f, 24f)
                lineTo(22f, 5.67f)
                lineTo(16.38f, 0f)
                close()
                moveTo(5f, 21f)
                lineTo(5f, 3f)
                lineTo(14f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(13f)
                lineTo(5f, 21f)
                close()
                moveTo(7f, 15f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(4f)
                lineTo(7f, 19f)
                verticalLineToRelative(-4f)
                close()
                moveTo(12f, 13f)
                lineTo(7f, 13f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                close()
                moveTo(12f, 8f)
                lineTo(7f, 8f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _FileInvoice = it}
