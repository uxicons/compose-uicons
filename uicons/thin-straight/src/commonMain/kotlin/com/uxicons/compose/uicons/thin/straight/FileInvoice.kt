package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileInvoice: ImageVector? = null

val Icons.Ts.FileInvoice: ImageVector
    get() = _FileInvoice ?: UXIcon(name = "FileInvoice") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 19f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-6f)
                lineTo(6f, 13f)
                verticalLineToRelative(6f)
                close()
                moveTo(7f, 14f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(4f)
                lineTo(7f, 18f)
                verticalLineToRelative(-4f)
                close()
                moveTo(11f, 10f)
                lineTo(6f, 10f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1f)
                close()
                moveTo(11f, 6f)
                lineTo(6f, 6f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1f)
                close()
                moveTo(14.71f, 0f)
                lineTo(4.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                lineTo(2f, 24f)
                lineTo(22f, 24f)
                lineTo(22f, 7.29f)
                lineTo(14.71f, 0f)
                close()
                moveTo(15f, 1.71f)
                lineToRelative(5.29f, 5.29f)
                horizontalLineToRelative(-5.29f)
                lineTo(15f, 1.71f)
                close()
                moveTo(3f, 23f)
                lineTo(3f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(14f, 1f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(15f)
                lineTo(3f, 23f)
                close()
            }
        }.also { _FileInvoice = it}
