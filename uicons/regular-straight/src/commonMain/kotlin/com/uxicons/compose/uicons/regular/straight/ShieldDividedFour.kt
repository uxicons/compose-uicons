package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldDividedFour: ImageVector? = null

val Icons.Rs.ShieldDividedFour: ImageVector
    get() = _ShieldDividedFour ?: UXIcon(name = "ShieldDividedFour") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.95f, 2.62f)
                lineTo(12f, -0.01f)
                lineTo(4.05f, 2.62f)
                curveToRelative(-1.23f, 0.41f, -2.06f, 1.55f, -2.06f, 2.84f)
                verticalLineToRelative(6.52f)
                curveToRelative(0f, 6.56f, 7.0f, 10.58f, 9.15f, 11.65f)
                lineToRelative(0.81f, 0.4f)
                lineToRelative(0.83f, -0.34f)
                curveToRelative(2.16f, -0.87f, 9.21f, -4.28f, 9.21f, -11.72f)
                lineTo(22f, 5.47f)
                curveToRelative(0f, -1.29f, -0.83f, -2.44f, -2.06f, -2.84f)
                close()
                moveTo(20f, 5.47f)
                verticalLineToRelative(5.53f)
                horizontalLineToRelative(-7f)
                lineTo(13f, 2.43f)
                lineToRelative(6.32f, 2.09f)
                curveToRelative(0.41f, 0.14f, 0.68f, 0.52f, 0.68f, 0.94f)
                close()
                moveTo(4.68f, 4.52f)
                lineToRelative(6.32f, -2.09f)
                lineTo(11f, 11f)
                lineTo(4f, 11f)
                lineTo(4f, 5.47f)
                curveToRelative(0f, -0.43f, 0.27f, -0.81f, 0.68f, -0.94f)
                close()
                moveTo(4.07f, 13.0f)
                horizontalLineToRelative(6.93f)
                verticalLineToRelative(8.29f)
                curveToRelative(-2.3f, -1.32f, -6.34f, -4.18f, -6.93f, -8.29f)
                close()
                moveTo(13f, 21.43f)
                lineTo(13f, 13f)
                horizontalLineToRelative(6.94f)
                curveToRelative(-0.53f, 4.71f, -4.66f, 7.33f, -6.94f, 8.43f)
                close()
            }
        }.also { _ShieldDividedFour = it}
