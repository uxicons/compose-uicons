package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AddressCard: ImageVector? = null

val Icons.Rs.AddressCard: ImageVector
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
                moveTo(9f, 21.27f)
                verticalLineToRelative(-5.27f)
                lineTo(0f, 16f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(9f)
                lineTo(9f, 2.73f)
                lineToRelative(8.28f, 7.58f)
                curveToRelative(0.48f, 0.47f, 0.72f, 1.06f, 0.72f, 1.69f)
                curveToRelative(0f, 0.63f, -0.25f, 1.22f, -0.69f, 1.66f)
                lineToRelative(-8.31f, 7.62f)
                close()
                moveTo(11f, 14f)
                verticalLineToRelative(2.73f)
                lineToRelative(4.93f, -4.52f)
                curveToRelative(0.06f, -0.06f, 0.07f, -0.16f, 0.07f, -0.21f)
                curveToRelative(0f, -0.05f, -0.01f, -0.16f, -0.1f, -0.24f)
                lineToRelative(-4.9f, -4.48f)
                verticalLineToRelative(2.73f)
                lineTo(2f, 10f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(9f)
                close()
            }
        }.also { _AddressCard = it}
