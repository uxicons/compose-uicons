package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Balcony: ImageVector? = null

val Icons.Ss.Balcony: ImageVector
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
                curveToRelative(0f, 1.65f, 1.85f, 3f, 3f, 3f)
                lineTo(21f, 24f)
                curveToRelative(2.15f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(24f, 10f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(4f, 22f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(2f, 12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                close()
                moveTo(8.5f, 22f)
                horizontalLineToRelative(-2f)
                lineTo(6.5f, 12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                close()
                moveTo(13f, 22f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                close()
                moveTo(17.5f, 22f)
                horizontalLineToRelative(-2f)
                lineTo(15.5f, 12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                close()
                moveTo(21f, 22f)
                horizontalLineToRelative(-1f)
                lineTo(20f, 12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _Balcony = it}
