package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MoneyCheck: ImageVector? = null

val Icons.Rs.MoneyCheck: ImageVector
    get() = _MoneyCheck ?: UXIcon(name = "MoneyCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 22f)
                lineTo(0f, 22f)
                lineTo(0f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(21f, 2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                lineTo(24f, 22f)
                close()
                moveTo(2f, 20f)
                lineTo(22f, 20f)
                lineTo(22f, 5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(15f)
                close()
                moveTo(20f, 13f)
                lineTo(12f, 13f)
                lineTo(12f, 7f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(6f)
                close()
                moveTo(14f, 11f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                close()
                moveTo(10f, 11f)
                lineTo(4f, 11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                close()
                moveTo(20f, 15f)
                lineTo(4f, 15f)
                verticalLineToRelative(2f)
                lineTo(20f, 17f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _MoneyCheck = it}
