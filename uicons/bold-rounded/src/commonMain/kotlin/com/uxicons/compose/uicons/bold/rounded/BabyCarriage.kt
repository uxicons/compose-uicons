package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BabyCarriage: ImageVector? = null

val Icons.Br.BabyCarriage: ImageVector
    get() = _BabyCarriage ?: UXIcon(name = "BabyCarriage") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.5f, 0f)
            arcTo(2.45f, 2.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2.5f)
            verticalLineTo(9f)
            horizontalLineTo(6.63f)
            lineTo(5.09f, 6.85f)
            curveTo(4.14f, 5.26f, 0.33f, 3.78f, 0f, 6.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 8f)
            arcToRelative(1.42f, 1.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.15f, 0.59f)
            lineTo(4f, 10.48f)
            verticalLineTo(11.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 17f)
            horizontalLineToRelative(1.11f)
            lineTo(8.78f, 19.02f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.19f, 2.06f)
            lineTo(14f, 17.73f)
            lineToRelative(3.04f, 3.34f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.19f, -2.06f)
            lineTo(17.39f, 17f)
            horizontalLineTo(18.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 11.5f)
            verticalLineToRelative(-1f)
            curveTo(24f, 2.19f, 17.79f, 0f, 14.5f, 0f)
            close()
            moveTo(15f, 3.03f)
            arcTo(6.4f, 6.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.91f, 9f)
            horizontalLineTo(15f)
            close()
            moveTo(18.5f, 14f)
            horizontalLineToRelative(-9f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.45f, -2f)
            horizontalLineToRelative(13.9f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 14f)
            close()
        }
    }.also { _BabyCarriage = it }
