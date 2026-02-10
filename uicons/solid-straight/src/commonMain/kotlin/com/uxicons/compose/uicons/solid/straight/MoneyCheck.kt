package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MoneyCheck: ImageVector? = null

val Icons.Ss.MoneyCheck: ImageVector
    get() = _MoneyCheck ?: UXIcon(name = "MoneyCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 11f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
                moveTo(24f, 5f)
                lineTo(24f, 22f)
                lineTo(0f, 22f)
                lineTo(0f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(21f, 2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(3f, 13f)
                lineTo(11f, 13f)
                verticalLineToRelative(-2f)
                lineTo(3f, 11f)
                verticalLineToRelative(2f)
                close()
                moveTo(21f, 15f)
                lineTo(3f, 15f)
                verticalLineToRelative(2f)
                lineTo(21f, 17f)
                verticalLineToRelative(-2f)
                close()
                moveTo(21f, 7f)
                lineTo(13f, 7f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(8f)
                lineTo(21f, 7f)
                close()
            }
        }.also { _MoneyCheck = it}
