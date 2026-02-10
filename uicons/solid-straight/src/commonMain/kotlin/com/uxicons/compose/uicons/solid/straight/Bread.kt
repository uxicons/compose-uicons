package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bread: ImageVector? = null

val Icons.Ss.Bread: ImageVector
    get() = _Bread ?: UXIcon(name = "Bread") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.36f, 1.64f)
                curveTo(20.68f, -0.04f, 18f, -0.45f, 14.82f, 0.49f)
                arcTo(21.55f, 21.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.03f, 6.03f)
                arcTo(21.55f, 21.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.49f, 14.82f)
                curveToRelative(-0.94f, 3.18f, -0.53f, 5.86f, 1.15f, 7.54f)
                arcTo(6.0f, 6.0f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.03f, 24f)
                arcToRelative(11.21f, 11.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.15f, -0.49f)
                arcToRelative(21.55f, 21.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.79f, -5.54f)
                arcToRelative(21.55f, 21.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.54f, -8.79f)
                curveTo(24.44f, 6f, 24.04f, 3.32f, 22.36f, 1.64f)
                close()
                moveTo(9f, 19f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -4f)
                lineTo(5f, 13f)
                arcToRelative(5.74f, 5.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 6f)
                close()
                moveTo(13f, 15f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -4f)
                lineTo(9f, 9f)
                arcToRelative(5.74f, 5.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 6f)
                close()
                moveTo(17f, 11f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -4f)
                lineTo(13f, 5f)
                arcToRelative(5.74f, 5.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 6f)
                close()
            }
        }.also { _Bread = it}
