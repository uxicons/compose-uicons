package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Whistle: ImageVector? = null

val Icons.Br.Whistle: ImageVector
    get() = _Whistle ?: UXIcon(name = "Whistle") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 13f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 3f)
            arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 13f)
            close()
            moveTo(24f, 11f)
            verticalLineToRelative(0.95f)
            curveToRelative(0f, 1.23f, -0.79f, 2.67f, -3.01f, 3.04f)
            lineToRelative(-5.0f, 0.85f)
            arcToRelative(7.61f, 7.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.61f, 3.21f)
            arcTo(8.06f, 8.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.28f, 23.9f)
            arcToRelative(8.1f, 8.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.28f, 0.1f)
            arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.99f, -8.53f)
            arcTo(8.14f, 8.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.24f, 8f)
            lineTo(21f, 8f)
            arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 11f)
            close()
            moveTo(21f, 11f)
            lineTo(8.24f, 11f)
            arcToRelative(5.14f, 5.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.23f, 4.67f)
            arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.6f, 2.22f)
            arcTo(4.74f, 4.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 15.9f)
            arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.49f, -3.02f)
            lineToRelative(5.0f, -0.84f)
            arcTo(1.58f, 1.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 11.88f)
            close()
            moveTo(9.5f, 6f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 4.5f)
            verticalLineToRelative(-3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineToRelative(3f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 6f)
            close()
            moveTo(12.67f, 6.75f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.08f, -0.42f)
            lineToRelative(2f, -3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.5f, -1.66f)
            lineToRelative(-2f, 3f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.67f, 6.75f)
            close()
            moveTo(4.25f, 6.34f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.49f, -1.67f)
            lineToRelative(-2.02f, -3f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.24f, 3.34f)
            close()
        }
    }.also { _Whistle = it }
