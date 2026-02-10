package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _School: ImageVector? = null

val Icons.Bs.School: ImageVector
    get() = _School ?: UXIcon(name = "School") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 5f)
                lineTo(14.04f, 5f)
                lineToRelative(-0.38f, -0.41f)
                lineTo(17f, 2.5f)
                lineTo(13f, 0f)
                lineTo(11f, 0f)
                lineTo(11f, 3.87f)
                lineTo(9.96f, 5f)
                lineTo(3.5f, 5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 8.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 5f)
                close()
                moveTo(20.5f, 8f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                lineTo(21f, 10f)
                lineTo(18.66f, 10f)
                lineTo(16.81f, 8f)
                close()
                moveTo(3.5f, 8f)
                lineTo(7.19f, 8f)
                lineTo(5.34f, 10f)
                lineTo(3f, 10f)
                lineTo(3f, 8.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 8f)
                close()
                moveTo(14f, 21f)
                lineTo(14f, 17f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 0f)
                verticalLineToRelative(4f)
                lineTo(3f, 21f)
                lineTo(3f, 13f)
                lineTo(6.66f, 13f)
                lineTo(12f, 7.21f)
                lineTo(17.34f, 13f)
                lineTo(21f, 13f)
                verticalLineToRelative(8f)
                close()
                moveTo(5f, 16f)
                lineTo(8f, 16f)
                verticalLineToRelative(3f)
                lineTo(5f, 19f)
                close()
                moveTo(16f, 16f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                lineTo(16f, 19f)
                close()
                moveTo(13.5f, 11.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 10f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 11.5f)
                close()
            }
        }.also { _School = it}
