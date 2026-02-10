package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MoneyCheck: ImageVector? = null

val Icons.Bs.MoneyCheck: ImageVector
    get() = _MoneyCheck ?: UXIcon(name = "MoneyCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 22f)
                lineTo(0f, 22f)
                lineTo(0f, 5.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                lineTo(20.5f, 2f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                lineTo(24f, 22f)
                close()
                moveTo(3f, 19f)
                lineTo(21f, 19f)
                lineTo(21f, 5.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                close()
                moveTo(19f, 7f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(7f)
                lineTo(19f, 7f)
                close()
                moveTo(10f, 9f)
                lineTo(5f, 9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3f)
                close()
                moveTo(19f, 14f)
                lineTo(5f, 14f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _MoneyCheck = it}
