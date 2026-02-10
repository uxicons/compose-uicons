package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Milk: ImageVector? = null

val Icons.Rs.Milk: ImageVector
    get() = _Milk ?: UXIcon(name = "Milk") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 5.3f)
                verticalLineToRelative(-3.3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                lineTo(6f, 0f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(3.3f)
                lineToRelative(-3f, 3.86f)
                verticalLineToRelative(11.84f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(16f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-11.84f)
                lineToRelative(-3f, -3.86f)
                close()
                moveTo(13.11f, 9f)
                lineTo(3.66f, 9f)
                lineToRelative(2.33f, -3f)
                horizontalLineToRelative(9.78f)
                lineToRelative(-2.67f, 3f)
                close()
                moveTo(18f, 2f)
                verticalLineToRelative(2f)
                lineTo(6f, 4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(12f)
                close()
                moveTo(3f, 21f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 0.35f, 0.07f, 0.69f, 0.18f, 1f)
                lineTo(4f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(21f, 21f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-11.12f)
                lineToRelative(3.21f, -3.62f)
                lineToRelative(2.79f, 3.58f)
                verticalLineToRelative(11.16f)
                close()
            }
        }.also { _Milk = it}
