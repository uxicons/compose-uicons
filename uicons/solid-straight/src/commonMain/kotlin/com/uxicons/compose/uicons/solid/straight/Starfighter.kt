package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Starfighter: ImageVector? = null

val Icons.Ss.Starfighter: ImageVector
    get() = _Starfighter ?: UXIcon(name = "Starfighter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 22f)
                lineTo(2f, 18f)
                verticalLineToRelative(3f)
                lineTo(0f, 21f)
                lineTo(0f, 6f)
                lineTo(2f, 6f)
                verticalLineToRelative(8f)
                lineTo(6f, 14f)
                close()
                moveTo(22f, 6f)
                verticalLineToRelative(8f)
                lineTo(18f, 14f)
                verticalLineToRelative(8f)
                lineToRelative(4f, -4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                lineTo(24f, 6f)
                close()
                moveTo(12f, 5f)
                arcToRelative(7.05f, 7.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.22f, 0.76f)
                curveTo(14f, -1.9f, 10f, -1.9f, 8.78f, 5.76f)
                arcTo(7.05f, 7.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 5f)
                close()
                moveTo(15.61f, 8.46f)
                arcToRelative(5.2f, 5.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.22f, 0f)
                curveToRelative(-0.25f, 2.23f, -0.34f, 4.35f, -0.38f, 5.54f)
                lineTo(8f, 14f)
                lineTo(8f, 24f)
                horizontalLineToRelative(2f)
                lineTo(10f, 22f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                lineTo(16f, 14f)
                horizontalLineToRelative(-0.02f)
                curveTo(15.95f, 12.81f, 15.86f, 10.69f, 15.61f, 8.46f)
                close()
            }
        }.also { _Starfighter = it}
