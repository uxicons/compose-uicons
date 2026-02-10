package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BarcodeRead: ImageVector? = null

val Icons.Bs.BarcodeRead: ImageVector
    get() = _BarcodeRead ?: UXIcon(name = "BarcodeRead") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.5f, 19f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3f)
                lineTo(3.5f, 22f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-3.5f)
                lineTo(3f, 15f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(21f, 18.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(20.5f, 2f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3f, 5.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.5f)
                lineTo(7f, 2f)
                lineTo(3.5f, 2f)
                curveTo(1.57f, 2f, 0f, 3.57f, 0f, 5.5f)
                verticalLineToRelative(3.5f)
                lineTo(3f, 9f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(5f, 17f)
                horizontalLineToRelative(4f)
                lineTo(9f, 7f)
                lineTo(5f, 7f)
                verticalLineToRelative(10f)
                close()
                moveTo(13f, 17f)
                horizontalLineToRelative(3f)
                lineTo(16f, 7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(10f)
                close()
                moveTo(12f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(2f)
                lineTo(12f, 7f)
                close()
                moveTo(19f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(2f)
                lineTo(19f, 7f)
                close()
            }
        }.also { _BarcodeRead = it}
