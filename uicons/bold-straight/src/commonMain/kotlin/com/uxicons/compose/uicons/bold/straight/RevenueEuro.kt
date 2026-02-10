package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RevenueEuro: ImageVector? = null

val Icons.Bs.RevenueEuro: ImageVector
    get() = _RevenueEuro ?: UXIcon(name = "RevenueEuro") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-15f)
                close()
                moveTo(10f, 24f)
                horizontalLineToRelative(3f)
                lineTo(13f, 6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(18f)
                close()
                moveTo(0f, 24f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-12f)
                lineTo(0f, 12f)
                verticalLineToRelative(12f)
                close()
                moveTo(20f, 22f)
                curveToRelative(-0.74f, 0f, -1.38f, -0.41f, -1.72f, -1f)
                horizontalLineToRelative(1.72f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1.72f)
                curveToRelative(0.35f, -0.59f, 0.98f, -1f, 1.72f, -1f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                curveToRelative(-1.86f, 0f, -3.41f, 1.28f, -3.86f, 3f)
                horizontalLineToRelative(-1.14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.14f)
                curveToRelative(0.45f, 1.72f, 2.0f, 3f, 3.86f, 3f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
                moveTo(23f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(11f)
                curveToRelative(1.09f, 0f, 2.12f, 0.3f, 3f, 0.81f)
                lineTo(23f, 0f)
                close()
                moveTo(18f, 11.35f)
                lineTo(18f, 3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(10.69f)
                curveToRelative(0.71f, -1.07f, 1.76f, -1.9f, 3f, -2.34f)
                close()
            }
        }.also { _RevenueEuro = it}
