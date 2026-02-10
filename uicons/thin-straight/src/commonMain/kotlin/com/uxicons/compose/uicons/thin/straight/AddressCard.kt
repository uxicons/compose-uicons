package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AddressCard: ImageVector? = null

val Icons.Ts.AddressCard: ImageVector
    get() = _AddressCard ?: UXIcon(name = "AddressCard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 2.5f)
                verticalLineToRelative(19f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                lineTo(23f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-5.5f)
                lineTo(16f, 0f)
                horizontalLineToRelative(5.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(9f, 21.15f)
                verticalLineToRelative(-5.15f)
                lineTo(0f, 16f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(9f)
                lineTo(9f, 2.85f)
                lineToRelative(8.45f, 7.82f)
                curveToRelative(0.36f, 0.36f, 0.56f, 0.83f, 0.56f, 1.32f)
                curveToRelative(0f, 0.49f, -0.19f, 0.96f, -0.54f, 1.31f)
                lineToRelative(-8.46f, 7.84f)
                close()
                moveTo(10f, 15f)
                verticalLineToRelative(3.85f)
                lineToRelative(6.76f, -6.27f)
                curveToRelative(0.15f, -0.15f, 0.24f, -0.36f, 0.24f, -0.58f)
                reflectiveCurveToRelative(-0.09f, -0.44f, -0.25f, -0.6f)
                lineToRelative(-6.75f, -6.25f)
                verticalLineToRelative(3.85f)
                lineTo(1f, 9.0f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(9f)
                close()
            }
        }.also { _AddressCard = it}
