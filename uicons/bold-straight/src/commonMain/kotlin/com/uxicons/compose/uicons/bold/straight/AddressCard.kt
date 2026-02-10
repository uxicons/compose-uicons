package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AddressCard: ImageVector? = null

val Icons.Bs.AddressCard: ImageVector
    get() = _AddressCard ?: UXIcon(name = "AddressCard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3.5f)
                verticalLineToRelative(17f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(21f, 3.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-4.5f)
                lineTo(16f, 0f)
                horizontalLineToRelative(4.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(8f, 22.41f)
                verticalLineToRelative(-6.41f)
                lineTo(0f, 16f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(8f)
                lineTo(8f, 1.59f)
                lineToRelative(9.12f, 8.34f)
                curveToRelative(0.59f, 0.58f, 0.88f, 1.3f, 0.88f, 2.06f)
                reflectiveCurveToRelative(-0.3f, 1.48f, -0.84f, 2.01f)
                lineToRelative(-9.16f, 8.4f)
                close()
                moveTo(11f, 13f)
                verticalLineToRelative(2.59f)
                lineToRelative(3.92f, -3.6f)
                lineToRelative(-3.92f, -3.59f)
                verticalLineToRelative(2.6f)
                lineTo(3f, 11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                close()
            }
        }.also { _AddressCard = it}
