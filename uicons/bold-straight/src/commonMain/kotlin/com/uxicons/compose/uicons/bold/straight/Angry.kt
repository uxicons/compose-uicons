package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Angry: ImageVector? = null

val Icons.Bs.Angry: ImageVector
    get() = _Angry ?: UXIcon(name = "Angry") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.89f, 24f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(12f, 21f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9f, -9f)
                curveTo(3.45f, 0.08f, 20.55f, 0.08f, 21f, 12f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21f)
                close()
                moveTo(12f, 13f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 2.38f)
                lineToRelative(-2f, 2.24f)
                arcToRelative(5.86f, 5.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.01f, 0f)
                lineTo(6f, 15.38f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 13f)
                close()
                moveTo(13f, 10.5f)
                arcTo(3.64f, 3.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 7f)
                verticalLineToRelative(3f)
                curveToRelative(-0.93f, 0f, -1f, 0.38f, -1f, 0.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 10.5f)
                close()
                moveTo(7f, 10f)
                lineTo(7f, 7f)
                arcToRelative(3.64f, 3.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 3.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
                curveTo(7.99f, 10.4f, 7.96f, 10f, 7f, 10f)
                close()
            }
        }.also { _Angry = it}
