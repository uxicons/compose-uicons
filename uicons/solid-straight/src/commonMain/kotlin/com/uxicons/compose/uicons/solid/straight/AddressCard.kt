package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AddressCard: ImageVector? = null

val Icons.Ss.AddressCard: ImageVector
    get() = _AddressCard ?: UXIcon(name = "AddressCard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3f)
                verticalLineToRelative(18f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                lineTo(22f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-5f)
                lineTo(16f, 0f)
                horizontalLineToRelative(5f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(17.31f, 13.66f)
                curveToRelative(0.45f, -0.44f, 0.69f, -1.03f, 0.69f, -1.66f)
                curveToRelative(0f, -0.63f, -0.24f, -1.22f, -0.72f, -1.69f)
                lineTo(9f, 2.73f)
                verticalLineToRelative(5.27f)
                lineTo(0f, 8f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(5.27f)
                lineToRelative(8.31f, -7.62f)
                close()
            }
        }.also { _AddressCard = it}
