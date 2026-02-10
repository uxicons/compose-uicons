package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CandyAlt: ImageVector? = null

val Icons.Br.CandyAlt: ImageVector
    get() = _CandyAlt ?: UXIcon(name = "CandyAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.96f, 0f)
            arcTo(8.99f, 8.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.67f, 14.21f)
            lineTo(0.44f, 21.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, 2.12f)
            lineToRelative(7.23f, -7.23f)
            arcTo(8.98f, 8.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 9f)
            arcTo(9.07f, 9.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.96f, 0f)
            close()
            moveTo(15f, 15f)
            arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.16f, -11.99f)
            curveTo(16.85f, 3.47f, 18f, 5.12f, 18f, 7.56f)
            arcTo(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 10f)
            curveToRelative(-0.71f, 0f, -1.5f, -0.61f, -1.5f, -1.16f)
            curveToRelative(0f, -0.58f, 0.29f, -0.84f, 0.5f, -0.84f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            arcTo(3.64f, 3.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 8.84f)
            arcTo(4.45f, 4.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 13f)
            arcToRelative(5.26f, 5.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.44f, -4.8f)
            arcTo(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 15f)
            close()
        }
    }.also { _CandyAlt = it }
