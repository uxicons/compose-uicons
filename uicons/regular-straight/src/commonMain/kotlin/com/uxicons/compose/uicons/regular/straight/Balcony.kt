package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Balcony: ImageVector? = null

val Icons.Rs.Balcony: ImageVector
    get() = _Balcony ?: UXIcon(name = "Balcony") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 10f)
                lineTo(20f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(7f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(7f)
                lineTo(0f, 10f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                lineTo(21f, 24f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(24f, 10f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(8.5f, 12f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-2.5f)
                lineTo(6f, 12f)
                horizontalLineToRelative(2.5f)
                close()
                moveTo(10.5f, 12f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 12f)
                close()
                moveTo(15.5f, 12f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-2.5f)
                lineTo(15.5f, 12f)
                close()
                moveTo(6f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(7f)
                lineTo(6f, 10f)
                lineTo(6f, 3f)
                close()
                moveTo(2f, 21f)
                lineTo(2f, 12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(22f, 21f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1f)
                lineTo(20f, 12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(9f)
                close()
            }
        }.also { _Balcony = it}
