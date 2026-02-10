package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CandyAlt: ImageVector? = null

val Icons.Bs.CandyAlt: ImageVector
    get() = _CandyAlt ?: UXIcon(name = "CandyAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 0f)
                arcTo(8.99f, 8.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.67f, 14.21f)
                lineTo(0.06f, 21.81f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(7.61f, -7.61f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 15f, 0f)
                close()
                moveTo(15f, 15f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.51f, -11.97f)
                curveToRelative(2.2f, 0.2f, 3.51f, 1.9f, 3.51f, 4.54f)
                arcTo(2.39f, 2.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.38f, 10f)
                arcTo(1.38f, 1.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 8.84f)
                curveToRelative(0f, -0.58f, 0.29f, -0.84f, 0.5f, -0.84f)
                lineTo(15f, 8f)
                lineTo(15f, 5f)
                horizontalLineToRelative(-0.5f)
                arcTo(3.64f, 3.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 8.84f)
                arcTo(4.33f, 4.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.38f, 13f)
                arcTo(5.33f, 5.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.94f, 8.2f)
                arcTo(6.07f, 6.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 9f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 15f)
                close()
            }
        }.also { _CandyAlt = it}
