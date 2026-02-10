package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Smog: ImageVector? = null

val Icons.Ss.Smog: ImageVector
    get() = _Smog ?: UXIcon(name = "Smog") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 22f)
                lineTo(14f, 22f)
                close()
                moveTo(20f, 22f)
                lineTo(16f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                close()
                moveTo(24f, 18f)
                lineTo(10f, 18f)
                verticalLineToRelative(2f)
                lineTo(24f, 20f)
                close()
                moveTo(8f, 18f)
                lineTo(4f, 18f)
                verticalLineToRelative(2f)
                lineTo(8f, 20f)
                close()
                moveTo(14f, 14f)
                lineTo(0f, 14f)
                verticalLineToRelative(2f)
                lineTo(14f, 16f)
                close()
                moveTo(20f, 14f)
                lineTo(16f, 14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                close()
                moveTo(19.27f, 10.78f)
                curveToRelative(5.61f, 1.62f, 6.58f, -7.09f, 0.75f, -6.75f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.53f, -2.01f)
                arcToRelative(6.04f, 6.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.13f, 0.16f)
                arcTo(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7f)
                arcToRelative(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.85f, 4.11f)
                arcToRelative(6.1f, 6.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.77f, 0.29f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.65f, -0.62f)
                close()
            }
        }.also { _Smog = it}
