package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldDividedFour: ImageVector? = null

val Icons.Sr.ShieldDividedFour: ImageVector
    get() = _ShieldDividedFour ?: UXIcon(name = "ShieldDividedFour") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 11f)
                lineTo(2f, 6.92f)
                curveToRelative(0f, -2.16f, 1.38f, -4.07f, 3.43f, -4.75f)
                lineTo(11f, 0.32f)
                lineTo(11f, 11f)
                lineTo(2f, 11f)
                close()
                moveTo(13f, 11f)
                horizontalLineToRelative(9f)
                lineTo(22f, 6.92f)
                curveToRelative(0f, -2.16f, -1.38f, -4.07f, -3.43f, -4.75f)
                lineTo(13f, 0.32f)
                lineTo(13f, 11f)
                close()
                moveTo(11f, 13f)
                lineTo(2.06f, 13f)
                curveToRelative(0.59f, 5.89f, 6.75f, 9.54f, 8.94f, 10.66f)
                lineTo(11f, 13f)
                close()
                moveTo(13f, 13f)
                verticalLineToRelative(10.72f)
                curveToRelative(2.25f, -0.94f, 8.41f, -4.12f, 8.95f, -10.72f)
                lineTo(13f, 13f)
                close()
            }
        }.also { _ShieldDividedFour = it}
