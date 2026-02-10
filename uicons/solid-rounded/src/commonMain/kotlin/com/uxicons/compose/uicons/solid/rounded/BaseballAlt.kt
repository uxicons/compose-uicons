package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BaseballAlt: ImageVector? = null

val Icons.Sr.BaseballAlt: ImageVector
    get() = _BaseballAlt ?: UXIcon(name = "BaseballAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 20.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20.5f, 17f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 20.5f)
                close()
                moveTo(22.75f, 7.1f)
                arcTo(4.13f, 4.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.9f, 1.25f)
                lineTo(14.43f, 3.72f)
                arcToRelative(31.37f, 31.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.5f, 5.68f)
                reflectiveCurveTo(8.78f, 11.3f, 8.44f, 11.82f)
                lineTo(12.21f, 15.6f)
                curveToRelative(0.45f, -0.28f, 2.21f, -1.37f, 2.57f, -1.6f)
                arcToRelative(31.18f, 31.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.36f, -4.3f)
                close()
                moveTo(7.19f, 13.4f)
                lineTo(2.5f, 18.09f)
                lineToRelative(-0.79f, -0.79f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.29f, 18.71f)
                lineToRelative(5f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.41f, -1.41f)
                lineTo(5.91f, 21.5f)
                lineTo(10.6f, 16.81f)
                close()
            }
        }.also { _BaseballAlt = it}
